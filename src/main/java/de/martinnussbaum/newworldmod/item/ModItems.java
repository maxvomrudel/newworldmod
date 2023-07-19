package de.martinnussbaum.newworldmod.item;

import de.martinnussbaum.newworldmod.item.custom.DowsingRodItem;
import de.martinnussbaum.newworldmod.newworldmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, newworldmod.MOD_ID);
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_1)));
    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_1)));
    public static final RegistryObject<Item> ELERIUM = ITEMS.register("elerium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_1)));
    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.TAB_1).durability(16)));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_1).food(ModFoods.CUCUMBER)));
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.TAB_1)));
    public static void register(IEventBus eventBus) {  ITEMS.register(eventBus);   }

}
