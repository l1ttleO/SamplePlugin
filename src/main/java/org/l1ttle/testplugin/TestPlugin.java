package org.l1ttle.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "Ping! We are enabling");
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Pong! We are disabling");
        // Plugin shutdown logic
    }
}
