package me.eduard.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainTutorial extends JavaPlugin {

	public void onEnable() {
		getLogger().info("Esse plugin foi habilitado!");
	}

	public void onDisable() {
		getLogger().info("Esse plugin foi desabilitado!");
	}

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (sender instanceof Player) {
			if (command.getName().equalsIgnoreCase("send")) {
				sender.sendMessage(ChatColor.GREEN
						+ "Voce enviou uma mensagem!");
			}
		}
		return false;
	}
}
