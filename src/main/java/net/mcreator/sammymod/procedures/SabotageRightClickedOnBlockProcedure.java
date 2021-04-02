package net.mcreator.sammymod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sammymod.SammymodModElements;
import net.mcreator.sammymod.SammymodMod;

import java.util.Map;

@SammymodModElements.ModElement.Tag
public class SabotageRightClickedOnBlockProcedure extends SammymodModElements.ModElement {
	public SabotageRightClickedOnBlockProcedure(SammymodModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SammymodMod.LOGGER.warn("Failed to load dependency x for procedure SabotageRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SammymodMod.LOGGER.warn("Failed to load dependency y for procedure SabotageRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SammymodMod.LOGGER.warn("Failed to load dependency z for procedure SabotageRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SammymodMod.LOGGER.warn("Failed to load dependency world for procedure SabotageRightClickedOnBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
	}
}
