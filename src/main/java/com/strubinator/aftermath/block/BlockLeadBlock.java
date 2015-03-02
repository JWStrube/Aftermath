package com.strubinator.aftermath.block;

import com.strubinator.aftermath.creativetab.CreativeTabAftermath;
import com.strubinator.aftermath.reference.Names;

/**
 * Created by John on 2/28/2015.
 */
public class BlockLeadBlock extends BlockAftermath
{
    public BlockLeadBlock()
    {
        super();
        this.setBlockName(Names.Blocks.LEAD_BLOCK);
        this.setBlockTextureName(Names.Blocks.LEAD_BLOCK);
        this.setResistance(10.0F).setStepSound(soundTypeMetal);
        this.setHardness(5.0F);

    }
}
