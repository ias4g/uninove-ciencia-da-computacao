
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsersList extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private DefaultTableModel tableModel;

    public UsersList() {
        initComponents();
        tableFill();
    }

    private void tableFill() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student"
            );

            stmt = conn.prepareStatement("SELECT * FROM tbusers");
            rs = stmt.executeQuery();

            tableModel = (DefaultTableModel) tblUsers.getModel();

            while (rs.next()) {
                Object datas[] = {
                    rs.getString("id"),
                    rs.getString("user"),
                    rs.getString("password"),
                    rs.getString("lastname"),
                    rs.getString("email"),
                    rs.getString("job")
                };
            }

            conn.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, "Algo de errado não está certo -> " + ex.getMessage()
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
