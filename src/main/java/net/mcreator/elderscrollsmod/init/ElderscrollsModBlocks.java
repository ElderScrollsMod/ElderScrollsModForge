
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elderscrollsmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.elderscrollsmod.block.TamrielPortalBlock;
import net.mcreator.elderscrollsmod.block.NirnrootBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodWoodBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodStairsBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodSlabBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodPressurePlateBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodPlanksBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodLogBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodLeavesBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodFenceGateBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodFenceBlock;
import net.mcreator.elderscrollsmod.block.Altmeri_WoodButtonBlock;
import net.mcreator.elderscrollsmod.block.AdoringFanBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElderscrollsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TAMRIEL_PORTAL = register(new TamrielPortalBlock());
	public static final Block NIRNROOT = register(new NirnrootBlock());
	public static final Block ADORING_FAN_BLOCK = register(new AdoringFanBlockBlock());
	public static final Block ALTMERI_WOOD_WOOD = register(new Altmeri_WoodWoodBlock());
	public static final Block ALTMERI_WOOD_LOG = register(new Altmeri_WoodLogBlock());
	public static final Block ALTMERI_WOOD_PLANKS = register(new Altmeri_WoodPlanksBlock());
	public static final Block ALTMERI_WOOD_LEAVES = register(new Altmeri_WoodLeavesBlock());
	public static final Block ALTMERI_WOOD_STAIRS = register(new Altmeri_WoodStairsBlock());
	public static final Block ALTMERI_WOOD_SLAB = register(new Altmeri_WoodSlabBlock());
	public static final Block ALTMERI_WOOD_FENCE = register(new Altmeri_WoodFenceBlock());
	public static final Block ALTMERI_WOOD_FENCE_GATE = register(new Altmeri_WoodFenceGateBlock());
	public static final Block ALTMERI_WOOD_PRESSURE_PLATE = register(new Altmeri_WoodPressurePlateBlock());
	public static final Block ALTMERI_WOOD_BUTTON = register(new Altmeri_WoodButtonBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NirnrootBlock.registerRenderLayer();
		}
	}
}
