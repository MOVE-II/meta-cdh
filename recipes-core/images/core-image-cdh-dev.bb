require core-image-cdh.bb

IMAGE_INSTALL += "gcc make i2c-tools spi-parallel-access-test"

IMAGE_FEATURES += "dev-pkgs"
