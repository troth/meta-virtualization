include runc.inc

SRCREV = "a9833ff391a71b30069a6c3f816db113379a4346"
SRC_URI = " \
    git://github.com/opencontainers/runc;branch=release-1.1;protocol=https;destsuffix=${GO_SRCURI_DESTSUFFIX} \
    file://0001-Makefile-respect-GOBUILDFLAGS-for-runc-and-remove-re.patch;patchdir=${GO_SRCURI_DESTSUFFIX} \
    "
RUNC_VERSION = "1.1.12"

CVE_PRODUCT = "runc"

LDFLAGS += "${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', ' -fuse-ld=bfd', '', d)}"
