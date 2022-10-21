
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreateNewUser extends javax.swing.JFrame {

    Connection conn;

    public CreateNewUser() {
        initComponents();
        activeFields();

        btnSave.setVisible(true);
        btnSave.setEnabled(true);
        this.setTitle("Cadastrando novo usuário");
    }

    public CreateNewUser(int id, String user, String password, String name, String lastname, String email, String job, String op) {
        initComponents();

        switch (op) {

            case "delete" -> {

                btnDelete.setVisible(true);
                btnDelete.setEnabled(true);

                btnSave.setVisible(false);
                btnSaveChange.setVisible(false);

                this.setTitle("Excluindo um usuário");

            }
            case "alterar" -> {

                activeFields();

                btnSaveChange.setVisible(true);
                btnSaveChange.setEnabled(true);

                btnDelete.setVisible(false);
                btnSave.setVisible(false);

                this.setTitle("Alterando um usuário");
            }

        }

        fillFields(id, user, password, name, lastname, email, job);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblJob = new javax.swing.JLabel();
        cmbJob = new javax.swing.JComboBox<>();
        lblLastname = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSaveChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setTitle("User Control");
        setMaximumSize(new java.awt.Dimension(640, 426));
        setMinimumSize(new java.awt.Dimension(640, 426));
        setPreferredSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(null);

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setText("Usuário");
        getContentPane().add(lblUser);
        lblUser.setBounds(20, 20, 70, 40);

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setEnabled(false);
        getContentPane().add(txtUser);
        txtUser.setBounds(90, 20, 290, 40);

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setText("Id");
        lblId.setEnabled(false);
        getContentPane().add(lblId);
        lblId.setBounds(430, 25, 20, 25);

        txtId.setEditable(false);
        txtId.setEnabled(false);
        getContentPane().add(txtId);
        txtId.setBounds(460, 20, 40, 40);

        lblPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPass.setText("Senha");
        getContentPane().add(lblPass);
        lblPass.setBounds(20, 80, 70, 40);

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPass.setEnabled(false);
        getContentPane().add(txtPass);
        txtPass.setBounds(90, 80, 290, 40);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Nome");
        getContentPane().add(lblName);
        lblName.setBounds(20, 140, 70, 40);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setEnabled(false);
        getContentPane().add(txtName);
        txtName.setBounds(90, 140, 160, 40);

        lblJob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblJob.setText("Cargo");
        getContentPane().add(lblJob);
        lblJob.setBounds(20, 260, 70, 40);

        cmbJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Analista", "Gerente", "Vendedor", "Estagiário", "Segurança", "Programador", "Administrador" }));
        cmbJob.setEnabled(false);
        getContentPane().add(cmbJob);
        cmbJob.setBounds(90, 260, 230, 40);

        lblLastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastname.setText("Sobrenome");
        getContentPane().add(lblLastname);
        lblLastname.setBounds(290, 140, 120, 40);

        txtLastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLastname.setEnabled(false);
        getContentPane().add(txtLastname);
        txtLastname.setBounds(390, 140, 210, 40);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(20, 200, 260, 40);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(90, 200, 350, 40);

        jPanel1.setLayout(new java.awt.CardLayout());

        btnSaveChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveChange.setText("Salvar Alteração");
        btnSaveChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveChange.setEnabled(false);
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChange, "card2");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, "card3");

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, "card4");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 320, 230, 50);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String email = txtEmail.getText();
        String job = cmbJob.getSelectedItem().toString();

        try {

            new SystemDao().salvarUsuario(user, pass, name, lastname, email, job);

            txtUser.setText(null);
            txtPass.setText(null);
            txtName.setText(null);
            txtLastname.setText(null);
            txtEmail.setText(null);
            cmbJob.setSelectedIndex(0);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir este usuário?", "Confirmação", 0);

        if (resp == 0) {

            try {

                new SystemDao().deletarUsuario(txtId.getText());

                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");

                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else {

            dispose();

        }


    }//GEN-LAST:event_btnDeleteActionPerformed
    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String email = txtEmail.getText();
        String job = String.valueOf(cmbJob.getSelectedItem());

        try {

            new SystemDao().alterarUsuario(user, pass, name, lastname, email, job, id);

            dispose();

            new UsersList().setVisible(true);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveChangeActionPerformed

    private void activeFields() {
        txtUser.setEnabled(true);
        txtPass.setEnabled(true);
        txtName.setEnabled(true);
        txtLastname.setEnabled(true);
        txtEmail.setEnabled(true);
        cmbJob.setEnabled(true);

        lblId.setVisible(false);
        txtId.setVisible(false);

        btnDelete.setVisible(false);
        btnSave.setVisible(false);
        btnSaveChange.setVisible(false);
    }

    private void fillFields(int id, String user, String password, String name, String lastname, String email, String job) {
        txtId.setText(String.valueOf(id));
        txtUser.setText(user);
        txtPass.setText(password);
        txtName.setText(name);
        txtLastname.setText(lastname);
        txtEmail.setText(email);
        cmbJob.setSelectedItem(job);

        lblId.setVisible(true);
        txtId.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JComboBox<String> cmbJob;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
