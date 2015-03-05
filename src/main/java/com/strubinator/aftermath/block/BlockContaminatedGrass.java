package com.strubinator.aftermath.block;

import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by John on 3/4/2015.
 */
public class BlockContaminatedGrass extends BlockAftermath
{
    @SideOnly(Side.CLIENT)
    private IIcon textureTop;
    @SideOnly(Side.CLIENT)
    private IIcon textureSide;



    public BlockContaminatedGrass()
    {

        super(Material.grass);
        this.setBlockName(Names.Blocks.DEAD_GRASS);
        this.setBlockTextureName(Names.Blocks.DEAD_GRASS);
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.5F);
        this.setTickRandomly(true);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.textureTop : (side == 0 ? ModBlocks.deadDirt.getBlockTextureFromSide(side) : this.blockIcon);
    }

    public void updateTick(World world, int x1, int y1, int z1, Random random)
    {
        if(!world.isRemote)
        {
            if(world.getBlockLightValue(x1, y1 + 1, z1) < 4 && world.getBlockLightOpacity(x1, y1 + 1, z1) >2)
            {
                world.setBlock(x1, y1, z1, ModBlocks.deadDirt);
            }
        }
    }

    public Item getItemDropped(int i1, Random random, int j1)
    {
        return ModBlocks.deadDirt.getItemDropped(0, random, j1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x1, int y1, int z1, int side)
    {
        if (side == 1)
        {
            return this.textureTop;
        }
        else if (side == 0)
        {
            return ModBlocks.deadDirt.getBlockTextureFromSide(side);
        }
        else
        {
            return this.blockIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister i1)
    {
        this.blockIcon = i1.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_side");
        this.textureTop = i1.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");

    }





}
