package com.strubinator.aftermath.init;

import com.strubinator.aftermath.block.*;
import com.strubinator.aftermath.reference.Names;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by John on 2/28/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockAftermath leadOre = new BlockOre();
    public static final BlockAftermath leadBlock = new BlockLeadBlock();
    public static final BlockAftermath deadDirt = new BlockContaminatedDirt();
    public static final BlockAftermath deadGrass = new BlockContaminatedGrass();

    public static void init()
    {
        GameRegistry.registerBlock(leadOre, Names.Blocks.LEAD_ORE).setBlockName(Names.Blocks.LEAD_ORE).setBlockTextureName(Names.Blocks.LEAD_ORE).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(leadBlock, Names.Blocks.LEAD_BLOCK);
        GameRegistry.registerBlock(deadDirt, Names.Blocks.DEAD_DIRT);
        GameRegistry.registerBlock(deadGrass, Names.Blocks.DEAD_GRASS);
    }
}
