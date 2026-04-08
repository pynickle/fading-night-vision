package com.euphony.fading_night_vision.platform;

import java.nio.file.Path;

public interface BetterClientPlatform {
    Path getConfigDirectory();

    boolean isModLoaded(String modId);

    PlatformType getPlatformType();
}
