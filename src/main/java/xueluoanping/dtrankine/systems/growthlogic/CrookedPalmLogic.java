package xueluoanping.dtrankine.systems.growthlogic;

import com.ferreusveritas.dynamictrees.api.configuration.ConfigurationProperty;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKitConfiguration;
import com.ferreusveritas.dynamictrees.growthlogic.PalmGrowthLogic;
import com.ferreusveritas.dynamictrees.growthlogic.context.DirectionManipulationContext;
import com.ferreusveritas.dynamictrees.systems.GrowSignal;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import com.ferreusveritas.dynamictrees.util.CoordUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;


import java.util.Random;

// Thanks to maxhyper
// signal_energy controls the maximum trunk length.
// The value of each position in the six directions of probMap affects the initial branch size,
// but in the end, only values greater than 0 will always grow unless the fertility is exhausted.
// Because each growth pulse is sent throughout the tree along the trunk.
public class CrookedPalmLogic extends PalmGrowthLogic {

    public static final ConfigurationProperty<Float> CHANCE_TO_DIVERGE = ConfigurationProperty.floatProperty("chance_to_diverge");
    public static final ConfigurationProperty<Float> CHANCE_TO_SPLIT = ConfigurationProperty.floatProperty("chance_to_split");
    public static final ConfigurationProperty<Integer> TURNING_HEIGHT = ConfigurationProperty.integer("turning_height");

    public CrookedPalmLogic(ResourceLocation registryName) {
        super(registryName);
    }

    @Override
    protected GrowthLogicKitConfiguration createDefaultConfiguration() {
        return super.createDefaultConfiguration()
                .with(CHANCE_TO_DIVERGE, 0.8f)
                .with(CHANCE_TO_SPLIT, 0.06f)
                .with(TURNING_HEIGHT, 8); // can only split under the bottom half
    }

    @Override
    protected void registerProperties() {
        this.register(CHANCE_TO_DIVERGE, CHANCE_TO_SPLIT, TURNING_HEIGHT);
    }

    @Override
    public int[] populateDirectionProbabilityMap(GrowthLogicKitConfiguration configuration, DirectionManipulationContext context) {
        final Species species = context.species();
        final Level world = context.level();
        final GrowSignal signal = context.signal();
        final int[] probMap = context.probMap();
        final BlockPos pos = context.pos();
        Direction originDir = signal.dir.getOpposite();

        // Alter probability map for direction change
        probMap[0] = 0; // Down is always disallowed for palm
        probMap[1] = 0;
        // Start by disabling probability on the sides
        probMap[2] = probMap[3] = probMap[4] = probMap[5] = 0;

        int diverge = (int) (4 / configuration.get(CHANCE_TO_DIVERGE));
        int split = (int) (1 / configuration.get(CHANCE_TO_SPLIT));
        int randCoordCode = Math.abs(CoordUtils.coordHashCode(pos, 2));

        int directionSelection = randCoordCode % diverge;
        int splitSelection = randCoordCode % split;
        // if (directionSelection < 4 && signal.energy > 1){
        //     Direction selectedDir = Direction.values()[2 + directionSelection];
        //     //only do branching if it just grew up (to avoid long sideways branches)
        //     DTRankine.logger(directionSelection,selectedDir);
        //     if (originDir == Direction.DOWN){
        //         probMap[selectedDir.ordinal()] = 10;
        //         //if the chance to split is met, the clockwise direction is also enabled
        //         if (splitSelection == 0 && signal.energy > species.getEnergy(world, signal.rootPos) *
        //                 Math.max(0, Math.min(1, 1 - configuration.get(SPLIT_MAX_ENERGY_FACTOR)))){
        //             probMap[selectedDir.ordinal()] = 10;
        //         }
        //         probMap[1] = 0;
        //     }
        //     else {
        //         probMap[originDir.ordinal()] = 10;
        //         // probMap[selectedDir.ordinal()] = 10;
        //         probMap[Direction.UP.ordinal()] = 10;
        //     }
        // }

        // Disable the direction we came from
        int currentSignUsed=(int)(context.species().getSignalEnergy()-signal.energy);
        int randomHeight=Math.abs(new Random(signal.rootPos.asLong()).nextInt()%2);
        int randomW=Math.abs(new Random(signal.rootPos.asLong()).nextInt()%2);

        int real_turned_height = configuration.get(TURNING_HEIGHT) + randomHeight+1;
        if(currentSignUsed==real_turned_height){
            probMap[2+Math.min(directionSelection,3)] = 10;
            // probMap[2] = 1;
        }
        else if (currentSignUsed  >real_turned_height
                && currentSignUsed  <real_turned_height+randomW+1) {
            // probMap[1] = 0;
            probMap[signal.dir.ordinal()] = 10;
        }
        else{
            probMap[Direction.UP.ordinal()] = species.getUpProbability();
        }
        // if (currentSignUsed==9) {
        //     // probMap[1] = 0;
        //     probMap[4] = 100;
        // }
        // DTRankine.logger(currentSignUsed,probMap,signal.dir,signal.energy,signal.numSteps,signal.numTurns,signal.delta);
        return probMap;
    }

}
