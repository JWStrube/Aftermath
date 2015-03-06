package com.strubinator.aftermath.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by John on 3/5/2015.
 */
public class ItemBlockOrganic extends ItemBlockWithMetadata
{
    public ItemBlockOrganic(Block block)
    {
        super(block, block);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        switch (stack.getItemDamage())
        {
            case 0:
            case 1:
                return this.getUnlocalizedName();

            case 2:
            case 3:
                return this.getUnlocalizedName() + "Compost";

            case 4:
                return this.getUnlocalizedName() + "Humus";

            default:
                return this.getUnlocalizedName();


        }
    }

}
