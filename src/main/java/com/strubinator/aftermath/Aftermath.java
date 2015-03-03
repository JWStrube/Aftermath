package com.strubinator.aftermath;


import com.strubinator.aftermath.handler.ConfigurationHandler;
import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.init.ModItems;
import com.strubinator.aftermath.init.Recipes;
import com.strubinator.aftermath.proxy.IProxy;
import com.strubinator.aftermath.reference.Reference;
import com.strubinator.aftermath.worldGen.OreGenHandler;
import com.strubinator.aftermath.worldGen.biome.BiomesAftermath;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Aftermath
{
    public static OreGenHandler genHandler = new OreGenHandler();

    @Instance(Reference.MOD_ID)
    public static Aftermath instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        BiomesAftermath.init();
        GameRegistry.registerWorldGenerator(genHandler, 1);
       // LogHelper.info("Pre Initialization Complete");
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        Recipes.init();

       // LogHelper.info("Initialization Complete");
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        //LogHelper.info("Post Initialization Complete");
    }
}
