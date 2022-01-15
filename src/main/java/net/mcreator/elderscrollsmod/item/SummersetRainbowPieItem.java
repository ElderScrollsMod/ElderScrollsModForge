
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elderscrollsmod.init.ElderscrollsModTabs;

public class SummersetRainbowPieItem extends Item {
	public SummersetRainbowPieItem() {
		super(new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_FOOD).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

						.build()));
		setRegistryName("summerset_rainbow_pie");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 35;
	}
}
