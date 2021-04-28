package by.jrr.VladtgBot.processors;

import by.jrr.VladtgBot.service.KeyboardService;
import by.jrr.VladtgBot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
