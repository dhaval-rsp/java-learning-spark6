public class P11_LoginValidation {
    public static void main(String[] args) {

        LoginService service = new LoginService();
        try {
            service.login("admin", "java123");
            service.login("user", "wrongpass");
        }
        catch (InvalidLoginException e) {
            System.out.println(e.getMessage()); // Handle custom exception
        }

        finally {
            System.out.println("Program completed");
        }

    }
}

// Custom unchecked exception
class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}

// Service class
class LoginService {
    public void login(String username, String password) {
        if (!"admin".equals(username) || !"java123".equals(password)) {

            throw new InvalidLoginException("Error: Invalid username or password.");
        }
        else {
            System.out.println("Login successful. Welcome, " + username + "!");
        }
    }
}


