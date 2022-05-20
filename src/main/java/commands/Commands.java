package commands;

import core.Bot;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Commands extends ListenerAdapter {
    private Bot bot;

    public Commands(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        // If from outside of discord server or from a bot, ignore
        if(!event.isFromGuild() || event.getAuthor().isBot()) return;

        // Breaks message into arguments
        String[] args = event.getMessage().getContentRaw().split(" ");

        // Example Command
        if(args[0].equalsIgnoreCase(bot.getConfig().get("PREFIX") + "testcommand")) {
            event.getChannel().sendMessage("Testing...").queue();
        }
    }
}
