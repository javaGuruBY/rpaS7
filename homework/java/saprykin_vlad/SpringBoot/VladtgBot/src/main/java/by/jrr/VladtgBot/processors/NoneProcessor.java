package by.jrr.VladtgBot.processors;

import org.springframework.stereotype.Service;

@Service
public class NoneProcessor implements Processor{
    @Override
    public String run() {
        return "Неизвестная команда";
    }
}
