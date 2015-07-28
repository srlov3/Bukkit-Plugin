
package net.eduard.score;


import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

	public static Main instance;

	public void onEnable() {

		Main.instance = this;
		new ScoreMain().setup();
	}

}
