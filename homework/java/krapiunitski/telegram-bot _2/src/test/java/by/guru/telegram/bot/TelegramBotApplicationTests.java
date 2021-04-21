import Mapper;
import MessageService;
import TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegramBotApplicationTests {

	@Test
	void contextLoads() {
	}

}
