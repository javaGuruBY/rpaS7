package by.jrr.VladtgBot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static by.jrr.VladtgBot.service.KeyboardService.replyKeyboardMarkup;

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

    @Autowired
    MessageService messageService;

    @Override
    public void onUpdateReceived(Update update) {
        questionnaire(update);
        requestDispatcher.dispatch(update);
        //saveJson(update);
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

    public String questionnaire(Update udpate) {
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        Message msg = udpate.getMessage();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if (msg.getText().equals("/questionnaire")) {
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Начать");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Начнем?";
        }
        if (msg.getText().equals("Начать")) {
            messageService.sendMessage(msg, "Знаком ли с настольными играми?");
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Да");
            keyboardFirstRow.add("Нет");
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Ваш выбор...";
        }
        if (msg.getText().equals("Да")) {
            messageService.sendMessage(msg, "Игра происходит в голове или в кругу игроков?");
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("В голове");
            keyboardFirstRow.add("В компании");
            return "Ваш выбор...";
        }
        if (msg.getText().equals("В голове") || msg.equals("В компании")) {
            messageService.sendMessage(msg, "Нравятся ли игры связанные со словами?");
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Да");
            keyboardFirstRow.add("Нет");
            return "Ваш выбор...";
        }
        if (msg.getText().equals("Да") || msg.equals("Нет")) {
            messageService.sendMessage(msg, "Какое описание ближе к твоему характеру?");
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardSecondRow.clear();
            keyboardFirstRow.add("Уступчивый");
            keyboardFirstRow.add("Агрессивный");
            keyboardSecondRow.add("Общительный");
            keyboardSecondRow.add("Расчетливый");
            return "Ваш выбор...";
        }

        return msg.getText();
    }


}
