package me.sfiguz7.netherenough.utils;

import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.sfiguz7.netherenough.NetherEnough;

public class Utils {

    private Utils() {
    }

    public static void teleportToWorld(Player p, World world) {
        if (world != null) {
            Location loc = p.getLocation();
            double x = loc.getX();
            double z = loc.getX();
            Location destination = new Location(world, x, world.getHighestBlockYAt((int) x, (int) z), z);
            p.teleport(destination);
        } else {
            p.sendMessage(ChatColor.LIGHT_PURPLE + "深渊幻章 > " + ChatColor.RED + "指定的 " +
                    "世界不存在!");
        }
    }

    public static boolean chance(double threshold) {
        return ThreadLocalRandom.current().nextDouble(100) < threshold;
    }

    public static boolean isNEWorld(World world) {
        return NetherEnough.getRegistry().getNeWorlds().containsKey(world.getUID());
    }
}
