FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Fix-spi-driver.patch;patch=1 \
            file://0001-Add-6-SPI1-slaves-to-DT-with-GPIO-cs.patch;patch=1"
