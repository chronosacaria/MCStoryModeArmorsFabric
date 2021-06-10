package chronosacaria.mcsa.registry;

import chronosacaria.mcsa.Mcsa;
import chronosacaria.mcsa.blocks.CarvedWhitePumpkinBlock;
import chronosacaria.mcsa.blocks.WhitePumpkinBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block WHITE_PUMPKIN_BLOCK =
            new WhitePumpkinBlock(FabricBlockSettings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CARVED_WHITE_PUMPKIN_BLOCK =
            new CarvedWhitePumpkinBlock(FabricBlockSettings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Mcsa.MOD_ID, "white_pumpkin"), WHITE_PUMPKIN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, "white_pumpkin"),
                new BlockItem(WHITE_PUMPKIN_BLOCK, new FabricItemSettings().group(Mcsa.ARMORS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(Mcsa.MOD_ID, "carved_white_pumpkin"),
                CARVED_WHITE_PUMPKIN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, "carved_white_pumpkin"),
                new BlockItem(CARVED_WHITE_PUMPKIN_BLOCK, new FabricItemSettings().group(Mcsa.ARMORS_GROUP)));
    }
}
