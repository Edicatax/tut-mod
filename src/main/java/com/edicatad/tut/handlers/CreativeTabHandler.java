package com.edicatad.tut.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	public static CreativeTabs tabBlocks = new CreativeTabs("tut_blocks"){
		public ItemStack getTabIconItem(){
			return new ItemStack(Item.getItemFromBlock(BlockHandler.tutBlock));
		}
	};

	public static CreativeTabs tabItems = new CreativeTabs("tut_items"){
		public ItemStack getTabIconItem(){
			return new ItemStack(ItemHandler.tutItem);
		}
	};
	
	/*
	public static CreativeTabs tabTools = new CreativeTabs("tut_tools"){
		public ItemStack getTabIconItem(){
			return null;
		}
	};

	public static CreativeTabs tabWeapons = new CreativeTabs("tut_weapons"){
		public ItemStack getTabIconItem(){
			return null;
		}
	};
	*/
	
	public static void init(){
		
	}
}
