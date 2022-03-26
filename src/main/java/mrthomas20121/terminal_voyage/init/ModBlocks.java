package mrthomas20121.terminal_voyage.init;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.terminal_voyage.TerminalVoyage;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(Block.class, TerminalVoyage.MOD_ID);

    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> treated_plank = register("treated_planks", new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> treated_stairs = register("treated_stairs", new StairsBlock(() -> treated_plank.getFirst().get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> treated_slab = register("treated_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));

    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> STEEL_BLOCK = registerMetalBlock("steel_block");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> SILICON_BRONZE_BLOCK = registerMetalBlock("copper_silicon_block");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> REDSTONE_ALLOY_BLOCK = registerMetalBlock("redstone_alloy_block");

    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> STRANGE_AQUAMARINE_SHALE_ORE = registerSandBlock("strange_aquamarine_shale_ore");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> CRYSTAL_AQUAMARINE_SHALE_ORE = registerSandBlock("crystal_aquamarine_shale_ore");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> MIDNIGHT_AQUAMARINE_SHALE_ORE = registerSandBlock("midnight_aquamarine_shale_ore");

    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> LUNAR_DIMENSIONAL_SHARD_ORE = registerOreBlock("lunar_dimensional_shard_ore");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> TURQUOISE_DIMENSIONAL_SHARD_ORE = registerOreBlock("turquoise_dimensional_shard_ore");
    public static final Pair<RegistryObject<Block>, RegistryObject<Item>> LIMESTONE_DIMENSIONAL_SHARD_ORE = registerOreBlock("limestone_dimensional_shard_ore");

    private static Pair<RegistryObject<Block>, RegistryObject<Item>> register(String name, Block block) {
        RegistryObject<Block> blockObj = BLOCKS.register(name, () -> block);
        RegistryObject<Item> itemObj = ModItems.ITEMS.register(name, () -> register(blockObj.get()));
        return new Pair<>(blockObj, itemObj);
    }

    private static Pair<RegistryObject<Block>, RegistryObject<Item>> register(String name, Material material) {
        return register(name, new Block(AbstractBlock.Properties.of(material)));
    }

    private static Pair<RegistryObject<Block>, RegistryObject<Item>> registerSandBlock(String name) {
        return register(name, new Block(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).requiresCorrectToolForDrops().harvestTool(ToolType.SHOVEL).strength(2.0F, 2.0F)));
    }

    private static Pair<RegistryObject<Block>, RegistryObject<Item>> registerOreBlock(String name) {
        return register(name, new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(3.0F, 3.0F)));
    }

    private static Pair<RegistryObject<Block>, RegistryObject<Item>> registerMetalBlock(String name) {
        return register(name, new Block(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(3.0F, 3.0F)));
    }

    private static BlockItem register(Block block) {
        return new BlockItem(block, new Item.Properties().tab(ModItems.group));
    }
}
