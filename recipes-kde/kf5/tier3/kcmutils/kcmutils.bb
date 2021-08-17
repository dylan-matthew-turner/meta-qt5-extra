SUMMARY = "Utilities for working with KCModules"
LICENSE = "GPL-2.0 & GPL-3.0 & LGPL-2.0 & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    kpackage-native \
    kitemviews \
    kconfigwidgets \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kservice \
    kxmlgui \
    kdeclarative \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "20e8a32f1f22bc0afc682b694c2d6d8333c9de796845904685269fb3719ece93"

FILES:${PN} += "${datadir}/kservicetypes5"
