package com.yt.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.yt.YoutubeItems.YoutubeItems;
import com.yt.helper.Reference;
import com.yt.proxy.CommonProxy;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MainYoutube {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		YoutubeItems.init();
		YoutubeItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
