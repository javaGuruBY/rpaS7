package by.jrr.VladtgBot.processors;

import org.springframework.stereotype.Service;

@Service
public class QuestionnaireProcessor implements Processor{
    @Override
    public String run() {
        return "Мы подберём тебе настольную игру :)\n" +
                "Бот будет присылать тебе вопросы, на которые можно отвечать командами /answerN (N - цифра ответа)\n" +
                "Ты всегда можешь остановить опрос командой /exitq";
    }
}
