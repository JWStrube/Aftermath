package com.strubinator.aftermath.block;

import com.strubinator.aftermath.reference.Names;
import net.minecraft.block.material.Material;

/**
 * Created by John on 3/3/2015.
 */
public class BlockContaminatedDirt extends BlockAftermath
{
    public BlockContaminatedDirt()
    {
        super(Material.ground);

        this.setBlockName(Names.Blocks.DEAD_DIRT);
        this.setBlockTextureName(Names.Blocks.DEAD_DIRT);
        this.setStepSound(soundTypeGravel);
        this.setHardness(0.5F);
    }
}
