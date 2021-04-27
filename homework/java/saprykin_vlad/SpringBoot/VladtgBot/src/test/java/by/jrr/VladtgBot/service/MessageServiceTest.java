package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.VladtgBotApplicationTests;
import by.jrr.VladtgBot.config.Mapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest extends VladtgBotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    private SendMessage actual;
    private SendMessage expected;

    @Test
    void onStartReceived() throws IOException, TelegramApiException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        actual = messageService.onUpdateReceived(update);
        expected = setMessage("Hello");
        assertEquals(expected,actual);
    }

    @Test
    void onHelpReceived() throws IOException, TelegramApiException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        actual = messageService.onUpdateReceived(update);
        expected = setMessage("Our commands:\n/help - see all commands\n/settings - set smth");
        assertEquals(expected,actual);
    }

    @Test
    void onSettingsReceived() throws IOException, TelegramApiException {
        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
        actual = messageService.onUpdateReceived(update);
        expected = setMessage("Settings");
        assertEquals(expected,actual);
    }

    @Test
    void onUnknownReceived() throws IOException, TelegramApiException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        actual = messageService.onUpdateReceived(update);
        expected = setMessage("See /help");
        assertEquals(expected,actual);
    }

    private SendMessage setMessage(String text) throws TelegramApiException {
        SendMessage message = new SendMessage();
        message.setChatId(447069249L);
        message.setText(text);
        return message;
    }
}