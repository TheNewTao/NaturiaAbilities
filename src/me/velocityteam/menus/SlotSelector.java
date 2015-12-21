package me.velocityteam.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SlotSelector {

	public Inventory createSlotSelector(Player p) {
		Inventory inv = Bukkit.createInventory(p, 36, ChatColor.GRAY + ChatColor.BOLD.toString() + "Slot for the Ability?");
		return inv;
	}

}
