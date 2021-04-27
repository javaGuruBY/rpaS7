package by.jrr.VladtgBot.processors;

import org.springframework.stereotype.Service;

@Service
public class StartProcessor implements Processor{
    @Override
    public String run() {
        return "Привет!\n" +
                "Наш бот поможет выбрать настольные игры, которые будут подходить именно тебе!\n" +
                "Список команд можно посмотреть с помощью /help";
    }
}
