package xueluoanping.dtrankine.data.lang;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import xueluoanping.dtrankine.util.RegisterFinderUtil;


import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lang_EN extends LangHelper {
    public Lang_EN(DataGenerator gen, ExistingFileHelper helper,String modid) {
        super(gen, helper,modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(modid, "Dynamic Trees for Project Rankine");


        add(RegisterFinderUtil.getBlock("dtrankine:eastern_hemlock_sapling"), "Eastern Hemlock Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:black_walnut_sapling"), "Black Walnut Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:cork_oak_sapling"), "Cork Oak Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:juniper_sapling"), "Juniper Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:sharinga_sapling"), "Sharinga Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:western_hemlock_sapling"), "Western Hemlock Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:coconut_palm_sapling"), "Coconut Palm Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:magnolia_sapling"), "Magnolia Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:honey_locust_sapling"), "Honey Locust Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:red_birch_sapling"), "Red Birch Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:maple_sapling"), "Maple Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_sapling"), "Weeping Willow Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:erythrina_sapling"), "Erythrina Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:pinyon_pine_sapling"), "Pinyon Pine Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:yellow_birch_sapling"), "Yellow Birch Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:cedar_sapling"), "Cedar Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:balsam_fir_sapling"), "Balsam Fir Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:black_birch_sapling"), "Black Birch Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:cinnamon_sapling"), "Cinnamon Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:petrified_chorus_sapling"), "Petrified Chorus Sapling");
        add(RegisterFinderUtil.getBlock("dtrankine:eastern_hemlock_branch"), "Eastern Hemlock Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:black_walnut_branch"), "Black Walnut Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:cork_oak_branch"), "Cork Oak Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:juniper_branch"), "Juniper Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:sharinga_branch"), "Sharinga Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:western_hemlock_branch"), "Western Hemlock Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:coconut_palm_branch"), "Coconut Palm Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:magnolia_branch"), "Magnolia Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:honey_locust_branch"), "Honey Locust Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:red_birch_branch"), "Red Birch Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:maple_branch"), "Maple Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_branch"), "Weeping Willow Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:erythrina_branch"), "Erythrina Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:pinyon_pine_branch"), "Pinyon Pine Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:yellow_birch_branch"), "Yellow Birch Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:cedar_branch"), "Cedar Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:balsam_fir_branch"), "Balsam Fir Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:black_birch_branch"), "Black Birch Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:cinnamon_branch"), "Cinnamon Tree");
        add(RegisterFinderUtil.getBlock("dtrankine:petrified_chorus_branch"), "Petrified Chorus Tree");
        add(RegisterFinderUtil.getItem("dtrankine:eastern_hemlock_seed"), "Eastern Hemlock Seed");
        add(RegisterFinderUtil.getItem("dtrankine:black_walnut_seed"), "Black Walnut Seed");
        add(RegisterFinderUtil.getItem("dtrankine:cork_oak_seed"), "Cork Oak Seed");
        add(RegisterFinderUtil.getItem("dtrankine:juniper_seed"), "Juniper Seed");
        add(RegisterFinderUtil.getItem("dtrankine:sharinga_seed"), "Sharinga Seed");
        add(RegisterFinderUtil.getItem("dtrankine:western_hemlock_seed"), "Western Hemlock Seed");
        add(RegisterFinderUtil.getItem("dtrankine:coconut_palm_seed"), "Coconut Palm Seed");
        add(RegisterFinderUtil.getItem("dtrankine:magnolia_seed"), "Magnolia Seed");
        add(RegisterFinderUtil.getItem("dtrankine:honey_locust_seed"), "Honey Locust Seed");
        add(RegisterFinderUtil.getItem("dtrankine:red_birch_seed"), "Red Birch Seed");
        add(RegisterFinderUtil.getItem("dtrankine:maple_seed"), "Maple Seed");
        add(RegisterFinderUtil.getItem("dtrankine:weeping_willow_seed"), "Weeping Willow Seed");
        add(RegisterFinderUtil.getItem("dtrankine:erythrina_seed"), "Erythrina Seed");
        add(RegisterFinderUtil.getItem("dtrankine:pinyon_pine_seed"), "Pinyon Pine Seed");
        add(RegisterFinderUtil.getItem("dtrankine:yellow_birch_seed"), "Yellow Birch Seed");
        add(RegisterFinderUtil.getItem("dtrankine:cedar_seed"), "Cedar Seed");
        add(RegisterFinderUtil.getItem("dtrankine:balsam_fir_seed"), "Balsam Fir Seed");
        add(RegisterFinderUtil.getItem("dtrankine:black_birch_seed"), "Black Birch Seed");
        add(RegisterFinderUtil.getItem("dtrankine:cinnamon_seed"), "Cinnamon Seed");
        // add(RegisterFinderUtil.getItem("dtrankine:petrified_chorus_seed"), "Petrified Chorus Seed");
        addSpecie("eastern_hemlock","Eastern Hemlock");
        addSpecie("black_walnut","Black Walnut");
        addSpecie("cork_oak","Cork Oak");
        addSpecie("juniper","Juniper");
        addSpecie("sharinga","Sharinga");
        addSpecie("western_hemlock","Western Hemlock");
        addSpecie("coconut_palm","Coconut Palm");
        addSpecie("magnolia","Magnolia");
        addSpecie("honey_locust","Honey Locust");
        addSpecie("red_birch","Red Birch");
        addSpecie("maple","Maple");
        addSpecie("weeping_willow","Weeping Willow");
        addSpecie("erythrina","Erythrina");
        addSpecie("pinyon_pine","Pinyon Pine");
        addSpecie("yellow_birch","Yellow Birch");
        addSpecie("cedar","Cedar");
        addSpecie("balsam_fir","Balsam Fir");
        addSpecie("black_birch","Black Birch");
        addSpecie("cinnamon","Cinnamon");
        addSpecie("petrified_chorus","Petrified Chorus");
        addSpecie("mega_petrified_chorus","Mega Petrified Chorus");
    }
}
