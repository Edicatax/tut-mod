package com.edicatad.tut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemTutSpade extends ItemSpade{
	public ItemTutSpade(String name, ToolMaterial material, CreativeTabs tab){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
