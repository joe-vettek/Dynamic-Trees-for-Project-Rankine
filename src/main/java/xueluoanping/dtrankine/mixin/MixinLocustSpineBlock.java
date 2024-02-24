package xueluoanping.dtrankine.mixin;

import com.cannolicatfish.rankine.blocks.LocustSpineBlock;
import com.ferreusveritas.dynamictrees.block.branch.BranchBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xueluoanping.dtrankine.util.RegisterFinderUtil;

@Mixin({LocustSpineBlock.class})
public class MixinLocustSpineBlock {

    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    private void zz$canSurvive(BlockState state, LevelReader worldIn, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState state1 = worldIn.getBlockState(pos.relative(state.getValue(LocustSpineBlock.FACING).getOpposite()));
        if (state1.is(RegisterFinderUtil.getBlock("dtrankine:honey_locust_branch"))) {
            if (((BranchBlock) state1.getBlock()).getRadius(state1) == 8)
                cir.setReturnValue(true);
        }
    }
}
