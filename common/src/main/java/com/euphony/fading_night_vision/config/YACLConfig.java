package com.euphony.fading_night_vision.config;

import com.euphony.fading_night_vision.config.screen.YACLConfigScreen;
import net.minecraft.client.gui.screens.Screen;

public class YACLConfig extends Config {
    @Override
    public Screen makeScreen(Screen parent) {
        return YACLConfigScreen.generate(parent);
    }
}
