
package me.velocityteam.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	public static Plugin getInstance() {

		PluginManager pluginManager = Bukkit.getServer().getPluginManager();

		return pluginManager.getPlugin("NaturiaAbilities");
	}
}