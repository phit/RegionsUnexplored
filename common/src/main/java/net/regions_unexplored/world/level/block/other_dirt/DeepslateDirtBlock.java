package net.regions_unexplored.world.level.block.other_dirt;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

public abstract class DeepslateDirtBlock extends SnowyDirtBlock {
   protected DeepslateDirtBlock(Properties properties) {
      super(properties);
   }

   private static boolean canBeGrass(BlockState state, LevelReader level, BlockPos pos) {
      BlockPos blockPos = pos.above();
      BlockState blockState = level.getBlockState(blockPos);
      if (blockState.is(Blocks.SNOW) && blockState.getValue(SnowLayerBlock.LAYERS) == 1) {
         return true;
      } else if (blockState.getFluidState().getAmount() == 8) {
         return false;
      } else {
         int i = LightEngine.getLightBlockInto(level, state, pos, blockState, blockPos, Direction.UP, blockState.getLightBlock(level, blockPos));
         return i < level.getMaxLightLevel();
      }
   }

   private static boolean canPropagate(BlockState state, LevelReader level, BlockPos pos) {
      BlockPos blockPos = pos.above();
      return canBeGrass(state, level, pos) && !level.getFluidState(blockPos).is(FluidTags.WATER);
   }

   public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
      if (!canBeGrass(state, level, pos)) {
         level.setBlockAndUpdate(pos, Blocks.DEEPSLATE.defaultBlockState());
      } else {
         if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
            BlockState blockstate = this.defaultBlockState();

            for(int i = 0; i < 4; ++i) {
               BlockPos blockPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
               if (level.getBlockState(blockPos).is(Blocks.DEEPSLATE) && canPropagate(blockstate, level, blockPos)) {
               }
            }
         }

      }
   }
}
