package by.jrr.start.rysard_poplavskij.login_user_service;

public class UserLoginServiceDemo {

    public static void main(String[] args) {
        User user = new User("user-login", "user-password");
        UserLoginService service = new UserLoginService();

//Should return false
        System.out.println(service.login(user, "user-password-12345"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
//Should return true
        System.out.println(service.login(user, "user-password"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
 //Should return false
        System.out.println(service.login(user, "user-password-12345"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
//Should return false
        System.out.println(service.login(user, "user-password-12345"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
//Should return false
        System.out.println(service.login(user, "user-password-12345"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
//Should return true
        System.out.println(service.login(user, "user-password"));
        System.out.println(user.getLoginAttempts());
        if (user.userIsBlocked()) {
            System.out.println("User is blocked");
        }
    }
}
