package darktime.mspt.xyz.darkAutoTNT;

import darktime.mspt.xyz.darkAutoTNT.events.Event;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("DarkAutoTNT loaded, version - 1.0");
        System.out.println("Coded by - DrForest");
        System.out.println("https://github.com/DrForest/");

        Bukkit.getPluginManager().registerEvents(new Event(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
