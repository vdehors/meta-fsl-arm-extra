# Armadeus APF6 common variables
# Supported platform : APF6 (Solo - Dual - Quad)
PREFERRED_PROVIDER_virtual/kernel ?= "linux-apf6"
PREFERRED_VERSION_linux-wandboard ?= "3.10.53"
PREFERRED_PROVIDER_u-boot ?= "u-boot-apf6"

SERIAL_CONSOLE = "115200 ttymxc3"

MACHINE_FEATURES += "wifi pci touchscreen"

KERNEL_IMAGETYPE = "zImage"
