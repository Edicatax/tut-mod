package com.edicatad.tut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemTutAxe extends ItemAxe{
	public ItemTutAxe(String name, ToolMaterial material, CreativeTabs tab){
		super(material,material.getDamageVsEntity(),material.getEfficiencyOnProperMaterial());
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
