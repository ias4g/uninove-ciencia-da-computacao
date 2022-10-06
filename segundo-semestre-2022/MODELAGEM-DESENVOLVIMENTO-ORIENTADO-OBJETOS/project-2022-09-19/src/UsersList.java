
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsersList extends javax.swing.JFrame {

    private Connection conn = null;

    public UsersList() {
        initComponents();
        tableFill();
    }

    private void tableFill() {
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student"
            );

            PreparedStatement st = conn.prepareStatement("SELECT * FROM tbusers");
            ResultSet resultado = st.executeQuery();

            if (resultado.next()) {

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }

            conn.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, "Você errou nos dados da conexão com o banco de dados"
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        setTitle("Relatórios de usuários");
        setMaximumSize(new java.awt.Dimension(640, 426));
        setMinimumSize(new java.awt.Dimension(640, 426));
        setPreferredSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(null);

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuário", "Senha", "Nome", "Sobrenome", "E-mail", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 20, 620, 340);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
