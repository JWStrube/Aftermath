package com.strubinator.aftermath.block;

import com.strubinator.aftermath.lib.CreativeTabAftermath;
import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.init.ModItems;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * Created by John on 3/8/2015.
 */
public class BlockMushroomEdible extends BlockBush
{
    public BlockMushroomEdible()
    {

        this.setBlockBounds(0.0f, 0.0F, 0.0f, 1f, .5f, 1f);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabAftermath.A_TAB);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return super.canPlaceBlockAt(world, x, y, z) && this.canBlockStay(world, x, y, z);
    }

    public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
    {
        if (p_149718_3_ >= 0 && p_149718_3_ < 256)
        {
            Block block = p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_);
            return block == Blocks.mycelium || block == ModBlocks.organicMatter || p_149718_1_.getFullBlockLightValue(p_149718_2_, p_149718_3_, p_149718_4_) < 13 && block.canSustainPlant(p_149718_1_, p_149718_2_, p_149718_3_ - 1, p_149718_4_, ForgeDirection.UP, this);
        }
        else
        {
            return false;
        }
    }

    public int getRenderType()
    {
        return 6;
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

    public Item getItemDropped(int meta, Random random, int l1)
    {
        return ModItems.mushroom;
    }

    public int quantityDropped(Random random)
    {
        return random.nextInt(3) + 1;
    }


}
