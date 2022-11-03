
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
        tableFill(String.valueOf(cmbJob.getSelectedItem()));
    }

    private void tableFill(String param) {

        String sqlAll = "SELECT * FROM tbusers";
        String sql = "SELECT * FROM tbusers WHERE job = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student"
            );

            if (param.equalsIgnoreCase("Mostrar todos")) {
                stmt = conn.prepareStatement(sqlAll);
            } else {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, param);
            }

            rs = stmt.executeQuery();

            tableModel = (DefaultTableModel) tblUsers.getModel();
//            tableModel.setRowCount(0);

            while (rs.next()) {
                Object datas[] = {
                    rs.getString("id"),
                    rs.getString("user"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("lastname"),
                    rs.getString("email"),
                    rs.getString("job")
                };

                tableModel.addRow(datas);
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
        lblJob = new javax.swing.JLabel();
        cmbJob = new javax.swing.JComboBox<>();

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
        jScrollPane1.setBounds(10, 70, 620, 290);

        lblJob.setText("Cargo");
        getContentPane().add(lblJob);
        lblJob.setBounds(10, 20, 50, 16);

        cmbJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "Analista", "Gerente", "Vendedor", "Estagiário", "Segurança", "Programador", "Administrador" }));
        cmbJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJobActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJob);
        cmbJob.setBounds(60, 10, 230, 40);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJobActionPerformed
        tableFill(String.valueOf(cmbJob.getSelectedItem()));
    }//GEN-LAST:event_cmbJobActionPerformed

//    private void search() {
//        String cargo = String.valueOf(cmbJob.getSelectedItem());
//
//        try {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student"
//            );
//
//            if (cmbJob.getSelectedIndex() == 0) {
//                tableFill();
//                return;
//            }
//
//            stmt = conn.prepareStatement("SELECT * FROM tbusers WHERE job = ?");
//            stmt.setString(1, cargo);
//            rs = stmt.executeQuery();
//
//            tableModel = (DefaultTableModel) tblUsers.getModel();
//            tableModel.setRowCount(0);
//
//            while (rs.next()) {
//                Object datas[] = {
//                    rs.getString("id"),
//                    rs.getString("user"),
//                    rs.getString("password"),
//                    rs.getString("name"),
//                    rs.getString("lastname"),
//                    rs.getString("email"),
//                    rs.getString("job")
//                };
//
//                tableModel.addRow(datas);
//            }
//
//            conn.close();
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(
//                    null, "Algo de errado não está certo -> " + ex.getMessage()
//            );
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbJob;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJob;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
