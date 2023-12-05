package xueluoanping.dtrankine.data;

import java.util.function.Consumer;

import com.cannolicatfish.rankine.data.RankineRecipesProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;


public class RecipeDataProvider extends RecipeProvider {
	public RecipeDataProvider(DataGenerator generator) {
		super(generator);
	}


	@Override
	protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

	}


}
