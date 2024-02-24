package xueluoanping.dtrankine.systems;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKit;
import net.minecraft.resources.ResourceLocation;
import xueluoanping.dtrankine.DTRankine;
import xueluoanping.dtrankine.systems.growthlogic.BifurcatedTreeLogic;
import xueluoanping.dtrankine.systems.growthlogic.CrookedPalmLogic;
import xueluoanping.dtrankine.systems.growthlogic.RedwoodLogic;

public class DTRankineGrowthLogicKits {
    public static final GrowthLogicKit CROOKED_PALM = new CrookedPalmLogic(new ResourceLocation(DTRankine.MOD_ID, "crooked_palm"));
    public static final GrowthLogicKit HEMLOCK = new RedwoodLogic(new ResourceLocation(DTRankine.MOD_ID, "hemlock"));
    public static final GrowthLogicKit BIFURCATED_TREE = new BifurcatedTreeLogic(new ResourceLocation(DTRankine.MOD_ID, "bifurcated"));
    public static void register(final Registry<GrowthLogicKit> registry) {
        registry.registerAll(CROOKED_PALM,HEMLOCK, BIFURCATED_TREE);
    }
}
