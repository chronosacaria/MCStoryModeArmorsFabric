package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.Mcsa;
import chronosacaria.mcsa.items.ArmorSetItem;
import chronosacaria.mcsa.items.ArmorSets;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.EnumMap;
import java.util.EnumSet;

import static net.minecraft.entity.EquipmentSlot.*;


public class ArmorsRegistry {
    // (set, slot) -> item
    public static final EnumMap<ArmorSets, EnumMap<EquipmentSlot, Item>> armorItems = new EnumMap<>(ArmorSets.class);

    protected static String armorID(ArmorSets set, EquipmentSlot slot){
        String slotID;
        switch (slot){
            case HEAD:
                slotID = "helmet";
                break;
            case CHEST:
                slotID = "chestplate";
                break;
            case LEGS:
                slotID = "leggings";
                break;
            case FEET:
                slotID = "boots";
                break;
            default:
                throw new IllegalArgumentException("armor with non-armor equipment slot");
        }
        return set.getSetName() + "_" + slotID;
    }

    protected static void registerArmor(ArmorSets set, EnumSet<EquipmentSlot> slots){
        EnumMap<EquipmentSlot, Item> slotMap = new EnumMap<>(EquipmentSlot.class);

        for (EquipmentSlot slot : slots){
            ArmorSetItem item = new ArmorSetItem(set, slot);
            slotMap.put(slot, item);
            Registry.register(Registry.ITEM, Mcsa.ID(armorID(set,slot)), item);
        }
        armorItems.put(set, slotMap);
    }

    public static void init(){
        for (ArmorSets set : ArmorSets.values()){
            EnumSet<EquipmentSlot> slots;

            switch (set) {
                case HARPERS_HEADSET:
                case WHITE_PUMPKIN:
                    slots = EnumSet.of(HEAD);
                    break;
                default:
                    slots = EnumSet.of(HEAD, CHEST, LEGS, FEET);
            }
            registerArmor(set, slots);
        }

    }
}
