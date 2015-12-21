package me.velocityteam.events;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import me.velocityteam.core.Main;

public class PlayerJoin implements Listener {
	Main main;

	public PlayerJoin(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		if (!p.hasPlayedBefore() && p.getWorld().getEnvironment() == Environment.NORMAL) {
			main.starter.put(p.getUniqueId(), true);
			p.sendTitle(
					ChatColor.RED + ChatColor.BOLD.toString() + "Welcome " + ChatColor.RED + ChatColor.BOLD.toString()
							+ p.getName(),
					ChatColor.BOLD + ChatColor.STRIKETHROUGH.toString() + "                              ");
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.WHITE
							+ " First time joined the server? Well I must introduce you properly!");
				}
			}.runTaskLater(main, 80L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.WHITE
							+ " Our server has five elements, or classes you can choose from");
				}
			}.runTaskLater(main, 160L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.BLUE + ChatColor.BOLD.toString() + " Water");
				}
			}.runTaskLater(main, 240L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.WHITE + ChatColor.BOLD.toString() + " Martial");
				}
			}.runTaskLater(main, 270L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.RED + ChatColor.BOLD.toString() + " Fire");
				}
			}.runTaskLater(main, 300L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.YELLOW + ChatColor.BOLD.toString() + " Lightning");
				}
			}.runTaskLater(main, 330L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.DARK_PURPLE + ChatColor.BOLD.toString() + " Dark");
				}
			}.runTaskLater(main, 360L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(
							main.prefix + ChatColor.WHITE + " You will now " + ChatColor.RED + ChatColor.BOLD.toString()
									+ "choose an ability for each element " + "to test out every ability!");
				}
			}.runTaskLater(main, 390L);
			new BukkitRunnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 16, 1);
					p.sendMessage(main.prefix + ChatColor.WHITE
							+ " Once you have made your decision on your class/element, do" + ChatColor.RED
							+ ChatColor.BOLD.toString() + " /select [element]");
				}
			}.runTaskLater(main, 490L);
			new BukkitRunnable() {
				public void run() {
					p.openInventory(main.water.createWaterAbilities());
				}
			}.runTaskLater(main, 550L);
		}
	}
}
