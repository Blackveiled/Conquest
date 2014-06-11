package com.statically.plugins.conquest.players;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class PlayerManager implements Listener {

    private class PlayerLoader {

        byte[] bytes = {0b00000000, 0b00000001, 0b00000010, 0b00000011, 0b00000100, 0b00000101, 0b00000110, 0b00000111, 0b00001000, 0b00001001, 0b00001010,
            0b00001011, 0b00001100, 0b00001101, 0b00001110, 0b00001111, 0b00010000, 0b00010001, 0b00010010, 0b00010011, 0b00010100, 0b00010101, 0b00010111,
            0b00011000, 0b00011001, 0b00011010, 0b00011011, 0b00011100, 0b00011101, 0b00011110, 0b00011111, 0b00100000, 0b00100001, 0b00100010, 0b00100011};
        char[] chars = {0b00000000, 0b00000001, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '@'};

        private PlayerLoader(String name) throws IOException, FileNotFoundException {
            File file = new File("\\Conquest\\players\\name.dat");
            file.createNewFile();
            FileInputStream stream = new FileInputStream(file);
            while (stream.read() != -1) {

            }
        }

    }

    private class PlayerData {

        private PlayerData(UUID uuid) {
            this.uuid = uuid.toString();
        }

        private final String uuid;

        public Player getEntity() {
            return Bukkit.getPlayer(UUID.fromString(uuid));
        }

    }

    /**
     * Initiate the PlayerManager class.
     */
    public PlayerManager() {

    }

    public void onJoinServer(PlayerJoinEvent e) {

    }
}
