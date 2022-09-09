package screem;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblIconLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDescription2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnEnter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Tela de cadastro");
        setMaximumSize(new java.awt.Dimension(480, 460));
        setMinimumSize(new java.awt.Dimension(480, 460));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 460));
        getContentPane().setLayout(new java.awt.CardLayout());

        jpPrincipal.setBackground(new java.awt.Color(52, 58, 64));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jpPrincipal.setLayout(null);

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 0, 51));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        lblClose.setToolTipText("Fechar");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jpPrincipal.add(lblClose);
        lblClose.setBounds(445, 10, 24, 24);

        lblIconLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enter.png"))); // NOI18N
        lblIconLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblIconLogin);
        lblIconLogin.setBounds(20, 10, 24, 24);

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login.png"))); // NOI18N
        lblLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblLogin);
        lblLogin.setBounds(46, 10, 67, 24);

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Preencha os campos");
        lblDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblDescription);
        lblDescription.setBounds(160, 60, 173, 25);

        lblDescription2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription2.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription2.setText("para realizar o cadastro");
        lblDescription2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblDescription2);
        lblDescription2.setBounds(160, 90, 170, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");
        jpPrincipal.add(jLabel1);
        jLabel1.setBounds(70, 150, 50, 20);

        jTextField1.setBackground(new java.awt.Color(52, 58, 64));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jTextField1.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(jTextField1);
        jTextField1.setBounds(70, 170, 353, 38);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUÁRIO:");
        jpPrincipal.add(jLabel2);
        jLabel2.setBounds(70, 230, 70, 20);

        jTextField2.setBackground(new java.awt.Color(52, 58, 64));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jTextField2.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(jTextField2);
        jTextField2.setBounds(70, 250, 353, 38);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA:");
        jpPrincipal.add(jLabel3);
        jLabel3.setBounds(70, 310, 60, 20);

        jPasswordField1.setBackground(new java.awt.Color(52, 58, 64));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jPasswordField1.setMaximumSize(new java.awt.Dimension(353, 38));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(353, 38));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(jPasswordField1);
        jPasswordField1.setBounds(70, 330, 353, 38);

        btnEnter.setBackground(new java.awt.Color(40, 167, 69));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("CADASTRAR");
        btnEnter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter.setMaximumSize(new java.awt.Dimension(353, 38));
        btnEnter.setMinimumSize(new java.awt.Dimension(353, 38));
        btnEnter.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(btnEnter);
        btnEnter.setBounds(70, 380, 353, 38);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setOpaque(true);
        jpPrincipal.add(jLabel4);
        jLabel4.setBounds(0, 43, 480, 2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(jLabel5);
        jLabel5.setBounds(202, 10, 75, 25);

        getContentPane().add(jpPrincipal, "card2");

        setSize(new java.awt.Dimension(480, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescription2;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblLogin;
    // End of variables declaration//GEN-END:variables
}
