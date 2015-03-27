package com.strubinator.aftermath.worldGen;

import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.lib.BiomeSettings;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;
import com.strubinator.aftermath.utility.LogHelper;

/**
 * Created by John on 3/26/2015.
 */
public class BiomeDecorator implements IWorldGenerator
{

    final WorldGenerator poisonMushroomGen = new WorldGenPlant(ModBlocks.mushroomPoison, 5);









    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        BiomeGenBase biome = world.getBiomeGenForCoords(chunkX, chunkZ);

        for(BiomeSettings b : BiomeSettings.values())
        {


            if( b.getBiome() == biome)
            {


                //Generate Poison Mushrooms
                for( int i = 0; i < b.poisonMushroomsPerChunk; i++)
                {
                    poisonMushroomGen.generate(world, rand, chunkX * 16 + rand.nextInt(16) , 256, chunkZ * 16 + rand.nextInt(16));
                }


            }
        }
    }



}
