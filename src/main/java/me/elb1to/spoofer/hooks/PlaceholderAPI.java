package me.elb1to.spoofer.hooks;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.elb1to.spoofer.utils.PlayerUtils;
import org.bukkit.entity.Player;

/**
 * Created by Elb1to
 * Project: PingSpoofer
 * Date: 1/1/2021 @ 9:12 PM
 */
public class PlaceholderAPI extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "ping_spoofer";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String getAuthor() {
        return "Elb1to";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        if (identifier.equalsIgnoreCase("ping")) {
            /*
             * This is how the placeholder is used -> %ping_spoofer_ping%
             * Example: Ping: %ping_spoofer_ping%
             */
            return String.valueOf(PlayerUtils.getPing(player) - PlayerUtils.randomReductionVal(1, 30));
        }

        return null;
    }
}
