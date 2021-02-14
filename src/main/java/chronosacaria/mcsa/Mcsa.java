package chronosacaria.mcsa;

import chronosacaria.mcsa.items.ArmorSets;
import chronosacaria.mcsa.registry.ArmorsRegistry;
import chronosacaria.mcsa.registry.LootRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Mcsa implements ModInitializer {

    public static final String MOD_ID = "mcsa";

    public static Identifier ID (String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final ItemGroup ARMORS_GROUP = FabricItemGroupBuilder.build(ID("armor"),
            () -> new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ADAMANTIUM).get(EquipmentSlot.CHEST)));

    @Override
    public void onInitialize() {
        ArmorsRegistry.init();
        LootRegistry.init();
    }
}
