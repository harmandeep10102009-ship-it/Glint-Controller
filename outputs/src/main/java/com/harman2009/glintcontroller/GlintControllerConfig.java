package com.harman2009.glintcontroller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GlintControllerConfig {
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static final File CONFIG_FILE = new File("config/glint-customizer.json");

	public static float glintStrength = 1.0f;
	public static float glintSpeed = 1.0f;
	public static boolean enableGlint = true;

	public static class ConfigData {
		public float glintStrength = 1.0f;
		public float glintSpeed = 1.0f;
		public boolean enableGlint = true;
	}

	public static void load() {
		try {
			if (CONFIG_FILE.exists()) {
				ConfigData data = GSON.fromJson(new FileReader(CONFIG_FILE), ConfigData.class);
				glintStrength = data.glintStrength;
				glintSpeed = data.glintSpeed;
				enableGlint = data.enableGlint;
				GlintController.LOGGER.info("Loaded glint config: strength={}, speed={}, enabled={}", 
					glintStrength, glintSpeed, enableGlint);
			} else {
				save();
			}
		} catch (IOException e) {
			GlintController.LOGGER.error("Failed to load glint config", e);
		}
	}

	public static void save() {
		try {
			CONFIG_FILE.getParentFile().mkdirs();
			ConfigData data = new ConfigData();
			data.glintStrength = glintStrength;
			data.glintSpeed = glintSpeed;
			data.enableGlint = enableGlint;
			GSON.toJson(data, new FileWriter(CONFIG_FILE));
			GlintController.LOGGER.info("Saved glint config");
		} catch (IOException e) {
			GlintController.LOGGER.error("Failed to save glint config", e);
		}
	}
}
