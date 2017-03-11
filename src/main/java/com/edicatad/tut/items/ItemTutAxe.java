package com.edicatad.tut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemTutAxe extends ItemAxe{
	public ItemTutAxe(String name, ToolMaterial material, CreativeTabs tab){
		// This calls the constructor of the extended class, passing on the default values from the ToolMaterial
		super(material,material.getDamageVsEntity(),material.getEfficiencyOnProperMaterial());
		// This registers an unlocalized name in the format "item.<name>.name", edit the localized output in /src/main/resources/assets/tut/lang/en_US.lang
		setUnlocalizedName(name);
		// This registers the name of the item in code, used to lookup models etc
		setRegistryName(name);
		// This tells the game which creative tab the item goes into
		setCreativeTab(tab);
	}
}
