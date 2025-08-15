package org.blockrooms.entity.enhanced.client;

import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EnhancedZombieModel<T extends Zombie> extends ZombieModel<T> {
    public EnhancedZombieModel(ModelPart p_171090_) {
        super(p_171090_);
    }

}
