
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elderscrollsmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElderscrollsModTabs {
	public static CreativeModeTab TAB_ELDER_SCROLLS_MOD;

	public static void load() {
		TAB_ELDER_SCROLLS_MOD = new CreativeModeTab("tabelder_scrolls_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElderscrollsModBlocks.ADORING_FAN_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
