package com.example.rubymod.items.custom_items;

import java.util.Random;


import net.minecraft.world.entity.player.Player;


import net.minecraft.world.InteractionResult;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class MagicWand extends Item{
    //public static final int[] poss={30,60,100};//posibilities
     private static final MobEffectInstance[] ME = new MobEffectInstance[]{
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2),
        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2),
        new MobEffectInstance(MobEffects.JUMP, 200, 2)
   
    };//mobefects
    public MagicWand(Properties e){
        super(e);

    }

     @Override
    public InteractionResult useOn(UseOnContext pContext){
        Random rand=new Random();
        int r=rand.nextInt(ME.length);
        Level level=pContext.getLevel();
       Player player =  pContext.getPlayer();
        //takes the clicked object
        
        if (player == null) {
            System.out.println("fail");
            return InteractionResult.FAIL; // Prevents null player issues
        }
        
        System.out.println(r);
        if (!level.isClientSide() ) { 
                        
            player.addEffect(new MobEffectInstance(
                ME[r].getEffect(),
                ME[r].getDuration(),
                ME[r].getAmplifier()
            ));
        
        }
        
            /*for (int i = 0; i < ME.length; i++) {
                if (r < poss[i]) {
                    if (!level.isClientSide() ) { 
                        
                        break;
                    
                    }
               
                }
            }*/
        
            
         return InteractionResult.SUCCESS;
    }
}
