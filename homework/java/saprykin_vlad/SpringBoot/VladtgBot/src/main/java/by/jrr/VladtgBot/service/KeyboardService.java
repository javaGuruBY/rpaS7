package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.constants.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

@Service
public class KeyboardService {
//
//    @Autowired
//    MessageService messageService;
//
//    @Autowired
//    TelegramBot telegramBot;

    private long chatId;

    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public ReplyKeyboardMarkup getKeyBoard(Message msg) {
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        String question = null;

        switch (msg.getText()) {
            case "/questionnaire":
                question = "Знаком ли с настольными играми?";
                setQuestionareMenu(keyboard, keyboardFirstRow, replyKeyboardMarkup);
                break;
            case "Начать":
                question = "Игра происходит в голове или в кругу игроков?";
                setQuestionareMenu(keyboard, keyboardFirstRow, replyKeyboardMarkup);
                break;
            case "Да, в кругу игроков":
                question = "Игра происходит в голове или в кругу игроков?";
                setStartKeyboardMenu(keyboard, keyboardFirstRow, replyKeyboardMarkup);
            case "В компании":
                setYesMenuKeyboard(keyboard, keyboardFirstRow, "В голове", "В компании");
                break;
            case "В голове":
                setYesMenuKeyboard(keyboard, keyboardFirstRow, "Да", "Нет");
                break;
            case "Нет":
                setFinalChooseMenu(keyboard, keyboardFirstRow, keyboardSecondRow);
                break;

        }

//        messageService.sendMessage(msg,question);
        return replyKeyboardMarkup;
    }

    private void setFinalChooseMenu(ArrayList<KeyboardRow> keyboard, KeyboardRow keyboardFirstRow, KeyboardRow keyboardSecondRow) {
        keyboard.clear();
        keyboardFirstRow.clear();
        keyboardSecondRow.clear();
        keyboardFirstRow.add("Уступчивый");
        keyboardFirstRow.add("Агрессивный");
        keyboardSecondRow.add("Общительный");
        keyboardSecondRow.add("Расчетливый");
    }

    private void setYesMenuKeyboard(ArrayList<KeyboardRow> keyboard, KeyboardRow keyboardFirstRow, String s, String s2) {
        keyboard.clear();
        keyboardFirstRow.clear();
        keyboardFirstRow.add(s);
        keyboardFirstRow.add(s2);
    }

    private void setStartKeyboardMenu(ArrayList<KeyboardRow> keyboard, KeyboardRow keyboardFirstRow, ReplyKeyboardMarkup replyKeyboardMarkup) {
        setYesMenuKeyboard(keyboard, keyboardFirstRow, "Да", "Нет");
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    private void setQuestionareMenu(ArrayList<KeyboardRow> keyboard, KeyboardRow keyboardFirstRow, ReplyKeyboardMarkup replyKeyboardMarkup) {
        keyboard.clear();
        keyboardFirstRow.clear();
        keyboardFirstRow.add("Начать");
        keyboard.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public ReplyKeyboardMarkup getFullKeyBoard(Question question) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        switch (question) {
            case CHOOSE:
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow keyboardFirstRow = new KeyboardRow();
                keyboardFirstRow.add("Уступчивый");
                keyboard.add(keyboardFirstRow);
                replyKeyboardMarkup.setKeyboard(keyboard);
                break;
        }
        return replyKeyboardMarkup;
    }
}
