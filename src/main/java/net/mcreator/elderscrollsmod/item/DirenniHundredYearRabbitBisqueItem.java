
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elderscrollsmod.init.ElderscrollsModTabs;

public class DirenniHundredYearRabbitBisqueItem extends Item {
	public DirenniHundredYearRabbitBisqueItem() {
		super(new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(1.6f)

						.build()));
		setRegistryName("direnni_hundred_year_rabbit_bisque");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 48;
	}
}
