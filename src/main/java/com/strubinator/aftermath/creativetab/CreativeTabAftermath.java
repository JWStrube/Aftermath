package com.strubinator.aftermath.creativetab;

import com.strubinator.aftermath.init.ModItems;
import com.strubinator.aftermath.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by John on 2/28/2015.
 */
public class CreativeTabAftermath
{
    public static final CreativeTabs A_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.leadIngot;
        }

    };
}
