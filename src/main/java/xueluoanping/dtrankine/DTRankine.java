package xueluoanping.dtrankine;

import com.cannolicatfish.rankine.init.Config;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import com.ferreusveritas.dynamictrees.blocks.leaves.DynamicLeavesBlock;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.blocks.rootyblocks.SoilHelper;
import com.ferreusveritas.dynamictrees.resources.Resources;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xueluoanping.dtrankine.data.start;

import java.lang.reflect.Array;
import java.util.List;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(DTRankine.MOD_ID)
public class DTRankine {
    public static final String MOD_ID = "dtrankine";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public DTRankine() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // MinecraftForge.EVENT_BUS.register(TreeGrowHandler.instance);
        RegistryHandler.setup(MOD_ID);

    }


    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        //        LOGGER.info("HELLO FROM PREINIT");
        //        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        //        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        //        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        //        LOGGER.info("Got IMC {}", event.getIMCStream().
        //                map(m->m.getMessageSupplier().get()).
        //                collect(Collectors.toList()));
        Config.MISC_WORLDGEN.RANKINE_TREES.set(false);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        //        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            //            LOGGER.info("HELLO from Register Block");
        }
    }

    public void gatherData(final GatherDataEvent event) {
        Resources.MANAGER.gatherData();

        // GatherDataHelper.gatherAllData(
        //         MOD_ID,
        //         event,
        //         SoilProperties.REGISTRY,
        //         Family.REGISTRY,
        //         Species.REGISTRY,
        //         LeavesProperties.REGISTRY
        // );

        start.dataGen(event);
    }

    public static void logger(Object... x) {

        // if (General.bool.get())
        {
            StringBuilder output = new StringBuilder();
            for (Object i : x) {
                if (i==null)output.append("null");else
                if (i.getClass().isArray()) {
                    output.append(", [");
                    for (Object c : (int[]) i) {
                        output.append(c+",");
                    }
                    output.append("]");
                }
                else if (i instanceof List) {
                    output.append(", [");
                    for (Object c : (List) i) {
                        output.append(c);
                    }
                    output.append("]");
                }
                else
                    output.append(", [").append(i).append("]");
            }
            LOGGER.info(output.toString().substring(1));
        }

    }

}
