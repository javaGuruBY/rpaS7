package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginServiceTest {

    User user;
    LoginService loginService;
    String correctPassword = "password";
    String correctLogin = "admin";
    String wrongInput = "wrong";

    boolean actualResult;

    @Before
    public void setUp() {
        getUser();
        loginService = new LoginService();
    }

    private void getUser() {
        user = new User();
        user.setLogin("admin");
        user.setPassword("password");
    }

    @Test
    public void login_correct() {
        actualResult = loginService.login(user, correctLogin, correctPassword);
        assertTrue(actualResult);
    }

    @Test
    public void login_wrongLogin() {
        actualResult = loginService.login(user, wrongInput, correctPassword);
        assertFalse(actualResult);
    }

    @Test
    public void login_wrongPassword() {
        actualResult = loginService.login(user, correctLogin, wrongInput);
        assertFalse(actualResult);
    }

    @Test
    public void checkUserPassword_correct() {
        actualResult = loginService.chekUserPassword(user, correctPassword);
        assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_wrong() {
        actualResult = loginService.chekUserPassword(user, wrongInput);
        assertFalse(actualResult);
    }


}