package chronosacaria.mcsa.configs;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name="mcsa_stats")
public class McsaStatsConfig implements ConfigData {
    static {
        AutoConfig.register(McsaStatsConfig.class, JanksonConfigSerializer::new);
    }

    public static final McsaStatsConfig config = AutoConfig.getConfigHolder(McsaStatsConfig.class).getConfig();

    @Comment("Adamantine Armor; Feet, Legs, Body, Head")
    public int[] AdamatineArmor = {4,7,9,4};
    public float AdamantineToughness = 3.0F;
    public float AdamantineKnockback = 0.3F;

    @Comment("Champion Petra Armor; Feet, Legs, Body, Head")
    public int[] ChampionPetraArmor = {4,7,9,4};
    public float ChampionPetraToughness = 2.0F;
    public float ChampionPetraKnockback = 0.2F;

    @Comment("Dragonsbane Armor; Feet, Legs, Body, Head")
    public int[] DragonsbaneArmor = {4,7,9,4};
    public float DragonsbaneToughness = 2.0F;
    public float DragonsbaneKnockback = 0.5F;

    @Comment("Ellegaard's Armor; Feet, Legs, Body, Head")
    public int[] EllegaardArmor = {3,6,8,3};
    public float EllegaardToughness = 2.0F;
    public float EllegaardKnockback = 0F;

    @Comment("Ender Defender Armor; Feet, Legs, Body, Head")
    public int[] EnderDefenderArmor = {4,7,9,4};
    public float EnderDefenderToughness = 2.0F;
    public float EnderDefenderKnockback = 0F;

    @Comment("Soren's Enderman Suit Armor; Feet, Legs, Body, Head")
    public int[] EndermanSorenArmor = {3,6,8,3};
    public float EndermanSorenToughness = 0F;
    public float EndermanSorenKnockback = 0F;

    @Comment("Gabriel's Armor; Feet, Legs, Body, Head")
    public int[] GabrielArmor = {3,6,8,3};
    public float GabrielToughness = 2.0F;
    public float GabrielKnockback = 0F;

    @Comment("Golden Goliath Armor; Feet, Legs, Body, Head")
    public int[] GoldenGoliathArmor = {4,7,9,4};
    public float GoldenGoliathToughness = 2.0F;
    public float GoldenGoliathKnockback = 0F;

    @Comment("Golden Goliath Circuitry Armor; Feet, Legs, Body, Head")
    public int[] GoldenGoliathCircuitryArmor = {4,7,9,4};
    public float GoldenGoliathCircuitryToughness = 2.0F;
    public float GoldenGoliathCircuitryKnockback = 0F;

    @Comment("Harper's Headset; Feet, Legs, Body, Head")
    public int[] HarpersHeadsetArmor = {4,7,9,4};
    public float HarpersHeadsetToughness = 2.0F;
    public float HarpersHeadsetKnockback = 0F;

    @Comment("Ivor's Armor; Feet, Legs, Body, Head")
    public int[] IvorArmor = {3,6,8,3};
    public float IvorToughness = 2.0F;
    public float IvorKnockback = 0F;

    @Comment("Lukas' Armor; Feet, Legs, Body, Head")
    public int[] LukasArmor = {3,6,8,3};
    public float LukasToughness = 2.0F;
    public float LukasKnockback = 0F;

    @Comment("Magnus' Armor; Feet, Legs, Body, Head")
    public int[] MagnusArmor = {3,6,8,3};
    public float MagnusToughness = 2.0F;
    public float MagnusKnockback = 0F;

    @Comment("Ninja Ivor's Armor; Feet, Legs, Body, Head")
    public int[] NinjaIvorArmor = {3,6,8,3};
    public float NinjaIvorToughness = 1.0F;
    public float NinjaIvorKnockback = 0F;

    @Comment("Olivia's Armor; Feet, Legs, Body, Head")
    public int[] OliviaArmor = {3,6,8,3};
    public float OliviaToughness = 2.0F;
    public float OliviaKnockback = 0F;

    @Comment("Petra's Armor; Feet, Legs, Body, Head")
    public int[] PetraArmor = {3,6,8,3};
    public float PetraToughness = 2.0F;
    public float PetraKnockback = 0F;

    @Comment("Prismarine Soldier Armor; Feet, Legs, Body, Head")
    public int[] PrismarineArmor = {3,6,8,3};
    public float PrismarineToughness = 2.0F;
    public float PrismarineKnockback = 0F;

    @Comment("Redstone Riot Armor; Feet, Legs, Body, Head")
    public int[] RedstoneRiot = {4,7,9,4};
    public float RedstoneRiotToughness = 3.0F;
    public float RedstoneRiotKnockback = 0.2F;

    @Comment("Shield of Infinity Armor; Feet, Legs, Body, Head")
    public int[] ShieldOfInfinity = {4,7,9,4};
    public float ShieldOfInfinityToughness = 3.0F;
    public float ShieldOfInfinityKnockback = 0.2F;

    @Comment("Soren's Armor; Feet, Legs, Body, Head")
    public int[] SorenArmor = {3,6,8,3};
    public float SorenToughness = 1.0F;
    public float SorenKnockback = 0F;

    @Comment("Star Shield Armor; Feet, Legs, Body, Head")
    public int[] StarShield = {4,7,9,4};
    public float StartShieldToughness = 3.0F;
    public float StartShieldKnockback = 0.2F;

