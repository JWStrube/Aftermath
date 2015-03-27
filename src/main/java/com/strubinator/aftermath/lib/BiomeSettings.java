package com.strubinator.aftermath.lib;

/**
 * Created by John on 3/26/2015.
 */

import com.strubinator.aftermath.worldGen.biome.BiomeWasteland;
import com.strubinator.aftermath.worldGen.biome.BiomesAftermath;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import com.google.common.base.Optional;


import com.strubinator.aftermath.utility.LogHelper;
public enum BiomeSettings
{
    DESERT, EXTREMEHILLS, FOREST, JUNGLE, PLAINS, SWAMPLAND, TAIGA, OCEAN,
    WASTELAND (BiomesAftermath.biomeWasteland );


    private boolean allowVillages = true;

    //private final Optional<? extends Class<? extends BiomeGenBase>> biomeClass;
    private  BiomeGenBase biome = null;
    private int id = 0;




    //Custom decoration settings
    public int deadTreesPerChunk = 0;
    public int sicklyTreesPerChunk = 0;
    public int poisonMushroomsPerChunk = 0;

    static
    {
        WASTELAND.poisonMushroomsPerChunk = 10;
    }


    private BiomeSettings()
    {
        this(null);
    }

    private BiomeSettings( BiomeGenBase biome)
    {

        if(biome != null){this.id = biome.biomeID; }
        //this.id = id;
       this.biome = biome;

    }


    public int getBiomeID()
    {
        return this.id;
    }

    public BiomeGenBase getBiome() {
        return biome;
    }

    public boolean isVanilla() {
        return !(biome == null);
    }


}
