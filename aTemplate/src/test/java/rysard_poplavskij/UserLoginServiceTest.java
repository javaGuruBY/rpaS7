package rysard_poplavskij;

import by.jrr.start.rysard_poplavskij.login_user_service.User;
import by.jrr.start.rysard_poplavskij.login_user_service.UserLoginService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserLoginServiceTest {

    UserLoginService service = new UserLoginService();

    @Test
    public void userThreeTimesWrongPasswordBlockTest() {
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "123");
        boolean expectedResult = true;
        boolean actualResult = user.isBlocked();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userTwoTimesWrongPasswordBlockTest() {
        User user = new User("UserName", "UserPassword");
        service.login(user, "psw");
        service.login(user, "psw");
        boolean expectedResult = false;
        boolean actualResult = user.isBlocked();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decreaseNumberOfAttemptsTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "psw");
        service.login(user, "psw");
        int actualLoginAttempts = user.getLoginAttempts();
        int expectedLoginAttempts = 1;
        assertEquals(expectedLoginAttempts,actualLoginAttempts);
    }

    @Test
    public void decreaseTwoNumberOfAttemptsTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "psw");
        service.login(user, "psw");
        int actualLoginAttempts = user.getLoginAttempts();
        int expectedLoginAttempts = 2;
        assertEquals(expectedLoginAttempts,actualLoginAttempts);
    }

    @Test
    public void resetNumberOfAttemptsTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "UserPassword");
        int actualLoginAttempts = user.getLoginAttempts();
        int expectedLoginAttempts = 3;
        assertEquals(expectedLoginAttempts,actualLoginAttempts);
    }
}
