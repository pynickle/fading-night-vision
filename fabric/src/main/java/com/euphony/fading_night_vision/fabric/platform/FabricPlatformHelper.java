package com.euphony.fading_night_vision.fabric.platform;

import com.euphony.fading_night_vision.platform.BetterClientPlatform;
import com.euphony.fading_night_vision.platform.PlatformType;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public final class FabricPlatformHelper implements BetterClientPlatform {
    @Override
    public Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.FABRIC;
    }
}
