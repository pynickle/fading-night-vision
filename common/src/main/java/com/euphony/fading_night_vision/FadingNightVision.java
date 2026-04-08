package com.euphony.fading_night_vision;

import com.euphony.fading_night_vision.config.Config;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class FadingNightVision {
    public static final String MOD_ID = "fading_night_vision";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static Config config = Config.create();

    public static void init() {}
}
