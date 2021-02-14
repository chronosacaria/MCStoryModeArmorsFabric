package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.items.ArmorSets;
import chronosacaria.mcsa.registry.ArmorsRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class LootRegistry {

    public static final Collection<Identifier> VILLAGE_SMITH_LOOT_TABLE = Collections.singletonList(
            LootTables.VILLAGE_WEAPONSMITH_CHEST
    );

    public static final Collection<Identifier> STRONGHOLD_LOOT_TABLES =
            Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
                LootTables.STRONGHOLD_CORRIDOR_CHEST, LootTables.STRONGHOLD_CROSSING_CHEST, LootTables.STRONGHOLD_LIBRARY_CHEST
            )));

    public static final Collection<Identifier> TEMPLE_LOOT_TABLES =
            Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
                    LootTables.JUNGLE_TEMPLE_CHEST, LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST, LootTables.DESERT_PYRAMID_CHEST
            )));

    public static final Collection<Identifier> ARMORER_GIFT_LOOT_TABLE = Collections.singletonList(
            LootTables.HERO_OF_THE_VILLAGE_ARMORER_GIFT_GAMEPLAY
    );

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
            if (!id.getNamespace().equals("minecraft"))
                return;

            FabricLootPoolBuilder poolBuilder;


            /* * * * * * * * * * * * * * * |
            | VILLAGER ARMORER LOOT TABLES |
            | * * * * * * * * * * * * * * */

            if (VILLAGE_SMITH_LOOT_TABLE.contains(id)){
                poolBuilder = FabricLootPoolBuilder.builder();
                addArmorSet(poolBuilder, ArmorSets.ELLEGAARD, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.GABRIEL, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.IVOR, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.LUKAS, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.MAGNUS, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.OLIVIA, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.PETRA, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.SOREN, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.TIMS_ARMOUR, 0.15F);
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * * * *|
            | STRONGHOLDS LOOT TABLES |
            |* * * * * * * * * * * * */

            else if (STRONGHOLD_LOOT_TABLES.contains(id)){
                poolBuilder = FabricLootPoolBuilder.builder();
                addArmorSet(poolBuilder, ArmorSets.DRAGONSBANE, 0.01F);
                addArmorSet(poolBuilder, ArmorSets.ENDER_DEFENDER, 0.01F);
                addArmorSet(poolBuilder, ArmorSets.GOLDEN_GOLIATH, 0.01F);
                addArmorSet(poolBuilder, ArmorSets.GOLDEN_GOLIATH_CIRCUITRY, 0.01F);
                addArmorSet(poolBuilder, ArmorSets.REDSTONE_RIOT, 0.01F);
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * *|
            | TEMPLES LOOT TABLES |
            |* * * * * * * * * * */

            else if (TEMPLE_LOOT_TABLES.contains(id)) {
                poolBuilder = FabricLootPoolBuilder.builder();
                addArmorSet(poolBuilder, ArmorSets.SHIELD_OF_INFINITY, 0.1F);
                addArmorSet(poolBuilder, ArmorSets.STAR_SHIELD, 0.1F);
                addArmorSet(poolBuilder, ArmorSets.SWORDBREAKER, 0.1F);
                supplier.pool(poolBuilder);
            }

            /* * * * * * * * * * * * *|
            | ARMORER GIFT LOOT TABLE |
            |* * * * * * * * * * * * */

            else if (ARMORER_GIFT_LOOT_TABLE.contains(id)) {
                poolBuilder = FabricLootPoolBuilder.builder();
                addArmorSet(poolBuilder, ArmorSets.ADAMANTIUM, 0.15F);
                addArmorSet(poolBuilder, ArmorSets.CHAMPION_PETRA, 0.15F);
                supplier.pool(poolBuilder);
            }
        })));
    }
    public static void addArmorSet(FabricLootPoolBuilder poolBuilder, ArmorSets set, float p){
        ArmorsRegistry.armorItems.get(set).values()
                .forEach((item -> {
                    poolBuilder.rolls(new BinomialLootTableRange(1, p));
                    poolBuilder.with(ItemEntry.builder(item));
                }));
    }
}
