package com.strubinator.aftermath.block;

import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by John on 2/28/2015.
 */
public class BlockOre extends BlockAftermath
{
    public BlockOre()
    {
        super();

    }

    //Returns item that drops from block. Used for ores that drop items
    public Item getItemDropped(int i1, Random j1, int k1)
    {
        return Item.getItemFromBlock(this);
    }

    /**
     * For ores that drop random amount of items
     */
    public int quantityDropped(Random i1)
    {
        return 1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int i1, Random j1)
    {
        if (i1 > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, j1, i1))
        {
            int j = j1.nextInt(i1 + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(j1) * (j + 1);
        }
        else
        {
            return this.quantityDropped(j1);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World i1, int j1, int k1, int l1, int m1, float n1, int o1)
    {
        super.dropBlockAsItemWithChance(i1, j1, k1, l1, m1, n1, o1);
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess i1, int j1, int k1)
    {
        if (this.getItemDropped(j1, rand, k1) != Item.getItemFromBlock(this))
        {
            int i2 = 0;

            //Add exp drop for ores that do not drop themselves

            return i2;
        }
        return 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i1)
    {
        return  0;
    }
}
