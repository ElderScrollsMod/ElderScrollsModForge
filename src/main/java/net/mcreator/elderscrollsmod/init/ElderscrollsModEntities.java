
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elderscrollsmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.elderscrollsmod.entity.BretonMerchantEntity;
import net.mcreator.elderscrollsmod.entity.BretonCommonerEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElderscrollsModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<BretonCommonerEntity> BRETON_COMMONER = register("breton_commoner",
			EntityType.Builder.<BretonCommonerEntity>of(BretonCommonerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BretonCommonerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<BretonMerchantEntity> BRETON_MERCHANT = register("breton_merchant",
			EntityType.Builder.<BretonMerchantEntity>of(BretonMerchantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BretonMerchantEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BretonCommonerEntity.init();
			BretonMerchantEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BRETON_COMMONER, BretonCommonerEntity.createAttributes().build());
		event.put(BRETON_MERCHANT, BretonMerchantEntity.createAttributes().build());
	}
}
