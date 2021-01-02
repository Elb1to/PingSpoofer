package me.elb1to.spoofer;

import lombok.Getter;
import me.elb1to.spoofer.commands.PingCommand;
import me.elb1to.spoofer.hooks.PlaceholderAPI;
import me.elb1to.spoofer.utils.ChatUtils;
import me.elb1to.spoofer.utils.command.CommandFramework;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Elb1to
 * Project: PingSpoofer
 * Date: 1/1/2021 @ 8:38 PM
 */
@Getter
public final class PingSpoofer extends JavaPlugin {

    @Getter
    private static PingSpoofer instance;
    private CommandFramework commandFramework;

    /*
     * DISCLAIMER:
     * I haven't tested this plugin because I honestly cba to do so,
     * regardless of that, the plugin should work just fine.
     *
     * I'll maybe update this later on to provide a more natural ping spoofing
     *
     * suckondeez B)
     */

    @Override
    public void onEnable() {
        instance = this;
        commandFramework = new CommandFramework(this);
        commandFramework.registerCommands(new PingCommand());

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new PlaceholderAPI().register();
            Bukkit.getConsoleSender().sendMessage(ChatUtils.translate("&aPlaceholder API expansion successfully registered."));
        }
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
