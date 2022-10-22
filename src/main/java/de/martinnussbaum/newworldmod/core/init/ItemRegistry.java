package de.martinnussbaum.newworldmod.core.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import de.martinnussbaum.newworldmod.NewWorldMod;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, NewWorldMod.MOD_ID);
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("poralrahmen", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
