package com.strubinator.aftermath.init;

import com.strubinator.aftermath.item.ItemAftermath;
import com.strubinator.aftermath.item.ItemLeadIngot;
import com.strubinator.aftermath.reference.Names;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by John on 2/28/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAftermath leadIngot = new ItemLeadIngot();

    public static void init()
    {
        GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);

    }
}
