require ${BPN}.inc

DEPENDS += "${BPN}-native karchive ki18n libxslt libxml2"

inherit cmake-lib

SRC_URI += " \
	file://0005-set-meinproc5-executable-so-that-it-can-be-found-for.patch \
"

do_configure_append() {
	# use native docbookl10nhelper
	sed -i 's:\./docbookl10nhelper:${STAGING_BINDIR_NATIVE}/docbookl10nhelper:' ${B}/src/CMakeFiles/docbookl10nhelper.dir/build.make
}

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5DocTools, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DocTools, -S${includedir}, -S${STAGING_INCDIR}"
# native binaries
CMAKE_HIDE_ERROR[3] = "KF5DocTools, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"

# make meinproc5 find kdoctools data
CMAKE_HIDE_ERROR[4] = "KF5DocToolsMacros.cmake, -s--stylesheet, -S--srcdir ${STAGING_DATADIR}/kf5/kdoctools --stylesheet"

FILES_${PN}-dev += "${datadir}/kf5/kdoctools/customization"
