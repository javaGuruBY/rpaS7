package by.jrr.VladtgBot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface GameChooser {

     void addFamilyPoints();
     void addWarPoints();
     void addPartyPoints();
     void addEconomyPoints();
}
