package com.statically.plugins.conquest.empires;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public interface Empire {

    public Empire getEmpire();

    public byte hasPlayer(Player p);

    public Location getOrigin();
}
