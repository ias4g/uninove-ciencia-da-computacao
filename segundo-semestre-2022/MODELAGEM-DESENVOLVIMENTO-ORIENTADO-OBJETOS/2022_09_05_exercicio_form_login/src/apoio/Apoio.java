package apoio;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Apoio {

    public static Boolean verifyCredentials(String user, String pass) {
        final String USER = "Adm";
        final String PASSWORD = "123";

        if (user.equals(USER) && pass.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }

    public static void resetFields(JTextField user, JPasswordField pass) {
        user.setText("");
        pass.setText("");
    }

    public static void resetFields(JTextField user, JPasswordField pass, JLabel error) {
        if (user.getText().isEmpty() || pass.getText().isEmpty()) {
            error.setForeground(Color.YELLOW);
            error.setText("Preencha todos os campos!");
            return;
        }

        user.setText("");
        pass.setText("");
        error.setForeground(Color.RED);
        error.setText("Usuário e/ou senha inválidos!");
    }
}
