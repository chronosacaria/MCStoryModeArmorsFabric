package chronosacaria.mcsa.materials;

import chronosacaria.mcsa.configs.McsaStatsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum McsaArmorMaterials implements ArmorMaterial {
    //Armor order: boots, leggings, chestplate, helmet

    /*
     * Durability:
     * Leather - 5
     * Iron = 14
     * Turtle = 25
     * Diamond = 33
     * Netherite = 37
     * Gold =37
     *
     * Enchantability:
     * Leather = 15
     * Iron = 9
     * Turtle = 9
     * Diamond = 10
     * Netherite = 15
     * Gold = 25
     *
     * Damage Reduction Amounts (boots, leggings, chestplate, helmet:
     * Leather = 1/2/3/1
     * Chain = 1/4/5/2
     * Iron = 2/5/6/2
     * Diamond = 3/6/8/3
     * Turtle = 2/5/6/2
     * Netherite = 3/6/8/3
     * Gold = 1/3/5/2
     *
     * reduce incoming damage by 35% => +2 armor toughness
     *
     *
     */

    ADAMANTIUM("adamantium",
            40,
            McsaStatsConfig.config.getAdamatineArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0f,
            3.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    CHAMPION_PETRA("championpetra",
            37,
            McsaStatsConfig.config.getChampionPetraArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            2.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    DRAGONSBANE("dragonsbane",
            37,
            McsaStatsConfig.config.getDragonsbaneArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            5.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    ELLEGAARD("ellegaard",
            37,
            McsaStatsConfig.config.getEllegaardArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    ENDER_DEFENDER("ender",
            37,
            McsaStatsConfig.config.getEnderDefenderArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    ENDERMAN_SOREN("enderman",
            35,
            McsaStatsConfig.config.getEndermanSorenArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    GABRIEL("gabriel",
            37,
            McsaStatsConfig.config.getGabrielArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    GOLDEN_GOLIATH("golden",
            37,
            McsaStatsConfig.config.getGoldenGoliathArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    GOLDEN_GOLIATH_CIRCUITRY("goldenu",
            37,
            McsaStatsConfig.config.getGoldenGoliathCircuitryArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    HARPERS_HEADSET("harper",
            37,
            McsaStatsConfig.config.getHarpersHeadsetArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    IVOR("ivor",
            37,
            McsaStatsConfig.config.getIvorArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    LUKAS("lukas",
            37,
            McsaStatsConfig.config.getLukasArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    MAGNUS("magnus",
            37,
            McsaStatsConfig.config.getMagnusArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    NINJA_IVOR_ARMOUR("ninja",
            37,
            McsaStatsConfig.config.getNinjaIvorArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    OLIVIA("olivia",
            37,
            McsaStatsConfig.config.getOliviaArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    PETRA("petra",
            37,
            McsaStatsConfig.config.getPetraArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    REDSTONE_RIOT("riot",
            37,
            McsaStatsConfig.config.getRedstoneRiot(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0f,
            2.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    SHIELD_OF_INFINITY("infinity",
            37,
            McsaStatsConfig.config.getShieldOfInfinity(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0f,
            2.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    SOREN("soren",
            37,
            McsaStatsConfig.config.getSorenArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    STAR_SHIELD("star",
            37,
            McsaStatsConfig.config.getStarShield(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0f,
            2.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    SWORDBREAKER("swordbreaker",
            37,
            McsaStatsConfig.config.getSwordbreakerArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.0f,
            5.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);}),

    TIMS_ARMOUR("tim",
            25,
            McsaStatsConfig.config.getTimsArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f,
            0.0f,
            () -> {return Ingredient.ofItems(Items.LEATHER);});


    private static final int[] baseDurability = new int[]{12,14,15,10};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    McsaArmorMaterials(String name, int durabilityMultiplier, int[] armorValueArray, int enchantability,
                       SoundEvent soundEvent, float toughness, float knockbackResistance,
                       Supplier<Ingredient> repairIngredient){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorValues = armorValueArray;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public int getDurability(EquipmentSlot equipmentSlot_1){
        return baseDurability[equipmentSlot_1.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
        return this.armorValues[equipmentSlot_1.getEntitySlotId()];
    }

    public int getEnchantability(){
        return this.enchantability;
    }

    public SoundEvent getEquipSound(){
        return this.equipSound;
    }

    public Ingredient getRepairIngredient(){
        return this.repairIngredient.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName(){
        return this.name;
    }

    public float getToughness(){
        return this.toughness;
    }

    public float getKnockbackResistance(){
        return this.knockbackResistance;
    }
}
