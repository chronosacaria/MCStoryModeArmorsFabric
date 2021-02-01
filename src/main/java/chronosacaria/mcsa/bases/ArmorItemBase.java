package chronosacaria.mcsa.bases;

import chronosacaria.mcsa.Mcsa;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.UUID;

public class ArmorItemBase extends ArmorItem {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};


    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public ArmorItemBase(ArmorMaterial armorMaterial, EquipmentSlot slot, Settings settings,
                               String id){
        super(armorMaterial, slot, settings);

        int protection = armorMaterial.getProtectionAmount(slot);
        float toughness = armorMaterial.getToughness();

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uuid, "Armor modifier",
                protection, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uuid, "Armor toughness",
                toughness, EntityAttributeModifier.Operation.ADDITION));
        if(this.knockbackResistance > 0) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "Armor knockback resistance",
                    this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));
        }
        this.attributeModifiers = builder.build();
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, id), this);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot){
        return slot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }
}
