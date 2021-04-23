package by.jrr.start.service;

import by.jrr.start.bean.User;

public class LoginService {

    public boolean login(User user, String login, String password) {
        if (!user.isBlocked()) {
            if (!chekUserPassword(user, password)) {
                reduceLoginAttempts(user);
                blockUserWith0Attempts(user);
                return false;
            }
            return user.getLogin().equals(login);
        }
        return false;
    }

    public boolean chekUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    private void blockUserWith0Attempts(User user) {
        if (user.getLoginAttempts() == 0) {
            user.setBlocked(true);
        }
    }

}
