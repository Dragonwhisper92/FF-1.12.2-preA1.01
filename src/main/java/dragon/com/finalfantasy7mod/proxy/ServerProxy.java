package com.finalfantasy7mod.proxy;

import com.finalfantasy7mod.objects.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.*;

public class ServerProxy {
	
	public void preInit(FMLPreInitializationEvent event) {}
	
	public void init(FMLInitializationEvent event) {}
	
	public void postInit(FMLPostInitializationEvent event) {}
	
	public void serverStarting(FMLServerStartingEvent event) {}
	
	public void serverStopping(FMLServerStoppingEvent event) {}

	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
}
