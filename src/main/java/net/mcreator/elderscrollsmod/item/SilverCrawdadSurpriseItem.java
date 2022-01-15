
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elderscrollsmod.init.ElderscrollsModTabs;

public class SilverCrawdadSurpriseItem extends Item {
	public SilverCrawdadSurpriseItem() {
		super(new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(1.2f)

						.build()));
		setRegistryName("silver_crawdad_surprise");
	}
}
