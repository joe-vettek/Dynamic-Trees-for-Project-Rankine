package xueluoanping.dtrankine.mixin;

import com.cannolicatfish.rankine.blocks.WillowBranchletBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xueluoanping.dtrankine.util.RegisterFinderUtil;

@Mixin({WillowBranchletBlock.class})
public class MixinWillowBranchletBlock {

    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    private  void zz$canSurvive(BlockState state, LevelReader reader, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (reader.getBlockState(pos.relative(Direction.DOWN.getOpposite())).is(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_leaves")))
        {
                cir.setReturnValue(true);
        }
    }
}
