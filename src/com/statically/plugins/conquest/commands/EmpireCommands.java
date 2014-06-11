package com.statically.plugins.conquest.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class EmpireCommands implements CommandExecutor {

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) {
            s.sendMessage("You cannot use this command while not in-game.");
            return false;
        }
        if (args[0].length() > 0) {
            switch (args[0].toLowerCase()) {
                case "new":
                    if (s.hasPermission("conquest.new")) {

                        break;
                    }
                    s.sendMessage(ChatColor.RED + "You do not have access for this command.");
                    break;
                case "view":
                    break;
                case "list":
                    break;
                case "disband":
                    break;
                case "hiscores":
                    break;
                case "map":
                    break;
            }
            s.sendMessage(ChatColor.RED + "Invalid argument entered.");
            s.sendMessage(ChatColor.GRAY + "Subcommands: NEW, VIEW, LIST, DISBAND, HISCORES, MAP");
        }
        return true;
    }
}
