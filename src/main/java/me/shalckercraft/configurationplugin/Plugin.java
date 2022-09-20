package me.shalckercraft.configurationplugin;

import me.shalckercraft.configurationplugin.commands.Explode;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("explode").setExecutor(new Explode());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("printMessageFromConfig")) {
            Player player = (Player) sender;
            String food = getConfig().getString("Food");
            int number = getConfig().getInt("Number");
            boolean Boolean = getConfig().getBoolean("Boolean");
            String thirditem = getConfig().getStringList("FoodList").get(2);
            player.sendMessage(ChatColor.DARK_PURPLE + "The food in the config.yml is " + ChatColor.RED + food + number + Boolean + " - " + thirditem);
        } else if (command.getName().equals("setFood")) {
            getConfig().set("Food", "Shrimp");
        }


        return true;
    }
}
