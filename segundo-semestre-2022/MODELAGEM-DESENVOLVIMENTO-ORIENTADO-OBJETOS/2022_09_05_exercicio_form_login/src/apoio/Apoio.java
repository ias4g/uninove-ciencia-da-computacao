package apoio;

import dao.ConnectBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Apoio {

    public static Boolean verifyCredentials(String user, String pass) {

        ResultSet rs = null;
        Connection conn = null;
        Boolean result = false;
        PreparedStatement pst = null;

        final String SQL = "SELECT * FROM tbusers WHERE user=? AND password=?";
        conn = ConnectBD.connect();

        try {

            pst = conn.prepareStatement(SQL);
            pst.setString(1, user);
            pst.setString(2, pass);

            rs = pst.executeQuery();

            if (rs.next()) {
                result = true;
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return result;
    }

    public static void resetFields(JTextField user, JPasswordField pass, JLabel error) {
        String password = new String(pass.getPassword());

        if (user.getText().isEmpty() || password.equals("")) {
            error.setForeground(Color.YELLOW);
            error.setText("Preencha todos os campos!");
            user.requestFocus();
            return;
        }

        user.setText("");
        pass.setText("");
        error.setForeground(Color.RED);
        error.setText("Usuário e/ou senha inválidos!");

        user.requestFocus();
    }

}
