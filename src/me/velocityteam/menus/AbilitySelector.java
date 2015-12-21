package me.velocityteam.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AbilitySelector {
	public Inventory openAbilitySelector() {
		Inventory inv = Bukkit.createInventory(null, 27,
				ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Select your Ability Type");

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		ItemMeta paneMeta = pane.getItemMeta();
		paneMeta.setDisplayName(" ");
		pane.setItemMeta(paneMeta);

		ItemStack water = new ItemStack(Material.WATER_BUCKET, 1);
		ItemMeta waterMeta = water.getItemMeta();
		waterMeta.setDisplayName(ChatColor.BLUE + ChatColor.BOLD.toString() + "Water Abilities");
		water.setItemMeta(waterMeta);

		ItemStack fire = new ItemStack(Material.BLAZE_POWDER, 1);
		ItemMeta fireMeta = fire.getItemMeta();
		fireMeta.setDisplayName(ChatColor.RED + ChatColor.BOLD.toString() + "Fire Abilities");
		fire.setItemMeta(fireMeta);

		ItemStack lighting = new ItemStack(Material.FLINT_AND_STEEL, 1);
		ItemMeta lightingMeta = lighting.getItemMeta();
		lightingMeta.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD.toString() + "Lighting Abilities");
		lighting.setItemMeta(lightingMeta);

		ItemStack dark = new ItemStack(Material.EYE_OF_ENDER, 1);
		ItemMeta darkMeta = dark.getItemMeta();
		darkMeta.setDisplayName(ChatColor.DARK_PURPLE + ChatColor.BOLD.toString() + "Dark Abilities");
		dark.setItemMeta(darkMeta);

		ItemStack martial = new ItemStack(Material.ARROW, 1);
		ItemMeta martialMeta = martial.getItemMeta();
		martialMeta.setDisplayName(ChatColor.WHITE + ChatColor.BOLD.toString() + "Martial Abilities");
		martial.setItemMeta(martialMeta);

		for (int x = 0; x < 27; x++) {
			switch (x) {
			case 11:
				inv.setItem(x, dark);
				break;
			case 12:
				inv.setItem(x, lighting);
				break;
			case 13:
				inv.setItem(x, fire);
				break;
			case 14:
				inv.setItem(x, water);
				break;
			case 15:
				inv.setItem(x, martial);
				break;
			default:
				inv.setItem(x, pane);
				break;
			}
		}
		return inv;
	}
}
