package com.edicatad.tut.blocks;

import java.util.Random;

import com.edicatad.tut.handlers.ItemHandler;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTutBlock extends ModBlock{
	public BlockTutBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest,
			String tool) {
		super(mat, name, tab, hardness, resistance, harvest, tool);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.tutItem;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return random.nextInt(4)+1;
	}
}
