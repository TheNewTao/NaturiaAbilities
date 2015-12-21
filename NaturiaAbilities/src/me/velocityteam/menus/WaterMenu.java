package me.velocityteam.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public class WaterMenu {
	public Inventory createWaterAbilities() {
		Inventory inv = Bukkit.createInventory(null, 27,
				ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Select your Ability Type");
		return inv;
	}
}
