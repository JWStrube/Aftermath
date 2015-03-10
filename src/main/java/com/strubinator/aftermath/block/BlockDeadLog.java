package com.strubinator.aftermath.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by John on 3/5/2015.
 */
public class BlockDeadLog extends BlockLog
{
    @SideOnly(Side.CLIENT)
    private IIcon textureTop;
    @SideOnly(Side.CLIENT)
    private IIcon textureSide;



        public BlockDeadLog()
        {
            super(Material.wood);
            this.setHardness(2.0F);
            this.setStepSound(soundTypeWood);
            this.setBlockName("deadLog");

        }

    @SideOnly(Side.CLIENT)
    public IIcon getSideIcon(int meta)
    {
        return this.textureSide;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getTopIcon(int meta)
    {
        return this.textureTop;
    }


    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return false;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
        super.registerBlockIcons(iconregister);
        this.textureSide = iconregister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName( this.getUnlocalizedName())));
        this.textureTop = iconregister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName() +  "_top")));

    }




    }

