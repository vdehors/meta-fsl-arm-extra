#!/bin/sh

echo "Performing wifi calibration..."

mkdir -p /tmp
cd /tmp

# Get MAC adress of the wifi card
#TODO: implement uniq MAC addr generation for production usage
mac_address="00:1E:AC:00:51:22"

echo "Removing existing module if it is already probed..."
rmmod wl12xx 2> /dev/null || true
rmmod wlcore_sdio 2> /dev/null || true
rmmod wlcore 2> /dev/null || true

echo "Creating NVS file..."
calibrator set ref_nvs /usr/share/ti-utils/ini_files/127x/TQS_S_2.5.ini
cp new-nvs.bin /lib/firmware/ti-connectivity/wl1271-nvs.bin
calibrator set nvs_mac /lib/firmware/ti-connectivity/wl1271-nvs.bin
echo "NVS file : /lib/firmware/ti-connectivity/wl1271-nvs.bin"

echo "Loading driver..."
modprobe wl12xx
modprobe wlcore_sdio

echo "Calibrating..."
calibrator plt calibrate dual

echo "Reseting..."
echo 40 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio40/direction
echo 1 > /sys/class/gpio/gpio40/value

echo "Done."

cd -

