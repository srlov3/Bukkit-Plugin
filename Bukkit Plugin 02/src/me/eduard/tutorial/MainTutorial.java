package me.eduard.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class MainTutorial extends JavaPlugin {

	public void onEnable() {
		getLogger().info("Esse plugin foi habilitado!");
	}

	public void onDisable() {
		getLogger().info("Esse plugin foi desabilitado!");
	}
}
