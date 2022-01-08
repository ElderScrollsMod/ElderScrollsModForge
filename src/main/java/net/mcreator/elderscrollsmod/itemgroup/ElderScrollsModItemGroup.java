
package net.mcreator.elderscrollsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elderscrollsmod.block.AdoringFanBlockBlock;
import net.mcreator.elderscrollsmod.ElderScrollsModModElements;

@ElderScrollsModModElements.ModElement.Tag
public class ElderScrollsModItemGroup extends ElderScrollsModModElements.ModElement {
	public ElderScrollsModItemGroup(ElderScrollsModModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelder_scrolls_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AdoringFanBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
