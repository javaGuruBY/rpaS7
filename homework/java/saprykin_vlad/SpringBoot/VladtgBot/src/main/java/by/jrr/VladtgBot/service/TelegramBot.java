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

    static final ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

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
    MessageService messageService;

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
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if (msg.equals("/start")){
            // requesttdispatcher
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Анкета");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Нажми 'Анкета'";
        }
        if (msg.equals("Анкета")) {
            //requesttdispatcher
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Начать");
            replyKeyboardMarkup.setKeyboard(keyboard);

            return "Начнем?";
        }
        if (msg.equals("Начать")){
            // Первый вопрос
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Да");
            keyboardFirstRow.add("Нет");
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Ваш выбор...";
            // переход ко 2 вопросу
        }
        if (msg.equals("Да") || msg.equals("Нет")){
            // Второй вопрос
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("В голове");
            keyboardFirstRow.add("В компании");
            return "Ваш выбор...";
            // переход к 3 вопросу
        }
        if (msg.equals("В голове") || msg.equals("В компании")){
            // Третий вопрос
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Да");
            keyboardFirstRow.add("Нет");
            return "Ваш выбор...";
            // переход к 4 вопросу
        }
        if (msg.equals("Да") || msg.equals("Нет")){
            // Четвертый вопрос
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardSecondRow.clear();
            keyboardFirstRow.add("Уступчивый");
            keyboardFirstRow.add("Агрессивный");
            keyboardSecondRow.add("Общительный");
            keyboardSecondRow.add("Расчетливый");
            return "Ваш выбор...";

            // Результат
        }

        return msg;
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
