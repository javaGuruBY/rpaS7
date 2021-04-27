package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.BotCommand;
import by.jrr.VladtgBot.processors.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;


@Service
public class RequestDispatcher {
    @Autowired
    MessageService messageService;
    @Autowired
    HelpProcessor helpProcessor;
    @Autowired
    QuestionnaireProcessor questionnaireProcessor;
    @Autowired
    StartProcessor startProcessor;
    @Autowired
    NoneProcessor noneProcessor;
    @Autowired
    ResultProcessor resultProcessor;

    public void dispatch(Update update) {
        switch (messageService.getCommand(update)) {
            case START:
                messageService.sendMessage(update.getMessage(), startProcessor.run());
                break;
            case HELP:
                messageService.sendMessage(update.getMessage(), helpProcessor.run());
                break;
            case QUESTIONNAIRE:
                messageService.sendMessage(update.getMessage(), questionnaireProcessor.run());
                break;
            case RESULT:
                messageService.sendMessage(update.getMessage(), resultProcessor.run());
                break;
            case NONE:
                messageService.sendMessage(update.getMessage(), noneProcessor.run());
                break;
        }
    }



}