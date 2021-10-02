package io.github.wakecode.cmcore.setup;

import io.github.wakecode.cmcore.CircuitMayhemCore;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CircuitMayhemCore.MOD_ID);
}
