DESCRIPTION = "Add SPI parallel access test binaries to image"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE.gpl;md5=d32239bcb673463ab874e80d47fae504"
PR = "r0"

SRCREV = "78728f0877c0a3d9b2853d4b6524568e7270c8eb"
SRC_URI = "git://github.com/move-ii/cdh-utilities.git;protocol=https"

S = "${WORKDIR}/git/spi-parallel-access-test/"

inherit cmake
