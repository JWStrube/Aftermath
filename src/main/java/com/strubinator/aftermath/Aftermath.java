package com.strubinator.aftermath;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Aftermath.MODID, name = Aftermath.NAME, version = Aftermath.VERSION)
public class Aftermath
{
    public static final String MODID = "aftermath";
    public static final String NAME = "Aftermath";
    public static final String VERSION = "1.0";
    
    @Instance(MODID)
    public static Aftermath instance;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
		
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
		
    }
}
