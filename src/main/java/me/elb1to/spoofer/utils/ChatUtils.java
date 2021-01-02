package me.elb1to.spoofer.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ChatUtils {

    public static final String SB_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "----------------------";
    public static final String MENU_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "------------------------";
    public static final String CHAT_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "------------------------------------------------";

    public static String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static List<String> translate(List<String> lines) {
        List<String> strings = new ArrayList<>();

        for (String line : lines) {
            strings.add(ChatColor.translateAlternateColorCodes('&', line));
        }

        return strings;
    }
}
