package net.regions_unexplored.data.worldgen.features;

import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import io.github.uhq_games.regions_unexplored.registry.ConfiguredFeatureRegistry;
import io.github.uhq_games.regions_unexplored.registry.FeatureRegistry;
import io.github.uhq_games.regions_unexplored.world.level.feature.configuration.HyacinthStockConfiguration;
import io.github.uhq_games.regions_unexplored.world.level.feature.configuration.RuTreeConfiguration;
import io.github.uhq_games.regions_unexplored.world.level.feature.configuration.SeaRockConfiguration;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class RuAquaticFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> FEN_CATTAIL = ConfiguredFeatureRegistry.createKey("fen_cattail");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATER_CATTAIL = ConfiguredFeatureRegistry.createKey("water_cattail");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_HYACINTH_STOCK = ConfiguredFeatureRegistry.createKey("tall_hyacinth_stock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_PLANTS = ConfiguredFeatureRegistry.createKey("hyacinth_plants");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_FLOWERS = ConfiguredFeatureRegistry.createKey("hyacinth_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_ROCKS = ConfiguredFeatureRegistry.createKey("hyacinth_rocks");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSSY_SEA_ROCKS = ConfiguredFeatureRegistry.createKey("mossy_sea_rocks");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_MAGNOLIA_FLOWERS_AQUATIC = ConfiguredFeatureRegistry.createKey("red_magnolia_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MAGNOLIA_FLOWERS_AQUATIC = ConfiguredFeatureRegistry.createKey("pink_magnolia_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MAGNOLIA_FLOWERS_AQUATIC = ConfiguredFeatureRegistry.createKey("white_magnolia_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_TREE_AQUATIC = ConfiguredFeatureRegistry.createKey("jungle_tree_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_TREE_AQUATIC = ConfiguredFeatureRegistry.createKey("palm_tree_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELEPHANT_EAR_AQUATIC = ConfiguredFeatureRegistry.createKey("elephant_ear_aquatic");
    
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, FEN_CATTAIL, FeatureRegistry.FEN_CATTAIL, FeatureConfiguration.NONE);
        register(context, WATER_CATTAIL, FeatureRegistry.WATER_CATTAIL, FeatureConfiguration.NONE);
        
        register(context, TALL_HYACINTH_STOCK, FeatureRegistry.TALL_HYACINTH_STOCK, new HyacinthStockConfiguration(BlockStateProvider.simple(RuBlocks.TALL_HYACINTH_STOCK), 1, 14));
        register(context, HYACINTH_PLANTS, FeatureRegistry.HYACINTH_PLANTS, new ProbabilityFeatureConfiguration(0.1F));
        register(context, HYACINTH_FLOWERS, Feature.MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock) RuBlocks.HYACINTH_FLOWERS, 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, Blocks.PRISMARINE, Blocks.PRISMARINE_BRICKS)));
        register(context, HYACINTH_ROCKS, FeatureRegistry.OCEAN_ROCK, new SeaRockConfiguration(Blocks.STONE.defaultBlockState(), RuBlocks.MOSSY_STONE.defaultBlockState()));
        //ROCKY_REEF
        register(context, MOSSY_SEA_ROCKS, FeatureRegistry.ROCK_PILLAR, FeatureConfiguration.NONE);
        register(context, BLUE_MAGNOLIA_FLOWERS_AQUATIC, FeatureRegistry.AIR_MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock) RuBlocks.BLUE_MAGNOLIA_FLOWERS, 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RuBlocks.STONE_GRASS_BLOCK)));
        register(context, PINK_MAGNOLIA_FLOWERS_AQUATIC, FeatureRegistry.AIR_MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock) RuBlocks.PINK_MAGNOLIA_FLOWERS, 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RuBlocks.STONE_GRASS_BLOCK)));
        register(context, WHITE_MAGNOLIA_FLOWERS_AQUATIC, FeatureRegistry.AIR_MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock) RuBlocks.WHITE_MAGNOLIA_FLOWERS, 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RuBlocks.STONE_GRASS_BLOCK)));
        register(context, JUNGLE_TREE_AQUATIC, FeatureRegistry.SAKURA_TREE, new RuTreeConfiguration(BlockStateProvider.simple(Blocks.JUNGLE_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.JUNGLE_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.JUNGLE_BRANCH.defaultBlockState()), 1, 4));

        register(context, PALM_TREE_AQUATIC, FeatureRegistry.PALM_TREE, new RuTreeConfiguration(BlockStateProvider.simple(RuBlocks.PALM_LOG.defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_LEAVES.defaultBlockState()), BlockStateProvider.simple(RuBlocks.PALM_BEARD.defaultBlockState()), 8, 4));
        register(context, ELEPHANT_EAR_AQUATIC, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RuBlocks.ELEPHANT_EAR.defaultBlockState()), 32));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
