package edu.uni9.mdoo.heranca.views;

public class TelaMenu extends javax.swing.JFrame {
    
    public TelaMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new edu.uni9.mdoo.heranca.swing.Background();
        jpControleFuncionario = new javax.swing.JPanel();
        btnFuncionario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpControleCliente = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de menu");
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(null);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpControleFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Controle de funcionários", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jpControleFuncionario.setMaximumSize(null);
        jpControleFuncionario.setMinimumSize(null);
        jpControleFuncionario.setOpaque(false);

        btnFuncionario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFuncionario.setText("Controle de funcionários");
        btnFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton2.setText("jButton1");

        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton3.setText("jButton1");

        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setText("jButton1");

        javax.swing.GroupLayout jpControleFuncionarioLayout = new javax.swing.GroupLayout(jpControleFuncionario);
        jpControleFuncionario.setLayout(jpControleFuncionarioLayout);
        jpControleFuncionarioLayout.setHorizontalGroup(
            jpControleFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleFuncionarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpControleFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jpControleFuncionarioLayout.setVerticalGroup(
            jpControleFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleFuncionarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jpControleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Controle de clientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jpControleCliente.setMaximumSize(null);
        jpControleCliente.setMinimumSize(null);
        jpControleCliente.setOpaque(false);

        btnCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCliente.setText("Controle de Clientes");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton4.setText("jButton1");

        jButton5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton5.setText("jButton1");

        jButton6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton6.setText("jButton1");

        javax.swing.GroupLayout jpControleClienteLayout = new javax.swing.GroupLayout(jpControleCliente);
        jpControleCliente.setLayout(jpControleClienteLayout);
        jpControleClienteLayout.setHorizontalGroup(
            jpControleClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpControleClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jpControleClienteLayout.setVerticalGroup(
            jpControleClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jpControleFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jpControleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpControleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpControleFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(850, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        new FrmFuncionario(this, true).setVisible(true);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        new FrmCliente(this, true).setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private edu.uni9.mdoo.heranca.swing.Background jpBackground;
    private javax.swing.JPanel jpControleCliente;
    private javax.swing.JPanel jpControleFuncionario;
    // End of variables declaration//GEN-END:variables
}
