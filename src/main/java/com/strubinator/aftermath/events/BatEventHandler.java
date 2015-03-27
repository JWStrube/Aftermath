package com.strubinator.aftermath.events;

import com.strubinator.aftermath.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

/**
 * Created by John on 3/23/2015.
 */
public class BatEventHandler {

    @SubscribeEvent
    public void BatEventHandler(LivingDropsEvent event) {

        if (event.entityLiving instanceof EntityBat) {
            //The integer at the end relates to how many potato will be dropped.
            event.entityLiving.dropItem(ModItems.batLeather, 1);

        }
    }
}

