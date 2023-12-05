package xueluoanping.dtrankine.data.lang;

import com.google.gson.JsonObject;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import xueluoanping.dtrankine.util.RegisterFinderUtil;


import java.util.function.Supplier;


public class Lang_ZH extends LangHelper {
	public Lang_ZH(DataGenerator gen, ExistingFileHelper helper,String modid) {
		super(gen, helper,modid, "zh_cn");
	}


	@Override
	protected void addTranslations() {
		add(modid, "动态的树：兰金计划附属");
		add(RegisterFinderUtil.getBlock("dtrankine:eastern_hemlock_sapling"), "东方铁杉树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:black_walnut_sapling"), "黑核桃树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:cork_oak_sapling"), "栓皮栎树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:juniper_sapling"), "杜松树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:sharinga_sapling"), "沙林加树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:western_hemlock_sapling"), "西部铁杉树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:coconut_palm_sapling"), "椰子树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:magnolia_sapling"), "木兰树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:honey_locust_sapling"), "皂荚树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:red_birch_sapling"), "红桦树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:maple_sapling"), "枫树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_sapling"), "垂柳树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:erythrina_sapling"), "刺桐树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:pinyon_pine_sapling"), "矮松树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:yellow_birch_sapling"), "黄桦树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:cedar_sapling"), "雪松树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:balsam_fir_sapling"), "冷杉树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:black_birch_sapling"), "黑桦树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:cinnamon_sapling"), "肉桂树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:petrified_chorus_sapling"), "紫颂树苗");
		add(RegisterFinderUtil.getBlock("dtrankine:eastern_hemlock_branch"), "东方铁杉木");
		add(RegisterFinderUtil.getBlock("dtrankine:black_walnut_branch"), "黑核桃木");
		add(RegisterFinderUtil.getBlock("dtrankine:cork_oak_branch"), "栓皮栎木");
		add(RegisterFinderUtil.getBlock("dtrankine:juniper_branch"), "杜松木");
		add(RegisterFinderUtil.getBlock("dtrankine:sharinga_branch"), "沙林加木");
		add(RegisterFinderUtil.getBlock("dtrankine:western_hemlock_branch"), "西部铁杉木");
		add(RegisterFinderUtil.getBlock("dtrankine:coconut_palm_branch"), "椰子木");
		add(RegisterFinderUtil.getBlock("dtrankine:magnolia_branch"), "木兰木");
		add(RegisterFinderUtil.getBlock("dtrankine:honey_locust_branch"), "皂荚木");
		add(RegisterFinderUtil.getBlock("dtrankine:red_birch_branch"), "红桦木");
		add(RegisterFinderUtil.getBlock("dtrankine:maple_branch"), "枫木");
		add(RegisterFinderUtil.getBlock("dtrankine:weeping_willow_branch"), "垂柳木");
		add(RegisterFinderUtil.getBlock("dtrankine:erythrina_branch"), "刺桐木");
		add(RegisterFinderUtil.getBlock("dtrankine:pinyon_pine_branch"), "矮松木");
		add(RegisterFinderUtil.getBlock("dtrankine:yellow_birch_branch"), "黄桦木");
		add(RegisterFinderUtil.getBlock("dtrankine:cedar_branch"), "雪松木");
		add(RegisterFinderUtil.getBlock("dtrankine:balsam_fir_branch"), "冷杉木");
		add(RegisterFinderUtil.getBlock("dtrankine:black_birch_branch"), "黑桦木");
		add(RegisterFinderUtil.getBlock("dtrankine:cinnamon_branch"), "肉桂木");
		add(RegisterFinderUtil.getBlock("dtrankine:petrified_chorus_branch"), "紫颂木");
		add(RegisterFinderUtil.getItem("dtrankine:eastern_hemlock_seed"), "东方铁杉种子");
		add(RegisterFinderUtil.getItem("dtrankine:black_walnut_seed"), "黑核桃种子");
		add(RegisterFinderUtil.getItem("dtrankine:cork_oak_seed"), "栓皮栎种子");
		add(RegisterFinderUtil.getItem("dtrankine:juniper_seed"), "杜松种子");
		add(RegisterFinderUtil.getItem("dtrankine:sharinga_seed"), "沙林加种子");
		add(RegisterFinderUtil.getItem("dtrankine:western_hemlock_seed"), "西部铁杉种子");
		add(RegisterFinderUtil.getItem("dtrankine:coconut_palm_seed"), "椰子种子");
		add(RegisterFinderUtil.getItem("dtrankine:magnolia_seed"), "木兰种子");
		add(RegisterFinderUtil.getItem("dtrankine:honey_locust_seed"), "皂荚种子");
		add(RegisterFinderUtil.getItem("dtrankine:red_birch_seed"), "红桦种子");
		add(RegisterFinderUtil.getItem("dtrankine:maple_seed"), "枫种子");
		add(RegisterFinderUtil.getItem("dtrankine:weeping_willow_seed"), "垂柳种子");
		add(RegisterFinderUtil.getItem("dtrankine:erythrina_seed"), "刺桐种子");
		add(RegisterFinderUtil.getItem("dtrankine:pinyon_pine_seed"), "矮松种子");
		add(RegisterFinderUtil.getItem("dtrankine:yellow_birch_seed"), "黄桦种子");
		add(RegisterFinderUtil.getItem("dtrankine:cedar_seed"), "雪松种子");
		add(RegisterFinderUtil.getItem("dtrankine:balsam_fir_seed"), "冷杉种子");
		add(RegisterFinderUtil.getItem("dtrankine:black_birch_seed"), "黑桦种子");
		add(RegisterFinderUtil.getItem("dtrankine:cinnamon_seed"), "肉桂种子");
		// add(RegisterFinderUtil.getItem("dtrankine:petrified_chorus_seed"), "紫颂种子");
		addSpecie("eastern_hemlock","东方铁杉树");
		addSpecie("black_walnut","黑核桃树");
		addSpecie("cork_oak","栓皮栎树");
		addSpecie("juniper","杜松树");
		addSpecie("sharinga","沙林加树");
		addSpecie("western_hemlock","西部铁杉树");
		addSpecie("coconut_palm","椰子树");
		addSpecie("magnolia","木兰树");
		addSpecie("honey_locust","皂荚树");
		addSpecie("red_birch","红桦树");
		addSpecie("maple","枫树");
		addSpecie("weeping_willow","垂柳树");
		addSpecie("erythrina","刺桐树");
		addSpecie("pinyon_pine","矮松树");
		addSpecie("yellow_birch","黄桦树");
		addSpecie("cedar","雪松树");
		addSpecie("balsam_fir","冷杉树");
		addSpecie("black_birch","黑桦树");
		addSpecie("cinnamon","肉桂树");
		addSpecie("petrified_chorus","紫颂树");
		addSpecie("mega_petrified_chorus","大紫颂树");


	}


}
