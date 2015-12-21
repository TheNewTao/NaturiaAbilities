package me.velocityteam.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.velocityteam.core.Main;
import me.velocityteam.menus.AbilitySelector;

public class AbilityCmd implements CommandExecutor {

	AbilitySelector gui;
	Main main;

	public AbilityCmd(AbilitySelector gui, Main main) {
		this.gui = gui;
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can execute this command.");
			return true;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("ability")) {
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 16, 1);
			p.openInventory(gui.openAbilitySelector());
			return true;
		} else if (cmd.getName().equalsIgnoreCase("select")) {
			main.starter.put(p.getUniqueId(), false);
			p.playSound(p.getLocation(), Sound.ENDERDRAGON_DEATH, 16, 1);
			return true;
		}
		return false;
	}
}
