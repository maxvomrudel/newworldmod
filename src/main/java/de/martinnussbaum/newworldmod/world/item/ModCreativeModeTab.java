package de.martinnussbaum.newworldmod.world.item;

import de.martinnussbaum.newworldmod.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
public static final CreativeModeTab Tutorial_Tab = new CreativeModeTab("testtab") {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.TESTITEM.get());
    }
};




}
