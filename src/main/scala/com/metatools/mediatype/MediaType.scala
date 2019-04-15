package com.metatools.mediatype

sealed trait MediaType {

  def name: String

  def mediaType: String

  def extensions: Seq[String]

}

case class ApplicationMediaType(name: String, mediaType: String, extensions: Seq[String]) extends MediaType

case class AudioMediaType(name: String, mediaType: String, extensions: Seq[String]) extends MediaType

case class ImageMediaType(name: String, mediaType: String, extensions: Seq[String]) extends MediaType

case class TextMediaType(name: String, mediaType: String, extensions: Seq[String]) extends MediaType

case class VideoMediaType(name: String, mediaType: String, extensions: Seq[String]) extends MediaType


object MediaType {

  private def toExtensionMap(mediaType: MediaType): Map[String, MediaType] = {
    mediaType match {
      case ApplicationMediaType(name, media, extensions) => extensions.map(_ -> ApplicationMediaType(name, media, extensions)).toMap
      case AudioMediaType(name, media, extensions) => extensions.map(_ -> AudioMediaType(name, media, extensions)).toMap
      case ImageMediaType(name, media, extensions) => extensions.map(_ -> ImageMediaType(name, media, extensions)).toMap
      case TextMediaType(name, media, extensions) => extensions.map(_ -> TextMediaType(name, media, extensions)).toMap
      case VideoMediaType(name, media, extensions) => extensions.map(_ -> VideoMediaType(name, media, extensions)).toMap
    }
  }

  val `application/excel` = ApplicationMediaType("excel", "application/excel", Seq("xl", "xla", "xlb", "xlc", "xld", "xlk", "xll", "xlm", "xls", "xlt", "xlv", "xlw"))
  val `application/javascript` = ApplicationMediaType("javascript", "application/javascript", Seq("js"))
  val `application/json` = ApplicationMediaType("json", "application/json", Seq("json"))
  val `application/lha` = ApplicationMediaType("lha", "application/lha", Seq("lha"))
  val `application/lzx` = ApplicationMediaType("lzx", "application/lzx", Seq("lzx"))
  val `application/mspowerpoint` = ApplicationMediaType("mspowerpoint", "application/mspowerpoint", Seq("pot", "pps", "ppt", "ppz"))
  val `application/msword` = ApplicationMediaType("msword", "application/msword", Seq("doc", "dot", "w6w", "wiz", "word", "wri"))
  val `application/pdf` = ApplicationMediaType("pdf", "application/pdf", Seq("pdf"))
  val `application/x-7z-compressed` = ApplicationMediaType("x-7z-compressed", "application/x-7z-compressed", Seq("7z", "s7z"))
  val `application/x-ace-compressed` = ApplicationMediaType("x-ace-compressed", "application/x-ace-compressed", Seq("ace"))
  val `application/x-apple-diskimage` = ApplicationMediaType("x-apple-diskimage", "application/x-apple-diskimage", Seq("dmg"))
  val `application/x-arc-compressed` = ApplicationMediaType("x-arc-compressed", "application/x-arc-compressed", Seq("arc"))
  val `application/x-bzip` = ApplicationMediaType("x-bzip", "application/x-bzip", Seq("bz"))
  val `application/x-bzip2` = ApplicationMediaType("x-bzip2", "application/x-bzip2", Seq("boz", "bz2"))
  val `application/x-chrome-extension` = ApplicationMediaType("x-chrome-extension", "application/x-chrome-extension ", Seq("crx"))
  val `application/x-compress` = ApplicationMediaType("x-compress", "application/x-compress", Seq("z"))
  val `application/x-compressed` = ApplicationMediaType("x-compressed", "application/x-compressed", Seq("gz"))
  val `application/x-debian-package` = ApplicationMediaType("x-debian-package", "application/x-debian-package", Seq("deb"))
  val `application/x-dvi` = ApplicationMediaType("x-dvi", "application/x-dvi", Seq("dvi"))
  val `application/x-font-truetype` = ApplicationMediaType("x-font-truetype", "application/x-font-truetype", Seq("ttf"))
  val `application/x-font-opentype` = ApplicationMediaType("x-font-opentype", "application/x-font-opentype", Seq("otf"))
  val `application/x-gtar` = ApplicationMediaType("x-gtar", "application/x-gtar", Seq("gtar"))
  val `application/x-gzip` = ApplicationMediaType("x-gzip", "application/x-gzip", Seq("gzip"))
  val `application/x-rar-compressed` = ApplicationMediaType("x-rar-compressed", "application/x-rar-compressed", Seq("rar"))
  val `application/x-redhat-package-manager` = ApplicationMediaType("x-redhat-package-manager", "application/x-redhat-package-manager", Seq("rpm"))
  val `application/x-shockwave-flash` = ApplicationMediaType("x-shockwave-flash", "application/x-shockwave-flash", Seq("swf"))
  val `application/x-tar` = ApplicationMediaType("x-tar", "application/x-tar", Seq("tar"))
  val `application/x-tex` = ApplicationMediaType("x-tex", "application/x-tex", Seq("tex"))
  val `application/x-texinfo` = ApplicationMediaType("x-texinfo", "application/x-texinfo", Seq("texi", "texinfo"))
  val `application/x-vrml` = ApplicationMediaType("x-vrml", "application/x-vrml", Seq("vrml"))
  val `application/x-x509-ca-cert` = ApplicationMediaType("x-x509-ca-cert", "application/x-x509-ca-cert", Seq("der"))
  val `application/zip` = ApplicationMediaType("zip", "application/zip", Seq("zip"))

