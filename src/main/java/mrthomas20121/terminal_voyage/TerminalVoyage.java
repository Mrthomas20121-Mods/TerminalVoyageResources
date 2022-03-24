package mrthomas20121.terminal_voyage;

import com.legacy.blue_skies.registries.SkiesBlocks;
import com.teammetallurgy.atum.init.AtumBlocks;
import mrthomas20121.terminal_voyage.init.ModBlocks;
import mrthomas20121.terminal_voyage.init.ModFluids;
import mrthomas20121.terminal_voyage.init.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TerminalVoyage.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerminalVoyage {

public static final String MOD_ID = "terminal_voyage";
	public static final Logger LOGGER = LogManager.getLogger();

	public static ConfiguredFeature<?,?> STRANGE_AQUAMARINE_FEATURE;
	public static ConfiguredFeature<?,?> CRYSTAL_AQUAMARINE_FEATURE;
	public static ConfiguredFeature<?,?> MIDNIGHT_AQUAMARINE_FEATURE;
	public static ConfiguredFeature<?,?> LUNAR_DIMENSIONAL_SHARD_FEATURE;
	public static ConfiguredFeature<?,?> TURQUOISE_DIMENSIONAL_SHARD_FEATURE;
	public static ConfiguredFeature<?,?> LIMESTONE_DIMENSIONAL_SHARD_FEATURE;

	public TerminalVoyage() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
		ModFluids.FLUIDS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
		bus.addListener(this::clientSetup);
		bus.addListener(this::setup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(ModBlocks.treated_stairs.getFirst().get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(ModBlocks.treated_slab.getFirst().get(), RenderType.cutoutMipped());
	}

	private void setup(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			STRANGE_AQUAMARINE_FEATURE = newConfiguredFeature("strange_aquamarine_shale", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(AtumBlocks.SAND), ModBlocks.STRANGE_AQUAMARINE_SHALE_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
			CRYSTAL_AQUAMARINE_FEATURE = newConfiguredFeature("crystal_aquamarine_shale", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(SkiesBlocks.crystal_sand), ModBlocks.CRYSTAL_AQUAMARINE_SHALE_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
			MIDNIGHT_AQUAMARINE_FEATURE = newConfiguredFeature("midnight_aquamarine_shale", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(SkiesBlocks.midnight_sand), ModBlocks.MIDNIGHT_AQUAMARINE_SHALE_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
			LUNAR_DIMENSIONAL_SHARD_FEATURE = newConfiguredFeature("lunar_dimensional_shard", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(SkiesBlocks.lunar_stone), ModBlocks.LUNAR_DIMENSIONAL_SHARD_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
			TURQUOISE_DIMENSIONAL_SHARD_FEATURE = newConfiguredFeature("turquoise_dimensional_shard", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(SkiesBlocks.turquoise_stone), ModBlocks.TURQUOISE_DIMENSIONAL_SHARD_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
			LIMESTONE_DIMENSIONAL_SHARD_FEATURE = newConfiguredFeature("limestone_dimensional_shard", Feature.ORE.configured(
					new OreFeatureConfig(new BlockMatchRuleTest(AtumBlocks.LIMESTONE), ModBlocks.LIMESTONE_DIMENSIONAL_SHARD_ORE.getFirst().get().defaultBlockState(), 15)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(20, 0, 120))))
					.squared().count(4);
		});
	}

	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(TerminalVoyage.MOD_ID, registryName), configuredFeature);
		return configuredFeature;
	}
}
