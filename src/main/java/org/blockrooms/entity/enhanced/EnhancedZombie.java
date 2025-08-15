package org.blockrooms.entity.enhanced;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class EnhancedZombie extends Zombie {
    public EnhancedZombie(EntityType<? extends Zombie> p_34271_, Level p_34272_) {
        super(p_34271_, p_34272_);
    }


    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 70.0D).add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.MOVEMENT_SPEED, 0.28F).add(Attributes.ATTACK_DAMAGE, 6.0D).add(Attributes.ARMOR, 4.0D).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, 0.5D);
    }

    @Override
    public void tick() {
        super.tick();
    }
}
