package com.edicatad.tut.handlers;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {
	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("tutorial", 3, 2500, 5F, 5F, 20);
}
