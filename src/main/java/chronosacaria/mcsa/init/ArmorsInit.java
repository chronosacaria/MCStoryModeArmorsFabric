package chronosacaria.mcsa.init;

import chronosacaria.mcsa.Mcsa;
import chronosacaria.mcsa.bases.ArmorItemBase;
import chronosacaria.mcsa.materials.McsaArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class ArmorsInit {
    public static Item ADAMANTIUM_IMPERVIUM_HELMET;
    public static Item ADAMANTIUM_IMPERVIUM_CHESTPLATE;
    public static Item ADAMANTIUM_IMPERVIUM_LEGGINGS;
    public static Item ADAMANTIUM_IMPERVIUM_BOOTS;

    public static Item CHAMPION_PETRA_HELMET;
    public static Item CHAMPION_PETRA_CHESTPLATE;
    public static Item CHAMPION_PETRA_LEGGINGS;
    public static Item CHAMPION_PETRA_BOOTS;

    public static Item DRAGONSBANE_HELMET;
    public static Item DRAGONSBANE_CHESTPLATE;
    public static Item DRAGONSBANE_LEGGINGS;
    public static Item DRAGONSBANE_BOOTS;

    public static Item ELLEGAARD_HELMET;
    public static Item ELLEGAARD_CHESTPLATE;
    public static Item ELLEGAARD_LEGGINGS;
    public static Item ELLEGAARD_BOOTS;

    public static Item ENDER_DEFENDER_HELMET;
    public static Item ENDER_DEFENDER_CHESTPLATE;
    public static Item ENDER_DEFENDER_LEGGINGS;
    public static Item ENDER_DEFENDER_BOOTS;

    public static Item ENDERMAN_SOREN_HELMET;
    public static Item ENDERMAN_SOREN_CHESTPLATE;
    public static Item ENDERMAN_SOREN_LEGGINGS;
    public static Item ENDERMAN_SOREN_BOOTS;

    public static Item GABRIEL_HELMET;
    public static Item GABRIEL_CHESTPLATE;
    public static Item GABRIEL_LEGGINGS;
    public static Item GABRIEL_BOOTS;

    public static Item GOLDEN_GOLIATH_HELMET;
    public static Item GOLDEN_GOLIATH_CHESTPLATE;
    public static Item GOLDEN_GOLIATH_LEGGINGS;
    public static Item GOLDEN_GOLIATH_BOOTS;

    public static Item GOLDEN_GOLIATH_CIRCUITRY_HELMET;
    public static Item GOLDEN_GOLIATH_CIRCUITRY_CHESTPLATE;
    public static Item GOLDEN_GOLIATH_CIRCUITRY_LEGGINGS;
    public static Item GOLDEN_GOLIATH_CIRCUITRY_BOOTS;

    public static Item HARPERS_HEADSET_HELMET;

    public static Item IVOR_HELMET;
    public static Item IVOR_CHESTPLATE;
    public static Item IVOR_LEGGINGS;
    public static Item IVOR_BOOTS;

    public static Item LUKAS_HELMET;
    public static Item LUKAS_CHESTPLATE;
    public static Item LUKAS_LEGGINGS;
    public static Item LUKAS_BOOTS;

    public static Item MAGNUS_HELMET;
    public static Item MAGNUS_CHESTPLATE;
    public static Item MAGNUS_LEGGINGS;
    public static Item MAGNUS_BOOTS;

    public static Item NINJA_IVOR_HELMET;
    public static Item NINJA_IVOR_CHESTPLATE;
    public static Item NINJA_IVOR_LEGGINGS;
    public static Item NINJA_IVOR_BOOTS;

    public static Item OLIVIA_HELMET;
    public static Item OLIVIA_CHESTPLATE;
    public static Item OLIVIA_LEGGINGS;
    public static Item OLIVIA_BOOTS;

    public static Item PETRA_HELMET;
    public static Item PETRA_CHESTPLATE;
    public static Item PETRA_LEGGINGS;
    public static Item PETRA_BOOTS;

    public static Item PRISMARINE_SOLDIER_HELMET;
    public static Item PRISMARINE_SOLDIER_CHESTPLATE;
    public static Item PRISMARINE_SOLDIER_LEGGINGS;
    public static Item PRISMARINE_SOLDIER_BOOTS;

    public static Item REDSTONE_RIOT_HELMET;
    public static Item REDSTONE_RIOT_CHESTPLATE;
    public static Item REDSTONE_RIOT_LEGGINGS;
    public static Item REDSTONE_RIOT_BOOTS;

    public static Item SHIELD_OF_INFINITY_HELMET;
    public static Item SHIELD_OF_INFINITY_CHESTPLATE;
    public static Item SHIELD_OF_INFINITY_LEGGINGS;
    public static Item SHIELD_OF_INFINITY_BOOTS;

    public static Item SOREN_HELMET;
    public static Item SOREN_CHESTPLATE;
    public static Item SOREN_LEGGINGS;
    public static Item SOREN_BOOTS;

    public static Item STAR_SHIELD_HELMET;
    public static Item STAR_SHIELD_CHESTPLATE;
    public static Item STAR_SHIELD_LEGGINGS;
    public static Item STAR_SHIELD_BOOTS;

    public static Item SWORDBREAKER_HELMET;
    public static Item SWORDBREAKER_CHESTPLATE;
    public static Item SWORDBREAKER_LEGGINGS;
    public static Item SWORDBREAKER_BOOTS;

    public static Item TIMS_HELMET;
    public static Item TIMS_CHESTPLATE;
    public static Item TIMS_LEGGINGS;
    public static Item TIMS_BOOTS;


    public static void init(){
        ADAMANTIUM_IMPERVIUM_HELMET = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_helmet");
        ADAMANTIUM_IMPERVIUM_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_chestplate");
        ADAMANTIUM_IMPERVIUM_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_leggings");
        ADAMANTIUM_IMPERVIUM_BOOTS = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_boots");

        CHAMPION_PETRA_HELMET = new ArmorItemBase(McsaArmorMaterials.CHAMPION_PETRA, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "champion_petra_helmet");
        CHAMPION_PETRA_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.CHAMPION_PETRA, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "champion_petra_chestplate");
        CHAMPION_PETRA_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.CHAMPION_PETRA, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "champion_petra_leggings");
        CHAMPION_PETRA_BOOTS = new ArmorItemBase(McsaArmorMaterials.CHAMPION_PETRA, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "champion_petra_boots");

        DRAGONSBANE_HELMET = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_helmet");
        DRAGONSBANE_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_chestplate");
        DRAGONSBANE_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_leggings");
        DRAGONSBANE_BOOTS = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_boots");

        ELLEGAARD_HELMET = new ArmorItemBase(McsaArmorMaterials.ELLEGAARD, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "ellegaard_helmet");
        ELLEGAARD_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ELLEGAARD, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "ellegaard_chestplate");
        ELLEGAARD_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ELLEGAARD, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "ellegaard_leggings");
        ELLEGAARD_BOOTS = new ArmorItemBase(McsaArmorMaterials.ELLEGAARD, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "ellegaard_boots");

        ENDER_DEFENDER_HELMET = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_helmet");
        ENDER_DEFENDER_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_chestplate");
        ENDER_DEFENDER_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_leggings");
        ENDER_DEFENDER_BOOTS = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_boots");

        ENDERMAN_SOREN_HELMET = new ArmorItemBase(McsaArmorMaterials.ENDERMAN_SOREN, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "enderman_soren_helmet");
        ENDERMAN_SOREN_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ENDERMAN_SOREN, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "enderman_soren_chestplate");
        ENDERMAN_SOREN_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ENDERMAN_SOREN, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "enderman_soren_leggings");
        ENDERMAN_SOREN_BOOTS = new ArmorItemBase(McsaArmorMaterials.ENDERMAN_SOREN, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "enderman_soren_boots");

        GABRIEL_HELMET = new ArmorItemBase(McsaArmorMaterials.GABRIEL, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "gabriel_helmet");
        GABRIEL_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.GABRIEL, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "gabriel_chestplate");
        GABRIEL_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.GABRIEL, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "gabriel_leggings");
        GABRIEL_BOOTS = new ArmorItemBase(McsaArmorMaterials.GABRIEL, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "gabriel_boots");

        GOLDEN_GOLIATH_HELMET = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_helmet");
        GOLDEN_GOLIATH_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_chestplate");
        GOLDEN_GOLIATH_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_leggings");
        GOLDEN_GOLIATH_BOOTS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_boots");

        GOLDEN_GOLIATH_CIRCUITRY_HELMET = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH_CIRCUITRY, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_circuitry_helmet");
        GOLDEN_GOLIATH_CIRCUITRY_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH_CIRCUITRY, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_circuitry_chestplate");
        GOLDEN_GOLIATH_CIRCUITRY_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH_CIRCUITRY, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_circuitry_leggings");
        GOLDEN_GOLIATH_CIRCUITRY_BOOTS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH_CIRCUITRY, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_circuitry_boots");

        HARPERS_HEADSET_HELMET = new ArmorItemBase(McsaArmorMaterials.HARPERS_HEADSET, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "harpers_headset_helmet");

        IVOR_HELMET = new ArmorItemBase(McsaArmorMaterials.IVOR, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "ivor_helmet");
        IVOR_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.IVOR, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "ivor_chestplate");
        IVOR_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.IVOR, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "ivor_leggings");
        IVOR_BOOTS = new ArmorItemBase(McsaArmorMaterials.IVOR, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "ivor_boots");

        LUKAS_HELMET = new ArmorItemBase(McsaArmorMaterials.LUKAS, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "lukas_helmet");
        LUKAS_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.LUKAS, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "lukas_chestplate");
        LUKAS_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.LUKAS, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "lukas_leggings");
        LUKAS_BOOTS = new ArmorItemBase(McsaArmorMaterials.LUKAS, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "lukas_boots");

        MAGNUS_HELMET = new ArmorItemBase(McsaArmorMaterials.MAGNUS, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "magnus_helmet");
        MAGNUS_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.MAGNUS, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "magnus_chestplate");
        MAGNUS_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.MAGNUS, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "magnus_leggings");
        MAGNUS_BOOTS = new ArmorItemBase(McsaArmorMaterials.MAGNUS, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "magnus_boots");

        NINJA_IVOR_HELMET = new ArmorItemBase(McsaArmorMaterials.NINJA_IVOR_ARMOUR, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "ninja_ivor_helmet");
        NINJA_IVOR_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.NINJA_IVOR_ARMOUR, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "ninja_ivor_chestplate");
        NINJA_IVOR_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.NINJA_IVOR_ARMOUR, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "ninja_ivor_leggings");
        NINJA_IVOR_BOOTS = new ArmorItemBase(McsaArmorMaterials.NINJA_IVOR_ARMOUR, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "ninja_ivor_boots");

        OLIVIA_HELMET = new ArmorItemBase(McsaArmorMaterials.OLIVIA, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "olivia_helmet");
        OLIVIA_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.OLIVIA, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "olivia_chestplate");
        OLIVIA_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.OLIVIA, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "olivia_leggings");
        OLIVIA_BOOTS = new ArmorItemBase(McsaArmorMaterials.OLIVIA, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "olivia_boots");

        PETRA_HELMET = new ArmorItemBase(McsaArmorMaterials.PETRA, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "petra_helmet");
        PETRA_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.PETRA, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "petra_chestplate");
        PETRA_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.PETRA, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "petra_leggings");
        PETRA_BOOTS = new ArmorItemBase(McsaArmorMaterials.PETRA, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "petra_boots");

        PRISMARINE_SOLDIER_HELMET = new ArmorItemBase(McsaArmorMaterials.PRISMARINE, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "prismarine_soldier_helmet");
        PRISMARINE_SOLDIER_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.PRISMARINE, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "prismarine_soldier_chestplate");
        PRISMARINE_SOLDIER_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.PRISMARINE, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "prismarine_soldier_leggings");
        PRISMARINE_SOLDIER_BOOTS = new ArmorItemBase(McsaArmorMaterials.PRISMARINE, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "prismarine_soldier_boots");

        REDSTONE_RIOT_HELMET = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_helmet");
        REDSTONE_RIOT_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_chestplate");
        REDSTONE_RIOT_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_leggings");
        REDSTONE_RIOT_BOOTS = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_boots");

        SHIELD_OF_INFINITY_HELMET = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_helmet");
        SHIELD_OF_INFINITY_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_chestplate");
        SHIELD_OF_INFINITY_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_leggings");
        SHIELD_OF_INFINITY_BOOTS = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_boots");

        SOREN_HELMET = new ArmorItemBase(McsaArmorMaterials.SOREN, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "soren_helmet");
        SOREN_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.SOREN, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "soren_chestplate");
        SOREN_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.SOREN, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "soren_leggings");
        SOREN_BOOTS = new ArmorItemBase(McsaArmorMaterials.SOREN, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "soren_boots");

        STAR_SHIELD_HELMET = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "star_shield_helmet");
        STAR_SHIELD_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "star_shield_chestplate");
        STAR_SHIELD_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "star_shield_leggings");
        STAR_SHIELD_BOOTS = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "star_shield_boots");

        SWORDBREAKER_HELMET = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_helmet");
        SWORDBREAKER_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_chestplate");
        SWORDBREAKER_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_leggings");
        SWORDBREAKER_BOOTS = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_boots");

        TIMS_HELMET = new ArmorItemBase(McsaArmorMaterials.TIMS_ARMOUR, EquipmentSlot.HEAD, new Item.Settings().group(Mcsa.ARMORS), "tim_helmet");
        TIMS_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.TIMS_ARMOUR, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "tim_chestplate");
        TIMS_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.TIMS_ARMOUR, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "tim_leggings");
        TIMS_BOOTS = new ArmorItemBase(McsaArmorMaterials.TIMS_ARMOUR, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "tim_boots");
    }
}
