package com.guppystudios.yeet;

import org.bukkit.plugin.java.JavaPlugin;

public final class Yeet extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Yeet has been enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Yeet has been disabled.");
    }
}
