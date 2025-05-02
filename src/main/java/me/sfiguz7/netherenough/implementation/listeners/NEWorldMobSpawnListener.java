package me.sfiguz7.netherenough.implementation.listeners;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import javax.annotation.Nonnull;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import static org.bukkit.event.EventPriority.LOWEST;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.sfiguz7.netherenough.NetherEnough;
import me.sfiguz7.netherenough.generation.worlds.NEWorld;
import me.sfiguz7.netherenough.utils.Utils;

public class NEWorldMobSpawnListener implements Listener {

    private final List<EntityType> allowedEntities = Arrays.asList(
            EntityType.PHANTOM, EntityType.HOGLIN, EntityType.POLAR_BEAR
    );

    public NEWorldMobSpawnListener(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = LOWEST)
    public void onVanillaMobSpawn(@Nonnull EntitySpawnEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof LivingEntity) {
            if (allowedEntities.contains(e.getEntity().getType())) {
                return;
            }
            World world = e.getLocation().getWorld();
            if (world == null) {
                NetherEnough.getInstance().getLogger().log(Level.SEVERE, "一个实体在一个空世界中生成了!");
            } else if (Utils.isNEWorld(world)) {
                e.setCancelled(true);
                Location loc = e.getLocation();
                NEWorld neWorld = NetherEnough.getRegistry().getNeWorlds().get(world.getUID());
                loc.getWorld().spawnEntity(loc, neWorld.getSpawningEntity());
            }
        }
    }
}
