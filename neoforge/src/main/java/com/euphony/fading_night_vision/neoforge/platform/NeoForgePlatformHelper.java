package com.euphony.fading_night_vision.neoforge.platform;

import com.euphony.fading_night_vision.platform.BetterClientPlatform;
import com.euphony.fading_night_vision.platform.PlatformType;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public final class NeoForgePlatformHelper implements BetterClientPlatform {
    @Override
    public Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.NEOFORGE;
    }
}
