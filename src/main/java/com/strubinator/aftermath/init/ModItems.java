package com.strubinator.aftermath.init;

import com.strubinator.aftermath.block.BlockAftermath;
import com.strubinator.aftermath.item.ItemAftermath;
import com.strubinator.aftermath.item.ItemCookedMushroom;
import com.strubinator.aftermath.item.ItemLeadIngot;
import com.strubinator.aftermath.item.ItemMushroom;
import com.strubinator.aftermath.reference.Names;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;

import java.util.Iterator;

/**
 * Created by John on 2/28/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAftermath leadIngot = new ItemLeadIngot();
    public static final Item cookedMushroom = new ItemCookedMushroom();
    public static final Item mushroom = new ItemMushroom();


    public static void init()
    {
        GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);
        GameRegistry.registerItem(cookedMushroom, Names.Items.COOKED_MUSHROOM);
        GameRegistry.registerItem(mushroom, Names.Items.MUSHROOM);

    }


}

