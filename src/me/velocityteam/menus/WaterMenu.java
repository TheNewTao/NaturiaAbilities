package me.velocityteam.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WaterMenu {
	public Inventory createWaterAbilities() {

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		ItemMeta paneMeta = pane.getItemMeta();
		paneMeta.setDisplayName(" ");
		pane.setItemMeta(paneMeta);

		// Utility
		ItemStack firstUtility = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GREEN.getData());
		ItemStack secondUtility = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GREEN.getData());
		ItemStack thirdUtility = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GREEN.getData());
		ItemStack fourthUtility = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GREEN.getData());
		ItemStack fifthUtility = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GREEN.getData());
		ItemMeta firstUtilityMeta = firstUtility.getItemMeta();
		ItemMeta secondUtilityMeta = secondUtility.getItemMeta();
		ItemMeta thirdUtilityMeta = thirdUtility.getItemMeta();
		ItemMeta fourthUtilityMeta = fourthUtility.getItemMeta();
		ItemMeta fifthUtilityMeta = fifthUtility.getItemMeta();
		firstUtilityMeta.setDisplayName("");
		secondUtilityMeta.setDisplayName("");
		thirdUtilityMeta.setDisplayName("");
		fourthUtilityMeta.setDisplayName("");
		fifthUtilityMeta.setDisplayName("");
		ArrayList<String> firstUtilityLore = new ArrayList<String>();
		ArrayList<String> secondUtilityLore = new ArrayList<String>();
		ArrayList<String> thirdUtilityLore = new ArrayList<String>();
		ArrayList<String> fourthUtilityLore = new ArrayList<String>();
		ArrayList<String> fifthUtilityLore = new ArrayList<String>();
		firstUtilityLore.add(ChatColor.WHITE + "");
		secondUtilityLore.add(ChatColor.WHITE + "");
		thirdUtilityLore.add(ChatColor.WHITE + "");
		fourthUtilityLore.add(ChatColor.WHITE + "");
		fifthUtilityLore.add(ChatColor.WHITE + "");
		firstUtilityMeta.setLore(firstUtilityLore);
		secondUtilityMeta.setLore(secondUtilityLore);
		thirdUtilityMeta.setLore(thirdUtilityLore);
		fourthUtilityMeta.setLore(fourthUtilityLore);
		fifthUtilityMeta.setLore(fifthUtilityLore);
		firstUtility.setItemMeta(firstUtilityMeta);
		secondUtility.setItemMeta(secondUtilityMeta);
		thirdUtility.setItemMeta(thirdUtilityMeta);
		fourthUtility.setItemMeta(fourthUtilityMeta);
		fifthUtility.setItemMeta(fifthUtilityMeta);

		// Damage
		ItemStack firstDamage = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.BLUE.getData());
		ItemStack secondDamage = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.BLUE.getData());
		ItemStack thirdDamage = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.BLUE.getData());
		ItemStack fourthDamage = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.BLUE.getData());
		ItemStack fifthDamage = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.BLUE.getData());
		ItemMeta firstDamageMeta = firstDamage.getItemMeta();
		ItemMeta secondDamageMeta = secondDamage.getItemMeta();
		ItemMeta thirdDamageMeta = thirdDamage.getItemMeta();
		ItemMeta fourthDamageMeta = fourthDamage.getItemMeta();
		ItemMeta fifthDamageMeta = fifthDamage.getItemMeta();
		firstDamageMeta.setDisplayName("");
		secondDamageMeta.setDisplayName("");
		thirdDamageMeta.setDisplayName("");
		fourthDamageMeta.setDisplayName("");
		fifthDamageMeta.setDisplayName("");
		ArrayList<String> firstDamageLore = new ArrayList<String>();
		ArrayList<String> secondDamageLore = new ArrayList<String>();
		ArrayList<String> thirdDamageLore = new ArrayList<String>();
		ArrayList<String> fourthDamageLore = new ArrayList<String>();
		ArrayList<String> fifthDamageLore = new ArrayList<String>();
		firstDamageLore.add(ChatColor.WHITE + "");
		secondDamageLore.add(ChatColor.WHITE + "");
		thirdDamageLore.add(ChatColor.WHITE + "");
		fourthDamageLore.add(ChatColor.WHITE + "");
		fifthDamageLore.add(ChatColor.WHITE + "");
		firstDamageMeta.setLore(firstDamageLore);
		secondDamageMeta.setLore(secondDamageLore);
		thirdDamageMeta.setLore(thirdDamageLore);
		fourthDamageMeta.setLore(fourthDamageLore);
		fifthDamageMeta.setLore(fifthDamageLore);
		firstDamage.setItemMeta(firstDamageMeta);
		secondDamage.setItemMeta(secondDamageMeta);
		thirdDamage.setItemMeta(thirdDamageMeta);
		fourthDamage.setItemMeta(fourthDamageMeta);
		fifthDamage.setItemMeta(fifthDamageMeta);

		ItemStack firstHealing = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.PINK.getData());
		ItemStack secondHealing = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.PINK.getData());
		ItemStack thirdHealing = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.PINK.getData());
		ItemMeta firstHealingMeta = firstHealing.getItemMeta();
		ItemMeta secondHealingMeta = secondHealing.getItemMeta();
		ItemMeta thirdHealingMeta = thirdHealing.getItemMeta();
		firstHealingMeta.setDisplayName("");
		secondHealingMeta.setDisplayName("");
		thirdHealingMeta.setDisplayName("");
		ArrayList<String> firstHealingLore = new ArrayList<String>();
		ArrayList<String> secondHealingLore = new ArrayList<String>();
		ArrayList<String> thirdHealingLore = new ArrayList<String>();
		firstHealingLore.add(ChatColor.WHITE + "");
		secondHealingLore.add(ChatColor.WHITE + "");
		thirdHealingLore.add(ChatColor.WHITE + "");
		firstHealingMeta.setLore(firstHealingLore);
		secondHealingMeta.setLore(secondHealingLore);
		thirdHealingMeta.setLore(thirdHealingLore);
		firstHealing.setItemMeta(firstHealingMeta);
		secondHealing.setItemMeta(secondHealingMeta);
		thirdHealing.setItemMeta(thirdHealingMeta);

		ItemStack firstBuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.ORANGE.getData());
		ItemStack secondBuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.ORANGE.getData());
		ItemStack thirdBuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.ORANGE.getData());
		ItemMeta firstBuffsMeta = firstBuffs.getItemMeta();
		ItemMeta secondBuffsMeta = secondBuffs.getItemMeta();
		ItemMeta thirdBuffsMeta = thirdBuffs.getItemMeta();
		firstBuffsMeta.setDisplayName("");
		secondBuffsMeta.setDisplayName("");
		thirdBuffsMeta.setDisplayName("");
		ArrayList<String> firstBuffsLore = new ArrayList<String>();
		ArrayList<String> secondBuffsLore = new ArrayList<String>();
		ArrayList<String> thirdBuffsLore = new ArrayList<String>();
		firstBuffsLore.add(ChatColor.WHITE + "");
		secondBuffsLore.add(ChatColor.WHITE + "");
		thirdBuffsLore.add(ChatColor.WHITE + "");
		firstBuffsMeta.setLore(firstBuffsLore);
		secondBuffsMeta.setLore(secondBuffsLore);
		thirdBuffsMeta.setLore(thirdBuffsLore);
		firstBuffs.setItemMeta(firstBuffsMeta);
		secondBuffs.setItemMeta(secondBuffsMeta);
		thirdBuffs.setItemMeta(thirdBuffsMeta);

		ItemStack firstDebuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GRAY.getData());
		ItemStack secondDebuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GRAY.getData());
		ItemStack thirdDebuffs = new ItemStack(Material.INK_SACK, 1, (byte) DyeColor.GRAY.getData());
		ItemMeta firstDebuffsMeta = firstDebuffs.getItemMeta();
		ItemMeta secondDebuffsMeta = secondDebuffs.getItemMeta();
		ItemMeta thirdDebuffsMeta = thirdDebuffs.getItemMeta();
		firstDebuffsMeta.setDisplayName("");
		secondDebuffsMeta.setDisplayName("");
		thirdDebuffsMeta.setDisplayName("");
		ArrayList<String> firstDebuffsLore = new ArrayList<String>();
		ArrayList<String> secondDebuffsLore = new ArrayList<String>();
		ArrayList<String> thirdDebuffsLore = new ArrayList<String>();
		firstDebuffsLore.add(ChatColor.WHITE + "");
		secondDebuffsLore.add(ChatColor.WHITE + "");
		thirdDebuffsLore.add(ChatColor.WHITE + "");
		firstDebuffsMeta.setLore(firstDebuffsLore);
		secondDebuffsMeta.setLore(secondDebuffsLore);
		thirdDebuffsMeta.setLore(thirdDebuffsLore);
		firstDebuffs.setItemMeta(firstDebuffsMeta);
		secondDebuffs.setItemMeta(secondDebuffsMeta);
		thirdDebuffs.setItemMeta(thirdDebuffsMeta);

		Inventory inv = Bukkit.createInventory(null, 54,
				ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Water Abilities");

		for (int x = 0; x < 54; x++) {
			switch (x) {

			// Utility Abilities
			case 11:
				inv.setItem(x, firstUtility);
				break;
			case 12:
				inv.setItem(x, secondUtility);
				break;
			case 13:
				inv.setItem(x, thirdUtility);
				break;
			case 14:
				inv.setItem(x, fourthUtility);
				break;
			case 15:
				inv.setItem(x, fifthUtility);
				break;

			// Damage Abilities
			case 20:
				inv.setItem(x, firstDamage);
				break;
			case 21:
				inv.setItem(x, secondDamage);
				break;
			case 22:
				inv.setItem(x, thirdDamage);
				break;
			case 23:
				inv.setItem(x, fourthDamage);
				break;
			case 24:
				inv.setItem(x, fifthDamage);
				break;

			// Healing Abilities
			case 30:
				inv.setItem(x, firstHealing);
				break;
			case 31:
				inv.setItem(x, secondHealing);
				break;
			case 32:
				inv.setItem(x, thirdHealing);
				break;

			// Buffs Abilities
			case 37:
				inv.setItem(x, firstBuffs);
				break;
			case 38:
				inv.setItem(x, secondBuffs);
				break;
			case 39:
				inv.setItem(x, thirdBuffs);
				break;

			// Debuff Abilities
			case 41:
				inv.setItem(x, firstDebuffs);
				break;
			case 42:
				inv.setItem(x, firstDebuffs);
				break;
			case 43:
				inv.setItem(x, thirdDebuffs);
				break;

			default:
				inv.setItem(x, pane);
				break;

			}

		}

		return inv;
	}
}
