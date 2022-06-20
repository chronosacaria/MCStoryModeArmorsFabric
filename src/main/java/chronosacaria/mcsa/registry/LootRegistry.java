package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.configs.McsaConfig;
import chronosacaria.mcsa.items.ArmorSets;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.Collections;

public class LootRegistry {

    public static final Collection<Identifier> VILLAGE_SMITH_LOOT_TABLE = Collections.singletonList(
            LootTables.VILLAGE_WEAPONSMITH_CHEST
    );

    public static final Collection<Identifier> STRONGHOLD_LOOT_TABLES =
            java.util.Set.of(LootTables.STRONGHOLD_CORRIDOR_CHEST, LootTables.STRONGHOLD_CROSSING_CHEST, LootTables.STRONGHOLD_LIBRARY_CHEST);

    public static final Collection<Identifier> TEMPLE_LOOT_TABLES =
            java.util.Set.of(LootTables.JUNGLE_TEMPLE_CHEST, LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST, LootTables.DESERT_PYRAMID_CHEST);

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
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (!id.getNamespace().equals("minecraft"))
                return;

            LootPool.Builder lootPoolBuilder;


            /* * * * * * * * * * * * * * * |
            | VILLAGER ARMORER LOOT TABLES |
            | * * * * * * * * * * * * * * */

            if (VILLAGE_SMITH_LOOT_TABLE.contains(id)){
                lootPoolBuilder = LootPool.builder();
                addArmorSet(lootPoolBuilder, ArmorSets.ELLEGAARD,   McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.GABRIEL,     McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.IVOR,        McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.LUKAS,       McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.MAGNUS,      McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.OLIVIA,      McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.PETRA,       McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.SOREN,       McsaConfig.config.getCharacterArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.TIMS_ARMOUR, McsaConfig.config.getCharacterArmourSpawnRate());
                tableBuilder.pool(lootPoolBuilder);
            }

            /* * * * * * * * * * * * *|
            | STRONGHOLDS LOOT TABLES |
            |* * * * * * * * * * * * */

            else if (STRONGHOLD_LOOT_TABLES.contains(id)){
                lootPoolBuilder = LootPool.builder();
                addArmorSet(lootPoolBuilder, ArmorSets.DRAGONSBANE,             McsaConfig.config.getStrongholdArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.ENDER_DEFENDER,          McsaConfig.config.getStrongholdArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.GOLDEN_GOLIATH,          McsaConfig.config.getStrongholdArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.GOLDEN_GOLIATH_CIRCUITRY,McsaConfig.config.getStrongholdArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.REDSTONE_RIOT,           McsaConfig.config.getStrongholdArmourSpawnRate());
                tableBuilder.pool(lootPoolBuilder);
            }

            /* * * * * * * * * * *|
            | TEMPLES LOOT TABLES |
            |* * * * * * * * * * */

            else if (TEMPLE_LOOT_TABLES.contains(id)) {
                lootPoolBuilder = LootPool.builder();
                addArmorSet(lootPoolBuilder, ArmorSets.SHIELD_OF_INFINITY,  McsaConfig.config.getTempleArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.STAR_SHIELD,         McsaConfig.config.getTempleArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.SWORDBREAKER,        McsaConfig.config.getTempleArmourSpawnRate());
                tableBuilder.pool(lootPoolBuilder);
            }

            /* * * * * * * * * * * * *|
            | ARMORER GIFT LOOT TABLE |
            |* * * * * * * * * * * * */

            else if (ARMORER_GIFT_LOOT_TABLE.contains(id)) {
                lootPoolBuilder = LootPool.builder();
                addArmorSet(lootPoolBuilder, ArmorSets.ADAMANTIUM,      McsaConfig.config.getHovArmourSpawnRate());
                addArmorSet(lootPoolBuilder, ArmorSets.CHAMPION_PETRA,  McsaConfig.config.getHovArmourSpawnRate());
                tableBuilder.pool(lootPoolBuilder);
            }
        }));
    }
    public static void addArmorSet(LootPool.Builder poolBuilder, ArmorSets set, float p){
        ArmorsRegistry.armorItems.get(set).values()
                .forEach((item -> {
                    poolBuilder.rolls(BinomialLootNumberProvider.create(1, p));
                    poolBuilder.with(ItemEntry.builder(item));
                }));
    }
}
