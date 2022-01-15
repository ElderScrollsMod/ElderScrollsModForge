
package net.mcreator.elderscrollsmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elderscrollsmod.init.ElderscrollsModTabs;

import java.util.List;

public class CrackedPeachPitsItem extends Item {
	public CrackedPeachPitsItem() {
		super(new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(1.6f)

						.build()));
		setRegistryName("cracked_peach_pits");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 48;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A78Often served to guests at orchards in Alinor"));
	}
}
