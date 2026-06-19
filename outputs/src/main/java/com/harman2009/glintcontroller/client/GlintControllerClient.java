package com.harman2009.glintcontroller.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import com.harman2009.glintcontroller.GlintControllerConfig;

@Environment(EnvType.CLIENT)
public class GlintControllerClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		GlintControllerConfig.load();
	}
}
