package de.martinnussbaum.newworldmod;

import com.mojang.logging.LogUtils;
import de.martinnussbaum.newworldmod.block.ModBlocks;
import de.martinnussbaum.newworldmod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(newworldmod.MOD_ID)
public class newworldmod {
    public static final String MOD_ID = "newworldmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public newworldmod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);



        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
    }

}
