package by.jrr.VladtgBot;

import by.jrr.VladtgBot.config.Mapper;
import by.jrr.VladtgBot.service.MessageService;
import by.jrr.VladtgBot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class VladtgBotApplicationTests {

	@Test
	void contextLoads() {
	}

}
