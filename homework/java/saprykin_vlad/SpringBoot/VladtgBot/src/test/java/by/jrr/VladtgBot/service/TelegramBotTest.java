package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.VladtgBotApplication;
import by.jrr.VladtgBot.VladtgBotApplicationTests;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

class TelegramBotTest extends VladtgBotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;

//    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBot.onUpdateReceived(update);
    }

//    @Test
    void sendMessage() throws TelegramApiException {
        SendMessage message = new SendMessage();
        message.setChatId(447069249L);
        message.setText("Hello I'm bot");
        telegramBot.execute(message);
    }
}