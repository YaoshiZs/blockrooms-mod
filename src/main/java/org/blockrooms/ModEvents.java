package org.blockrooms;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.blockrooms.entity.enhanced.EnhancedSkeleton;
import org.blockrooms.entity.enhanced.EnhancedZombie;

import static org.blockrooms.Blockrooms.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID)
public class ModEvents {
    @SubscribeEvent
    public static void setupAttributes(EntityAttributeCreationEvent event) {
        event.put(BRRegistries.ENHANCED_ZOMBIE.get(), EnhancedZombie.createAttributes().build());
        event.put(BRRegistries.ENHANCED_SKELETON.get(), EnhancedSkeleton.createAttributes().build());
    }
}
