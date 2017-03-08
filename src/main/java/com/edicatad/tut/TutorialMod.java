package com.edicatad.tut;

import com.edicatad.tut.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Ref.MODID, name=Ref.NAME, version=Ref.VERSION)
public class TutorialMod {
	@SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
	public static IProxy proxy;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit();
	}
	
}
