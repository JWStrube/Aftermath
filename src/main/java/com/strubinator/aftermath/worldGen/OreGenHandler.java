package com.strubinator.aftermath.worldGen;

/**
 * Created by John on 3/2/2015.
 */
import com.strubinator.aftermath.handler.ConfigurationHandler;
import com.strubinator.aftermath.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGenHandler implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderEnd))
        {
            for(int i = 0; i < ConfigurationHandler.leadOrePerChunk; i++)
            {
                int randPosX = (chunkX*16) + random.nextInt(16);
                int randPosY = random.nextInt(60);
                int randPosZ = (chunkZ*16) + random.nextInt(16);
                new WorldGenMinable(ModBlocks.leadOre, 10, Blocks.stone).generate(world, random, randPosX, randPosY, randPosZ);
            }


        }
    }
}