  val `audio/aiff` = AudioMediaType("aiff", "audio/aiff", Seq("aif", "aifc", "aiff"))
  val `audio/basic` = AudioMediaType("basic", "audio/basic", Seq("au", "snd"))
  val `audio/midi` = AudioMediaType("midi", "audio/midi", Seq("mid", "midi", "kar"))
  val `audio/mod` = AudioMediaType("mod", "audio/mod", Seq("mod"))
  val `audio/mpeg` = AudioMediaType("mpeg", "audio/mpeg", Seq("m2a", "mp2", "mp3", "mpa", "mpga"))
  val `audio/ogg` = AudioMediaType("ogg", "audio/ogg", Seq("oga", "ogg"))
  val `audio/voc` = AudioMediaType("voc", "audio/voc", Seq("voc"))
  val `audio/vorbis` = AudioMediaType("vorbis", "audio/vorbis", Seq("vorbis"))
  val `audio/voxware` = AudioMediaType("voxware", "audio/voxware", Seq("vox"))
  val `audio/wav` = AudioMediaType("wav", "audio/wav", Seq("wav"))
  val `audio/x-realaudio` = AudioMediaType("x-pn-realaudio", "audio/x-realaudio", Seq("ra", "ram", "rmm", "rmp"))
  val `audio/x-psid` = AudioMediaType("x-psid", "audio/x-psid", Seq("sid"))
  val `audio/xm` = AudioMediaType("xm", "audio/xm", Seq("xm"))

  val `image/gif` = ImageMediaType("gif", "image/gif", Seq("gif"))
  val `image/jpeg` = ImageMediaType("jpeg", "image/jpeg", Seq("jpe", "jpeg", "jpg"))
  val `image/pict` = ImageMediaType("pict", "image/pict", Seq("pic", "pict"))
  val `image/png` = ImageMediaType("png", "image/png", Seq("png"))
  val `image/svg+xml` = ImageMediaType("svg+xml", "image/svg+xml", Seq("svg", "svgz"))
  val `image/tiff` = ImageMediaType("tiff", "image/tiff", Seq("tif", "tiff"))
  val `image/x-icon` = ImageMediaType("x-icon", "image/x-icon", Seq("ico"))
  val `image/bmp` = ImageMediaType("bmp", "image/bmp", Seq("bmp"))
  val `image/x-pcx` = ImageMediaType("x-pcx", "image/x-pcx", Seq("pcx"))
  val `image/x-pict` = ImageMediaType("x-pict", "image/x-pict", Seq("pct"))
  val `image/x-quicktime` = ImageMediaType("x-quicktime", "image/x-quicktime", Seq("qif", "qti", "qtif"))
  val `image/x-rgb` = ImageMediaType("x-rgb", "image/x-rgb", Seq("rgb"))
  val `image/x-xbitmap` = ImageMediaType("x-xbitmap", "image/x-xbitmap", Seq("xbm"))
  val `image/x-xpixmap` = ImageMediaType("x-xpixmap", "image/x-xpixmap", Seq("xpm"))
  val `image/webp` = ImageMediaType("webp", "image/webp", Seq("webp"))

