
package me.velocityteam.core;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.velocityteam.commands.AbilityCmd;
import me.velocityteam.events.InventoryClick;
import me.velocityteam.events.PlayerJoin;
import me.velocityteam.menus.AbilitySelector;
import me.velocityteam.menus.DarkMenu;
import me.velocityteam.menus.FireMenu;
import me.velocityteam.menus.LightningMenu;
import me.velocityteam.menus.MartialMenu;
import me.velocityteam.menus.WaterMenu;

public class Main extends JavaPlugin {
	public HashMap<UUID, Boolean> starter = new HashMap<UUID, Boolean>();
	public HashMap<String, String> fireAbilities = new HashMap<String, String>();
	public HashMap<String, String> waterAbilities = new HashMap<String, String>();
	public HashMap<String, String> martialAbilities = new HashMap<String, String>();
	public HashMap<String, String> lightningAbilities = new HashMap<String, String>();
	public HashMap<String, String> darkAbilities = new HashMap<String, String>();
	public final static String prefix = ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "[" + ChatColor.GOLD
			+ ChatColor.BOLD.toString() + "Naturia" + ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "]";
	public DarkMenu dark = new DarkMenu();
	public FireMenu fire = new FireMenu();
	public LightningMenu lighting = new LightningMenu();
	public MartialMenu martial = new MartialMenu();
	public WaterMenu water = new WaterMenu();
	private AbilitySelector abilitySelector = new AbilitySelector();
	private AbilityCmd abilityCommand = new AbilityCmd(abilitySelector, this);
	private InventoryClick invClick = new InventoryClick(this);
	private PlayerJoin playerJoin = new PlayerJoin(this);

	@Override
	public void onEnable() {
		this.getCommand("ability").setExecutor(abilityCommand);
		this.getCommand("select").setExecutor(abilityCommand);
		Bukkit.getPluginManager().registerEvents(invClick, this);
		Bukkit.getPluginManager().registerEvents(playerJoin, this);
	}

	@Override
	public void onDisable() {

	}

	public static Plugin getInstance() {
		PluginManager pluginManager = Bukkit.getServer().getPluginManager();
		return pluginManager.getPlugin("NaturiaAbilities");
	}
}