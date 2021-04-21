package by.jrr.start.rysard_poplavskij.login_user_service;

public class UserLoginService {
    public boolean login(User user, String password){
        if (user.getPassword().equals(password) && !user.userIsBlocked()) {
            user.resetNumberOfAttempts();
            return true;
        }
        else {
            if (!user.userIsBlocked()) {
                user.decreaseLoginAttempts();
                if (user.getLoginAttempts() < 1) {
                    user.blockUser();
                }
            }
            return false;
        }

    }
}
