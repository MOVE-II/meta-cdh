DESCRIPTION = "Add udev rules for CDH platform"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://../LICENSE.gpl;md5=d32239bcb673463ab874e80d47fae504"
PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "file://10-spi-device-names.rules \
           file://LICENSE.gpl"

do_install () {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/*.rules ${D}${sysconfdir}/udev/rules.d/
}
