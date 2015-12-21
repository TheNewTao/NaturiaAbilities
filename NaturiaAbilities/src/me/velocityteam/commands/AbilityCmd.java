package me.velocityteam.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AbilityCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can execute this command.");

			return true;
		}
		Player player = (Player) sender;

		if(cmd.getName().equalsIgnoreCase("ability")) {

			/**
			 * @author GamerzKing
			 * @version 1.0
			 * @return true if command is executed
			 * @throws PabloIsPabloException
			 */
			
			return true;
		}
		return false;
	}
}
