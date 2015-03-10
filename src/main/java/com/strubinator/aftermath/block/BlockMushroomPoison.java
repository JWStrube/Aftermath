package com.strubinator.aftermath.block;

import com.strubinator.aftermath.creativetab.CreativeTabAftermath;
import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * Created by John on 3/9/2015.
 */
public class BlockMushroomPoison extends BlockBush {

    public BlockMushroomPoison() {
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabAftermath.A_TAB);
    }

    //Spreads the mushroom block
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (random.nextInt(25) == 0 && canBlockGrow(world, x, y, z))
        {
            byte b0 = 4;
            int l = 5;
            int i1;
            int j1;
            int k1;

            for (i1 = x - b0; i1 <= x + b0; ++i1)
            {
                for (j1 = z - b0; j1 <= z + b0; ++j1)
                {
                    for (k1 = y - 1; k1 <= y + 1; ++k1)
                    {
                        if (world.getBlock(i1, k1, j1) == this)
                        {
                            --l;

                            if (l <= 0)
                            {
                                return;
                            }
                        }
                    }
                }
            }

            i1 = x + random.nextInt(3) - 1;
            j1 = y + random.nextInt(2) - random.nextInt(2);
            k1 = z + random.nextInt(3) - 1;

            for (int l1 = 0; l1 < 4; ++l1)
            {
                if (world.isAirBlock(i1, j1, k1) && this.canBlockStay(world, i1, j1, k1))
                {
                    x = i1;
                    y = j1;
                    z = k1;
                }

                i1 = x + random.nextInt(3) - 1;
                j1 = y + random.nextInt(2) - random.nextInt(2);
                k1 = z + random.nextInt(3) - 1;
            }

            if (world.isAirBlock(i1, j1, k1) && this.canBlockStay(world, i1, j1, k1))
            {
                world.setBlock(i1, j1, k1, this, 0, 2);
            }
        }
    }


    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        return super.canPlaceBlockAt(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_) && this.canBlockStay(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_);
    }

    public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
    {
        if (p_149718_3_ >= 0 && p_149718_3_ < 256)
        {
            Block block = p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_);
            return block == Blocks.mycelium || block == ModBlocks.organicMatter || block == ModBlocks.deadGrass || block == Blocks.grass;
        }
        else
        {
            return false;
        }
    }

    public boolean canBlockGrow(World world, int x, int y, int z)
    {
        return (world.getBlock(x, y-1, z) == ModBlocks.organicMatter) && (world.getBlockLightValue(x, y, z) <= 4);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
        //
    }


}


