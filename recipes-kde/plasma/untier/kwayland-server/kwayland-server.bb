SUMMARY = "Wayland Server Components built on KDE Frameworks"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-plasma

DEPENDS_remove_class-native = " kwayland-native"
DEPENDS_append_class-native = " \
    qtwayland-native \
"

DEPENDS_append_class-target = " \
    ${BPN}-native \
    qtwayland-native \
    plasma-wayland-protocols \
"

PV = "${PLASMA_VERSION}"
SRC_URI_append_class-native = " \
    file://0001-Build-qtwaylandscanner_kde-only-for-native-build.patch \
    file://0002-Avoid-traces-to-sysroot-to-avoid-false-fails-by-cmak.patch \
"
SRC_URI[sha256sum] = "da167417221610d521fefbe4ae1322aa20e7d6ac782cadcb61972f915589767c"

do_configure_append() {
    # adjust path to protocol sources in sysroot
    # once there are more consumers of plasma-wayland-protocols we might need
    # to find another solution
    sed -i 's: ${datadir}/plasma-wayland-protocols: ${STAGING_DATADIR}/plasma-wayland-protocols:g' ${B}/build.ninja
    sed -i 's: ${datadir}/wayland/wayland.xml: ${STAGING_DATADIR}/wayland/wayland.xml:g' ${B}/build.ninja
}

do_install_class-native() {
    install -d ${D}${bindir}
    install -m0755 ${B}/bin/* ${D}${bindir}/
}

BBCLASSEXTEND = "native"
