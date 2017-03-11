package com.edicatad.tut.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
	public static void init(){
		/* This adds a new recipe that outputs 1 of ItemHandler.tutPickaxe. The crafting grid specifies as follows:
		 *	xxx
		 *	 c
		 *	 c
		 * where x is our ItemHandler.tutItem and c is a generic minecraft stick.  Any letters can be used for this.
		 */
		GameRegistry.addRecipe(new ItemStack(ItemHandler.tutAxe,1)," xx"," cx"," c ",'x',ItemHandler.tutCarbite,'c',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.tutHoe,1)," xx"," c "," c ",'x',ItemHandler.tutCarbite,'c',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.tutPickaxe,1),"xxx"," c "," c ",'x',ItemHandler.tutCarbite,'c',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.tutSpade,1)," x "," c "," c ",'x',ItemHandler.tutCarbite,'c',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.tutSword,1)," x "," x "," c ",'x',ItemHandler.tutCarbite,'c',Items.STICK);
	}
}
