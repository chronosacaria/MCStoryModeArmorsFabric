package chronosacaria.mcsa;

import chronosacaria.mcsa.init.ArmorsInit;
import chronosacaria.mcsa.init.LootInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Mcsa implements ModInitializer {

    public static final String MOD_ID = "mcsa";

    public static final ItemGroup ARMORS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "armor"),
            () -> new ItemStack(ArmorsInit.ADAMANTIUM_IMPERVIUM_CHESTPLATE));

    @Override
    public void onInitialize() {

        ArmorsInit.init();
        LootInit.init();
    }
}
