package org.blockrooms.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;

public class AlmondMilkBucketItem extends MilkBucketItem {
    public AlmondMilkBucketItem() {
        super(new Item.Properties().craftRemainder(Items.BUCKET).food(new FoodProperties.Builder().nutrition(9).saturationMod(10).build()).stacksTo(1));
    }


    @Override
    public ItemStack finishUsingItem(ItemStack p_42923_, Level p_42924_, LivingEntity p_42925_) {
        if (!p_42924_.isClientSide) {
            p_42925_.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1));
            p_42925_.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1));
        }

        if (p_42925_ instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, p_42923_);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (p_42925_ instanceof Player && !((Player)p_42925_).getAbilities().instabuild) {
            p_42923_.shrink(1);
        }

        return p_42923_.isEmpty() ? new ItemStack(Items.BUCKET) : p_42923_;
    }
}
