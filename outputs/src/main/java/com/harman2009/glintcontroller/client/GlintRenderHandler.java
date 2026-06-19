package com.harman2009.glintcontroller.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.RenderTickCounter;
import com.harman2009.glintcontroller.GlintControllerConfig;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Environment(EnvType.CLIENT)
public class GlintRenderHandler {

	private static float lastTime = 0;

	public static void register() {
		WorldRenderEvents.LAST.register(context -> {
			// Glint animation is controlled by texture coordinate offset
			// Store current time for glint speed calculation
			MinecraftClient client = MinecraftClient.getInstance();
			if (client.world != null) {
				lastTime = (client.world.getTime() + client.getTickDelta()) * GlintControllerConfig.glintSpeed;
			}
		});
	}

	public static float getGlintTime() {
		return lastTime;
	}

	public static float getGlintStrength() {
		return GlintControllerConfig.glintStrength;
	}
}
