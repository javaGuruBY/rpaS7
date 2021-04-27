package by.jrr.VladtgBot.service;

import by.jrr.VladtgBot.BotCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageService {

    @Autowired
    TelegramBot telegramBot;

    public void sendMessage(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            telegramBot.execute(sendMessage);
        }
        catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public BotCommand getCommand(Update update) {
        if (update != null && update.hasMessage()) {
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                String msgText = message.getText();
                if (msgText.startsWith(BotCommand.HELP.getCommand())) {
                    return BotCommand.HELP;
                } else if (msgText.startsWith(BotCommand.START.getCommand())) {
                    return BotCommand.START;
                } else if (msgText.startsWith(BotCommand.QUESTIONNAIRE.getCommand())) {
                    return BotCommand.QUESTIONNAIRE;
                } else if (msgText.startsWith(BotCommand.RESULT.getCommand())) {
                    return BotCommand.RESULT;
                } else if (msgText.startsWith(BotCommand.EXITQ.getCommand())) {
                    return BotCommand.EXITQ;
                }
            }
        }
        return BotCommand.NONE;
    }


}
