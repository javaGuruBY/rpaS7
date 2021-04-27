package by.jrr.VladtgBot.processors;

import by.jrr.VladtgBot.PointCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultProcessor implements Processor{
    @Autowired
    PointCounter pointCounter;

    @Override
    public String run() {
        return pointCounter.chooseGame();
    }
}
