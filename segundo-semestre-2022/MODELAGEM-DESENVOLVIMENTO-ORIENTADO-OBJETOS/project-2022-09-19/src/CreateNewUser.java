
public class CreateNewUser extends javax.swing.JFrame {

    public CreateNewUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setTitle("User Control");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 40);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 20, 290, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 70, 40);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(90, 80, 290, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 70, 40);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(90, 140, 290, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cargo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 70, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Analista", "Gerente", "Vendedor", "Estagiário", "Segurança", "Programador", "Administrador" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(90, 200, 290, 40);

        setSize(new java.awt.Dimension(615, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
