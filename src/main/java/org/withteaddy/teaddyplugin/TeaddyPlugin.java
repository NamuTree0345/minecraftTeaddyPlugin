package org.withteaddy.teaddyplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TeaddyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("plugin is enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println("plugin is disabled!");
    }
}
