package com.github.beastyboo;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ModuleCentral implements OGMFactionsAPI{

    private final JavaPlugin plugin;
    private final Logger logger;

    public ModuleCentral(JavaPlugin plugin) {
        this.plugin = plugin;
        logger = plugin.getLogger();
    }

    void launch() {

    }

    void close() {

    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public Logger getLogger() {
        return logger;
    }
}
