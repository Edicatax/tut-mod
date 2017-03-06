package com.edicatad.tut.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutBlock extends ModBlock{
	public BlockTutBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest,
			String tool) {
		super(mat, name, tab, hardness, resistance, harvest, tool);
	}
}
