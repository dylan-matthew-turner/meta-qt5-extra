SUMMARY = "KDE and Plasma resources management GUI"
LICENSE = "BSD-3-Clause & GPL-2.0 & GPL-2.0+ & GPL-3.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-plasma gtk-icon-cache mime-xdg

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "6ff39f2dfd898af867c55fdac1cf48a3adc4ca90bf3fee0d8f2fa7ed5d584746"

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    attica \
    kitemmodels \
    knewstuff \
    knotifications \
    kirigami2 \
    plasma-framework \
    kidletime \
"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/plasma \
    ${datadir}/kpackage \
    \
    ${libdir}/plasma-discover \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS_${PN} += "python3-core kirigami"
