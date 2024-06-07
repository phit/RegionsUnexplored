package net.regions_unexplored.registry;

import io.github.uhq_games.regions_unexplored.RegionsUnexplored;
import io.github.uhq_games.regions_unexplored.world.level.feature.*;
import io.github.uhq_games.regions_unexplored.world.level.feature.bioshroom.GiantBlueBioshroomFeature;
import io.github.uhq_games.regions_unexplored.world.level.feature.bioshroom.GiantGreenBioshroomFeature;
import io.github.uhq_games.regions_unexplored.world.level.feature.bioshroom.GiantPinkBioshroomFeature;
import io.github.uhq_games.regions_unexplored.world.level.feature.bioshroom.GiantYellowBioshroomFeature;
import io.github.uhq_games.regions_unexplored.world.level.feature.configuration.*;
import io.github.uhq_games.regions_unexplored.world.level.feature.tree.*;
import io.github.uhq_games.regions_unexplored.world.level.feature.tree.nether.BrimWillowFeature;
import io.github.uhq_games.regions_unexplored.world.level.feature.tree.nether.TallBrimWillowFeature;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;

public class FeatureRegistry {
    //BIOSHROOMS
    public static Feature<GiantBioshroomConfiguration> GIANT_BLUE_BIOSHROOM = new GiantBlueBioshroomFeature(GiantBioshroomConfiguration.CODEC);
    public static Feature<GiantBioshroomConfiguration> GIANT_GREEN_BIOSHROOM = new GiantGreenBioshroomFeature(GiantBioshroomConfiguration.CODEC);
    public static Feature<GiantBioshroomConfiguration> GIANT_PINK_BIOSHROOM = new GiantPinkBioshroomFeature(GiantBioshroomConfiguration.CODEC);
    public static Feature<GiantBioshroomConfiguration> GIANT_YELLOW_BIOSHROOM = new GiantYellowBioshroomFeature(GiantBioshroomConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> SMALL_YELLOW_BIOSHROOM = new YellowBioshroomShrubFeature(NoneFeatureConfiguration.CODEC);
    //TREES
    public static Feature<RuTreeConfiguration> ASHEN_TREE = new AshenTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> ASPEN_TREE = new AspenTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> BAMBOO_TREE = new BambooTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> BLACKWOOD_TREE = new BlackwoodTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> COBALT_TREE = new CobaltShrubFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> CYPRESS_TREE = new CypressTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> DEAD_TREE = new DeadTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> EUCALYPTUS_TREE = new EucalyptusTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> GIANT_CYPRESS_TREE = new GiantCypressTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> KAPOK_TREE = new KapokTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> LARCH_TREE = new LarchTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LARGE_JOSHUA_TREE = new LargeJoshuaTreeFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> LARGE_SOCOTRA_TREE = new LargeSocotraTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> LUSH_PINE_TREE = new LushPineTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> MAPLE_TREE = new MapleTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> MEDIUM_JOSHUA_TREE = new MediumJoshuaTreeFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> MEGA_BAOBAB_TREE = new MegaBaobabTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> PALM_TREE = new PalmTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> PINE_TREE = new PineTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> REDWOOD_TREE = new RedwoodTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SAGUARO_CACTUS = new SaguaroCactusFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SAKURA_TREE = new SakuraTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SMALL_EUCALYPTUS_TREE = new SmallEucalyptusTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SMALL_JOSHUA_TREE = new SmallJoshuaTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SMALL_OAK_TREE = new SmallOakTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> SMALL_SOCOTRA_TREE = new SmallSocotraTreeFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> STRIPPED_PINE_TREE = new StrippedPineTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SUPER_REDWOOD_TREE = new SuperRedwoodTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> ULTRA_BAOBAB_TREE = new UltraBaobabTreeFeature(RuTreeConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> ULTRA_REDWOOD_TREE = new UltraRedwoodTreeFeature(RuTreeConfiguration.CODEC);
    //CAVE
    public static Feature<NoneFeatureConfiguration> ASH_VENT = new AshVentFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<ColumnFeatureConfiguration> BASALT_BLOB = new BasaltBlobFeature(ColumnFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> DROPLEAF = new DropleafFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> HANGING_PRISMARITE = new HangingPrismariteFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<LargePointedRedstoneConfiguration> LARGE_POINTED_REDSTONE = new LargePointedRedstoneFeature(LargePointedRedstoneConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LAVA_FALL = new LavaFallFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<VegetationPatchConfiguration> OVERWORLD_LAVA_DELTA = new LavaDeltaFeature(VegetationPatchConfiguration.CODEC);
    public static Feature<PointedRedstoneConfiguration> POINTED_REDSTONE = new PointedRedstoneFeature(PointedRedstoneConfiguration.CODEC);
    public static Feature<PointedRedstoneClusterConfiguration> POINTED_REDSTONE_CLUSTER = new PointedRedstoneClusterFeature(PointedRedstoneClusterConfiguration.CODEC);
    //NETHER//NETHER
    public static Feature<NoneFeatureConfiguration> BRIM_WILLOW = new BrimWillowFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> TALL_BRIM_WILLOW = new TallBrimWillowFeature(NoneFeatureConfiguration.CODEC);
    //VEGETATION
    public static Feature<NoneFeatureConfiguration> GIANT_LILY = new GiantLilyPadFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<ShrubConfiguration> SHRUB = new ShrubFeature(ShrubConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> TREE_SHRUB = new TreeShrubFeature(RuTreeConfiguration.CODEC);
    //DECORATION
    public static Feature<MultifaceGrowthConfiguration> AIR_MULTIFACE_GROWTH = new AirMultifaceGrowthFeature(MultifaceGrowthConfiguration.CODEC);
    public static Feature<FallenTreeConfiguration> FALLEN_BLOB_TREE = new FallenBlobTreeFeature(FallenTreeConfiguration.CODEC);
    public static Feature<FallenTreeConfiguration> FALLEN_SNOW_TREE = new FallenSnowTreeFeature(FallenTreeConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> ICICLE_UP = new FloorIcicleFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> MEADOW_ROCK = new MeadowRockFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> ROCK = new RockFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> SMOULDERING_DIRT = new SmoulderingDirtFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<RuTreeConfiguration> SPIRE = new IceSpireFeature(RuTreeConfiguration.CODEC);
    //AQUATIC
    public static Feature<NoneFeatureConfiguration> FEN_CATTAIL = new FenCattailFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<ProbabilityFeatureConfiguration> HYACINTH_PLANTS = new HyacinthPlantsFeature(ProbabilityFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> MARSH = new MarshFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<SeaRockConfiguration> OCEAN_ROCK = new SeaRockFeature(SeaRockConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> ROCK_PILLAR = new RockPillarFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<HyacinthStockConfiguration> TALL_HYACINTH_STOCK = new HyacinthStockFeature(HyacinthStockConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> WATER_CATTAIL = new WaterCattailFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> WATER_EDGE = new WaterEdgeFeature(NoneFeatureConfiguration.CODEC);
    //NETHER
    public static Feature<NoneFeatureConfiguration> GLISTERING_IVY = new GlisteringIvyFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> HANGING_EARLIGHT = new HangingEarlightFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> NETHER_ROCK = new NetherRockFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> OBSIDIAN_SPIRE = new ObsidianSpireFeature(NoneFeatureConfiguration.CODEC);

    public static void addFeatures() {
        //BIOSHROOMS
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_blue_bioshroom"), GIANT_BLUE_BIOSHROOM);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_green_bioshroom"), GIANT_GREEN_BIOSHROOM);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_pink_bioshroom"), GIANT_PINK_BIOSHROOM);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_yellow_bioshroom"), GIANT_YELLOW_BIOSHROOM);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("small_yellow_bioshroom"), SMALL_YELLOW_BIOSHROOM);
        //TREES
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("ashen_tree"),ASHEN_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("aspen_tree"),ASPEN_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("bamboo_tree"),BAMBOO_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("blackwood_tree"),BLACKWOOD_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("cobalt_tree"),COBALT_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("cypress_tree"),CYPRESS_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("dead_tree"),DEAD_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("eucalyptus_tree"),EUCALYPTUS_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_cypress_tree"),GIANT_CYPRESS_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("kapok_tree"),KAPOK_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("larch_tree"),LARCH_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("large_joshua_tree"),LARGE_JOSHUA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("large_socotra_tree"),LARGE_SOCOTRA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("lush_pine_tree"),LUSH_PINE_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("maple_tree"),MAPLE_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("medium_joshua_tree"),MEDIUM_JOSHUA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("mega_baobab_tree"),MEGA_BAOBAB_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("palm_tree"),PALM_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("pine_tree"),PINE_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("redwood_tree"),REDWOOD_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("saguaro_cactus"),SAGUARO_CACTUS);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("sakura_tree"),SAKURA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("small_eucalyptus_tree"),SMALL_EUCALYPTUS_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("small_joshua_tree"),SMALL_JOSHUA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("small_oak_tree"),SMALL_OAK_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("small_socotra_tree"),SMALL_SOCOTRA_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("stripped_pine_tree"),STRIPPED_PINE_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("super_redwood_tree"),SUPER_REDWOOD_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("ultra_baobab_tree"),ULTRA_BAOBAB_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("ultra_redwood_tree"),ULTRA_REDWOOD_TREE);
        //CAVE
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("scorch_vent"), ASH_VENT);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("basalt_blob"), BASALT_BLOB);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("dropleaf"), DROPLEAF);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("hanging_prismarite"), HANGING_PRISMARITE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("large_pointed_redstone"), LARGE_POINTED_REDSTONE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("lava_fall"), LAVA_FALL);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("overworld_lava_delta"), OVERWORLD_LAVA_DELTA);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("pointed_redstone"), POINTED_REDSTONE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("pointed_redstone_cluster"), POINTED_REDSTONE_CLUSTER);
        //NETHER
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("brim_willow"), BRIM_WILLOW);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("tall_brim_willow"), TALL_BRIM_WILLOW);
        //VEGETATION
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("giant_lily"), GIANT_LILY);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("shrub"), SHRUB);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("tree_shrub"), TREE_SHRUB);
        //DECORATION
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("air_multiface_growth"), AIR_MULTIFACE_GROWTH);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("fallen_blob_tree"), FALLEN_BLOB_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("fallen_snow_tree"), FALLEN_SNOW_TREE);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("icicle_up"), ICICLE_UP);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("meadow_rock"), MEADOW_ROCK);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("rock"), ROCK);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("smouldering_dirt"), SMOULDERING_DIRT);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("spire"), SPIRE);
        //AQUATIC
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("fen_cattail"), FEN_CATTAIL);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("hyacinth_plants"), HYACINTH_PLANTS);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("marsh"), MARSH);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("ocean_rock"), OCEAN_ROCK);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("rock_pillar"), ROCK_PILLAR);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("tall_hyacinth_stock"), TALL_HYACINTH_STOCK);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("water_cattail"), WATER_CATTAIL);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("water_edge"), WATER_EDGE);
        //NETHER
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("glistering_ivy"), GLISTERING_IVY);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("hanging_earlight"), HANGING_EARLIGHT);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("nether_rock"), NETHER_ROCK);
        Registry.register(BuiltInRegistries.FEATURE, RegionsUnexplored.ID("obsidian_spire"), OBSIDIAN_SPIRE);
    }
}
