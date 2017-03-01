package com.edicatad.tut.proxy;

import com.edicatad.tut.handlers.ItemHandler;

public class CommonProxy implements IProxy{

	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
	}

	public void init() {
		
	}

	public void postInit() {
		
	}
	
}
