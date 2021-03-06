SUMMARY = "Libkexiv2 is a wrapper around Exiv2 library"
LICENSE = "GPL-2.0 & BSD-3-Clause & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps

DEPENDS += "\
    exiv2 \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "b762730416f8c9db6075695222027c0c37cec8c8defe0c5723af570fa49021e4"
