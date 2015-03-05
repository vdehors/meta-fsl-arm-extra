DESCRIPTION = "The calibrator and other useful utilities for TI wireless solution based on wl12xx driver"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=4725015cb0be7be389cf06deeae3683d"

DEPENDS = "libnl"
RDEPENDS_${PN} = "linux-firmware-wl12xx"

PR ="r1+gitr${SRCPV}"

SRCREV = "06dbdb2727354b5f3ad7c723897f40051fddee49"
SRC_URI = "git://github.com/gxk/ti-utils.git"

S = "${WORKDIR}/git"

export CROSS_COMPILE = "${TARGET_PREFIX}"
CFLAGS += " -DCONFIG_LIBNL20 -I${STAGING_INCDIR}/libnl3"
export LIBS = "-lnl-3 -lnl-genl-3 -lm"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 calibrator ${D}${bindir}/
    install -d ${D}/usr/share/ti-utils/ini_files/127x/
    install -m 0755 ini_files/127x/* ${D}/usr/share/ti-utils/ini_files/127x/
    install -d ${D}/usr/share/ti-utils/ini_files/128x/
    install -m 0755 ini_files/128x/* ${D}/usr/share/ti-utils/ini_files/128x/
}
FILES_${PN} = "${bindir} /usr/share/ti-utils"

