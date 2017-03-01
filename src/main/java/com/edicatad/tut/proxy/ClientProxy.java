package com.edicatad.tut.proxy;

import com.edicatad.tut.handlers.ItemHandler;

public class ClientProxy extends CommonProxy {
	public void init(){
		ItemHandler.registerRenders();
	}
}
