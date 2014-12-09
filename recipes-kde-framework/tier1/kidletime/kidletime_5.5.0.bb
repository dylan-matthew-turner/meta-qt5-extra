SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

SRC_URI += "file://0001-Do-not-search-for-Qt5X11Extras-in-x-less-environment.patch"
SRCREV = "31e0bc0429000c93da91cba8df79b08e1afd6a9b"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5IdleTime, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5IdleTime, -S${includedir}, -S${STAGING_INCDIR}"
