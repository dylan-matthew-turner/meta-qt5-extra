SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPL-2.0+ & LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "345fb419e5ef64dc23e3cfda3a8d9877fa915cd0b5d8dee0517d4326be148be7"

PV = "${KF5_VERSION}"
