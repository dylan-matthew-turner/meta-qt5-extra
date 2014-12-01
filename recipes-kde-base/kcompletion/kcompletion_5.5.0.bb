SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

SRCREV = "278e8f0c396a1e30723775d437db34a46a5843c5"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
