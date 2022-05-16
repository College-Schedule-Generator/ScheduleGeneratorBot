package core;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Bot {
    private JDA api;

    public Bot() throws LoginException, InterruptedException {
        api = JDABuilder.createDefault("INSERT_TOKEN_HERE").build().awaitReady();
    }

    public static void main(String[] args) throws LoginException, InterruptedException {
        new Bot();
    }
}
