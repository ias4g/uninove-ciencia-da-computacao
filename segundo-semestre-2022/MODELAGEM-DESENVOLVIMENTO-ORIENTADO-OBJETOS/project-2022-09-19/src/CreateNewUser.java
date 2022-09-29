
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreateNewUser extends javax.swing.JFrame {

    public CreateNewUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblJob = new javax.swing.JLabel();
        cmbJob = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        lblLastname = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setTitle("User Control");
        setMaximumSize(new java.awt.Dimension(640, 426));
        setMinimumSize(new java.awt.Dimension(640, 426));
        setPreferredSize(new java.awt.Dimension(640, 426));
        getContentPane().setLayout(null);

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setText("Usuário");
        getContentPane().add(lblUser);
        lblUser.setBounds(20, 20, 70, 40);

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtUser);
        txtUser.setBounds(90, 20, 290, 40);

        lblPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPass.setText("Senha");
        getContentPane().add(lblPass);
        lblPass.setBounds(20, 80, 70, 40);

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPass);
        txtPass.setBounds(90, 80, 290, 40);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Nome");
        getContentPane().add(lblName);
        lblName.setBounds(20, 140, 70, 40);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(90, 140, 160, 40);

        lblJob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblJob.setText("Cargo");
        getContentPane().add(lblJob);
        lblJob.setBounds(20, 260, 70, 40);

        cmbJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Analista", "Gerente", "Vendedor", "Estagiário", "Segurança", "Programador", "Administrador" }));
        getContentPane().add(cmbJob);
        cmbJob.setBounds(90, 260, 230, 40);

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(20, 320, 230, 40);

        lblLastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastname.setText("Sobrenome");
        getContentPane().add(lblLastname);
        lblLastname.setBounds(290, 140, 120, 40);

        txtLastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtLastname);
        txtLastname.setBounds(390, 140, 210, 40);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(20, 200, 260, 40);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(90, 200, 350, 40);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String user;
        String pass;
        String name;
        String lastname;
        String email;
        String job;

        int rs;
        Connection conn;

        user = txtUser.getText();
        pass = txtPass.getText();
        name = txtName.getText();
        lastname = txtLastname.getText();
        email = txtEmail.getText();
        job = cmbJob.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student");

            PreparedStatement st = conn.prepareStatement("INSERT INTO tbusers (user, password, name, lastname, email, job) VALUES (?, ?, ?, ?, ?, ?)");

            st.setString(1, user);
            st.setString(2, pass);
            st.setString(3, name);
            st.setString(4, lastname);
            st.setString(5, email);
            st.setString(6, job);

            rs = st.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }

            txtUser.setText(null);
            txtPass.setText(null);
            txtName.setText(null);
            txtLastname.setText(null);
            txtEmail.setText(null);
            cmbJob.setSelectedIndex(0);

            conn.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador.\n Message: " + ex.getMessage() + "\n Código do erro: " + ex.getErrorCode());
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbJob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
