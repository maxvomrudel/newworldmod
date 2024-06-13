package de.martinnussbaum.newworldmod.world.villager;

import net.martinnussbaum.newworldmod.newworldmod;
import de.martinnussbaum.newworldmod.newworldmod;
import net.martinnussbaum.newworldmod.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, newworldmod.MOD_ID);
    public static final RegistryObject<PoiType> PORTAL =
            POI.register("portal", () -> new PoiType("portal",
                    PoiType.getBlockStates(ModBlocks.PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}