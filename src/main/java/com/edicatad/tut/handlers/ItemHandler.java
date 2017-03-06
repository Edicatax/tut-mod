package com.edicatad.tut.handlers;

import com.edicatad.tut.items.ItemTutAxe;
import com.edicatad.tut.items.ItemTutHoe;
import com.edicatad.tut.items.ItemTutItem;
import com.edicatad.tut.items.ItemTutPickaxe;
import com.edicatad.tut.items.ItemTutSpade;
import com.edicatad.tut.items.ItemTutSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item tutItem;
	public static Item tutAxe;
	public static Item tutHoe;
	public static Item tutPickaxe;
	public static Item tutSpade;
	public static Item tutSword;
	
	
	public static void init(){
		tutItem = new ItemTutItem("tut_item", CreativeTabHandler.tabItems);
		tutAxe = new ItemTutAxe("tut_axe", MaterialHandler.TUTORIAL, CreativeTabHandler.tabTools);
		tutHoe = new ItemTutHoe("tut_hoe", MaterialHandler.TUTORIAL, CreativeTabHandler.tabTools);
		tutPickaxe = new ItemTutPickaxe("tut_pickaxe", MaterialHandler.TUTORIAL, CreativeTabHandler.tabTools);
		tutSpade = new ItemTutSpade("tut_spade", MaterialHandler.TUTORIAL, CreativeTabHandler.tabTools);
		tutSword = new ItemTutSword("tut_sword", MaterialHandler.TUTORIAL, CreativeTabHandler.tabCombat);
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
