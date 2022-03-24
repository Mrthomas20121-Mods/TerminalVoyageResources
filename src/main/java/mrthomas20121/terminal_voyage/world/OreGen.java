package mrthomas20121.terminal_voyage.world;

import mrthomas20121.terminal_voyage.TerminalVoyage;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TerminalVoyage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGen {

    @SubscribeEvent
    public static void generateOre(final BiomeLoadingEvent event) {
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.CRYSTAL_AQUAMARINE_FEATURE);
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.STRANGE_AQUAMARINE_FEATURE);
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.MIDNIGHT_AQUAMARINE_FEATURE);
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.LUNAR_DIMENSIONAL_SHARD_FEATURE);
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.TURQUOISE_DIMENSIONAL_SHARD_FEATURE);
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TerminalVoyage.LIMESTONE_DIMENSIONAL_SHARD_FEATURE);
    }
}
