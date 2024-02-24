package xueluoanping.dtrankine.systems.leaves;

import com.cannolicatfish.rankine.blocks.RankineLeavesBlock;
import com.cannolicatfish.rankine.blocks.block_groups.RankineWood;
import com.cannolicatfish.rankine.init.Config;
import com.cannolicatfish.rankine.init.RankineBlocks;
import com.cannolicatfish.rankine.init.RankineLists;
import com.ferreusveritas.dynamictrees.block.leaves.DynamicLeavesBlock;
import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;


import java.util.Iterator;
import java.util.Random;

public class DynamicRankineLeavesBlock extends DynamicLeavesBlock {

    public static final IntegerProperty AGE = RankineLeavesBlock.AGE;

    public DynamicRankineLeavesBlock(LeavesProperties leavesProperties, Properties properties) {
        super(leavesProperties, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(AGE));
    }


    private boolean dropLeaves(ServerLevel world, BlockPos pos, BlockState state, Random rand) {

        BlockState bs = getProperties(state).getPrimitiveLeaves().getBlock().defaultBlockState();
        if ((double)rand.nextFloat() < (Double)Config.GENERAL.LEAF_LITTER_GEN.get() && (bs.is(Blocks.AIR) || bs.canBeReplaced(Fluids.WATER)) && !bs.is((Block) RankineBlocks.WILLOW_BRANCHLET.get())) {
            Iterator var6 = RankineLists.RANKINE_WOODS.iterator();

            while(var6.hasNext()) {
                RankineWood Wood = (RankineWood)var6.next();
                if (state.is(Wood.getLeaves())) {
                    world.setBlockAndUpdate(pos.below(), Wood.getLeafLitter().defaultBlockState());
                    break;
                }
            }
        }
        // DTFruitTrees.LOGGER.debug(getProperties(state).getFamily().getCommonSpecies().getGenFeatures().get(0));
        return false;
    }


    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random rand) {
        super.randomTick(state, world, pos, rand);
        dropLeaves(world, pos, state, rand);
    }

}

