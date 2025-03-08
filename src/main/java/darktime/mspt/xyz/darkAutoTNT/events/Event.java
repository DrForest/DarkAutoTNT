package darktime.mspt.xyz.darkAutoTNT.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Event implements Listener {
    @EventHandler
    public void BlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType().equals(Material.TNT)) {
            event.getBlockPlaced().setType(Material.AIR);
            event.getBlockPlaced().getWorld().spawnEntity(event.getBlockPlaced().getLocation(), EntityType.PRIMED_TNT);
        }
    }
}
