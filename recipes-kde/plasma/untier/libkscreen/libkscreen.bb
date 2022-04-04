SUMMARY = "KDE's screen management software"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

inherit kde-plasma

DEPENDS += " \
    qtwayland-native \
    plasma-wayland-protocols \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "016dec6d912b2a733ebdd26bfe5e31029651bd5b4e476d95a541765a68dd67f7"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
