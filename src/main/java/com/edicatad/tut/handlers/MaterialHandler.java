package com.edicatad.tut.handlers;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {
	/*
	 * EnumHelper is Minecraft's way of dealing with the fact that Java doesn't do Enums
	 * This registers a ToolMaterial with the following properties:
	 * "tutorial" is the unlocalized name
	 * 3 is the harvest level of the material:  diamond
	 * 2500 is the durability:  the amount of times you can click it before it breaks
	 * 5F is the mining speed; diamond is 8F
	 * 5F is the damage float; diamond is 3F
	 * 20 is the enchantability;  gold is 20
	 */
	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("tutorial", 3, 2500, 5F, 5F, 20);
}
