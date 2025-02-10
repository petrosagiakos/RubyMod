package com.example.rubymod.items.custom_items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FireSword extends SwordItem {

    public FireSword(Tier tier, Properties p) {
        super(tier, p);
        
    }

    @Override//overrides the SwordItem method
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setRemainingFireTicks(100); // 5 seconds (20 ticks per second)
        return super.hurtEnemy(stack, target, attacker);
    }
    
    
}

