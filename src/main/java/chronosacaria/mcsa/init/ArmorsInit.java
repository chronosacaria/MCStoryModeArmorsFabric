package chronosacaria.mcsa.init;

import chronosacaria.mcsa.Mcsa;
import chronosacaria.mcsa.bases.ArmorItemBase;
import chronosacaria.mcsa.materials.McsaArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class ArmorsInit {
    public static Item ADAMANTIUM_IMPERVIUM_CHESTPLATE;
    public static Item ADAMANTIUM_IMPERVIUM_LEGGINGS;
    public static Item ADAMANTIUM_IMPERVIUM_BOOTS;

    public static Item SWORDBREAKER_CHESTPLATE;
    public static Item SWORDBREAKER_LEGGINGS;
    public static Item SWORDBREAKER_BOOTS;

    public static Item DRAGONSBANE_CHESTPLATE;
    public static Item DRAGONSBANE_LEGGINGS;
    public static Item DRAGONSBANE_BOOTS;

    public static Item ENDER_DEFENDER_CHESTPLATE;
    public static Item ENDER_DEFENDER_LEGGINGS;
    public static Item ENDER_DEFENDER_BOOTS;

    public static Item GOLDEN_GOLIATH_CHESTPLATE;
    public static Item GOLDEN_GOLIATH_LEGGINGS;
    public static Item GOLDEN_GOLIATH_BOOTS;

    public static Item STAR_SHIELD_CHESTPLATE;
    public static Item STAR_SHIELD_LEGGINGS;
    public static Item STAR_SHIELD_BOOTS;

    public static Item REDSTONE_RIOT_CHESTPLATE;
    public static Item REDSTONE_RIOT_LEGGINGS;
    public static Item REDSTONE_RIOT_BOOTS;

    public static Item SHIELD_OF_INFINITY_CHESTPLATE;
    public static Item SHIELD_OF_INFINITY_LEGGINGS;
    public static Item SHIELD_OF_INFINITY_BOOTS;

    public static void init(){
        ADAMANTIUM_IMPERVIUM_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_chestplate");
        ADAMANTIUM_IMPERVIUM_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_leggings");
        ADAMANTIUM_IMPERVIUM_BOOTS = new ArmorItemBase(McsaArmorMaterials.ADAMANTIUM, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "adamantium_impervium_boots");

        SWORDBREAKER_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_chestplate");
        SWORDBREAKER_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_leggings");
        SWORDBREAKER_BOOTS = new ArmorItemBase(McsaArmorMaterials.SWORDBREAKER, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "swordbreaker_boots");

        DRAGONSBANE_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_chestplate");
        DRAGONSBANE_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_leggings");
        DRAGONSBANE_BOOTS = new ArmorItemBase(McsaArmorMaterials.DRAGONSBANE, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "dragonsbane_boots");

        ENDER_DEFENDER_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_chestplate");
        ENDER_DEFENDER_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_leggings");
        ENDER_DEFENDER_BOOTS = new ArmorItemBase(McsaArmorMaterials.ENDER_DEFENDER, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "ender_defender_boots");

        GOLDEN_GOLIATH_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_chestplate");
        GOLDEN_GOLIATH_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_leggings");
        GOLDEN_GOLIATH_BOOTS = new ArmorItemBase(McsaArmorMaterials.GOLDEN_GOLIATH, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "golden_goliath_boots");

        STAR_SHIELD_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "star_shield_chestplate");
        STAR_SHIELD_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "star_shield_leggings");
        STAR_SHIELD_BOOTS = new ArmorItemBase(McsaArmorMaterials.STAR_SHIELD, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "star_shield_boots");

        REDSTONE_RIOT_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_chestplate");
        REDSTONE_RIOT_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_leggings");
        REDSTONE_RIOT_BOOTS = new ArmorItemBase(McsaArmorMaterials.REDSTONE_RIOT, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "redstone_riot_boots");

        SHIELD_OF_INFINITY_CHESTPLATE = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.CHEST, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_chestplate");
        SHIELD_OF_INFINITY_LEGGINGS = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.LEGS, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_leggings");
        SHIELD_OF_INFINITY_BOOTS = new ArmorItemBase(McsaArmorMaterials.SHIELD_OF_INFINITY, EquipmentSlot.FEET, new Item.Settings().group(Mcsa.ARMORS), "shield_of_infinity_boots");



    }
}
