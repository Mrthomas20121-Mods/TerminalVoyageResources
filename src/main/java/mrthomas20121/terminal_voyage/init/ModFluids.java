package mrthomas20121.terminal_voyage.init;

import mrthomas20121.terminal_voyage.TerminalVoyage;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;

public class ModFluids {

    public static FluidDeferredRegister FLUIDS = new FluidDeferredRegister(TerminalVoyage.MOD_ID);

    public static FluidObject<ForgeFlowingFluid> REDSTONE_ALLOY = FLUIDS.register("redstone_alloy", hotBuilder("redstone_alloy").temperature(1200), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> SILICON_BRONZE = FLUIDS.register("copper_silicon", hotBuilder("copper_silicon").temperature(1500), Material.LAVA, 7);
    // we do not need to register steel as tinkers is already registering it for mod compat.
    //public static FluidObject<ForgeFlowingFluid> STEEL = FLUIDS.register("steel", hotBuilder("steel").temperature(1800), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> CERTUS_QUARTZ = FLUIDS.register("certus_quartz", hotBuilder("certus_quartz").temperature(1400), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> CHARGED_CERTUS_QUARTZ = FLUIDS.register("charged_certus_quartz", hotBuilder("charged_certus_quartz").temperature(2500), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> fluix = FLUIDS.register("fluix", hotBuilder("fluix").temperature(2000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> sky_stone = FLUIDS.register("sky_stone", hotBuilder("sky_stone").temperature(1200), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> SILICON = FLUIDS.register("silicon", hotBuilder("silicon").temperature(2000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> LIMESTONE = FLUIDS.register("limestone", hotBuilder("limestone").temperature(1000), Material.LAVA, 7);

    private static FluidAttributes.Builder hotBuilder(String name) {
        return FluidAttributes.builder(new ResourceLocation(String.format("terminal_voyage:block/fluids/%s_still", name)), new ResourceLocation(String.format("terminal_voyage:block/fluids/%s_flow", name))).density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
    }
}
