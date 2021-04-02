
package net.mcreator.sammymod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sammymod.itemgroup.SammyNightsTabItemGroup;
import net.mcreator.sammymod.SammymodModElements;

import java.util.List;

@SammymodModElements.ModElement.Tag
public class LosNinosDelParqueItem extends SammymodModElements.ModElement {
	@ObjectHolder("sammymod:los_ninos_del_parque")
	public static final Item block = null;
	public LosNinosDelParqueItem(SammymodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SammymodModElements.sounds.get(new ResourceLocation("sammymod:losninosdelparque")),
					new Item.Properties().group(SammyNightsTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("los_ninos_del_parque");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Los Ninos Del Parque - KMFDM"));
		}
	}
}
