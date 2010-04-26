DESCRIPTION = "Alsa OSS Compatibility Package"
SECTION = "libs/multimedia"
LICENSE = "GPL"
DEPENDS = "alsa-lib"

SRC_URI = "ftp://ftp.alsa-project.org/pub/oss-lib/alsa-oss-${PV}.tar.bz2"

inherit autotools

do_configure_prepend () {
	touch NEWS README AUTHORS ChangeLog
}
