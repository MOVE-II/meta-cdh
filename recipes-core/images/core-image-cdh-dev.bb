require core-image-cdh.bb

IMAGE_INSTALL += "gcc make i2c-tools"

IMAGE_FEATURES += "dev-pkgs"
