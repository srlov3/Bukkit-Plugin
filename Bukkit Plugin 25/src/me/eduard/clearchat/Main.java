package me.eduard.clearchat;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;

public class Main extends JavaPlugin implements Listener {

	public Main main = this;
	public Server server = Bukkit.getServer();
	public ScoreboardManager score = Bukkit.getScoreboardManager();
	public FileConfiguration cf = getConfig();
	public PluginManager pm = Bukkit.getPluginManager();
	public BukkitScheduler sh = Bukkit.getScheduler();
	public CommandSender send = Bukkit.getConsoleSender();

	public void onLoad() {

	}
	
	@EventHandler
	public void SemChuva(WeatherChangeEvent e) {
		if (e.toWeatherState()) {
			e.setCancelled(true);
		}
	}

	public void onEnable() {
		pm.registerEvents(this, this);
		
		sh.scheduleSyncRepeatingTask(this, new Runnable() {
			
			public void run() {
				for (World w : Bukkit.getWorlds()) {
					w.setTime(0);
				}
			}
		}, 0, 5*20);
	}

	public void onDisable() {
		HandlerList.unregisterAll();
	}

	public List<String> onTabComplete(CommandSender sender, Command command,
			String alias, String[] args) {
		return null;
	}

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cApenas para players!");
			return true;
		}
		Player p = (Player) sender;
		if (command.getName().equalsIgnoreCase("clearchat")) {
			if (args.length == 0) {
				for (int i = 100; i > 0; i--) {
					p.sendMessage("");
				}
			}
			
		}else if (command.getName().equalsIgnoreCase("clearchatall")) {
			if (args.length == 0) {
				for (int i = 100; i > 0; i--) {
					Bukkit.broadcastMessage("");				}
			}
			
		}
		return true;
	}
}
