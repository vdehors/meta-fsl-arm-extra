LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR ="r0"

SRC_URI = "file://calibrate.sh"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/calibrate.sh ${D}${bindir}/calibrate.sh
}

COMPATIBLE_MACHINE = "(apf6q)"
