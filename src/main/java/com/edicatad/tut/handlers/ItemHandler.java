package com.edicatad.tut.handlers;

import com.edicatad.tut.items.ItemTutItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item tutItem;
	
	public static void init(){
		tutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
	}
	
	public static void register(){
		GameRegistry.register(tutItem);
	}
	
	public static void registerRenders(){
		registerRender(tutItem);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
						new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
