package com.edicatad.tut.proxy;

import com.edicatad.tut.handlers.BlockHandler;
import com.edicatad.tut.handlers.CraftingHandler;
import com.edicatad.tut.handlers.ItemHandler;
import com.edicatad.tut.handlers.SmeltingHandler;
import com.edicatad.tut.world.WorldGenOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy{
	// This code runs server-side
	// Remember that Minecraft singleplayer loads a local server in the background
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
		BlockHandler.init();
		BlockHandler.register();
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
	}

	public void init() {
	}

	public void postInit() {
		CraftingHandler.init();
		SmeltingHandler.init();
	}
}
