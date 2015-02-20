# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-wandboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Wandboard branch - based on 3.10.31_1.1.0 from Freescale git
SRCBRANCH = "wandboard_imx_3.10.31_1.1.0_beta2"
SRCREV = "a63c7c073c385bdc9d041c9795a18754f4544dba"
LOCALVERSION = "-1.1.0-wandboard"

SRC_URI_apf6_append += "file://0450-armadeus-add-apf6q-and-apf6dl-device-trees.patch"

COMPATIBLE_MACHINE = "(apf6dl|apf6q)"
