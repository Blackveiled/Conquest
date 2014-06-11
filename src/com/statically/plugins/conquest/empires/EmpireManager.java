package com.statically.plugins.conquest.empires;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class EmpireManager {

    private List<Number> empires = new ArrayList<>();

    public enum EmpireType implements Empire {

        EMPIRE("Empire"),
        CONTESTEDTERRITORY("Contested"),
        NEUTRAL("Neutral"),
        PROTECTEDZONE("Protected");

        private short id;
        private short rank;
        private Location origin;
        private String name;
        private List<String> players = new ArrayList<>();
        private List<String> ranks = new ArrayList<>();

        private EmpireType(String name) {
            this.name = name;

            ranks.add("Leader");
            ranks.add("Officer");
            ranks.add("Soldier");
            ranks.add("Peasant");
            ranks.add("Traitor");
        }

        @Override
        public Empire getEmpire() {
            return null;
        }

        @Override
        public byte hasPlayer(Player p) {
            byte bool = 0x0;
            for (short s = 0; s < players.size(); s++) {
                if (players.contains(p.getName())) {
                    bool = 0x1;
                    break;
                }
            }
            return bool;
        }

        @Override
        public Location getOrigin() {
            return origin;
        }

    }

    public static boolean createEmpire(String name, String uuid) {
        return false;
    }

    public static boolean removeEmpire(String name) {
        return false;
    }

    public static boolean removeEmpire(short id) {
        return false;
    }

    public static boolean exists(String name) {
        return false;
    }

    public static Empire getEmpire(short id) {
        return null;
    }

}
