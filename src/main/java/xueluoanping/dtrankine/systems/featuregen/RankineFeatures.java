package xueluoanping.dtrankine.systems.featuregen;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.systems.genfeatures.GenFeature;
import net.minecraft.util.ResourceLocation;

import xueluoanping.dtrankine.DTRankine;

public class RankineFeatures {
    public static final GenFeature FALLEN_LEAVES = new FeatureGenFallenLeaves(regName("fallen_leaves"));
    public static final GenFeature SPINE = new FeatureGenSpine(regName("spine"));

    private static ResourceLocation regName(String name) {
        return new ResourceLocation(DTRankine.MOD_ID, name);
    }

    public static void register(final Registry<GenFeature> registry) {
        registry.registerAll(FALLEN_LEAVES, SPINE);
    }
}
