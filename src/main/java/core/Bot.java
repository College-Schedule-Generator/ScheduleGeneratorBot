package core;

import commands.Commands;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import utils.Config;

import javax.security.auth.login.LoginException;

public class Bot {
    private JDA api;

    private Config config;

    public Bot() throws LoginException, InterruptedException {
        config = new Config();

        api = JDABuilder.createDefault(getConfig().get("TOKEN"))
                .addEventListeners(new Commands(this))
                .build().awaitReady();
    }

    public static void main(String[] args) throws LoginException, InterruptedException {
        new Bot();
    }

    public Config getConfig() {
        return config;
    }
}
