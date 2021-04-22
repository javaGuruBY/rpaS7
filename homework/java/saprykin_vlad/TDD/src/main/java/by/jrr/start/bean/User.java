package by.jrr.start.bean;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private int loginAttempts;
    private boolean isBlocked;

    public User() {
    }

    public User(String login, String password, int loginAttempts, boolean isBlocked) {
        this.login = login;
        this.password = password;
        this.loginAttempts = loginAttempts;
        this.isBlocked = isBlocked;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttempts == user.loginAttempts && isBlocked == user.isBlocked && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, loginAttempts, isBlocked);
    }

    @Override
    public String toString() {
        return "User\n" +
                "login = " + login + '\n' +
                "password = " + password + '\n' +
                "loginAttempts = " + loginAttempts + '\n' +
                "isBlocked =" + isBlocked + '\n';
    }
}

