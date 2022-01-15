
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SummersetRainbowPieItem extends Item {
	public SummersetRainbowPieItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

						.build()));
		setRegistryName("summerset_rainbow_pie");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 35;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A pie with filling made from game"));
		list.add(new TextComponent("bananas"));
		list.add(new TextComponent("beets"));
		list.add(new TextComponent("and frost mirriam."));
	}
}
