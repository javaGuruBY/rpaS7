package by.jrr.start.bean;

import java.util.Objects;

public class User {
    private String password;
    private String login;
    private int loginAttempts;
    private boolean blocked;

    public User() {
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getLigonAttempts() {
        return loginAttempts;
    }

    public void setLigonAttempts(int ligonAttempts) {
        this.loginAttempts = ligonAttempts;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", loginAttempts=" + loginAttempts +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttempts == user.loginAttempts && blocked == user.blocked && Objects.equals(password, user.password) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, login, loginAttempts, blocked);
    }
}
