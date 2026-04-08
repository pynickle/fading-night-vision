package com.euphony.fading_night_vision.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static com.euphony.fading_night_vision.FadingNightVision.config;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
    @ModifyReturnValue(method = "getNightVisionScale", at = @At("RETURN"))
    private static float fading_night_vision$getNightVisionScaleModify(float original, LivingEntity camera, float a) {
        int fadingOutTicks = (int) (config.fadingOutDuration * 20);
        MobEffectInstance mobEffectInstance = camera.getEffect(MobEffects.NIGHT_VISION);
        if (mobEffectInstance != null) {
            return !mobEffectInstance.endsWithin(fadingOutTicks)
                    ? 1.0F
                    : (1f / fadingOutTicks * (mobEffectInstance.getDuration() - a));
        }
        return 1.0F;
    }
}
