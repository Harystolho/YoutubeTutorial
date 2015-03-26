package com.yt.proxy;

import com.yt.YoutubeItems.YoutubeItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		YoutubeItems.registerRenders();
	}
}
