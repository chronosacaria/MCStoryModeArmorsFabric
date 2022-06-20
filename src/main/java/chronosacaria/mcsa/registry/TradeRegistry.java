package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.factories.BasicTradeFactory;
import chronosacaria.mcsa.configs.McsaConfig;
import chronosacaria.mcsa.items.ArmorSets;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class TradeRegistry {

    public static void registerVillagerOffers() {
        if (McsaConfig.config.enableVillagerArmourTrades) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.ELLEGAARD).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.GABRIEL).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.IVOR).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.LUKAS).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.MAGNUS).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.OLIVIA).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.PETRA).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.HEAD)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.CHEST)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.LEGS)), 1,
                            30, 0.2F))));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsRegistry.armorItems.get(ArmorSets.SOREN).get(EquipmentSlot.FEET)), 1,
                            30, 0.2F))));
        }
    }
}
