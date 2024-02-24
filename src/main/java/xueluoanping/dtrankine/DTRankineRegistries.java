package xueluoanping.dtrankine;

import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;

import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKit;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xueluoanping.dtrankine.systems.DTRankineGrowthLogicKits;
import xueluoanping.dtrankine.systems.featuregen.RankineFeatures;
import xueluoanping.dtrankine.systems.leaves.RankineLeavesProperties;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTRankineRegistries {

    @SubscribeEvent
    public static void registerLeavesPropertiesTypes(final TypeRegistryEvent<LeavesProperties> event) {
        event.registerType(new ResourceLocation(DTRankine.MOD_ID, "rankine_trees"), RankineLeavesProperties.TYPE);
    }


    // public static final FeatureCanceller FRUIT_TREES_CANCELLER = new RankineFeatureCanceller(new ResourceLocation(DTRankine.MOD_ID, "rankine_trees"));
    //
    // @SubscribeEvent
    // public static void onFeatureCancellerRegistry(final RegistryEvent<FeatureCanceller> event) {
    //     event.getRegistry().registerAll(FRUIT_TREES_CANCELLER);
    // }

    @SubscribeEvent
    public static void onGenFeatureRegistry(final RegistryEvent<GenFeature> event) {
        RankineFeatures.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void onGrowthLogicKitRegistry(final RegistryEvent<GrowthLogicKit> event) {
        DTRankineGrowthLogicKits.register(event.getRegistry());
    }
}
