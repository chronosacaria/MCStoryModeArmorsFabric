package chronosacaria.mcsa.configs;

import chronosacaria.mcsa.Mcsa;
import chronosacaria.mcsa.items.ArmorSets;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import net.minecraft.entity.EquipmentSlot;

import java.util.EnumMap;
import java.util.EnumSet;

import static chronosacaria.mcsa.items.ArmorSets.*;
import static net.minecraft.entity.EquipmentSlot.*;

@Config(name= Mcsa.MOD_ID)
public class McsaConfig implements ConfigData {
    public static final McsaConfig config;

    static {
        AutoConfig.register(McsaConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(McsaConfig.class).getConfig();
    }

    // config contents:
    public EnumMap<ArmorSets, ArmorStats> armorStats = new EnumMap<>(ArmorSets.class);

    @Comment("Character Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float characterArmourSpawnRate = 0.15F;

    public float getCharacterArmourSpawnRate(){
        return characterArmourSpawnRate;
    }

    @Comment("Stronghold Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float strongholdArmourSpawnRate = 0.1F;

    public float getStrongholdArmourSpawnRate(){
        return strongholdArmourSpawnRate;
    }

    @Comment("Temple Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float templeArmourSpawnRate = 0.1F;

    public float getTempleArmourSpawnRate(){
        return templeArmourSpawnRate;
    }

    @Comment("Armourer Hero of the Village Gift Rate (Percentage where 1.0 = 100%)")
    public float hovArmourSpawnRate = 0.15F;

    public float getHovArmourSpawnRate(){
        return hovArmourSpawnRate;
    }

    @Comment("Enable Villager Armour Trades")
    public boolean enableVillagerArmourTrades = false;

    // convenience methods:
    protected ArmorStats setProtection(int head, int chest, int legs, int feet, ArmorSets set) {
        return armorStats.get(set).setProtection(head, chest, legs, feet);
    }



    // set config defaults
    public McsaConfig() {
        for (ArmorSets armorSet : ArmorSets.values()) {
            armorStats.put(armorSet, new ArmorStats());
        }

        for (ArmorSets armorSet : ArmorSets.values()) {
            ArmorStats stats = new ArmorStats();
            stats.protection = new EnumMap<>(EquipmentSlot.class);
            for (EquipmentSlot slot : EnumSet.of(HEAD, CHEST, LEGS, FEET)) {
                stats.protection.put(slot, 0);
            }

            this.armorStats.put(armorSet, stats);
        }

        setProtection(4, 9, 7, 4, ADAMANTIUM).setToughness(3.0F).setKnockbackRes(0.3F);
        setProtection(4, 9, 7, 4, CHAMPION_PETRA).setToughness(2.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, DRAGONSBANE).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, ELLEGAARD).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ENDER_DEFENDER).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ENDERMAN_SOREN);
        setProtection(3, 8, 6, 3, GABRIEL).setToughness(2.0F);
        setProtection(4, 9, 7, 4, GOLDEN_GOLIATH).setToughness(2.0F);
        setProtection(4, 9, 7, 4, GOLDEN_GOLIATH_CIRCUITRY).setToughness(2.0F);
        setProtection(4, 9, 7, 4, HARPERS_HEADSET).setToughness(2.0F);
        setProtection(3, 8, 6, 3, IVOR).setToughness(2.0F);
        setProtection(3, 8, 6, 3, LUKAS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, MAGNUS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, NINJA_IVOR_ARMOUR).setToughness(1.0F);
        setProtection(3, 8, 6, 3, OLIVIA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, PETRA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, PRISMARINE).setToughness(2.0F);
        setProtection(4, 9, 7, 4, REDSTONE_RIOT).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, SHIELD_OF_INFINITY).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(3, 8, 6, 3, SOREN).setToughness(2.0F);
        setProtection(4, 9, 7, 4, STAR_SHIELD).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, SWORDBREAKER).setToughness(1.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, TIMS_ARMOUR).setToughness(2.0F);
        //setProtection(1, 1, 1, 1, WHITE_PUMPKIN);

    }
}
