package apoio;

public class Apoio {

    public static Boolean verifyCredentials(String user, String pass) {
        final String USER = "teste";
        final String PASSWORD = "1234";

        if (user.equals(USER) && pass.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
