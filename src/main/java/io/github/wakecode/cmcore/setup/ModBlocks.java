package io.github.wakecode.cmcore.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> BASIC_CASING = register("basic_casing", ItemGroup.TAB_BUILDING_BLOCKS,
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, ItemGroup group, Supplier<T> block) {
        RegistryObject<T> reg = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(reg.get(), new Item.Properties().tab(group)));

        return reg;
    }
}
