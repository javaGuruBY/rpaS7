package by.jrr.VladtgBot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    @Autowired
    RequestDispatcher requestDispatcher;

    static final ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    KeyboardService keyboardService;

    @Override
    public void onUpdateReceived(Update update) {
        requestDispatcher.dispatch(update);
        saveJson(update);

        keyboardService.sendMsg(update);

    }




    private void saveJson(Update update) {
        try {
            objectMapper.writeValue(new File("src/test/resources/update.json"), update);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }


}
