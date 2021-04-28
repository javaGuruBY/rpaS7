package by.jrr.VladtgBot.processors;

import by.jrr.VladtgBot.constants.BotCommand;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class HelpProcessor implements Processor{
    @Override
    public String run() {
        return Arrays.stream(BotCommand.values())
                .map(a -> String.format("%s - %s", a.getCommand(), a.getDesc()))
                .collect((Collectors.joining("\n")));
    }
}
