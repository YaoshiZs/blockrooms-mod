package org.blockrooms.entity.enhanced.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EnhancedZombieRenderer extends ZombieRenderer {
    public EnhancedZombieRenderer(EntityRendererProvider.Context p_174456_) {
        super(p_174456_);
    }

    public EnhancedZombieRenderer(EntityRendererProvider.Context p_174458_, ModelLayerLocation p_174459_, ModelLayerLocation p_174460_, ModelLayerLocation p_174461_) {
        super(p_174458_, p_174459_, p_174460_, p_174461_);
    }
}
