package com.github.beastyboo;

import org.bukkit.plugin.java.JavaPlugin;

public class OGMFactionsPluginLoader extends JavaPlugin implements OGMFactionsPlugin{

    private ModuleCentral central;

    @Override
    public synchronized void onEnable() {
        central = new ModuleCentral(this);
        central.launch();
    }

    @Override
    public synchronized void onDisable() {
        central.close();
        central = null;
    }

    @Override
    public OGMFactionsAPI getAPI() {
        return central;
    }
}
