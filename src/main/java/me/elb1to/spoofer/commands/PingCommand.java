package me.elb1to.spoofer.commands;

import me.elb1to.spoofer.utils.ChatUtils;
import me.elb1to.spoofer.utils.command.BaseCommand;
import me.elb1to.spoofer.utils.command.Command;
import me.elb1to.spoofer.utils.command.CommandArgs;
import me.elb1to.spoofer.utils.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: PingSpoofer
 * Date: 1/1/2021 @ 8:44 PM
 */
public class PingCommand extends BaseCommand {
    @Command(name = "ping", aliases = {"latency", "connection", "ms"})

    @Override
    public void onCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String[] args = cmd.getArgs();

        if (args.length == 0) {
            player.sendMessage(ChatUtils.translate("&aYour ping: &o" + (PlayerUtils.getPing(player) - PlayerUtils.randomReductionVal(1, 30))));
            player.sendMessage(ChatUtils.translate("&c[Debug] Real/Spoofed values &7&l| &4&o" + PlayerUtils.getPing(player) + " ~ " + PlayerUtils.randomReductionVal(1, 30)));
            return;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (args.length == 1) {
            if (target != null) {
                player.sendMessage(ChatUtils.translate("&a" + target.getName() + "'s ping: &o" + (PlayerUtils.getPing(target) - PlayerUtils.randomReductionVal(1, 30))));
            } else {
                player.sendMessage(ChatUtils.translate("&cPlayer not found."));
            }
        }
    }
}
