package com.strubinator.aftermath.block;

import com.strubinator.aftermath.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by John on 3/5/2015.
 */
public class BlockOrganicMatter extends BlockAftermath
{
    @SideOnly(Side.CLIENT)
    private IIcon textureOrganic;
    @SideOnly(Side.CLIENT)
    private IIcon textureCompost;
    @SideOnly(Side.CLIENT)
    private IIcon textureHumus;



    public BlockOrganicMatter()
    {
        super(Material.grass);
        this.setHardness(.5f);
        this.setBlockName(Names.Blocks.ORGANIC_MATTER);

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if(meta == 0 || meta ==1)
        {
            return this.textureOrganic;
        }
        else if(meta == 2 || meta == 3)
        {
            return this.textureCompost;
        }
        else
        {
            return this.textureHumus;
        }
    }

    public int damageDropped(int meta)
    {
        if(meta == 0 || meta == 1)
        {
            return 1;
        }
        else if(meta == 2 || meta == 3)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }

    public ItemStack createStackedBlock(int meta)
    {
        return super.createStackedBlock(meta);
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {

        list.add(new ItemStack(this, 1, 1));

        list.add(new ItemStack(this, 1, 3));
        list.add(new ItemStack(this, 1, 4));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
        super.registerBlockIcons(iconregister);
        this.textureOrganic = iconregister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName( this.getUnlocalizedName())));
        this.textureCompost = iconregister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName() +  "Compost")));
        this.textureHumus = iconregister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName() +  "Humus")));
    }

    public int getDamageValue(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);


        return l;
    }





}
