package com.edicatad.tut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemTutPickaxe extends ItemPickaxe{
	public ItemTutPickaxe(String name, ToolMaterial material, CreativeTabs tab){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
