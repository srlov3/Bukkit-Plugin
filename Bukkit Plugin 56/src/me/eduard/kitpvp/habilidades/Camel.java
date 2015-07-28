
package me.eduard.kitpvp.habilidades;

import me.eduard.kitpvp.Kit;
import me.eduard.kitpvp.KitType;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Camel implements Listener
{

	@EventHandler
	public void CamelEvent( PlayerMoveEvent e ) {

		Player p = e.getPlayer();
		if ( Kit.hasKit( p , KitType.CAMEL ) ) {
			if ( e.getTo().getBlock().getRelative( BlockFace.DOWN ).getType() == Material.SAND ) {

				// Atere a força lembrando 0 = level 1 e 1 = level 2
				p.addPotionEffect( new PotionEffect( PotionEffectType.SPEED , 20 * 5 , 1 ) , true );
			}
		}
	}
}
