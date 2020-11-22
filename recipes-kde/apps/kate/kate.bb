SUMMARY = "An advanced editor component which is used in numerous KDE applications requiring a text editing component"
LICENSE = "GPL-2.0 & LGPL-3.0 & GPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=334069b3769dfd935f3e668e638a26ad \
    file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-apps gettext mime-xdg

DEPENDS += " \
    qtscript \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    sonnet-native \
    kdoctools-native \
    kpackage-native \
    kguiaddons \
    ki18n \
    kinit \
    kjobwidgets \
    kio \
    kparts \
    ktexteditor \
    kwindowsystem \
    kxmlgui \
    kitemmodels \
    threadweaver \
    plasma-framework \
    knewstuff \
    kiconthemes \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "718e8230edfa16f93f54380c4e214a0f25f8a398fe74ad23f12b7dcffae419d0"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kateproject \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/katexmltools \
    ${datadir}/icons \
    \
    ${libdir}/libkdeinit5*.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
