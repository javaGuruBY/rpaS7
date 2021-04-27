package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.PointCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameChooser {

    @Autowired
    PointCounter pointCounter;

    public void addFamilyPoints(){
        pointCounter.setFamilyPoints(pointCounter.getFamilyPoints() + 1);
    }

    public void addWarPoints(){
        pointCounter.setWarPoints(pointCounter.getWarPoints() + 1);
    }

    public void addPartyPoints(){
        pointCounter.setPartyPoints(pointCounter.getPartyPoints() + 1);
    }

    public void addEconomyPoints(){
        pointCounter.setEconomyPoints(pointCounter.getEconomyPoints() + 1);
    }

}
