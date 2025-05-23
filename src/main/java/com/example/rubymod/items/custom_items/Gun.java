package com.example.rubymod.items.custom_items;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.level.Level;

import com.example.rubymod.entity.ModEntities;
import com.example.rubymod.items.ModItems;
import com.example.rubymod.sound.ModSounds;
import com.example.rubymod.entity.custom.BulletEntity;

public class Gun extends Item {
    public Gun(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        ItemStack ammo = new ItemStack(ModItems.BULLET_ITEM.get());
        if(!getAmmo(player).isEmpty()){

            if (!world.isClientSide) { // Server-side execution
                ItemStack bullets=getAmmo(player);
                BulletEntity bullet = new BulletEntity(ModEntities.BULLET.get(),world, player,ammo);
                world.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.GUN_SOUND.get(),SoundSource.PLAYERS, 1.0F, 1.0F);//playing custom sound

                bullet.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 100.0F, 0.0F);//last parameter: defines the percision of the target
                world.addFreshEntity(bullet);
                bullets.shrink(1);//reduces the bullets by one
                

            }
            return InteractionResultHolder.sidedSuccess(stack, world.isClientSide());
        }else {
            // Play empty gun click sound
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.DISPENSER_FAIL, SoundSource.PLAYERS, 1.0F, 1.0F);
            return InteractionResultHolder.fail(stack);
        }
        
    }

    private ItemStack getAmmo(Player player) {//checks if the player has bullets
        for (ItemStack itemStack : player.getInventory().items) {
            if (itemStack.getItem() == ModItems.BULLET_ITEM.get()) {
                return itemStack;
            }
        }
        return ItemStack.EMPTY;
    }
}
