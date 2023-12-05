package xueluoanping.dtrankine.systems.leaves;

import com.cannolicatfish.rankine.blocks.WillowBranchletTopBlock;
import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.blocks.leaves.DynamicLeavesBlock;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.ResourceLocation;
import xueluoanping.dtrankine.DTRankine;

public class RankineLeavesProperties extends LeavesProperties {

    public static final TypedRegistry.EntryType<LeavesProperties> TYPE = TypedRegistry.newType(RankineLeavesProperties::new);

    public RankineLeavesProperties(ResourceLocation registryName) {
        super(registryName);
    }


    @Override
    protected DynamicLeavesBlock createDynamicLeaves(AbstractBlock.Properties properties) {

        return new DynamicRankineLeavesBlock(this, properties) ;

    }

}
