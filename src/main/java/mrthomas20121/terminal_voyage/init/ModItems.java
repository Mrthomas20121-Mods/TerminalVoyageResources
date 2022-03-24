package mrthomas20121.terminal_voyage.init;

import mrthomas20121.terminal_voyage.TerminalVoyage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;

public class ModItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, TerminalVoyage.MOD_ID);

    public static ItemGroup group = new ItemGroup(TerminalVoyage.MOD_ID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(STEEL_INGOT.get());
        }
    };
    
    public static RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ModItems::register);
    public static RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", ModItems::register);
    public static RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", ModItems::register);
    public static RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", ModItems::register);
    public static RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ModItems::register);

    public static RegistryObject<Item> COPPER_SILICON_INGOT = ITEMS.register("copper_silicon_ingot", ModItems::register);
    public static RegistryObject<Item> COPPER_SILICON_DUST = ITEMS.register("copper_silicon_dust", ModItems::register);
    public static RegistryObject<Item> COPPER_SILICON_GEAR = ITEMS.register("copper_silicon_gear", ModItems::register);
    public static RegistryObject<Item> COPPER_SILICON_PLATE = ITEMS.register("copper_silicon_plate", ModItems::register);
    public static RegistryObject<Item> COPPER_SILICON_NUGGET = ITEMS.register("copper_silicon_nugget", ModItems::register);

    public static RegistryObject<Item> REDSTONE_ALLOY_INGOT = ITEMS.register("redstone_alloy_ingot", ModItems::register);
    public static RegistryObject<Item> REDSTONE_ALLOY_DUST = ITEMS.register("redstone_alloy_dust", ModItems::register);
    public static RegistryObject<Item> REDSTONE_ALLOY_GEAR = ITEMS.register("redstone_alloy_gear", ModItems::register);
    public static RegistryObject<Item> REDSTONE_ALLOY_PLATE = ITEMS.register("redstone_alloy_plate", ModItems::register);
    public static RegistryObject<Item> REDSTONE_ALLOY_NUGGET = ITEMS.register("redstone_alloy_nugget", ModItems::register);

    public static RegistryObject<Item> PRINTED_CAST = ITEMS.register("printed_cast", ModItems::register);
    public static RegistryObject<Item> ALUMINUM_PRINTED_CAST = ITEMS.register("aluminum_printed_cast", ModItems::register);

    public static Item register() {
        return new Item(new Item.Properties().tab(group));
    }
}
