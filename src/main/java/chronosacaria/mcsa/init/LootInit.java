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

    public static final Identifier[] STRONGHOLD_LOOT_TABLES = new Identifier[] {LootTables.STRONGHOLD_CORRIDOR_CHEST,
            LootTables.STRONGHOLD_CROSSING_CHEST, LootTables.STRONGHOLD_LIBRARY_CHEST};

    public static final Identifier[] TEMPLE_LOOT_TABLES = new Identifier[] {LootTables.JUNGLE_TEMPLE_CHEST,
            LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST, LootTables.DESERT_PYRAMID_CHEST};

    public static final Identifier[] ARMORER_GIFT_LOOT_TABLE =
            new Identifier[] {LootTables.HERO_OF_THE_VILLAGE_ARMORER_GIFT_GAMEPLAY};

    private static boolean villageArmorerLootTables(Identifier lootTable){
        for (Identifier id : VILLAGE_SMITH_LOOT_TABLE){
            if (id.equals(lootTable)){
                return true;
            }
        }
        return false;
    }

    private static boolean strongholdLootTables(Identifier lootTable){
        for (Identifier id : STRONGHOLD_LOOT_TABLES){
            if (id.equals(lootTable)){
                return true;
            }
        }
        return false;
    }

    private static boolean templeLootTables(Identifier lootTable){
        for (Identifier id : TEMPLE_LOOT_TABLES){
            if (id.equals(lootTable)){
                return true;
            }
        }
        return false;
    }

    private static boolean armorerGiftLootTable(Identifier lootTable){
        for (Identifier id : ARMORER_GIFT_LOOT_TABLE){
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
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ELLEGAARD_HELMET))

                        // Gabriel
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.GABRIEL_HELMET))

                        // Ivor
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.IVOR_HELMET))

                        // Lukas
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.LUKAS_HELMET))

                        // Magnus
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.MAGNUS_HELMET))

                        // Olivia
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.OLIVIA_HELMET))

                        // Petra
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.PETRA_HELMET))

                        // Soren
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.SOREN_HELMET))

                        // Tim
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.TIMS_HELMET));
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * * * *|
            | STRONGHOLDS LOOT TABLES |
            |* * * * * * * * * * * * */

            if (strongholdLootTables(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()

                        // Dragonbane
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.DRAGONSBANE_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.DRAGONSBANE_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.DRAGONSBANE_CHESTPLATE))

                        // Ender Defender
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.ENDER_DEFENDER_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.ENDER_DEFENDER_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.ENDER_DEFENDER_CHESTPLATE))

                        // Golden Goliath & Golden Goliath Circuitry
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_CIRCUITRY_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_CIRCUITRY_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.GOLDEN_GOLIATH_CIRCUITRY_CHESTPLATE))

                        // Redstone Riot
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.REDSTONE_RIOT_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.REDSTONE_RIOT_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.REDSTONE_RIOT_CHESTPLATE));
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * *|
            | TEMPLES LOOT TABLES |
            |* * * * * * * * * * */

            if (templeLootTables(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()

                        // Shield of Infinity
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SHIELD_OF_INFINITY_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SHIELD_OF_INFINITY_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SHIELD_OF_INFINITY_CHESTPLATE))

                        // Star Shield
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.STAR_SHIELD_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.STAR_SHIELD_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.STAR_SHIELD_CHESTPLATE))

                        // Swordbreaker
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SWORDBREAKER_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SWORDBREAKER_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.1F))
                        .with(ItemEntry.builder(ArmorsInit.SWORDBREAKER_CHESTPLATE));
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * * * *|
            | ARMORER GIFT LOOT TABLE |
            |* * * * * * * * * * * * */

            if (armorerGiftLootTable(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()

                        // Adamantium Impervium
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ADAMANTIUM_IMPERVIUM_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ADAMANTIUM_IMPERVIUM_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.ADAMANTIUM_IMPERVIUM_CHESTPLATE))

                        // Champion Petra
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.CHAMPION_PETRA_BOOTS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.CHAMPION_PETRA_LEGGINGS))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.CHAMPION_PETRA_CHESTPLATE))
                        .rolls(new BinomialLootTableRange(1, 0.15F))
                        .with(ItemEntry.builder(ArmorsInit.CHAMPION_PETRA_HELMET));

                supplier.pool(poolBuilder);
            }
        })));


    }
}
