package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.items.ArmorSets;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

import static net.minecraft.village.TradeOffers.PROFESSION_TO_LEVELED_TRADE;

public class TradeRegistry {

    public static void registerVillagerOffers() {
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.HEAD)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.CHEST)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.LEGS)), 64, 1, 1, 30, 0.2F));
        addTrade(VillagerProfession.ARMORER, 5, new TradeOffers.SellItemFactory(new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.FEET)), 64, 1, 1, 30, 0.2F));

    }

    public static void addTrade(VillagerProfession profession, int level, TradeOffers.Factory trade) {
        TradeOffers.Factory[] fixedTrades = PROFESSION_TO_LEVELED_TRADE.get(profession).get(level);
        int newSize = fixedTrades.length + 1;

        TradeOffers.Factory[] newTrades = new TradeOffers.Factory[newSize];
        System.arraycopy(fixedTrades, 0, newTrades, 0, fixedTrades.length);
        newTrades[newSize - 1] = trade;

        PROFESSION_TO_LEVELED_TRADE.get(profession).put(level, newTrades);
    }
}
