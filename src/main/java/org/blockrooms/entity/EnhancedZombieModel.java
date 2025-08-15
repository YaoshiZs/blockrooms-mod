package org.blockrooms.entity;

import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.monster.Zombie;

public class EnhancedZombieModel<T extends Zombie> extends ZombieModel<T> {
    public EnhancedZombieModel(ModelPart p_171090_) {
        super(p_171090_);
    }
}
