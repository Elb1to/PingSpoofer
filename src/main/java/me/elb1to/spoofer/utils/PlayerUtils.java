package me.elb1to.spoofer.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

/**
 * Created by Elb1to
 * Project: PingSpoofer
 * Date: 1/1/2021 @ 9:01 PM
 */
public class PlayerUtils {

    public static int getPing(Player player) {
        try {
            String version = Bukkit.getServer().getClass().getPackage().getName().substring(23);
            Class<?> craftPlayer = Class.forName("org.bukkit.craftbukkit." + version + ".entity.CraftPlayer");
            Object handle = craftPlayer.getMethod("getHandle", new Class[0]).invoke(player);
            return (Integer) handle.getClass().getDeclaredField("ping").get(handle);
        } catch (Exception e) {
            return -1;
        }
    }

    public static int randomReductionVal(int min, int max) {
        Random random = new Random();

        int realMin = Math.min(min, max);
        int realMax = Math.max(min, max);
        int exclusiveSize = realMax - realMin;

        return random.nextInt(exclusiveSize + 1) + min;
    }
}
