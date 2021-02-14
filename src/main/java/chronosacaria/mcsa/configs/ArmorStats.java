package chronosacaria.mcsa.configs;

import net.minecraft.entity.EquipmentSlot;

import java.util.EnumMap;

import static net.minecraft.entity.EquipmentSlot.*;

public class ArmorStats {
    public EnumMap<EquipmentSlot, Integer> protection = new EnumMap<>(EquipmentSlot.class);
    public float toughness;
    public float knockbackRes;

    public ArmorStats setProtection(int head, int chest, int legs, int feet){
        this.protection.put(HEAD, head);
        this.protection.put(CHEST, chest);
        this.protection.put(LEGS, legs);
        this.protection.put(FEET, feet);
        return this;
    }

    public ArmorStats setToughness(float toughness){
        this.toughness = toughness;
        return this;
    }

    public ArmorStats setKnockbackRes(float knockbackRes){
        this.knockbackRes = knockbackRes;
        return this;
    }
}
