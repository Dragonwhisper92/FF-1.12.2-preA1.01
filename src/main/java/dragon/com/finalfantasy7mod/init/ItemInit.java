package com.finalfantasy7mod.init;


import com.finalfantasy7mod.objects.tools.ToolSword;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_MAKO = EnumHelper.addToolMaterial("tool_mako", 2, 180, 10.0F, 10F, 30);
	
	//Items
	//TODO ADD ITEMS
	
	//Tools
	public static final Item BUSTER_SWORD = new ToolSword("buster_sword", TOOL_MAKO);
	
	//Armour
	//TODO ADD Armour

}
