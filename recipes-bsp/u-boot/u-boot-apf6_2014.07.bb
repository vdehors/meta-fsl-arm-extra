# Armadeus u-boot

require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for Armadeus Boards."

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://README;beginline=1;endline=22;md5=2687c5ebfd9cb284491c3204b726ea29 "

PROVIDES += "u-boot"

PV = "2014.07"

SRCREV = "524123a70761110c5cf3ccc5f52f6d4da071b959"

SRC_URI += "file://001-restore-command-env-param-compatitbility.patch \
            file://040-i2c-mxc-fix-mx51-i2c-declaration.patch \
            file://102-mx1-i2c.patch \
            file://103-apf9328.patch \
            file://104-apf9328-makefile.patch \
            file://106-mx1-pllclk.patch \
            file://107-mx1-pllclk-debug.patch \
            file://108-DM9000.patch \
            file://111-mx1-timer.patch \
            file://300-imx27-fix_dcache_boot_issue.patch \
            file://302-apf27-support-boot-from-RAM.patch \
            file://311-imx-nand-lock-unlock.patch \
            file://320-spartan.patch \
            file://340-apf27-misc-commands.patch \
            file://350-nand_large_file_download.patch \
            file://360-arm-support-continuous-mmu-mem-mapping.patch \
            file://400-imx51.patch \
            file://401-apf51.patch \
            file://410-imx-iim.patch \
            file://420-apf51-nand-spl-NG.patch \
            file://501-imx28-update-and-fix.patch \
            file://502-add-apf28.patch \
            file://503-add-apf6.patch \
            file://504-apf6-seek_uboot_image_in_boot_partition.patch \
            file://505-apf6-in_bootstrap_get_uboot_image_on_serial_port.patch \
            file://506-apf6-in_bootstrap_dont_use_env_vars.patch \
            file://apf6-config.h"

COMPATIBLE_MACHINE = "(apf6dl|apf6q)"

do_configure_prepend() {
    cp "${WORKDIR}/apf6-config.h" "${S}/include/configs/apf6.h"
}

