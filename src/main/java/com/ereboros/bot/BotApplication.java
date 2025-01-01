package com.ereboros.bot;

import com.ereboros.bot.config.BotConfig;
import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BotApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BotApplication.class, args);
		BotConfig configuration = ctx.getBean(BotConfig.class);
		JDA api = JDABuilder.createDefault(configuration.getToken()).build();
	}

}
