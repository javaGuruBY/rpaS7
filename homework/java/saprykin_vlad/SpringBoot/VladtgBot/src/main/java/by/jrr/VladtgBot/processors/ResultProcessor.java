package by.jrr.VladtgBot.processors;

import org.springframework.stereotype.Service;

@Service
public class ResultProcessor implements Processor{


    @Override
    public String run() {
        return "choose game";
    }
}
