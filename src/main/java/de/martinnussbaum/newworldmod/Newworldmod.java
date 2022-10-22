package de.martinnussbaum.newworldmod;

import com.mojang.logging.LogUtils;
import de.martinnussbaum.newworldmod.core.init.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NewWorldMod.MOD_ID)
public class NewWorldMod {

    public static final String MOD_ID = "newworldmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NewWorldMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.register(modEventBus);



        MinecraftForge.EVENT_BUS.register(this);
    }
}
