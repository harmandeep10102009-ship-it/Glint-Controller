package com.harman2009.glintcontroller;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlintController implements ModInitializer {
	public static final String MOD_ID = "glint-customizer";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Glint Customizer");
		GlintControllerConfig.load();
	}
}
