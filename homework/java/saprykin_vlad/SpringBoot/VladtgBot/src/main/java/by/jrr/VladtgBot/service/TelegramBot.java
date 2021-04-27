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
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    @Autowired(required = true)
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    private long chatId;

    @Autowired
    RequestDispatcher requestDispatcher;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void onUpdateReceived(Update update) {
        requestDispatcher.dispatch(update);
        saveJson(update);

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chatId = update.getMessage().getChatId();

        String text = update.getMessage().getText();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        try {
            sendMessage.setText(getMessage(text));
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private String getMessage(String msg) {
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if (msg.equals("/start")){
            keyboard.clear();
            keyboardFirstRow.add("Анкета");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выбрать...";
        }
        if (msg.equals("Анкета")){
            keyboard.clear();
            keyboardFirstRow.add("Да");
            keyboardFirstRow.add("Нет");
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выбрать...";
            // переход ко 2 вопросу
        }
        if (msg.equals("Да") || msg.equals("Нет")){
            keyboard.clear();
            keyboardFirstRow.add("В голове");
            keyboardFirstRow.add("В компании");
            return "Выбрать...";
        }
        return null;
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
