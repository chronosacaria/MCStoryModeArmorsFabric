package chronosacaria.mcsa.init;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class LootInit {

    public static final Identifier[] VILLAGE_SMITH_LOOT_TABLE = new Identifier[] {LootTables.VILLAGE_ARMORER_CHEST,
            LootTables.VILLAGE_WEAPONSMITH_CHEST};

    private static boolean villageArmorerLootTables(Identifier lootTable){
        for (Identifier id : VILLAGE_SMITH_LOOT_TABLE){
            if (id.equals(lootTable)){
                return true;
            }
        }
        return false;
    }


    public static void init() {
        LootTableLoadingCallback.EVENT.register((((resourceManager, manager, id, supplier, setter) -> {

            /* * * * * * * * * * * * * * * |
            | VILLAGER ARMORER LOOT TABLES |
            | * * * * * * * * * * * * * * */

            if (villageArmorerLootTables(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        // Ellegaard
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_HELMET))

                        // Gabriel
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_HELMET))

                        // Ivor
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_HELMET))

                        // Lukas
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_HELMET))

                        // Magnus
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_HELMET))

                        // Olivia
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_HELMET))

                        // Petra
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_HELMET))

                        // Soren
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_HELMET))

                        // Tim
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.05F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_HELMET));
                supplier.pool(poolBuilder);
            }

        })));


    }
}
