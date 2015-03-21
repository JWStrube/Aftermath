package com.strubinator.aftermath.init;

import com.strubinator.aftermath.block.BlockAftermath;
import com.strubinator.aftermath.item.*;
import com.strubinator.aftermath.reference.Names;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Iterator;

/**
 * Created by John on 2/28/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static ItemArmor.ArmorMaterial HAZARD_BASIC = EnumHelper.addArmorMaterial("HAZARD_BASIC", 16, new int[]{3, 8, 6, 3}, 10);

    public static final ItemAftermath leadIngot =  (ItemAftermath) new ItemAftermath().setUnlocalizedName(Names.Items.LEAD_INGOT);
    public static final Item cookedMushroom = new ItemCookedMushroom();
    public static final Item mushroom = new ItemMushroom();
    public static final ItemAftermath batLeather = (ItemAftermath ) new ItemAftermath().setUnlocalizedName(Names.Items.BAT_LEATHER);
    public static final ItemAftermath plateLead = (ItemAftermath ) new ItemAftermath().setUnlocalizedName(Names.Items.LEAD_PLATE);
    public static final ItemAftermath leatherLined = (ItemAftermath ) new ItemAftermath().setUnlocalizedName(Names.Items.LINED_LEATHER);
    public static final ItemAftermath rebar = (ItemAftermath ) new ItemAftermath().setUnlocalizedName(Names.Items.REBAR);
    public static final ItemHazardSuit hazardBasic_helmet = new ItemHazardSuit("hazardBasic_helmet", HAZARD_BASIC, "hazardBasic", 0);
    public static final ItemHazardSuit hazardBasic_chestplate = new ItemHazardSuit("hazardBasic_chestplate", HAZARD_BASIC, "hazardBasic", 1);
    public static final ItemHazardSuit hazardBasic_leggings = new ItemHazardSuit("hazardBasic_leggings", HAZARD_BASIC, "hazardBasic", 2);
    public static final ItemHazardSuit hazardBasic_boots = new ItemHazardSuit("hazardBasic_boots", HAZARD_BASIC, "hazardBasic", 3);




    public static void init()
    {
        GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);
        GameRegistry.registerItem(cookedMushroom, Names.Items.COOKED_MUSHROOM);
        GameRegistry.registerItem(mushroom, Names.Items.MUSHROOM);
        GameRegistry.registerItem(batLeather, Names.Items.BAT_LEATHER);
        GameRegistry.registerItem(plateLead, Names.Items.LEAD_PLATE);
        GameRegistry.registerItem(leatherLined, Names.Items.LINED_LEATHER);
        GameRegistry.registerItem(rebar, Names.Items.REBAR);
        GameRegistry.registerItem(hazardBasic_helmet,"hazardBasic_helmet" );
        GameRegistry.registerItem(hazardBasic_chestplate, "hazardBasic_chestplate");
        GameRegistry.registerItem(hazardBasic_leggings, "hazardBasic_leggings");
        GameRegistry.registerItem(hazardBasic_boots, "hazardBasic_boots");


    }


}

