package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.constants.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardServiceTest {

    @Test
    public void questionare() {
        String answer = "Да, хочу выбрать";

        KeyboardService keyboardService = new KeyboardService();

        var row = new KeyboardRow();
        row.add("Уступчивый");


        ReplyKeyboardMarkup expectedReplyKeyboardMarkup = new ReplyKeyboardMarkup();
        expectedReplyKeyboardMarkup.setKeyboard(List.of(row));
        ReplyKeyboardMarkup replyKeyboardMarkup
                = keyboardService.getFullKeyBoard(Question.getByCommand(answer));

        assertEquals(expectedReplyKeyboardMarkup, replyKeyboardMarkup);
    }

}
