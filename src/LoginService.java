public class LoginService {
    
    public boolean authenticate(String username, String password) {
        if (username.equals("user") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
