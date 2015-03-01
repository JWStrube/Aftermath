package com.strubinator.aftermath.block;

import com.strubinator.aftermath.creativetab.CreativeTabAftermath;
import com.strubinator.aftermath.reference.Names;

/**
 * Created by John on 2/28/2015.
 */
public class BlockLeadOre extends BlockAftermath
{
    public BlockLeadOre()
    {
        super();
        this.setBlockName(Names.Blocks.LEAD_ORE);
        this.setBlockTextureName(Names.Blocks.LEAD_ORE);
        this.setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypePiston);

    }
}
