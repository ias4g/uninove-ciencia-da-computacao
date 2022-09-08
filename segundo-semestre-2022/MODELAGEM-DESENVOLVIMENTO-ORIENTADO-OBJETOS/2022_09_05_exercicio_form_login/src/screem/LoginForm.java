/**
 * Exercício:
 *
 * Crie um formulário que tenha os campos, "USUÁRIO" e "SENHA", os botões "ENTRAR" e "CADASTRE-SE".
 *
 * Se for clicado no botão "CADASTRE-SE", abrir um formulário novo chamado "CADASTRO".
 * Se for clicado no botão "ENTRAR", verificar:
 *  Se o usuário digitado for “teste” e a senha digitada for “1234”, abrir um formulário novo chamado "ACESSO".
 *  Senão, mostrar uma mensagem “Usuário e/ou senha inválidos”.
 */
package screem;

public class LoginForm extends javax.swing.JFrame {
    
    public LoginForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jpPrincipal = new javax.swing.JPanel();
        lblIconLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDescription2 = new javax.swing.JLabel();
        jpUser = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jpPassword = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRegister = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        lblHide1 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setMaximumSize(new java.awt.Dimension(480, 320));
        setMinimumSize(new java.awt.Dimension(480, 320));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 320));
        getContentPane().setLayout(new java.awt.CardLayout());

        jpPrincipal.setBackground(new java.awt.Color(52, 58, 64));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jpPrincipal.setToolTipText("");
        jpPrincipal.setLayout(null);

        lblIconLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enter.png"))); // NOI18N
        lblIconLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblIconLogin);
        lblIconLogin.setBounds(190, 20, 24, 24);

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login.png"))); // NOI18N
        lblLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblLogin);
        lblLogin.setBounds(220, 20, 67, 24);

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

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Entre com suas credenciais");
        lblDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblDescription);
        lblDescription.setBounds(130, 60, 228, 25);

        lblDescription2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription2.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription2.setText("para ter acesso ao sistema!");
        lblDescription2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblDescription2);
        lblDescription2.setBounds(160, 90, 182, 20);

        jpUser.setBackground(new java.awt.Color(255, 0, 51));
        jpUser.setMaximumSize(new java.awt.Dimension(50, 38));
        jpUser.setLayout(new java.awt.CardLayout());

        lblUser.setBackground(new java.awt.Color(255, 51, 51));
        lblUser.setForeground(new java.awt.Color(255, 0, 51));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUser.setMaximumSize(new java.awt.Dimension(50, 38));
        lblUser.setMinimumSize(new java.awt.Dimension(50, 38));
        lblUser.setPreferredSize(new java.awt.Dimension(50, 38));
        jpUser.add(lblUser, "card2");

        jpPrincipal.add(jpUser);
        jpUser.setBounds(30, 150, 50, 38);

        txtUser.setBackground(new java.awt.Color(52, 58, 64));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        txtUser.setMaximumSize(new java.awt.Dimension(353, 38));
        txtUser.setMinimumSize(new java.awt.Dimension(353, 38));
        txtUser.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(txtUser);
        txtUser.setBounds(90, 150, 353, 38);

        jpPassword.setBackground(new java.awt.Color(255, 0, 51));
        jpPassword.setMaximumSize(new java.awt.Dimension(50, 38));
        jpPassword.setMinimumSize(new java.awt.Dimension(50, 38));
        jpPassword.setPreferredSize(new java.awt.Dimension(50, 38));
        jpPassword.setLayout(new java.awt.CardLayout());

        lblPassword.setBackground(new java.awt.Color(255, 51, 51));
        lblPassword.setForeground(new java.awt.Color(255, 0, 51));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/key.png"))); // NOI18N
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPassword.setMaximumSize(new java.awt.Dimension(50, 38));
        lblPassword.setMinimumSize(new java.awt.Dimension(50, 38));
        lblPassword.setPreferredSize(new java.awt.Dimension(50, 38));
        jpPassword.add(lblPassword, "card2");

        jpPrincipal.add(jpPassword);
        jpPassword.setBounds(30, 200, 50, 38);

        txtPassword.setBackground(new java.awt.Color(52, 58, 64));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        txtPassword.setMaximumSize(new java.awt.Dimension(353, 38));
        txtPassword.setMinimumSize(new java.awt.Dimension(353, 38));
        txtPassword.setPreferredSize(new java.awt.Dimension(353, 38));
        jpPrincipal.add(txtPassword);
        txtPassword.setBounds(90, 200, 353, 38);

        lblRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(204, 204, 204));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Não tem cadastro? Clique aqui!");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblRegister.setMaximumSize(new java.awt.Dimension(210, 38));
        lblRegister.setMinimumSize(new java.awt.Dimension(210, 38));
        lblRegister.setPreferredSize(new java.awt.Dimension(210, 38));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        jpPrincipal.add(lblRegister);
        lblRegister.setBounds(90, 250, 210, 38);

        btnEnter.setBackground(new java.awt.Color(40, 167, 69));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("ENTRAR");
        btnEnter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter.setMaximumSize(new java.awt.Dimension(130, 38));
        btnEnter.setMinimumSize(new java.awt.Dimension(130, 38));
        btnEnter.setPreferredSize(new java.awt.Dimension(130, 38));
        jpPrincipal.add(btnEnter);
        btnEnter.setBounds(310, 250, 130, 38);

        lblHide1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHide1.setForeground(new java.awt.Color(255, 255, 51));
        lblHide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize.png"))); // NOI18N
        lblHide1.setToolTipText("Minimizar");
        lblHide1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHide1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHide1MouseClicked(evt);
            }
        });
        jpPrincipal.add(lblHide1);
        lblHide1.setBounds(415, 10, 24, 24);

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/info.png"))); // NOI18N
        lblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });
        jpPrincipal.add(lblInfo);
        lblInfo.setBounds(385, 10, 24, 24);

        getContentPane().add(jpPrincipal, "card2");

        setSize(new java.awt.Dimension(480, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        RegistrationForm r = new RegistrationForm();
        r.setVisible(true);
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblHide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHide1MouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblHide1MouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        Information i = new Information(this, false);
        i.setVisible(true);
    }//GEN-LAST:event_lblInfoMouseClicked
    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpPassword;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpUser;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescription2;
    private javax.swing.JLabel lblHide1;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
