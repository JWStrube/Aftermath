package com.strubinator.aftermath;


import com.strubinator.aftermath.handler.ConfigurationHandler;
import com.strubinator.aftermath.proxy.IProxy;
import com.strubinator.aftermath.reference.Reference;
import com.strubinator.aftermath.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Aftermath
{
    @Instance(Reference.MOD_ID)
    public static Aftermath instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre Initialization Complete");
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
