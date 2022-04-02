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

    public static FluidObject<ForgeFlowingFluid> REDSTONE_ALLOY = FLUIDS.register("redstone_alloy", hotBuilder("redstone_alloy").temperature(2000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> SILICON_BRONZE = FLUIDS.register("copper_silicon", hotBuilder("copper_silicon").temperature(2200), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> CERTUS_QUARTZ = FLUIDS.register("certus_quartz", hotBuilder("certus_quartz").temperature(1400), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> CHARGED_CERTUS_QUARTZ = FLUIDS.register("charged_certus_quartz", hotBuilder("charged_certus_quartz").temperature(2500), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> fluix = FLUIDS.register("fluix", hotBuilder("fluix").temperature(2000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> sky_stone = FLUIDS.register("sky_stone", hotBuilder("sky_stone").temperature(1200), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> SILICON = FLUIDS.register("silicon", hotBuilder("silicon").temperature(2000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> LIMESTONE = FLUIDS.register("limestone", hotBuilder("limestone").temperature(1000), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> NEBU = FLUIDS.register("nebu", hotBuilder("nebu").temperature(2500), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> HALLOWED_GOLD = FLUIDS.register("hallowed_gold", hotBuilder("hallowed_gold").temperature(2900), Material.LAVA, 7);
    public static FluidObject<ForgeFlowingFluid> DEADWOOD_SAP = FLUIDS.register("deadwood_sap", hotBuilder("deadwood_sap").temperature(500), Material.WATER, 7);

    private static FluidAttributes.Builder hotBuilder(String name) {
        return FluidAttributes.builder(new ResourceLocation(String.format("terminal_voyage:block/fluids/%s_still", name)), new ResourceLocation(String.format("terminal_voyage:block/fluids/%s_flow", name))).density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
    }
}
