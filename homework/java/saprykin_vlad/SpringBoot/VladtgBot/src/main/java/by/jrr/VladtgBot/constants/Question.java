package by.jrr.VladtgBot.constants;

public enum Question {
    CHOOSE("Да, хочу выбрать"),
    UNKNOWN("НИПАНЯТНА");

    Question(String question) {
        this.question = question;
    }

    String question;

    public String getQuestion() {
        return question;
    }

    public static Question getByCommand(String command) {
        switch (command) {
            case "Да, хочу выбрать":
                return Question.CHOOSE;
            default:
                return Question.UNKNOWN;

        }
    }
}
