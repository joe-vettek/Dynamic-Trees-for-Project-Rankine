package xueluoanping.dtrankine.systems;

import com.cannolicatfish.rankine.init.RankineFeatures;
import com.ferreusveritas.dynamictrees.api.worldgen.BiomePropertySelectors;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.registries.ForgeRegistries;
import xueluoanping.dtrankine.DTRankine;

public class RankineFeatureCanceller extends FeatureCanceller {

    public RankineFeatureCanceller(ResourceLocation registryName) {
        super(registryName);
    }

    @Override
    public boolean shouldCancel(ConfiguredFeature<?, ?> configuredFeature, BiomePropertySelectors.FeatureCancellations featureCancellations) {
        // Note it not in ForgeRegistries.FEATURES
        final ResourceLocation featureName = WorldGenRegistries.CONFIGURED_FEATURE.getKey(configuredFeature);
        DTRankine.logger(2563,ForgeRegistries.FEATURES.getKey(configuredFeature.feature), featureName, WorldGenRegistries.CONFIGURED_FEATURE.getKey(configuredFeature));
       DTRankine.logger( RankineFeatures.ARTIST_CONK_FEATURE.get().configuredCodec());
        if (featureName == null) {
            return false;
        }
        // configuredFeature.feature.getClass()
        return featureCancellations.shouldCancelNamespace(featureName.getNamespace())
                && (WorldGenRegistries.CONFIGURED_FEATURE.getKey(configuredFeature) + "").startsWith("fruittrees");
    }
}
