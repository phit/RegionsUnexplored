package net.regions_unexplored;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.neoforged.fml.config.ModConfig;
import net.regions_unexplored.block.compat.BlockToolCompat;
import net.regions_unexplored.block.compat.CompostableBlocks;
import net.regions_unexplored.block.compat.FlammableBlocks;
import net.regions_unexplored.block.compat.FurnaceBurnTimesFabric;
import net.regions_unexplored.config.RuCommonConfig;
import net.regions_unexplored.config.RuPrimaryRegionConfig;
import net.regions_unexplored.config.RuSecondaryRegionConfig;
import net.regions_unexplored.mixin.invoke.FoliagePlacerTypeInvoker;
import net.regions_unexplored.mixin.invoke.TreeDecoratorTypeInvoker;
import net.regions_unexplored.registry.BiomeRegistry;
import net.regions_unexplored.world.features.foliageplacers.SakuraFoliagePlacer;
import net.regions_unexplored.world.features.foliageplacers.WillowFoliagePlacer;
import net.regions_unexplored.world.features.treedecorators.BlackwoodBioshroom;
import net.regions_unexplored.world.features.treedecorators.ChanceWillowTrunkDecorator;
import net.regions_unexplored.world.features.treedecorators.WillowTrunkDecorator;
import terrablender.api.TerraBlenderApi;

public class RegionsUnexploredFabric implements ModInitializer, TerraBlenderApi {

    public static final FoliagePlacerType<SakuraFoliagePlacer> SAKURA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("regions_unexplored:sakura_foliage_placer", SakuraFoliagePlacer.CODEC);
    public static final FoliagePlacerType<WillowFoliagePlacer> WILLOW_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("regions_unexplored:willow_foliage_placer", WillowFoliagePlacer.CODEC);
    public static final TreeDecoratorType<BlackwoodBioshroom> BLACKWOOD_BIOSHROOM = TreeDecoratorTypeInvoker.callRegister("regions_unexplored:blackwood_bioshrooms", BlackwoodBioshroom.CODEC);
    public static final TreeDecoratorType<ChanceWillowTrunkDecorator> CHANCE_WILLOW_TRUNK_DECORATOR = TreeDecoratorTypeInvoker.callRegister("regions_unexplored:chance_willow_trunk_decorator", ChanceWillowTrunkDecorator.CODEC);
    public static final TreeDecoratorType<WillowTrunkDecorator> WILLOW_TRUNK_DECORATOR = TreeDecoratorTypeInvoker.callRegister("regions_unexplored:willow_trunk_decorator", WillowTrunkDecorator.CODEC);

    static {
        Constants.LOG.info("[Regions Unexplored] generating and loading config");
        NeoForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, RuCommonConfig.SPEC, "regions_unexplored/regions_unexplored-common.toml");
        NeoForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, RuPrimaryRegionConfig.SPEC, "regions_unexplored/regions_unexplored-primary-region.toml");
        NeoForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, RuSecondaryRegionConfig.SPEC, "regions_unexplored/regions_unexplored-secondary-region.toml");
    }

    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        RegionsUnexplored.init();

        setupBlockFeatures();
    }

    @Override
    public void onTerraBlenderInitialized() {
        BiomeRegistry.setupTerrablender();
    }

    public void setupBlockFeatures(){
        BlockToolCompat.setup();
        CompostableBlocks.setup();
        FlammableBlocks.setup();
        FurnaceBurnTimesFabric.setup();

    }
}
