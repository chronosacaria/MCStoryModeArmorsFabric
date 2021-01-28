package chronosacaria.mcsa.configs;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvent;

import java.util.HashMap;

public class McsmStatsConfig {
    // Leather is used as the default values
    private static final HashMap<String, ArmorMaterial> MATERIAL = new HashMap<>();

    public static ArmorMaterial getMaterials(String item){return MATERIAL.getOrDefault(item, ArmorMaterials.DIAMOND);}
    //public static int[] getArmourValues(String item){return ARMOUR_VALUES.getOrDefault(item, new int[]{1,2,3,1});}
    //public static int getEnchantability(String item){return ENCHANTABILITY.getOrDefault(item, 15);}
    //public static float getToughness(String item){return TOUGHNESS.getOrDefault(item, 0f);}
    //public static float getKnockbackResistance(String item){return KNOCKBACK_RESISTANCE.getOrDefault(item, 0f);}


}
