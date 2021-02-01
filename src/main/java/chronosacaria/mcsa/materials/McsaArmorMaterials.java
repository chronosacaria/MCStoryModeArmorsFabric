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
    
    ADAMANTIUM("adamantium",
            40,
            McsaStatsConfig.config.getAdamatineArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getAdamantineToughness(),
            McsaStatsConfig.config.getAdamantineKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    CHAMPION_PETRA("championpetra",
            37,
            McsaStatsConfig.config.getChampionPetraArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getChampionPetraToughness(),
            McsaStatsConfig.config.getChampionPetraKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    DRAGONSBANE("dragonsbane",
            37,
            McsaStatsConfig.config.getDragonsbaneArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getDragonsbaneToughness(),
            McsaStatsConfig.config.getDragonsbaneKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    ELLEGAARD("ellegaard",
            37,
            McsaStatsConfig.config.getEllegaardArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getEllegaardToughness(),
            McsaStatsConfig.config.getEllegaardKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    ENDER_DEFENDER("ender",
            37,
            McsaStatsConfig.config.getEnderDefenderArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getEnderDefenderToughness(),
            McsaStatsConfig.config.getEnderDefenderKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    ENDERMAN_SOREN("enderman",
            35,
            McsaStatsConfig.config.getEndermanSorenArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getEndermanSorenToughness(),
            McsaStatsConfig.config.getEndermanSorenKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    GABRIEL("gabriel",
            37,
            McsaStatsConfig.config.getGabrielArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getGabrielToughness(),
            McsaStatsConfig.config.getGabrielKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    GOLDEN_GOLIATH("golden",
            37,
            McsaStatsConfig.config.getGoldenGoliathArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getGoldenGoliathToughness(),
            McsaStatsConfig.config.getGoldenGoliathKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    GOLDEN_GOLIATH_CIRCUITRY("goldenu",
            37,
            McsaStatsConfig.config.getGoldenGoliathCircuitryArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getGoldenGoliathCircuitryToughness(),
            McsaStatsConfig.config.getGoldenGoliathCircuitryKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    HARPERS_HEADSET("harper",
            37,
            McsaStatsConfig.config.getHarpersHeadsetArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getHarpersHeadsetToughness(),
            McsaStatsConfig.config.getHarpersHeadsetKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    IVOR("ivor",
            37,
            McsaStatsConfig.config.getIvorArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getIvorToughness(),
            McsaStatsConfig.config.getIvorKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    LUKAS("lukas",
            37,
            McsaStatsConfig.config.getLukasArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getLukasToughness(),
            McsaStatsConfig.config.getLukasKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    MAGNUS("magnus",
            37,
            McsaStatsConfig.config.getMagnusArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getMagnusToughness(),
            McsaStatsConfig.config.getMagnusKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    NINJA_IVOR_ARMOUR("ninja",
            37,
            McsaStatsConfig.config.getNinjaIvorArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getNinjaIvorToughness(),
            McsaStatsConfig.config.getNinjaIvorKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    OLIVIA("olivia",
            37,
            McsaStatsConfig.config.getOliviaArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getOliviaToughness(),
            McsaStatsConfig.config.getOliviaKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    PETRA("petra",
            37,
            McsaStatsConfig.config.getPetraArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getPetraToughness(),
            McsaStatsConfig.config.getPetraKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    PRISMARINE("prismarine",
            37,
            McsaStatsConfig.config.getPrismarineArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getPrismarineToughness(),
            McsaStatsConfig.config.getPrismarineKnockback(),
            () -> {return Ingredient.ofItems(Items.PRISMARINE_BRICKS);}),

    REDSTONE_RIOT("riot",
            37,
            McsaStatsConfig.config.getRedstoneRiot(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getRedstoneRiotToughness(),
            McsaStatsConfig.config.getRedstoneRiotKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    SHIELD_OF_INFINITY("infinity",
            37,
            McsaStatsConfig.config.getShieldOfInfinity(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getShieldOfInfinityToughness(),
            McsaStatsConfig.config.getShieldOfInfinityKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    SOREN("soren",
            37,
            McsaStatsConfig.config.getSorenArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getSorenToughness(),
            McsaStatsConfig.config.getSorenKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    STAR_SHIELD("star",
            37,
            McsaStatsConfig.config.getStarShield(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getStartShieldToughness(),
            McsaStatsConfig.config.getStartShieldKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    SWORDBREAKER("swordbreaker",
            37,
            McsaStatsConfig.config.getSwordbreakerArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getSwordbreakerToughness(),
            McsaStatsConfig.config.getSwordbreakerKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);}),

    TIMS_ARMOUR("tim",
            25,
            McsaStatsConfig.config.getTimsArmor(),
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            McsaStatsConfig.config.getTimsToughness(),
            McsaStatsConfig.config.getTimsKnockback(),
            () -> {return Ingredient.ofItems(Items.DIAMOND);});


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
