package me.shalckercraft.configurationplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Explode implements CommandExecutor {

    private Plugin plugin = me.shalckercraft.configurationplugin.Plugin.getPlugin(me.shalckercraft.configurationplugin.Plugin.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        player.sendMessage(plugin.getConfig().getString("Food"));

        return true;
    }
}
