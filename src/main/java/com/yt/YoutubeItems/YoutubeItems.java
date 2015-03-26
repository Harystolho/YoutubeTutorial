package com.yt.YoutubeItems;

import com.yt.helper.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class YoutubeItems {

	public static Item youtube_item;

	public static void init() {
		youtube_item = new Item().setUnlocalizedName("youtube_item");

	}

	public static void register() {
		GameRegistry.registerItem(youtube_item, youtube_item
				.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(youtube_item);
	}

	public static void registerRender(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}
}
