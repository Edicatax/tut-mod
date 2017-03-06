package com.edicatad.tut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemTutHoe extends ItemHoe{
	public ItemTutHoe(String name, ToolMaterial material, CreativeTabs tab){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
