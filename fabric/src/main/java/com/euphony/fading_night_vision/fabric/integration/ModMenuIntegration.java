package com.euphony.fading_night_vision.fabric.integration;

import com.euphony.fading_night_vision.FadingNightVision;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> FadingNightVision.config.makeScreen(screen);
    }
}
