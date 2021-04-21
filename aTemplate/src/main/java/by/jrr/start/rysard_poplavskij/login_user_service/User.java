package by.jrr.start.rysard_poplavskij.login_user_service;

public class User {
    private String login;
    private String password;
    private boolean isBlocked = false;
    private int loginAttempts = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void blockUser() {
        this.isBlocked = true;
    }
    public boolean userIsBlocked() {
        return isBlocked;
    }

    public void resetNumberOfAttempts() {
        this.loginAttempts = 3;
    }

    public void decreaseLoginAttempts() {
        this.loginAttempts --;
    }
}
