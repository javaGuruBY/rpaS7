package by.jrr.VladtgBot.processors;

import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor{
    @Override
    public String run() {
        return "Список доступных команд:\n" +
                "/help - просмотр списка команд\n" +
                "/questionnaire - подобрать настольную игру\n" +
                "/exitq - принудительно закончить опрос\n" +
                "/result - результаты опроса";
    }
}
