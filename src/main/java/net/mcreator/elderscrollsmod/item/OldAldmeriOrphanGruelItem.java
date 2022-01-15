
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

public class OldAldmeriOrphanGruelItem extends Item {
	public OldAldmeriOrphanGruelItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(6).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.8f)

						.build()));
		setRegistryName("old_aldmeri_orphan_gruel");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Porridge that is traditionally served during the New Life Festival. Surprisingly tasty"));
		list.add(new TextComponent("it's made with barley"));
		list.add(new TextComponent("roses"));
		list.add(new TextComponent("and pumpkins."));
	}
}
