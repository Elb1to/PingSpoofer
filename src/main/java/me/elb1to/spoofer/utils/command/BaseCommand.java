package me.elb1to.spoofer.utils.command;

import me.elb1to.spoofer.PingSpoofer;

/**
 * Created by Elb1to
 * Project: PingSpoofer
 * Date: 1/1/2021 @ 8:40 PM
 */
public abstract class BaseCommand {
    public PingSpoofer plugin = PingSpoofer.getInstance();

    public BaseCommand() {
        this.plugin.getCommandFramework().registerCommands(this);
    }

    public abstract void onCommand(CommandArgs cmd);
}
