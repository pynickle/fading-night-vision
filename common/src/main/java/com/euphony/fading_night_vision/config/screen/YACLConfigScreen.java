package com.euphony.fading_night_vision.config.screen;

import com.euphony.fading_night_vision.config.Config;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.List;

import static com.euphony.fading_night_vision.FadingNightVision.config;
import static com.euphony.fading_night_vision.config.Config.DEFAULTS;

public final class YACLConfigScreen {
    private YACLConfigScreen() {}

    public static Screen generate(Screen parent) {
        Option<Double> fadingOutDurationOpt = Option.<Double>createBuilder()
                .name(Component.translatable("yacl3.config.fading_night_vision:config.fadingOutDuration"))
                .description(OptionDescription.of(Component.translatable(
                        "yacl3.config.fading_night_vision:config.fadingOutDuration.desc")))
                .binding(DEFAULTS.fadingOutDuration, () -> config.fadingOutDuration, newVal -> config.fadingOutDuration = newVal)
                .controller(opt -> DoubleSliderControllerBuilder.create(opt)
                        .range(1.0, 5.0)
                        .step(0.5)
                        .formatValue(value -> Component.literal(value + "s")))
                .build();

        return YetAnotherConfigLib.createBuilder()
                .title(Component.translatable("yacl3.config.fading_night_vision:config"))
                .category(ConfigCategory.createBuilder()
                        .name(Component.translatable("yacl3.config.fading_night_vision:config.category.client"))
                        .group(OptionGroup.createBuilder()
                                .name(Component.translatable(
                                        "yacl3.config.fading_night_vision:config.category.client.group.fading_night_vision"))
                                .options(List.of(fadingOutDurationOpt))
                                .build())
                        .build())
                .save(Config::save)
                .build()
                .generateScreen(parent);
    }
}
