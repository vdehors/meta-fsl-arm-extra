LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PR ="r0"

SRC_URI = "file://calibrate.sh"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/calibrate.sh ${D}${bindir}/calibrate.sh
}

COMPATIBLE_MACHINE = "(apf6q)"
