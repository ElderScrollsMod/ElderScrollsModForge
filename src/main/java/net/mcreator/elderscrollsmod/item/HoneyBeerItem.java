
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elderscrollsmod.init.ElderscrollsModTabs;

public class HoneyBeerItem extends Item {
	public HoneyBeerItem() {
		super(new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(2f)

						.build()));
		setRegistryName("honey_beer");
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}
}
