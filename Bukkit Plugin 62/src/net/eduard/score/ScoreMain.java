
package net.eduard.score;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.Map.Entry;

import net.eduard.api.java8_class.Eduard;


public class ScoreMain extends Eduard implements Listener
{

	public ScoreMain(){

		super(Main.instance);
	}

	public void setup() {
		setEvent( this );
		new Time( new Runnable(	) {
			
			@Override
			public void run() {
				for (Entry< String , Scoreboards > score : scores.entrySet()) {
					Player p = getPlayer( score.getKey() );
					score.getValue().setSlot( 6 , "§3Kills: §e" + p.getStatistic( Statistic.PLAYER_KILLS ) );
					score.getValue().setSlot( 4 , "§3Deaths: §e" + p.getStatistic( Statistic.DEATHS ) );
				}
				
			}
		} , 1 , -1 );
		
		
		
	}
	public HashMap< String , Scoreboards > scores = new HashMap<>();
	
	@EventHandler
	public void PlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Scoreboards score = new Scoreboards();
		score.setSize( 10 );
		score.setName( "§6§lSky§f§lLegend" );
		score.setSlot( 8 , p.getName() );
		score.setSlot( 6 , "§3Kills: §e" + p.getStatistic( Statistic.PLAYER_KILLS ) );
		score.setSlot( 4 , "§3Deaths: §e" + p.getStatistic( Statistic.DEATHS ) );
		score.show( p );
		scores.put( p.getName() , score );
	}
}
