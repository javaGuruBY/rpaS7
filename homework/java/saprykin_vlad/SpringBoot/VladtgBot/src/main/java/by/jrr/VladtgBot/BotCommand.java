package by.jrr.VladtgBot;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public enum BotCommand {
    START("/start"),
    HELP("/help"),
    QUESTIONNAIRE("/questionnaire"),
    RESULT("/result"),
    EXITQ("/exitq"),
    SHOWALL("/showall"),
    NONE("/none");

    String command;

    BotCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}