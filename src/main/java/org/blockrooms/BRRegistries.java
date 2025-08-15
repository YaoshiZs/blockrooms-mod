package org.blockrooms;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.blockrooms.entity.enhanced.EnhancedSkeleton;
import org.blockrooms.entity.enhanced.EnhancedZombie;
import org.blockrooms.items.AlmondMilkBucketItem;
import org.blockrooms.items.HeldWitherItem;

import static org.blockrooms.Blockrooms.MODID;

public class BRRegistries {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, MODID);
    public static final RegistryObject<EntityType<EnhancedZombie>> ENHANCED_ZOMBIE = ENTITY_TYPES.register("enhanced_zombie", () -> EntityType.Builder.of(EnhancedZombie::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build("enhanced_zombie"));
    public static final RegistryObject<EntityType<EnhancedSkeleton>> ENHANCED_SKELETON = ENTITY_TYPES.register("enhanced_skeleton", () -> EntityType.Builder.of(EnhancedSkeleton::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8).build("enhanced_skeleton"));
    public static final RegistryObject<Item> ALMOND_MILK = ITEMS.register("almond_milk_bucket", AlmondMilkBucketItem::new);
    public static final RegistryObject<Item> HELD_WITHER = ITEMS.register("held_wither", HeldWitherItem::new);
    public static final RegistryObject<SpawnEggItem> ENHANCED_ZOMBIE_SPAWN_EGG = ITEMS.register("enhanced_zombie_spawn_egg", () -> new ForgeSpawnEggItem(ENHANCED_ZOMBIE, 44975, 7969893, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> ENHANCED_SKELETON_SPAWN_EGG = ITEMS.register("enhanced_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(ENHANCED_SKELETON, 12698049, 4802889, new Item.Properties()));
    public static final RegistryObject<CreativeModeTab> ITEM_TAB = CREATIVE_MODE_TABS.register("item_tab", () -> CreativeModeTab.builder().icon(() -> ALMOND_MILK.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(
                ALMOND_MILK.get()
        );
        output.accept(HELD_WITHER.get());
        output.accept(ENHANCED_ZOMBIE_SPAWN_EGG.get());
        output.accept(ENHANCED_SKELETON_SPAWN_EGG.get());
    }).build());


    public static void register(IEventBus modEventBus){
        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        ENTITY_TYPES.register(modEventBus);
    }
}