package com.edicatad.tut.proxy;

import com.edicatad.tut.handlers.BlockHandler;
import com.edicatad.tut.handlers.ItemHandler;

public class ClientProxy extends CommonProxy {
	public void init(){
		// This code only runs clientside
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
	}
}