  val `text/css` = TextMediaType("css", "text/css", Seq("css"))
  val `text/csv` = TextMediaType("csv", "text/csv", Seq("csv"))
  val `text/html` = TextMediaType("html", "text/html", Seq("htm", "html", "htmls", "htx"))
  val `text/plain` = TextMediaType("plain", "text/plain", Seq("conf", "text", "txt", "properties"))
  val `text/richtext` = TextMediaType("richtext", "text/richtext", Seq("rtf", "rtx"))
  val `text/tab-separated-values` = TextMediaType("tab-separated-values", "text/tab-separated-values", Seq("tsv"))
  val `text/x-java-source` = TextMediaType("x-java-source", "text/x-java-source", Seq("java"))
  val `text/x-vcalendar` = TextMediaType("x-vcalendar", "text/x-vcalendar", Seq("vcs"))
  val `text/x-vcard` = TextMediaType("x-vcard", "text/x-vcard", Seq("vcf", "vcard"))
  val `text/xml` = TextMediaType("xml", "text/xml", Seq("xml"))

  val `video/avs-video` = VideoMediaType("avs-video", "video/avs-video", Seq("avs"))
  val `video/divx` = VideoMediaType("divx", "video/divx", Seq("divx"))
  val `video/gl` = VideoMediaType("gl", "video/gl", Seq("gl"))
  val `video/mp4` = VideoMediaType("mp4", "video/mp4", Seq("mp4"))
  val `video/mpeg` = VideoMediaType("mpeg", "video/mpeg", Seq("m1v", "m2v", "mpe", "mpeg", "mpg"))
  val `video/ogg` = VideoMediaType("ogg", "video/ogg", Seq("ogv"))
  val `video/quicktime` = VideoMediaType("quicktime", "video/quicktime", Seq("moov", "mov", "qt"))
  val `video/x-dv` = VideoMediaType("x-dv", "video/x-dv", Seq("dif", "dv"))
  val `video/x-flv` = VideoMediaType("x-flv", "video/x-flv", Seq("flv"))
  val `video/x-motion-jpeg` = VideoMediaType("x-motion-jpeg", "video/x-motion-jpeg", Seq("mjpg"))
  val `video/x-ms-asf` = VideoMediaType("x-ms-asf", "video/x-ms-asf", Seq("asf"))
  val `video/x-msvideo` = VideoMediaType("x-msvideo", "video/x-msvideo", Seq("avi"))
  val `video/x-sgi-movie` = VideoMediaType("x-sgi-movie", "video/x-sgi-movie", Seq("movie", "mv"))
  val `video/webm` = VideoMediaType("webm", "video/webm", Seq("webm"))
  val `video/x-m4v` = VideoMediaType("m4v", "video/x-m4v", Seq("m4v"))

