SUMMARY = "Artikulate is a pronunciation trainer"
LICENSE = "GPL-2.0 & CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://COPYING.DOC;md5=4b39cb11ffa11c92d3f7a3431390e0d9 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtmultimedia \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kcrash \
    ki18n \
    knewstuff \
    kirigami2 \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "35bf5044b904acebaac6ccf9064738d7d5b0a2433610ef742dd0295e8172d6be"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_PLUGINS} \
"
