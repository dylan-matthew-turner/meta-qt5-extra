SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "2c999206c51a6a6c5ecda211773276438f0069a2e1c81d4903ae5712c6f28c15"
