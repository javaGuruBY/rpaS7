package by.jrr.VladtgBot.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowNastolkiByProcessor implements Processor{
    @Autowired

    @Override
    public String run() {
        return "Вот все настольные игры с сайта";
    }
}
