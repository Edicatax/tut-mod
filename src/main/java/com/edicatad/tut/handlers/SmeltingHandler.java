package com.edicatad.tut.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {
	public static void init(){
		/* 
		 * This adds a smelting 'recipe' with the following parameters:
		 * one ItemHandler.tutItem smelted down in a furnace
		 * produces one ItemHandler.tutCarbite
		 * and grants the player maximum crafting XP, similar to crafting a gold or diamond item
		 */
		GameRegistry.addSmelting(ItemHandler.tutItem, new ItemStack(ItemHandler.tutCarbite),1.0F);
	}
}
