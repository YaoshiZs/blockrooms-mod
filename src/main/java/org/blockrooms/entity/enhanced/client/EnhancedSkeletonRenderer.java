package org.blockrooms.entity.enhanced.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EnhancedSkeletonRenderer extends SkeletonRenderer {
    public EnhancedSkeletonRenderer(EntityRendererProvider.Context p_174380_) {
        super(p_174380_);
    }

    public EnhancedSkeletonRenderer(EntityRendererProvider.Context p_174382_, ModelLayerLocation p_174383_, ModelLayerLocation p_174384_, ModelLayerLocation p_174385_) {
        super(p_174382_, p_174383_, p_174384_, p_174385_);
    }
}
