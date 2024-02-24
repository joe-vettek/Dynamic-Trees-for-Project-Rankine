package xueluoanping.dtrankine.systems.featuregen;

import com.cannolicatfish.rankine.blocks.LocustSpineBlock;

import com.ferreusveritas.dynamictrees.api.configuration.ConfigurationProperty;
import com.ferreusveritas.dynamictrees.block.branch.BranchBlock;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeatureConfiguration;
import com.ferreusveritas.dynamictrees.systems.genfeature.context.PostGenerationContext;
import com.ferreusveritas.dynamictrees.systems.genfeature.context.PostGrowContext;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import xueluoanping.dtrankine.util.RegisterFinderUtil;

import java.util.Random;

public class FeatureGenSpine extends GenFeature {

    public static final ConfigurationProperty<String> SPINE = ConfigurationProperty.property("spine", String.class);

    public BlockState getSpineBlock(GenFeatureConfiguration configuration) {
        return RegisterFinderUtil.getBlock(configuration.get(SPINE)).defaultBlockState();
    }

    public FeatureGenSpine(ResourceLocation registryName) {
        super(registryName);
    }

    @Override
    protected void registerProperties() {
        this.register(SPINE);
    }

    @Override
    protected GenFeatureConfiguration createDefaultConfiguration() {
        return super.createDefaultConfiguration()
                .with(SPINE, "air");
    }

    @Override
    protected boolean postGenerate(GenFeatureConfiguration configuration, PostGenerationContext context) {
        final LevelAccessor world = context.level();


        final Random random = context.random();
        BlockPos offPos = context.pos();
        for (int i = 0; i < 32; i++) {
            offPos = offPos.above();

            if (!world.isEmptyBlock(offPos)) {
                Block block = world.getBlockState(offPos).getBlock();

                if (!(block instanceof BranchBlock)) {
                    break;
                } else if (((BranchBlock) block).getRadius(world.getBlockState(offPos)) == 8) {// Convert grass or dirt to podzol

                    testAir(world, offPos.east(), Direction.EAST, configuration);
                    testAir(world, offPos.west(), Direction.WEST, configuration);
                    testAir(world, offPos.south(), Direction.SOUTH, configuration);
                    testAir(world, offPos.north(), Direction.NORTH, configuration);
                } else
                    break;

            } else
                break;
        }
        // final BlockPos pos = endPoints.get(random.nextInt(endPoints.size()));


        return true;
    }

    @Override
    protected boolean postGrow(GenFeatureConfiguration configuration, PostGrowContext context) {

        // DTRankine.logger( Config.MISC_WORLDGEN.RANKINE_TREES.get());
        final LevelAccessor world = context.level();
        final Random random = context.random();
        BlockPos offPos = context.pos();
        for (int i = 0; i < 32; i++) {
            offPos = offPos.above();

            if (!world.isEmptyBlock(offPos)) {
                Block block = world.getBlockState(offPos).getBlock();

                if (!(block instanceof BranchBlock)) {
                    break;
                } else if (((BranchBlock) block).getRadius(world.getBlockState(offPos)) == 8) {// Convert grass or dirt to podzol

                    if (world.getRandom().nextInt(4) ==0)
                        testAir(world, offPos.east(),Direction.EAST, configuration);
                    if (world.getRandom().nextInt(4) ==0)
                        testAir(world, offPos.west(),Direction.WEST, configuration);
                    if (world.getRandom().nextInt(4) ==0)
                        testAir(world, offPos.south(),Direction.SOUTH, configuration);
                    if (world.getRandom().nextInt(4) ==0)
                        testAir(world, offPos.north(),Direction.NORTH, configuration);
                } else
                    break;

            } else
                break;
        }
        // final BlockPos pos = endPoints.get(random.nextInt(endPoints.size()));


        return true;
    }

    private void testAir(LevelAccessor world, BlockPos pos, Direction opposite, GenFeatureConfiguration configuration) {
        if (world.isEmptyBlock(pos)) {
            // random generate , maybe not
            if (world.getRandom().nextInt(5) < 3)
                world.setBlock(pos, getSpineBlock(configuration).setValue(LocustSpineBlock.FACING, opposite), Block.UPDATE_ALL);
        }

    }


}
