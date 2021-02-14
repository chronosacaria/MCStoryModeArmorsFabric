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
public class EndermanSuitNoAggroMixin {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir){
        ItemStack helmetStack = player.inventory.armor.get(3);
        ItemStack chestplateStack = player.inventory.armor.get(2);
        ItemStack leggingsStack = player.inventory.armor.get(1);
        ItemStack bootsStack = player.inventory.armor.get(0);

        if (helmetStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDERMAN_SOREN).get(EquipmentSlot.HEAD).asItem()
                && chestplateStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDERMAN_SOREN).get(EquipmentSlot.CHEST).asItem()
                && leggingsStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDERMAN_SOREN).get(EquipmentSlot.LEGS).asItem()
                && bootsStack.getItem() == ArmorsRegistry.armorItems.get(ArmorSets.ENDERMAN_SOREN).get(EquipmentSlot.FEET).asItem())
            cir.setReturnValue(false);
    }
}
