
public class CreateNewUser extends javax.swing.JFrame {

    public CreateNewUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblJob = new javax.swing.JLabel();
        cmbJob = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

        setTitle("User Control");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 40);

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
        txtName.setBounds(90, 140, 450, 40);

        lblJob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblJob.setText("Cargo");
        getContentPane().add(lblJob);
        lblJob.setBounds(20, 200, 70, 40);

        cmbJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Analista", "Gerente", "Vendedor", "Estagiário", "Segurança", "Programador", "Administrador" }));
        getContentPane().add(cmbJob);
        cmbJob.setBounds(90, 200, 230, 40);

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSave.setText("Salvar");
        getContentPane().add(btnSave);
        btnSave.setBounds(20, 280, 230, 40);

        setSize(new java.awt.Dimension(615, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
