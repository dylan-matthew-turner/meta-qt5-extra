SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPL-2.0 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "90e9bfeb2bd6afdd86ef8b18370a04d3e2e01841def635d25b349551a7a68031"
