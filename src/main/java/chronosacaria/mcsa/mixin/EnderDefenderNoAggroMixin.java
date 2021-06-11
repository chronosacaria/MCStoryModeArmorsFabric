package chronosacaria.mcsa.mixin;

import chronosacaria.mcsa.items.ArmorSets;
import chronosacaria.mcsa.registry.ArmorsRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public class EnderDefenderNoAggroMixin {

    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir){
        ItemStack helmetStack = player.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestplateStack = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack leggingsStack = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack bootsStack = player.getEquippedStack(EquipmentSlot.FEET);

        if (helmetStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDER_DEFENDER).get(EquipmentSlot.HEAD).asItem()
                && chestplateStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDER_DEFENDER).get(EquipmentSlot.CHEST).asItem()
                && leggingsStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDER_DEFENDER).get(EquipmentSlot.LEGS).asItem()
                && bootsStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDER_DEFENDER).get(EquipmentSlot.FEET).asItem())
            cir.setReturnValue(false);
    }
}