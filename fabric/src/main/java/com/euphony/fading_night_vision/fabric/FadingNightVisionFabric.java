package com.euphony.fading_night_vision.fabric;

import com.euphony.fading_night_vision.FadingNightVision;
import net.fabricmc.api.ModInitializer;

public final class FadingNightVisionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FadingNightVision.init();
    }
}
