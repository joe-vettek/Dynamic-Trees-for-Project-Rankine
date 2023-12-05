package xueluoanping.dtrankine.mixin;

import com.cannolicatfish.rankine.blocks.WillowBranchletTopBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xueluoanping.dtrankine.util.RegisterFinderUtil;

@Mixin({WillowBranchletTopBlock.class})
public class MixinWillowBranchletTopBlock   {

    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    private  void zz$canSurvive(BlockState state, IWorldReader reader, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (reader.getBlockState(pos.relative(Direction.DOWN.getOpposite())).is(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_leaves")))
        {
                cir.setReturnValue(true);
        }
    }
}
