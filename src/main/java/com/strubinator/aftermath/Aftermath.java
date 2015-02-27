package com.strubinator.aftermath;


import com.strubinator.aftermath.proxy.IProxy;
import com.strubinator.aftermath.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Aftermath
{
    @Instance(Reference.MOD_ID)
    public static Aftermath instance;

    @SidedProxy(clientSide = "com.strubinator.aftermath.proxy.ClientProxy", serverSide = "com.strubinator.aftermath.proxy.ServerProxy")
    public static IProxy proxy;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
		
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
		
    }
}
