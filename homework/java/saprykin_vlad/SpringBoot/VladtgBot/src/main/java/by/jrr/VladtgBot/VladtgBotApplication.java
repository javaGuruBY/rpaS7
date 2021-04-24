package by.jrr.VladtgBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class VladtgBotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(VladtgBotApplication.class, args);
	}

}
