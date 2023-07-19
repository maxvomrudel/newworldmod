package de.martinnussbaum.newworldmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 0.3F).build();
}
