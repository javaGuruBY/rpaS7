package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    User user;
    LoginService loginService;
    String correctPassword = "password";
    String correctLogin = "admin";
    String wrongInput = "wrong";

    boolean actualResult;
    int actualAttempts;

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

    @Test
    public void afterWrongPassword_ShouldReduceAttempts() {
        loginService.login(user, correctLogin, wrongInput);
        actualAttempts = user.getLoginAttempts();
        assertEquals(2, actualAttempts);
    }

    @Test
    public void afterWrongLogin_ShouldNotReduceAttempts() {
        loginService.login(user, wrongInput, wrongInput);
        actualAttempts = user.getLoginAttempts();
        assertEquals(3, actualAttempts);
    }

    @Test
    public void after2WrongPasswords_ShouldReduceAttemptsTo1() {
        loginService.login(user, correctLogin, wrongInput);
        loginService.login(user, correctLogin, wrongInput);
        actualAttempts = user.getLoginAttempts();
        assertEquals(1, actualAttempts);
    }

    @Test
    public void after3WrongPassword_ShouldReduceAttemptsTo0() {
        loginService.login(user, correctLogin, wrongInput);
        loginService.login(user, correctLogin, wrongInput);
        loginService.login(user, correctLogin, wrongInput);
        actualAttempts = user.getLoginAttempts();
        assertEquals(0, actualAttempts);
    }

    @Test
    public void userIsBlocked_AfterAttemptsExceed() {
        user.setLoginAttempts(1);
        loginService.login(user, correctLogin, wrongInput);
        assertTrue(user.isBlocked());
    }

    @Test
    public void userCanNotEnterIfBlocked(){
        user.setBlocked(true);
        actualResult = loginService.login(user, correctLogin, correctPassword);
        assertFalse(actualResult);
    }

    @Test
    public void recoverUserLoginAttemptsAfterCorrectInput(){
        user.setLoginAttempts(1);
        loginService.login(user, correctLogin, correctPassword);
        actualAttempts = user.getLoginAttempts();
        assertEquals(3, actualAttempts);
    }

}