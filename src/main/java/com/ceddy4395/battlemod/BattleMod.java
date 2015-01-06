package com.ceddy4395.battlemod;

import com.ceddy4395.battlemod.proxy.IProxy;
import com.ceddy4395.battlemod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)

public class BattleMod {

    @Mod.Instance(Reference.MOD_ID)
    public static BattleMod instance;

    @SidedProxy(clientSide = "com.ceddy4395.battlemod.proxy.ClientProxy", serverSide = "com.ceddy4395.battlemod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {


    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {


    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
