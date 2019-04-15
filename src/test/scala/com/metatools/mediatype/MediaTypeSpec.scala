package com.metatools.mediatype

import org.scalatest.{FunSpec, OptionValues}

class MediaTypeSpec extends FunSpec with OptionValues {

  describe("MediaTypeSpec") {

    it("should return correct media type for zip extension") {
      MediaType.fromExtension("zip").value.mediaType equals "application/zip"
    }

    it("should return correct media type for a zip file") {
      MediaType.fromFilename("/some/folder/somezipfile.zip").value.mediaType equals "application/zip"
    }

    it("should return correct media type for all jpeg extensions") {
      MediaType.fromExtension("jpe").value.mediaType equals "image/jpeg"
      MediaType.fromExtension("jpeg").value.mediaType equals "image/jpeg"
      MediaType.fromExtension("jpg").value.mediaType equals "image/jpeg"
    }

    it("should return application media type for json") {
      MediaType.fromExtension("json").value.isInstanceOf[ApplicationMediaType] equals true
    }

    it("should return audio media type for mp3") {
      MediaType.fromExtension("mp3").value.isInstanceOf[AudioMediaType] equals true
    }

    it("should return image media type for png") {
      MediaType.fromExtension("png").value.isInstanceOf[ImageMediaType] equals true
    }

    it("should return text media type for html") {
      MediaType.fromExtension("html").value.isInstanceOf[TextMediaType] equals true
    }

    it("should return video media type for mp4") {
      MediaType.fromExtension("mp4").value.isInstanceOf[ImageMediaType] equals true
    }

    it("should return None for unsupported extension") {
      MediaType.fromExtension("xxx").isEmpty equals true
    }

    it("should return application media type: application/lzx") {
      MediaType.fromMediaType("application/lzx").value.isInstanceOf[ApplicationMediaType]
    }

    it("should return application media type: audio/ogg") {
      MediaType.fromMediaType("audio/ogg").value.isInstanceOf[AudioMediaType]
    }

    it("should return None media type: audio/xxx") {
      MediaType.fromMediaType("audio/xxx").isEmpty equals true
    }

    it("should return application media type: application/zip") {
      MediaType.fromMediaType("application/zip").value equals MediaType.`application/zip`
    }

  }
}
