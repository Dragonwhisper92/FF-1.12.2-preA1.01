package com.finalfantasy7mod.proxy;

import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends ServerProxy
{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		super.serverStarting(event);
	}
	
	@Override
	public void serverStopping(FMLServerStoppingEvent event) {
		super.serverStopping(event);
	}
}