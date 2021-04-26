/*package chronosacaria.mcsa.mixin;

import chronosacaria.mcsa.effects.ArmorEffects;
import chronosacaria.mcsa.items.ArmorSets;
import chronosacaria.mcsa.registry.ArmorsRegistry;
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
            ItemStack helmetStack = playerEntity.inventory.armor.get(3);

            if (helmetStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.WHITE_PUMPKIN).get(EquipmentSlot.HEAD).asItem()) {
                ArmorEffects.applyNightVision(playerEntity);
            }
        }
    }
}*/
