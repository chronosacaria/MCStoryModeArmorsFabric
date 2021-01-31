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
public class EnderDefenderNoAggroMixin {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir){
        ItemStack chestplateStack = (ItemStack)player.inventory.armor.get(2);
        ItemStack leggingsStack = (ItemStack)player.inventory.armor.get(1);
        ItemStack bootsStack = (ItemStack)player.inventory.armor.get(0);

        if (chestplateStack.getItem() == ArmorsInit.ENDER_DEFENDER_CHESTPLATE
                && leggingsStack.getItem() == ArmorsInit.ENDER_DEFENDER_LEGGINGS
                && bootsStack.getItem() == ArmorsInit.ENDER_DEFENDER_BOOTS){
            cir.setReturnValue(false);
        }
    }
}
