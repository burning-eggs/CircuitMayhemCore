package io.github.wakecode.cmcore.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> LEAD_INGOT = Registration.ITEMS.register("lead_ingot", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    static void register() {}
}
