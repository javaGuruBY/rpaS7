package by.jrr.VladtgBot.constants;

public enum BotCommand{
    START("/start", "Начало, запуск"),
    HELP("/help", "Спавка о командах"),
    QUESTIONNAIRE("/questionnaire", "Анкета"),
    RESULT("/result", "Посмотреть результать "),
    EXITQ("/exitq", "Выход как в вим"),
    SHOWALL("/showall", "Все настолки"),
    SHOWNASTOLKIBY("/shownastolkiby", "В Магазин"),
    NONE("/none", "Ничога");

    String command;
    String desc;

    BotCommand(String command, String  desc) {
        this.command = command;
        this.desc = desc;
    }

    public String getCommand() {
        return command;
    }

    public String getDesc() {
        return desc;
    }
}
