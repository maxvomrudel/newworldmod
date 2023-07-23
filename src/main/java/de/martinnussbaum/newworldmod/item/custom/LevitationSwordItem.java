package de.martinnussbaum.newworldmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class LevitationSwordItem extends SwordItem {
    public LevitationSwordItem(Tier ptier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperites) {
        super(ptier, pAttackDamageModifier, pAttackSpeedModifier, pProperites);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
