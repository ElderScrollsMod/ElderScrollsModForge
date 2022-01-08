
package net.mcreator.elderscrollsmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.elderscrollsmod.itemgroup.ElderScrollsModItemGroup;
import net.mcreator.elderscrollsmod.ElderScrollsModModElements;

import java.util.List;
import java.util.Collections;

@ElderScrollsModModElements.ModElement.Tag
public class AdoringFanBlockBlock extends ElderScrollsModModElements.ModElement {
	@ObjectHolder("elder_scrolls_mod:adoring_fan_block")
	public static final Block block = null;

	public AdoringFanBlockBlock(ElderScrollsModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ElderScrollsModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("elder_scrolls_mod:adoring_fan_bye")),
							() -> new SoundEvent(new ResourceLocation("block.slime_block.step")),
							() -> new SoundEvent(new ResourceLocation("elder_scrolls_mod:adoring_fan_greeting")),
							() -> new SoundEvent(new ResourceLocation("block.slime_block.hit")),
							() -> new SoundEvent(new ResourceLocation("block.slime_block.hit"))))
					.hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("adoring_fan_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
