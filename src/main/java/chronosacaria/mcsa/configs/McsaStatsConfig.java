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

    @Comment("Feet, Legs, Body, Head")
    public int[] AdamatineArmor = {4,7,9,4};
    public int[] ChampionPetraArmor = {4,7,9,4};
    public int[] DragonsbaneArmor = {4,7,9,4};
    public int[] EllegaardArmor = {3,6,8,3};
    public int[] EndermanSorenArmor = {3,6,8,3};
    public int[] EnderDefenderArmor = {4,7,9,4};
    public int[] GabrielArmor = {3,6,8,3};
    public int[] GoldenGoliathArmor = {4,7,9,4};
    public int[] GoldenGoliathCircuitryArmor = {4,7,9,4};
    public int[] HarpersHeadsetArmor = {4,7,9,4};
    public int[] IvorArmor = {3,6,8,3};
    public int[] LukasArmor = {3,6,8,3};
    public int[] MagnusArmor = {3,6,8,3};
    public int[] NinjaIvorArmor = {3,6,8,3};
    public int[] OliviaArmor = {3,6,8,3};
    public int[] PetraArmor = {3,6,8,3};
    public int[] PrismarineArmor = {3,6,8,3};
    public int[] RedstoneRiot = {4,7,9,4};
    public int[] ShieldOfInfinity = {4,7,9,4};
    public int[] SorenArmor = {3,6,8,3};
    public int[] StarShield = {4,7,9,4};
    public int[] SwordbreakerArmor = {4,7,9,4};
    public int[] TimsArmor = {3,6,8,3};

    public int[] getAdamatineArmor() { return AdamatineArmor; }
    public int[] getChampionPetraArmor() { return ChampionPetraArmor; }
    public int[] getEllegaardArmor() { return EllegaardArmor; }
    public int[] getEndermanSorenArmor() { return EndermanSorenArmor; }
    public int[] getGabrielArmor() { return GabrielArmor; }
    public int[] getDragonsbaneArmor() { return DragonsbaneArmor; }
    public int[] getEnderDefenderArmor() { return EnderDefenderArmor; }
    public int[] getGoldenGoliathArmor() { return GoldenGoliathArmor; }
    public int[] getGoldenGoliathCircuitryArmor() { return GoldenGoliathCircuitryArmor; }
    public int[] getHarpersHeadsetArmor() { return HarpersHeadsetArmor; }
    public int[] getIvorArmor() { return IvorArmor; }
    public int[] getLukasArmor() { return LukasArmor; }
    public int[] getMagnusArmor() { return MagnusArmor; }
    public int[] getNinjaIvorArmor() { return NinjaIvorArmor; }
    public int[] getOliviaArmor() { return OliviaArmor; }
    public int[] getPetraArmor() { return PetraArmor; }
    public int[] getPrismarineArmor() { return PrismarineArmor; }
    public int[] getRedstoneRiot() { return RedstoneRiot; }
    public int[] getShieldOfInfinity() { return ShieldOfInfinity; }
    public int[] getSorenArmor() { return SorenArmor; }
    public int[] getStarShield() { return StarShield; }
    public int[] getSwordbreakerArmor() { return SwordbreakerArmor; }
    public int[] getTimsArmor() { return TimsArmor; }
}
