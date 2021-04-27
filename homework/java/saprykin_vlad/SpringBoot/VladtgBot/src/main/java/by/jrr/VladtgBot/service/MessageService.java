package by.jrr.VladtgBot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public SendMessage onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        if (update != null) {
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                sendMessage.setChatId(message.getChatId());
                String magText = message.getText();
                if (magText.equals("/start")) {
                    return sendMessage.setText("Hello");
                } else if (magText.equals("/help")) {
                    return sendMessage.setText("Our commands:\n/help - see all commands\n/settings - set smth");
                } else if (magText.equals("/settings")) {
                    return sendMessage.setText("Settings");
                }
            }
            return sendMessage.setText("See /help");
        }
        return null;
    }
}
