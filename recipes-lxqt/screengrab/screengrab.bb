SUMMARY = "Crossplatform tool for fast making screenshots"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=7f201c1a63190995185a05dc34cab048"

inherit lxqt qt5-translation pkgconfig gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    libqtxdg \
    kwindowsystem \
"

SRCREV = "d00dd586df81c06ff6d25641bcccb994907c9a89"
PV = "2.4.0"

FILES:${PN} += "${datadir}/metainfo"

INSANE_SKIP:${PN} = "dev-so"
