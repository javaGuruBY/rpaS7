package by.jrr.VladtgBot.processors;

import by.jrr.VladtgBot.service.KeyboardService;
import by.jrr.VladtgBot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

import static by.jrr.VladtgBot.service.KeyboardService.replyKeyboardMarkup;

@Service
public class QuestionnaireProcessor implements Processor {

    @Autowired
    KeyboardService keyboardService;

    @Autowired
    MessageService messageService;

    @Override
    public String run() {
        return "Мы подберём тебе настольную игру :)\n" +
                "Бот будет присылать тебе вопросы, на которые можно отвечать командами /answerN (N - цифра ответа)\n" +
                "Ты всегда можешь остановить опрос командой /exitq";
    }



}