    @Comment("Swordbreaker Armor; Feet, Legs, Body, Head")
    public int[] SwordbreakerArmor = {4,7,9,4};
    public float SwordbreakerToughness = 1.0F;
    public float SwordbreakerKnockback = 0.5F;

    @Comment("Tim's Armor; Feet, Legs, Body, Head")
    public int[] TimsArmor = {3,6,8,3};
    public float TimsToughness = 0F;
    public float TimsKnockback = 0F;

    public int[] getAdamatineArmor() { return AdamatineArmor; }
    public float getAdamantineToughness() { return AdamantineToughness; }
    public float getAdamantineKnockback() { return AdamantineKnockback; }

    public int[] getChampionPetraArmor() { return ChampionPetraArmor; }
    public float getChampionPetraToughness() { return ChampionPetraToughness; }
    public float getChampionPetraKnockback() { return ChampionPetraKnockback; }

    public int[] getEllegaardArmor() { return EllegaardArmor; }
    public float getEllegaardToughness() { return EllegaardToughness; }
    public float getEllegaardKnockback() { return EllegaardKnockback; }

    public int[] getEnderDefenderArmor() { return EnderDefenderArmor; }
    public float getEnderDefenderToughness() { return EnderDefenderToughness; }
    public float getEnderDefenderKnockback() { return EnderDefenderKnockback; }

    public int[] getEndermanSorenArmor() { return EndermanSorenArmor; }
    public float getEndermanSorenToughness() { return EndermanSorenToughness; }
    public float getEndermanSorenKnockback() { return EndermanSorenKnockback; }

    public int[] getDragonsbaneArmor() { return DragonsbaneArmor; }
    public float getDragonsbaneToughness() { return DragonsbaneToughness; }
    public float getDragonsbaneKnockback() { return DragonsbaneKnockback; }

    public int[] getGabrielArmor() { return GabrielArmor; }
    public float getGabrielToughness() { return GabrielToughness; }
    public float getGabrielKnockback() { return GabrielKnockback; }

    public int[] getGoldenGoliathArmor() { return GoldenGoliathArmor; }
    public float getGoldenGoliathToughness() { return GoldenGoliathToughness; }
    public float getGoldenGoliathKnockback() {return GoldenGoliathKnockback;}

    public int[] getGoldenGoliathCircuitryArmor() { return GoldenGoliathCircuitryArmor; }
    public float getGoldenGoliathCircuitryToughness() { return GoldenGoliathCircuitryToughness; }
    public float getGoldenGoliathCircuitryKnockback() { return GoldenGoliathCircuitryKnockback; }

    public int[] getHarpersHeadsetArmor() { return HarpersHeadsetArmor; }
    public float getHarpersHeadsetToughness() { return HarpersHeadsetToughness; }
    public float getHarpersHeadsetKnockback() { return HarpersHeadsetKnockback; }

    public int[] getIvorArmor() { return IvorArmor; }
    public float getIvorToughness() { return IvorToughness; }
    public float getIvorKnockback() { return IvorKnockback; }

    public int[] getLukasArmor() { return LukasArmor; }
    public float getLukasToughness() { return LukasToughness; }
    public float getLukasKnockback() { return LukasKnockback; }

    public int[] getMagnusArmor() { return MagnusArmor; }
    public float getMagnusToughness() { return MagnusToughness; }
    public float getMagnusKnockback() { return MagnusKnockback; }

    public int[] getNinjaIvorArmor() { return NinjaIvorArmor; }
    public float getNinjaIvorToughness() { return NinjaIvorToughness; }
    public float getNinjaIvorKnockback() { return NinjaIvorKnockback; }

    public int[] getOliviaArmor() { return OliviaArmor; }
    public float getOliviaToughness() { return OliviaToughness; }
    public float getOliviaKnockback() { return OliviaKnockback; }

    public int[] getPetraArmor() { return PetraArmor; }
    public float getPetraToughness() { return PetraToughness; }
    public float getPetraKnockback() { return PetraKnockback; }

    public int[] getPrismarineArmor() { return PrismarineArmor; }
    public float getPrismarineToughness() { return PrismarineToughness; }
    public float getPrismarineKnockback() { return PrismarineKnockback; }

    public int[] getRedstoneRiot() { return RedstoneRiot; }
    public float getRedstoneRiotToughness() { return RedstoneRiotToughness; }
    public float getRedstoneRiotKnockback() { return RedstoneRiotKnockback; }

    public int[] getShieldOfInfinity() { return ShieldOfInfinity; }
    public float getShieldOfInfinityToughness() { return ShieldOfInfinityToughness; }
    public float getShieldOfInfinityKnockback() { return ShieldOfInfinityKnockback; }

    public int[] getSorenArmor() { return SorenArmor; }
    public float getSorenToughness() { return SorenToughness; }
    public float getSorenKnockback() { return SorenKnockback; }

    public int[] getStarShield() { return StarShield; }
    public float getStartShieldToughness() { return StartShieldToughness; }
    public float getStartShieldKnockback() { return StartShieldKnockback; }

    public int[] getSwordbreakerArmor() { return SwordbreakerArmor; }
    public float getSwordbreakerToughness() { return SwordbreakerToughness; }
    public float getSwordbreakerKnockback() { return SwordbreakerKnockback; }

    public int[] getTimsArmor() { return TimsArmor; }
    public float getTimsToughness() { return TimsToughness; }
    public float getTimsKnockback() { return TimsKnockback; }
}
