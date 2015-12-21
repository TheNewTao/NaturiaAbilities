package me.velocityteam.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.velocityteam.core.Main;

public class InventoryClick implements Listener {
	Main main;

	public InventoryClick(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Select your Ability Type")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE) {
				p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
			} else {
				p.playSound(p.getLocation(), Sound.ANVIL_LAND, 16, 1);
			}
			switch (e.getCurrentItem().getType()) {
			case EYE_OF_ENDER:
				p.openInventory(main.dark.createDarkAbilities());
				break;
			case BLAZE_POWDER:
				p.openInventory(main.fire.createFireAbilities());
				break;
			case FLINT_AND_STEEL:
				p.openInventory(main.lighting.createLightningAbilities());
				break;
			case WATER_BUCKET:
				p.openInventory(main.water.createWaterAbilities());
				break;
			case ARROW:
				p.openInventory(main.martial.createMartialAbilities());
				break;
			default:
				p.closeInventory();
				break;
			}

		} else if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Water Abilities")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (!main.starter.get(p.getUniqueId())) {

			} else {
				p.openInventory(main.martial.createMartialAbilities());
			}
		} else if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Martial Abilities")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (!main.starter.get(p.getUniqueId())) {

			} else {
				p.openInventory(main.lighting.createLightningAbilities());
			}
		} else if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Lightning Abilities")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (!main.starter.get(p.getUniqueId())) {

			} else {
				p.openInventory(main.fire.createFireAbilities());
			}
		} else if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Fire Abilities")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (!main.starter.get(p.getUniqueId())) {

			} else {
				p.openInventory(main.dark.createDarkAbilities());
			}
		} else if (e.getInventory().getName()
				.equals(ChatColor.DARK_GRAY + ChatColor.BOLD.toString() + "Dark Abilities")) {
			if (e.isRightClick() || e.isLeftClick() || e.isShiftClick() || e.getClick() == ClickType.NUMBER_KEY) {
				e.setCancelled(true);
			}
			if (!main.starter.get(p.getUniqueId())) {

			} else {
				p.closeInventory();
			}
		}
	}
}
