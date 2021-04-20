package io.github.denhock.task1.service;

import io.github.denhock.task1.been.User;

public class LoginService {

    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
        return false;
    }

    private void updateUserStatus(User user, boolean result) {
        if (result) {
            restoreAttempt(user);
        } else {
            reduceLoginAttempt(user);
            blockIfLoginAttemptExceeded(user);
        }
    }

    private void blockIfLoginAttemptExceeded(User user) {
        if (user.getLoginAttempt() == 0) {
            blockUser(user);
        }
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempt(User user) {
        user.setLoginAttempt(user.getLoginAttempt() - 1);
    }

    private void blockUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempt(User user) {
        user.setLoginAttempt(3);
    }
}
