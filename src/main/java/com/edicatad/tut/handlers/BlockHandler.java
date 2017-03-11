package com.edicatad.tut.handlers;

import com.edicatad.tut.blocks.BlockTutBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
	public static Block tutBlock;
	public static ItemBlock ibTutBlock;
	
	public static void init(){
		/* This creates a new block with the following properties:
		 * The material acts like ROCK, solid, non-hurting, no dimension warping, etc
		 * 5F is the mining resistance, 5F means it takes a decent amount of time to mine
		 * 15F is the explosion resistance
		 * 3 is the harvest level:  diamond
		 * "pickaxe" means that the correct tool for handling this is a pickaxe
		 */
		tutBlock = new BlockTutBlock(Material.ROCK, "tut_block", CreativeTabHandler.tabBlocks, 5F, 15F, 3, "pickaxe");
		  
		ibTutBlock = (ItemBlock) new ItemBlock(tutBlock);
	}
	
	public static void register(){
		// In order for the renderer to properly render things both the inventory item and
		// the block need to have the same registry name
		GameRegistry.register(tutBlock);
		GameRegistry.register(ibTutBlock, tutBlock.getRegistryName());
	}
	
	public static void registerRenders(){
		registerRender(tutBlock);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
						new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
