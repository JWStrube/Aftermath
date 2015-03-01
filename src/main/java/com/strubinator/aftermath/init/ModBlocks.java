package com.strubinator.aftermath.init;

import com.strubinator.aftermath.block.BlockAftermath;
import com.strubinator.aftermath.block.BlockLeadBlock;
import com.strubinator.aftermath.block.BlockLeadOre;
import com.strubinator.aftermath.reference.Names;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by John on 2/28/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockAftermath leadOre = new BlockLeadOre();
    public static final BlockAftermath leadBlock = new BlockLeadBlock();

    public static void init()
    {
        GameRegistry.registerBlock(leadOre, Names.Blocks.LEAD_ORE);
        GameRegistry.registerBlock(leadBlock, Names.Blocks.LEAD_BLOCK);
    }
}
