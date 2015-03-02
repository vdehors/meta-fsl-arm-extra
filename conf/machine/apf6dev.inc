# Armadeus patches for are based on the linux-wandboard
PREFERRED_PROVIDER_virtual/kernel ?= "linux-wandboard"
PREFERRED_VERSION_linux-wandboard ?= "3.10.53"
PREFERRED_PROVIDER_u-boot ?= "u-boot-apf6"

SERIAL_CONSOLE = "115200 ttymxc3"

MACHINE_FEATURES += "wifi pci touchscreen"

KERNEL_IMAGETYPE = "zImage"

UBOOT_MACHINE = "apf6_config"
