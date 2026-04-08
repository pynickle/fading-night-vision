package com.euphony.fading_night_vision.platform;

import java.util.ServiceLoader;

public final class PlatformServices {
    private static final BetterClientPlatform PLATFORM = ServiceLoader.load(BetterClientPlatform.class)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("No Fading Night Vision platform service found"));

    private PlatformServices() {}

    public static BetterClientPlatform getPlatform() {
        return PLATFORM;
    }
}
