package de.martinnussbaum.newworldmod.core.init;

import de.martinnussbaum.newworldmod.newworldmod;
import de.martinnussbaum.newworldmod.world.item.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class Blockinit {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, newworldmod.MOD_ID);

    public static final RegistryObject<Block> PORTAL_BLOCK = registerBlock("portal_block", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE)
            .strength(1F,3.0F)
            .sound(SoundType.AMETHYST).requiresCorrectToolForDrops())
            , ModCreativeModeTab.Tutorial_Tab);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
       RegistryObject<T> toReturen = BLOCKS.register(name,block);
       registerBlockItem(name, toReturen, tab);
       return toReturen;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));

    }


public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);
}

}
