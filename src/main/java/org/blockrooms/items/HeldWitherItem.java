package org.blockrooms.items;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class HeldWitherItem extends CEItem{

    public HeldWitherItem() {
        super(new Item.Properties());
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        LivingEntity entity = new WitherBoss(EntityType.WITHER, p_41427_.getLevel());
        entity.moveTo(p_41427_.getClickedPos().getX(), p_41427_.getClickedPos().getY(), p_41427_.getClickedPos().getZ());
        return InteractionResult.SUCCESS;
    }
}
