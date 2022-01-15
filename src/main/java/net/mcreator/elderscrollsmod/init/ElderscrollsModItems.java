
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elderscrollsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.elderscrollsmod.item.TamrielItem;
import net.mcreator.elderscrollsmod.item.SummersetRainbowPieItem;
import net.mcreator.elderscrollsmod.item.OldAldmeriOrphanGruelItem;
import net.mcreator.elderscrollsmod.item.HoneyPuddingItem;
import net.mcreator.elderscrollsmod.item.CandiedNectarBreadItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElderscrollsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TAMRIEL = register(new TamrielItem());
	public static final Item NIRNROOT = register(ElderscrollsModBlocks.NIRNROOT, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ADORING_FAN_BLOCK = register(ElderscrollsModBlocks.ADORING_FAN_BLOCK, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_WOOD = register(ElderscrollsModBlocks.ALTMERI_WOOD_WOOD, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_LOG = register(ElderscrollsModBlocks.ALTMERI_WOOD_LOG, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_PLANKS = register(ElderscrollsModBlocks.ALTMERI_WOOD_PLANKS, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_LEAVES = register(ElderscrollsModBlocks.ALTMERI_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ALTMERI_WOOD_STAIRS = register(ElderscrollsModBlocks.ALTMERI_WOOD_STAIRS, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_SLAB = register(ElderscrollsModBlocks.ALTMERI_WOOD_SLAB, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_FENCE = register(ElderscrollsModBlocks.ALTMERI_WOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ALTMERI_WOOD_FENCE_GATE = register(ElderscrollsModBlocks.ALTMERI_WOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item ALTMERI_WOOD_PRESSURE_PLATE = register(ElderscrollsModBlocks.ALTMERI_WOOD_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item ALTMERI_WOOD_BUTTON = register(ElderscrollsModBlocks.ALTMERI_WOOD_BUTTON, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item BRETON_COMMONER = register(new SpawnEggItem(ElderscrollsModEntities.BRETON_COMMONER, -10053121, -16750900,
			new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD)).setRegistryName("breton_commoner_spawn_egg"));
	public static final Item BRETON_MERCHANT = register(new SpawnEggItem(ElderscrollsModEntities.BRETON_MERCHANT, -10053121, -6697729,
			new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD)).setRegistryName("breton_merchant_spawn_egg"));
	public static final Item CANDIED_NECTAR_BREAD = register(new CandiedNectarBreadItem());
	public static final Item SUMMERSET_RAINBOW_PIE = register(new SummersetRainbowPieItem());
	public static final Item OLD_ALDMERI_ORPHAN_GRUEL = register(new OldAldmeriOrphanGruelItem());
	public static final Item HONEY_PUDDING = register(new HoneyPuddingItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
