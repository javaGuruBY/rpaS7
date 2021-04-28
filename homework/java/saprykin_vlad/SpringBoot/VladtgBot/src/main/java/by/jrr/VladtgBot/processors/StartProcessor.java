package by.jrr.VladtgBot.processors;

import by.jrr.VladtgBot.constants.BotCommand;
import org.springframework.stereotype.Service;

@Service
public class StartProcessor implements Processor{
    @Override
    public String run() {
        return String.format("Привет!\n" +
                "Наш бот поможет выбрать настольные игры, которые будут подходить именно тебе!\n" +
                "Список команд можно посмотреть с помощью %s - %s",
                BotCommand.HELP.getCommand(),
                BotCommand.HELP.getDesc());
    }
}
