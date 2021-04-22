package by.jrr.start.service;

import by.jrr.start.bean.User;

public class LoginService {
    public boolean chekUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public boolean login(User user, String login, String password) {
        return user.getLogin().equals(login) && chekUserPassword(user, password);
    }
}