  private lazy val extensionMap: Map[String, MediaType] =
    toExtensionMap(`application/excel`) ++
      toExtensionMap(`application/javascript`) ++
      toExtensionMap(`application/json`) ++
      toExtensionMap(`application/lha`) ++
      toExtensionMap(`application/lzx`) ++
      toExtensionMap(`application/mspowerpoint`) ++
      toExtensionMap(`application/msword`) ++
      toExtensionMap(`application/pdf`) ++
      toExtensionMap(`application/x-7z-compressed`) ++
      toExtensionMap(`application/x-ace-compressed`) ++
      toExtensionMap(`application/x-apple-diskimage`) ++
      toExtensionMap(`application/x-arc-compressed`) ++
      toExtensionMap(`application/x-bzip`) ++
      toExtensionMap(`application/x-bzip2`) ++
      toExtensionMap(`application/x-chrome-extension`) ++
      toExtensionMap(`application/x-compress`) ++
      toExtensionMap(`application/x-compressed`) ++
      toExtensionMap(`application/x-debian-package`) ++
      toExtensionMap(`application/x-dvi`) ++
      toExtensionMap(`application/x-font-truetype`) ++
      toExtensionMap(`application/x-font-opentype`) ++
      toExtensionMap(`application/x-gtar`) ++
      toExtensionMap(`application/x-gzip`) ++
      toExtensionMap(`application/x-rar-compressed`) ++
      toExtensionMap(`application/x-redhat-package-manager`) ++
      toExtensionMap(`application/x-shockwave-flash`) ++
      toExtensionMap(`application/x-tar`) ++
      toExtensionMap(`application/x-tex`) ++
      toExtensionMap(`application/x-texinfo`) ++
      toExtensionMap(`application/x-vrml`) ++
      toExtensionMap(`application/x-x509-ca-cert`) ++
      toExtensionMap(`application/zip`) ++
      toExtensionMap(`audio/aiff`) ++
      toExtensionMap(`audio/basic`) ++
      toExtensionMap(`audio/midi`) ++
      toExtensionMap(`audio/mod`) ++
      toExtensionMap(`audio/mpeg`) ++
      toExtensionMap(`audio/ogg`) ++
      toExtensionMap(`audio/voc`) ++
      toExtensionMap(`audio/vorbis`) ++
      toExtensionMap(`audio/voxware`) ++
      toExtensionMap(`audio/wav`) ++
      toExtensionMap(`audio/x-realaudio`) ++
      toExtensionMap(`audio/x-psid`) ++
      toExtensionMap(`audio/xm`) ++
      toExtensionMap(`image/gif`) ++
      toExtensionMap(`image/jpeg`) ++
      toExtensionMap(`image/pict`) ++
      toExtensionMap(`image/png`) ++
      toExtensionMap(`image/svg+xml`) ++
      toExtensionMap(`image/tiff`) ++
      toExtensionMap(`image/x-icon`) ++
      toExtensionMap(`image/bmp`) ++
      toExtensionMap(`image/x-pcx`) ++
      toExtensionMap(`image/x-pict`) ++
      toExtensionMap(`image/x-quicktime`) ++
      toExtensionMap(`image/x-rgb`) ++
      toExtensionMap(`image/x-xbitmap`) ++
      toExtensionMap(`image/x-xpixmap`) ++
      toExtensionMap(`image/webp`) ++
      toExtensionMap(`text/css`) ++
      toExtensionMap(`text/csv`) ++
      toExtensionMap(`text/html`) ++
      toExtensionMap(`text/plain`) ++
      toExtensionMap(`text/richtext`) ++
      toExtensionMap(`text/tab-separated-values`) ++
      toExtensionMap(`text/x-java-source`) ++
      toExtensionMap(`text/x-vcalendar`) ++
      toExtensionMap(`text/x-vcard`) ++
      toExtensionMap(`text/xml`) ++
      toExtensionMap(`video/avs-video`) ++
      toExtensionMap(`video/divx`) ++
      toExtensionMap(`video/gl`) ++
      toExtensionMap(`video/mp4`) ++
      toExtensionMap(`video/mpeg`) ++
      toExtensionMap(`video/ogg`) ++
      toExtensionMap(`video/quicktime`) ++
      toExtensionMap(`video/x-dv`) ++
      toExtensionMap(`video/x-flv`) ++
      toExtensionMap(`video/x-motion-jpeg`) ++
      toExtensionMap(`video/x-ms-asf`) ++
      toExtensionMap(`video/x-msvideo`) ++
      toExtensionMap(`video/x-sgi-movie`) ++
      toExtensionMap(`video/webm`) ++
      toExtensionMap(`video/x-m4v`)

  private lazy val mediaTypeMap: Map[String, MediaType] =
    extensionMap.values.groupBy(_.mediaType).map { case (k, v) => (k, v.head) }

  def fromExtension(extension: String): Option[MediaType] = {
    extensionMap.get(extension)
  }

  def fromFilename(filename: String): Option[MediaType] = {
    extractFilenameExtension(filename).flatMap(fromExtension)
  }

  def fromMediaType(mediaType: String): Option[MediaType] = {
    mediaTypeMap.get(mediaType)
  }

  private def extractFilenameExtension(filename: String): Option[String] = {
    val pos = filename.lastIndexOf('.')
    if (pos > 0) Some(filename.substring(pos + 1)) else None
  }

}
