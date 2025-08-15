package org.blockrooms;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.blockrooms.entity.enhanced.client.EnhancedZombieRenderer;

import static org.blockrooms.Blockrooms.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void onClientEvent(FMLClientSetupEvent event){
        event.enqueueWork(()-> EntityRenderers.register(BRRegistries.ENHANCED_ZOMBIE.get(), EnhancedZombieRenderer::new));
    }
}
