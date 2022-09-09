package screem;

public class Info extends javax.swing.JFrame {

    public Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblIconLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Informações do programa");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(480, 320));
        setMinimumSize(new java.awt.Dimension(480, 320));
        setName("jfInfo"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(480, 320));
        getContentPane().setLayout(new java.awt.CardLayout());

        jpPrincipal.setBackground(new java.awt.Color(52, 58, 64));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 167, 69), 2));
        jpPrincipal.setLayout(null);

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        lblClose.setToolTipText("Fechar");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jpPrincipal.add(lblClose);
        lblClose.setBounds(445, 10, 24, 24);

        jScrollPane1.setBackground(new java.awt.Color(52, 58, 64));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(480, 320));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(480, 320));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(480, 320));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(52, 58, 64));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("\nExercício:\n\nCrie um formulário que tenha os campos, \"USUÁRIO\" e \"SENHA\", os botões\n\"ENTRAR\" e \"CADASTRE-SE\".\n\nSe for clicado no botão \"CADASTRE-SE\", abrir um formulário novo chamado\n\"CADASTRO\".\n\nSe for clicado no botão \"ENTRAR\", verificar:\n\nSe o usuário digitado for “teste” e a senha digitada for “1234”, abrir um\nformulário novo chamado \"ACESSO\".\n\nSenão, mostrar uma mensagem “Usuário e/ou senha inválidos”.");
        jTextArea1.setBorder(null);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea1);

        jpPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 440, 250);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informações");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(jLabel1);
        jLabel1.setBounds(187, 10, 106, 25);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setOpaque(true);
        jpPrincipal.add(jLabel2);
        jLabel2.setBounds(0, 43, 480, 2);

        getContentPane().add(jpPrincipal, "card2");

        setSize(new java.awt.Dimension(480, 320));
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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblLogin;
    // End of variables declaration//GEN-END:variables
}
