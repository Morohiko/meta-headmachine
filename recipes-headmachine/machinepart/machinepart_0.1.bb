DESCRIPTION = "Machinepart"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/Morohiko/machinepart.git;branch=develop_mp;protocol=https"

SRCREV = "fdf088baf4d29e3e4a318000f6eba4bc30f4c5f5"

IMAGE_ROOTFS_SIZE ?= "8192"

inherit cmake

S = "${WORKDIR}/git/sources"

DEPENDS = " \
    glibc \
    cjson \
"

FILES_${PN} += "${sysconfdir}/config.json"
FILES_${PN} += "${bindir}/gyroscope_emulator"
FILES_${PN} += "${bindir}/head_machine"
FILES_${PN} += "${bindir}/shell_bin"

EXTRA_OECMAKE += "-DWITH_CAMERA_RECEIVER_EMULATOR=OFF -DWITH_TESTS=OFF"
