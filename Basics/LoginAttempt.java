// Exercise 17: Login Attempt 
// Problem: 
// If username = "user" and password = "pass", allow login. 
// Input: user, pass 
// Output: Login Successful


public class LoginAttempt {
    String username;
    String password;

    LoginAttempt(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void validateLogin() {
        if (username.equals("user") && password.equals("pass")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    public static void main(String[] args) {
        LoginAttempt login = new LoginAttempt("user", "pass");
        login.validateLogin();
    }
}