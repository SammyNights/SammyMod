
package net.mcreator.sammymod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sammymod.item.SabotageItem;
import net.mcreator.sammymod.SammymodModElements;

@SammymodModElements.ModElement.Tag
public class SammyNightsTabItemGroup extends SammymodModElements.ModElement {
	public SammyNightsTabItemGroup(SammymodModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsammy_nights_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SabotageItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
