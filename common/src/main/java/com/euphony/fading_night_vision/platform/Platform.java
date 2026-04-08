package com.euphony.fading_night_vision.platform;

import java.nio.file.Path;

public final class Platform {
    private Platform() {}

    public static Path getConfigFolder() {
        return PlatformServices.getPlatform().getConfigDirectory();
    }

    public static boolean isModLoaded(String modId) {
        return PlatformServices.getPlatform().isModLoaded(modId);
    }

    public static boolean isFabric() {
        return PlatformServices.getPlatform().getPlatformType() == PlatformType.FABRIC;
    }

    public static boolean isNeoForge() {
        return PlatformServices.getPlatform().getPlatformType() == PlatformType.NEOFORGE;
    }
}
