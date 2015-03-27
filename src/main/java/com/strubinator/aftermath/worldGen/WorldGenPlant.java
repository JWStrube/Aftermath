package com.strubinator.aftermath.worldGen;

import com.strubinator.aftermath.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by John on 3/21/2015.
 */
public class WorldGenPlant extends WorldGenerator
{
    private Block plantToGen;
    private int amount;
    private int radius;

    public WorldGenPlant(Block block)
    {
        this.plantToGen = block;
        this.amount = 16;
        this.radius = 5;
    }

    public WorldGenPlant(Block block, int amt)
    {
        this.plantToGen = block;
        this.amount = amt;
        this.radius = 5;
    }

    public WorldGenPlant(Block block, int amt, int rad)
    {
        this.plantToGen = block;
        this.amount = amt;
        this.radius = rad;
    }


    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {


        do
        {
            Block block;
            block = world.getBlock(x, y, z);
            if (block != Blocks.air && !block.isLeaves(world, x, y, z))
            {
                //y++;
                break;

            }
            y--;
        }while(y>0);

        for(int i1 = 0; i1 < amount; i1++)
        {
            //LogHelper.info(y);
            int x1 = x + random.nextInt(radius) - random.nextInt(radius);
            int y1 = y + random.nextInt(4) - random.nextInt(4);
            int z1 = z + random.nextInt(radius) - random.nextInt(radius);
            if (world.isAirBlock(x1, y1, z1) && plantToGen.canBlockStay(world, x1, y1, z1))
            {

                world.setBlock(x1, y1, z1, plantToGen);
            }


        }


        return true;


    }
}
