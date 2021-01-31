package chronosacaria.mcsa.mixin;

import chronosacaria.mcsa.init.ArmorsInit;
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
        ItemStack helmetStack = (ItemStack)player.inventory.armor.get(3);
        ItemStack chestplateStack = (ItemStack)player.inventory.armor.get(2);
        ItemStack leggingsStack = (ItemStack)player.inventory.armor.get(1);
        ItemStack bootsStack = (ItemStack)player.inventory.armor.get(0);

        if (helmetStack.getItem() == ArmorsInit.ENDERMAN_SOREN_HELMET.asItem()
                && chestplateStack.getItem() == ArmorsInit.ENDERMAN_SOREN_CHESTPLATE
                && leggingsStack.getItem() == ArmorsInit.ENDERMAN_SOREN_LEGGINGS
                && bootsStack.getItem() == ArmorsInit.ENDERMAN_SOREN_BOOTS){
            cir.setReturnValue(false);
        }
    }

}
