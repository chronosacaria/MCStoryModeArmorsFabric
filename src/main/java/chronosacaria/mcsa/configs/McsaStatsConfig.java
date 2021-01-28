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

    @Comment("Adamantine Impervium Armor: Feet, Legs, Body, Head")
    public int[] AdamatineArmor = {4,7,9,4};
    public int[] DragonsbaneArmor = {4,7,9,4};
    public int[] EnderDefenderArmor = {4,7,9,4};
    public int[] GoldenGoliathArmor = {4,7,9,4};
    public int[] RedstoneRiot = {4,7,9,4};
    public int[] ShieldOfInfinity = {4,7,9,4};
    public int[] StarShield = {4,7,9,4};
    public int[] SwordbreakerArmor = {4,7,9,4};

    public int[] getAdamatineArmor() { return AdamatineArmor; }
    public int[] getDragonsbaneArmor() { return DragonsbaneArmor; }
    public int[] getEnderDefenderArmor() { return EnderDefenderArmor; }
    public int[] getGoldenGoliathArmor() { return GoldenGoliathArmor; }
    public int[] getRedstoneRiot() { return RedstoneRiot; }
    public int[] getShieldOfInfinity() { return ShieldOfInfinity; }
    public int[] getStarShield() { return StarShield; }
    public int[] getSwordbreakerArmor() { return SwordbreakerArmor; }
}
