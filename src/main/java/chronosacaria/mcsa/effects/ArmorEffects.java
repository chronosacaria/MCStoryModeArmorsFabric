package chronosacaria.mcsa.effects;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;

public class ArmorEffects {

    public static void applyNightVision(ServerPlayerEntity player) {
        StatusEffectInstance nightVision = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 210, 0, false, false);
        player.addStatusEffect(nightVision);
    }
}
