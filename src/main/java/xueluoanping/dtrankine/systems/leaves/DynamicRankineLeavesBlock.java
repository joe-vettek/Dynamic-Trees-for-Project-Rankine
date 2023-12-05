package xueluoanping.dtrankine.systems.leaves;

import com.cannolicatfish.rankine.blocks.RankineLeavesBlock;
import com.cannolicatfish.rankine.init.Config;
import com.cannolicatfish.rankine.init.RankineLists;
import com.ferreusveritas.dynamictrees.blocks.leaves.DynamicLeavesBlock;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistries;


import java.util.Random;

public class DynamicRankineLeavesBlock extends DynamicLeavesBlock {

    public static final IntegerProperty AGE = RankineLeavesBlock.AGE;

    public DynamicRankineLeavesBlock(LeavesProperties leavesProperties, Properties properties) {
        super(leavesProperties, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }


    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(AGE));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context);
    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        super.tick(state, worldIn, pos, rand);


    }



    private boolean dropLeaves(World world, BlockPos pos, BlockState state, Random rand) {

        if (state.is(this)) {
            BlockState bs = world.getBlockState(pos.below());
            if ((double)rand.nextFloat() < Config.GENERAL.LEAF_LITTER_GEN.get() && (bs.is(Blocks.AIR) || bs.canBeReplaced(Fluids.WATER)) && (world.getBlockState(pos.below(2)).is(Blocks.AIR) || world.getBlockState(pos.below(2)).canBeReplaced(Fluids.WATER))) {
                world.setBlock(pos.below(), RankineLists.LEAF_LITTERS.get(RankineLists.LEAVES.indexOf(getProperties(state).getPrimitiveLeaves().getBlock())).defaultBlockState(), 3);
            }
        }

        // DTFruitTrees.LOGGER.debug(getProperties(state).getFamily().getCommonSpecies().getGenFeatures().get(0));
        return false;
    }

    public Item getItemFromRegistry(String itemName) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName));
    }


    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        return super.use(state, world, pos, player, hand, blockRayTraceResult);
    }


    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        super.randomTick(state, world, pos, rand);

dropLeaves(world,pos,state,rand);
    }

}

