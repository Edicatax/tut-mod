package com.edicatad.tut.world;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenOre extends WorldGenerator{

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		// Switch to handle the world's dimensions for ore gen.  Switches fall through;  all code is executed until a break is encountered.
		switch(worldIn.provider.getDimension()){
		case 1:
			// End
		case 0:
			// Overworld
		case -1:
			// Nether
		default:
			// Mod dimensions
			break;
		}
		return false;
	}
	
}
