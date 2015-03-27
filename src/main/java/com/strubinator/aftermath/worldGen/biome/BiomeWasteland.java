package com.strubinator.aftermath.worldGen.biome;
import com.strubinator.aftermath.init.ModBlocks;
import com.strubinator.aftermath.lib.OldBiomeSettings;
import com.strubinator.aftermath.lib.DecorationSettings;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;

/**
 * Created by John on 3/2/2015.
 */

    public class BiomeWasteland extends BiomeGenBase
    {
        private static final Height biomeHeight = new Height(.5f, .5f);
        public BiomeWasteland(int ID)
        {
            super(ID);
            this.setHeight(biomeHeight);
            this.setColor(6775623);
            this.setDisableRain();
            this.setTemperatureRainfall(5.0f, 0.0f);
            this.waterColorMultiplier = 4936480;

            this.spawnableCreatureList.clear();
            this.spawnableWaterCreatureList.clear();

            this.topBlock = ModBlocks.organicMatter;

            this.fillerBlock = ModBlocks.organicMatter;
            this.theBiomeDecorator.treesPerChunk = -999;
            this.theBiomeDecorator.grassPerChunk = 1;
            this.theBiomeDecorator.flowersPerChunk = -999;


        }

       // @Override




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

