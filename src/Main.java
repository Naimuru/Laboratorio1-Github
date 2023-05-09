public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        String username = "user";
        String password = "password";

        if (loginService.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}
