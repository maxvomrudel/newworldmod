package de.martinnussbaum.newworldmod.core.init;

import de.martinnussbaum.newworldmod.world.item.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import de.martinnussbaum.newworldmod.newworldmod;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, newworldmod.MOD_ID);
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("poralrahmen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Tutorial_Tab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
