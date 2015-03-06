package com.strubinator.aftermath.block;

import com.strubinator.aftermath.creativetab.CreativeTabAftermath;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by John on 3/5/2015.
 */
public abstract class BlockLog extends BlockRotatedPillar
{
    public BlockLog(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabAftermath.A_TAB);
    }

    public BlockLog()
    {
        this(Material.wood);
        this.setCreativeTab(CreativeTabAftermath.A_TAB);
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
