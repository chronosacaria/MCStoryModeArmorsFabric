package chronosacaria.mcsa.items;

import chronosacaria.mcsa.base.ArmourMaterials;
import chronosacaria.mcsa.base.BaseArmourItem;
import chronosacaria.mcsa.configs.McsmStatsConfig;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;
import java.util.HashSet;

public class ItemRegistry {
    public static final HashMap<String, Item> ITEMS = new HashMap<>();

    private static final HashSet<String> HELMETS = new HashSet<String>() {{

    }};

    private static final HashSet<String> CHESTPLATES = new HashSet<String>() {{
        add("adamantium_impervium_chestplate");
    }};

    private static final HashSet<String> LEGGINGS = new HashSet<String>() {{
        add("adamantium_impervium_leggings");
    }};

    private static final HashSet<String> BOOTS = new HashSet<String>() {{
        add("adamantium_impervium_boots");
    }};

    public static Item getItem(String id) {return ITEMS.getOrDefault(id, Items.AIR);}

    public static void addItems(){
        // Helmets
        for (String itemID: HELMETS){

        }

        // Chestplates
        for (String itemID: CHESTPLATES){

        }

        // Leggings
        for (String itemID: LEGGINGS){

        }

        // Boots
        for (String itemID: BOOTS){

        }
    }
}
