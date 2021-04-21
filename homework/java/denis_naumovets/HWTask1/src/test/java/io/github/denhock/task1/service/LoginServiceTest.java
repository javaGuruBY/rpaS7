package io.github.denhock.task1.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.github.denhock.task1.been.User;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    User blockedUser;
    String positiveUserInput = "password";
    String negativeUserInput = "wrong";

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempt());
        Assert.assertFalse(user.isBlocked());

        this.blockedUser = getBlockedUser();
        Assert.assertEquals(0, blockedUser.getLoginAttempt());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void checkUserPassword_positive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempt() {
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempt());
    }

    @Test
    public void login_positive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void login_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempt());
    }

    @Test
    public void blockUser() {
        user.setLoginAttempt(1);
        loginService.login(user, negativeUserInput);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUser() {
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempt());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttempt());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttempt());
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void blockedUserLogin_ShouldReturnFalse() {
        boolean actualResult = loginService.login(blockedUser, positiveUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void restoreAttempt() {
        user.setLoginAttempt(1);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempt());
    }

    @Test
    public void after1Incorrect_ShouldRestoreAttempt() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempt());
    }

    @Test
    public void after2Incorrect_ShouldRestoreAttempt() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempt());
    }

    @Test
    public void after3Incorrect_ShouldRestoreAttempt() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0, user.getLoginAttempt());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempt(0);
        user.setBlocked(true);
        return user;
    }
}