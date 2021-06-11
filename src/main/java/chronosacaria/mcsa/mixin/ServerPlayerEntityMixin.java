package chronosacaria.mcsa.mixin;

import chronosacaria.mcsa.effects.ArmorEffects;
import chronosacaria.mcsa.registry.BlockRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    public void tick (CallbackInfo ci){
        ServerPlayerEntity playerEntity = (ServerPlayerEntity) (Object) this;
        if (playerEntity.isAlive()){
            ItemStack helmetStack = playerEntity.getEquippedStack(EquipmentSlot.HEAD);

            if (helmetStack.getItem() == BlockRegistry.CARVED_WHITE_PUMPKIN_BLOCK.asItem()){
                ArmorEffects.applyNightVision(playerEntity);
            }
        }
    }
}
