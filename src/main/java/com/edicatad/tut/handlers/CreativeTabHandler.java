package com.edicatad.tut.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	// This class is pretty much just a container for all of our creative tabs.
	// This adds a tab named "tut_blocks" with the inventory texture of 
	// BlockHandler.tutBlock as the tab symbol.
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
	
	public static CreativeTabs tabTools = new CreativeTabs("tut_tools"){
		public ItemStack getTabIconItem(){
			return new ItemStack(ItemHandler.tutAxe);
		}
	};

	public static CreativeTabs tabCombat = new CreativeTabs("tut_combat"){
		public ItemStack getTabIconItem(){
			return new ItemStack(ItemHandler.tutSword);
		}
	};
}
