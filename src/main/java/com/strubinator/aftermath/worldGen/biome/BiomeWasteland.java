package com.strubinator.aftermath.worldGen.biome;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by John on 3/2/2015.
 */

    public class BiomeWasteland extends BiomeGenBase
    {
        private static final Height biomeHeight = new Height(0.1f, 0.2f);
        public BiomeWasteland(int id)
        {
            super(id);
            this.setHeight(biomeHeight);
            this.setColor(6708510);
            this.setTemperatureRainfall(0.9f, 0.2f);
            this.waterColorMultiplier = 4936480;
        }

        @Override
        public int getBiomeGrassColor(int x, int y, int z)
        {
            return 6708510;
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

