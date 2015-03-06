package com.strubinator.aftermath.worldGen.biome;
import com.strubinator.aftermath.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by John on 3/2/2015.
 */

    public class BiomeWasteland extends BiomeGenBase
    {
        private static final Height biomeHeight = new Height(-5.0f, 10.0f);
        public BiomeWasteland(int id)
        {
            super(id);
            this.setHeight(biomeHeight);
            this.setColor(6775623);
            this.setDisableRain();
            this.setTemperatureRainfall(5.0f, 0.0f);
            this.waterColorMultiplier = 4936480;

            this.spawnableCreatureList.clear();
            this.spawnableWaterCreatureList.clear();

            this.topBlock = ModBlocks.deadGrass;
            this.fillerBlock = ModBlocks.deadDirt;
            this.theBiomeDecorator.treesPerChunk = -999;
            this.theBiomeDecorator.grassPerChunk = 1;
            this.theBiomeDecorator.flowersPerChunk = -999;


        }

        @Override
        public int getBiomeGrassColor(int x, int y, int z)
        {
            return 6896932;
        }

        @Override
        public int getBiomeFoliageColor(int x, int y, int z)
        {
            return 10188371;
        }

        @Override
        public int getSkyColorByTemp(float par1 )
        {
            return 6708510;
        }
    }

