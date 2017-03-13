package com.edicatad.tut.world;

import java.util.Random;

import com.edicatad.tut.handlers.BlockHandler;
import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int chunkOriginX = chunkX * 16;
		int chunkOriginZ = chunkZ * 16;
		//Switch to handle the world's dimensions for ore gen.  Switches fall through;  all code is executed until a break is encountered.
		switch(world.provider.getDimension()){
		case 1:
			// End
			genEnd(world,random,chunkOriginX,chunkOriginZ);
			break;
		case 0:
			// Overworld
			genOverworld(world,random,chunkOriginX,chunkOriginZ);
			break;
		case -1:
			// Nether
			genNether(world,random,chunkOriginX,chunkOriginZ);
			break;
		default:
			// Mod dimensions
			break;
		}
		/* 
		 * I suspect chunkX and Z pass the chunk number on the axis rather than the position, so to properly gen the world I would need to 
		 * pass chunkX*16 instead.  Confirmed.
		 */
		//TutLogger.info("Generating in chunk found at %s, %s", chunkX, chunkZ);
	}
	
	private void genEnd(World world, Random random, int chunkX, int chunkZ){

		addOreSpawn(BlockHandler.tutBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 50, 50, 10, 100, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	private void genOverworld(World world, Random random, int chunkX, int chunkZ){
		/*
		 * This adds spawn details to the world generator with the following parameters:
		 * BlockHandler.tutBlock.getDefaultState() is the block we are generating
		 * world is the world we are generating it in
		 * random is a random number provided by the world seed
		 * chunkX is the x-value of one corner of the chunk (16x256x16 blocks) we are generating in
		 * chunkZ is the z-value of one corner of the chunk (16x256x16 blocks) we are generating in
		 * 16 is the maximum x-value within the chunk where the ore can spawn
		 * 16 is the maximum z-value within the chunk where the ore can spawn
		 * 50 is the vein size;  every vein will contain at most 50 blocks of ore
		 * 20 is the chance for the ore to spawn within a chunk in quantity;  20 means we will get 20 veins per chunk
		 * 10 is the lowest Y-value where our veins can spawn
		 * 100 is the highest Y-value where our veins can spawn
		 * BlockMatcher.forBlock(Blocks.STONE) is the block that our ore can spawn inside of - stone
		 */
		addOreSpawn(BlockHandler.tutBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 50, 20, 10, 100, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	private void genNether(World world, Random random, int chunkX, int chunkZ){

		addOreSpawn(BlockHandler.tutBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 50, 50, 10, 100, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		int diffMinMaxY = maxY - minY;
		// if I want random chance for vein count I would implement it here:
		// int spawnChance = 1 + random.nextInt(chance);
		for(int x=0;x<chance;x++){
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			/*
			 * Create a minable with the following properties:
			 * block is the type of block
			 * maxVeinSize is how many instances of block it tries to spawn
			 * blockToSpawnIn determines where it can and can not spawn
			 * and then generate a vein of this minable with the following parameters:
			 * world is the world we're spawning into
			 * random is a random number determined by the world seed
			 * BlockPos(posX,posY,posZ) is the center of our vein spawn, determined randomly above
			 */
			(new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}