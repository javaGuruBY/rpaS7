package by.jrr.VladtgBot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

@Service
public class KeyboardService {

    static final ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    private long chatId;

    String getMessage(String msg) {
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if (msg.equals("/start")){
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


}
