
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elderscrollsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.elderscrollsmod.item.XanmeerBrandyItem;
import net.mcreator.elderscrollsmod.item.WiltedGreensItem;
import net.mcreator.elderscrollsmod.item.WamasuLoinItem;
import net.mcreator.elderscrollsmod.item.TonicTeaItem;
import net.mcreator.elderscrollsmod.item.TimberMammothItem;
import net.mcreator.elderscrollsmod.item.TheilulItem;
import net.mcreator.elderscrollsmod.item.TamrielItem;
import net.mcreator.elderscrollsmod.item.TabooSaladItem;
import net.mcreator.elderscrollsmod.item.SylphMeadItem;
import net.mcreator.elderscrollsmod.item.SweetbileItem;
import net.mcreator.elderscrollsmod.item.SwampShrimpBoilItem;
import net.mcreator.elderscrollsmod.item.SwampEelItem;
import net.mcreator.elderscrollsmod.item.SunsDuskAleItem;
import net.mcreator.elderscrollsmod.item.SummersetRainbowPieItem;
import net.mcreator.elderscrollsmod.item.SummerSausageItem;
import net.mcreator.elderscrollsmod.item.StormberryItem;
import net.mcreator.elderscrollsmod.item.SnakeSweatItem;
import net.mcreator.elderscrollsmod.item.SnailGinItem;
import net.mcreator.elderscrollsmod.item.SlaughterfishLiverItem;
import net.mcreator.elderscrollsmod.item.SilverCrawdadSurpriseItem;
import net.mcreator.elderscrollsmod.item.ShimmereneTonicItem;
import net.mcreator.elderscrollsmod.item.SavoryCornbreadItem;
import net.mcreator.elderscrollsmod.item.SaddleCuredRabbitItem;
import net.mcreator.elderscrollsmod.item.RussafeldRedItem;
import net.mcreator.elderscrollsmod.item.RootLiqueurItem;
import net.mcreator.elderscrollsmod.item.RabbitMeatballPieItem;
import net.mcreator.elderscrollsmod.item.PumpkinStewItem;
import net.mcreator.elderscrollsmod.item.PhlegmwineItem;
import net.mcreator.elderscrollsmod.item.PeacockConfitItem;
import net.mcreator.elderscrollsmod.item.OldEpiphanyItem;
import net.mcreator.elderscrollsmod.item.OldAldmeriOrphanGruelItem;
import net.mcreator.elderscrollsmod.item.NewLifeRoastPigItem;
import net.mcreator.elderscrollsmod.item.NectarineItem;
import net.mcreator.elderscrollsmod.item.NagahsseeItem;
import net.mcreator.elderscrollsmod.item.MudNectarItem;
import net.mcreator.elderscrollsmod.item.MudHopperStewItem;
import net.mcreator.elderscrollsmod.item.MollusksItem;
import net.mcreator.elderscrollsmod.item.MetheglinItem;
import net.mcreator.elderscrollsmod.item.MarshHenItem;
import net.mcreator.elderscrollsmod.item.MarshCentipedeItem;
import net.mcreator.elderscrollsmod.item.LizardfruitItem;
import net.mcreator.elderscrollsmod.item.KollopiItem;
import net.mcreator.elderscrollsmod.item.KipperedSilvertroutItem;
import net.mcreator.elderscrollsmod.item.JuggedVenisonItem;
import net.mcreator.elderscrollsmod.item.JaggaTartsItem;
import net.mcreator.elderscrollsmod.item.JaggaItem;
import net.mcreator.elderscrollsmod.item.JaggaDrenchedMudBallItem;
import net.mcreator.elderscrollsmod.item.IsquelianBrandyItem;
import net.mcreator.elderscrollsmod.item.IndrikHeartItem;
import net.mcreator.elderscrollsmod.item.HoneyPuddingItem;
import net.mcreator.elderscrollsmod.item.HoneyBeerItem;
import net.mcreator.elderscrollsmod.item.GrubsItem;
import net.mcreator.elderscrollsmod.item.GoldenPearAleItem;
import net.mcreator.elderscrollsmod.item.GarlicHagfishItem;
import net.mcreator.elderscrollsmod.item.FungusOmeletItem;
import net.mcreator.elderscrollsmod.item.FishEyeRyeItem;
import net.mcreator.elderscrollsmod.item.FireAppleItem;
import net.mcreator.elderscrollsmod.item.FermentedHoneyLiquorItem;
import net.mcreator.elderscrollsmod.item.DragonfruitItem;
import net.mcreator.elderscrollsmod.item.DirenniHundredYearRabbitBisqueItem;
import net.mcreator.elderscrollsmod.item.CrystalTowerWhiskeyItem;
import net.mcreator.elderscrollsmod.item.CrayfishSaladItem;
import net.mcreator.elderscrollsmod.item.CrackedPeachPitsItem;
import net.mcreator.elderscrollsmod.item.CloudrestGoldenAleItem;
import net.mcreator.elderscrollsmod.item.ClarifiedCoffeeItem;
import net.mcreator.elderscrollsmod.item.CenturySoupItem;
import net.mcreator.elderscrollsmod.item.CandiedNectarBreadItem;
import net.mcreator.elderscrollsmod.item.BrinedLeechesItem;
import net.mcreator.elderscrollsmod.item.BosmerBitesItem;
import net.mcreator.elderscrollsmod.item.BloodfrothItem;
import net.mcreator.elderscrollsmod.item.BlackCockerelItem;
import net.mcreator.elderscrollsmod.item.BileBeerItem;
import net.mcreator.elderscrollsmod.item.BeetlePuffsItem;
import net.mcreator.elderscrollsmod.item.BakedBananasItem;
import net.mcreator.elderscrollsmod.item.AuridonMudcrabsItem;
import net.mcreator.elderscrollsmod.item.ArenthianBrandyItem;
import net.mcreator.elderscrollsmod.item.AojeeSakkaItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElderscrollsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TAMRIEL = register(new TamrielItem());
	public static final Item NIRNROOT = register(ElderscrollsModBlocks.NIRNROOT, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ADORING_FAN_BLOCK = register(ElderscrollsModBlocks.ADORING_FAN_BLOCK, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_WOOD = register(ElderscrollsModBlocks.ALTMERI_WOOD_WOOD, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_LOG = register(ElderscrollsModBlocks.ALTMERI_WOOD_LOG, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_PLANKS = register(ElderscrollsModBlocks.ALTMERI_WOOD_PLANKS, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_LEAVES = register(ElderscrollsModBlocks.ALTMERI_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ALTMERI_WOOD_STAIRS = register(ElderscrollsModBlocks.ALTMERI_WOOD_STAIRS, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_SLAB = register(ElderscrollsModBlocks.ALTMERI_WOOD_SLAB, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item ALTMERI_WOOD_FENCE = register(ElderscrollsModBlocks.ALTMERI_WOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ALTMERI_WOOD_FENCE_GATE = register(ElderscrollsModBlocks.ALTMERI_WOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item ALTMERI_WOOD_PRESSURE_PLATE = register(ElderscrollsModBlocks.ALTMERI_WOOD_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item ALTMERI_WOOD_BUTTON = register(ElderscrollsModBlocks.ALTMERI_WOOD_BUTTON, ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD);
	public static final Item BRETON_COMMONER = register(new SpawnEggItem(ElderscrollsModEntities.BRETON_COMMONER, -10053121, -16750900,
			new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD)).setRegistryName("breton_commoner_spawn_egg"));
	public static final Item BRETON_MERCHANT = register(new SpawnEggItem(ElderscrollsModEntities.BRETON_MERCHANT, -10053121, -6697729,
			new Item.Properties().tab(ElderscrollsModTabs.TAB_ELDER_SCROLLS_MOD)).setRegistryName("breton_merchant_spawn_egg"));
	public static final Item CANDIED_NECTAR_BREAD = register(new CandiedNectarBreadItem());
	public static final Item SUMMERSET_RAINBOW_PIE = register(new SummersetRainbowPieItem());
	public static final Item OLD_ALDMERI_ORPHAN_GRUEL = register(new OldAldmeriOrphanGruelItem());
	public static final Item HONEY_PUDDING = register(new HoneyPuddingItem());
	public static final Item CLARIFIED_COFFEE = register(new ClarifiedCoffeeItem());
	public static final Item CLOUDREST_GOLDEN_ALE = register(new CloudrestGoldenAleItem());
	public static final Item CRYSTAL_TOWER_WHISKEY = register(new CrystalTowerWhiskeyItem());
	public static final Item GOLDEN_PEAR_ALE = register(new GoldenPearAleItem());
	public static final Item HONEY_BEER = register(new HoneyBeerItem());
	public static final Item ISQUELIAN_BRANDY = register(new IsquelianBrandyItem());
	public static final Item OLD_EPIPHANY = register(new OldEpiphanyItem());
	public static final Item METHEGLIN = register(new MetheglinItem());
	public static final Item RUSSAFELD_RED = register(new RussafeldRedItem());
	public static final Item SHIMMERENE_TONIC = register(new ShimmereneTonicItem());
	public static final Item SYLPH_MEAD = register(new SylphMeadItem());
	public static final Item TONIC_TEA = register(new TonicTeaItem());
	public static final Item CRACKED_PEACH_PITS = register(new CrackedPeachPitsItem());
	public static final Item DIRENNI_HUNDRED_YEAR_RABBIT_BISQUE = register(new DirenniHundredYearRabbitBisqueItem());
	public static final Item NEW_LIFE_ROAST_PIG = register(new NewLifeRoastPigItem());
	public static final Item SUMMER_SAUSAGE = register(new SummerSausageItem());
	public static final Item WILTED_GREENS = register(new WiltedGreensItem());
	public static final Item PEACOCK_CONFIT = register(new PeacockConfitItem());
	public static final Item CENTURY_SOUP = register(new CenturySoupItem());
	public static final Item INDRIK_HEART = register(new IndrikHeartItem());
	public static final Item RABBIT_MEATBALL_PIE = register(new RabbitMeatballPieItem());
	public static final Item AURIDON_MUDCRABS = register(new AuridonMudcrabsItem());
	public static final Item MOLLUSKS = register(new MollusksItem());
	public static final Item SILVER_CRAWDAD_SURPRISE = register(new SilverCrawdadSurpriseItem());
	public static final Item KIPPERED_SILVERTROUT = register(new KipperedSilvertroutItem());
	public static final Item BEETLE_PUFFS = register(new BeetlePuffsItem());
	public static final Item FUNGUS_OMELET = register(new FungusOmeletItem());
	public static final Item SAVORY_CORNBREAD = register(new SavoryCornbreadItem());
	public static final Item BAKED_BANANAS = register(new BakedBananasItem());
	public static final Item DRAGONFRUIT = register(new DragonfruitItem());
	public static final Item NECTARINE = register(new NectarineItem());
	public static final Item LIZARDFRUIT = register(new LizardfruitItem());
	public static final Item FIRE_APPLE = register(new FireAppleItem());
	public static final Item STORMBERRY = register(new StormberryItem());
	public static final Item AOJEE_SAKKA = register(new AojeeSakkaItem());
	public static final Item BLACK_COCKEREL = register(new BlackCockerelItem());
	public static final Item BRINED_LEECHES = register(new BrinedLeechesItem());
	public static final Item CRAYFISH_SALAD = register(new CrayfishSaladItem());
	public static final Item GARLIC_HAGFISH = register(new GarlicHagfishItem());
	public static final Item GRUBS = register(new GrubsItem());
	public static final Item MARSH_CENTIPEDE = register(new MarshCentipedeItem());
	public static final Item MARSH_HEN = register(new MarshHenItem());
	public static final Item MUD_HOPPER_STEW = register(new MudHopperStewItem());
	public static final Item NAGAHSSEE = register(new NagahsseeItem());
	public static final Item SADDLE_CURED_RABBIT = register(new SaddleCuredRabbitItem());
	public static final Item SLAUGHTERFISH_LIVER = register(new SlaughterfishLiverItem());
	public static final Item SWAMP_EEL = register(new SwampEelItem());
	public static final Item SWAMP_SHRIMP_BOIL = register(new SwampShrimpBoilItem());
	public static final Item WAMASU_LOIN = register(new WamasuLoinItem());
	public static final Item BILE_BEER = register(new BileBeerItem());
	public static final Item FISH_EYE_RYE = register(new FishEyeRyeItem());
	public static final Item MUD_NECTAR = register(new MudNectarItem());
	public static final Item PHLEGMWINE = register(new PhlegmwineItem());
	public static final Item SNAIL_GIN = register(new SnailGinItem());
	public static final Item SWEETBILE = register(new SweetbileItem());
	public static final Item SNAKE_SWEAT = register(new SnakeSweatItem());
	public static final Item THEILUL = register(new TheilulItem());
	public static final Item XANMEER_BRANDY = register(new XanmeerBrandyItem());
	public static final Item PUMPKIN_STEW = register(new PumpkinStewItem());
	public static final Item BOSMER_BITES = register(new BosmerBitesItem());
	public static final Item JAGGA_TARTS = register(new JaggaTartsItem());
	public static final Item KOLLOPI = register(new KollopiItem());
	public static final Item JUGGED_VENISON = register(new JuggedVenisonItem());
	public static final Item TIMBER_MAMMOTH = register(new TimberMammothItem());
	public static final Item ARENTHIAN_BRANDY = register(new ArenthianBrandyItem());
	public static final Item JAGGA = register(new JaggaItem());
	public static final Item SUNS_DUSK_ALE = register(new SunsDuskAleItem());
	public static final Item ROOT_LIQUEUR = register(new RootLiqueurItem());
	public static final Item BLOODFROTH = register(new BloodfrothItem());
	public static final Item FERMENTED_HONEY_LIQUOR = register(new FermentedHoneyLiquorItem());
	public static final Item JAGGA_DRENCHED_MUD_BALL = register(new JaggaDrenchedMudBallItem());
	public static final Item TABOO_SALAD = register(new TabooSaladItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
