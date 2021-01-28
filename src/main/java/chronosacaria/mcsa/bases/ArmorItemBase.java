package chronosacaria.mcsa.bases;

import chronosacaria.mcsa.Mcsa;
import net.minecraft.entity.EquipmentSlot;
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

    public ArmorItemBase(ArmorMaterial armorMaterial, EquipmentSlot slot, Settings settings,
                               String id){
        super(armorMaterial, slot, settings);
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, id), this);
    }
}
