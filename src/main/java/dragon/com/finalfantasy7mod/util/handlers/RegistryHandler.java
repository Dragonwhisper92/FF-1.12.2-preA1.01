package com.finalfantasy7mod.util.handlers;

import com.finalfantasy7mod.init.ItemInit;
import com.finalfantasy7mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		//for(Block block : BlockInit.BLOCKS)
		//{
		//	if(block instanceof IHasModel)
		//	{
		//		((IHasModel)block).registerModels();
		//	}
		//}
	}
	
	public static void preInitRegistries()
	{
	}
	
	public static void initRegistries()
	{
	}
	
	public static void postInitRegistries()
	{
	}
}
