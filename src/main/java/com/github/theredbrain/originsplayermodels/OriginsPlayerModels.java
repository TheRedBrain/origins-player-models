package com.github.theredbrain.originsplayermodels;

import net.fabricmc.api.ModInitializer;

public class OriginsPlayerModels implements ModInitializer {

	public static final String MOD_ID = "originsplayermodels";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
