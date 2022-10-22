package br.com.loginform.screem;

import java.awt.CardLayout;
import java.awt.Color;

public class test extends javax.swing.JDialog {
    
    public test(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(242, 242, 242));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEcoleta = new br.com.loginform.components.JLabelRoundedBorder();
        lblCompilation = new br.com.loginform.components.JLabelRoundedBorder();
        lblLegais = new br.com.loginform.components.JLabelRoundedBorder();
        jpMain = new br.com.loginform.components.JPanelRoundedBorder();
        jpEcoleta = new br.com.loginform.components.JPanelRoundedBorder();
        jLabel4 = new javax.swing.JLabel();
        jTextPane1 = new javax.swing.JTextPane();
        jpCompilation = new br.com.loginform.components.JPanelRoundedBorder();
        jpLegais = new br.com.loginform.components.JPanelRoundedBorder();
        jLabelRoundedBorder1 = new br.com.loginform.components.JLabelRoundedBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setModal(true);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 16, 112, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/GNU.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 0, 154, 72);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 80);

        lblEcoleta.setBackground(new java.awt.Color(255, 255, 255));
        lblEcoleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoleta.setText("Ecoleta");
        lblEcoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEcoletaMouseClicked(evt);
            }
        });
        getContentPane().add(lblEcoleta);
        lblEcoleta.setBounds(32, 90, 60, 30);

        lblCompilation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompilation.setText("Informações de Compilação");
        lblCompilation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompilationMouseClicked(evt);
            }
        });
        getContentPane().add(lblCompilation);
        lblCompilation.setBounds(92, 90, 170, 30);

        lblLegais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegais.setText("Informações Legais");
        lblLegais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLegaisMouseClicked(evt);
            }
        });
        getContentPane().add(lblLegais);
        lblLegais.setBounds(262, 90, 120, 30);

        jpMain.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ecoleta v1.0");

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setText("Você está com a ultima versão deste software. Sistema para cadastro de ponto de coleta de resíduos orgânicos e não orgânicos. Desenvolvido durante o 2º semestre do curso de ciência da computação. Como trabalho de conclusão de semestre. Pela Universidade Nove de Julho.");
        jTextPane1.setFocusable(false);

        javax.swing.GroupLayout jpEcoletaLayout = new javax.swing.GroupLayout(jpEcoleta);
        jpEcoleta.setLayout(jpEcoletaLayout);
        jpEcoletaLayout.setHorizontalGroup(
            jpEcoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEcoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEcoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGroup(jpEcoletaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpEcoletaLayout.setVerticalGroup(
            jpEcoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEcoletaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpMain.add(jpEcoleta, "cardEcoleta");

        javax.swing.GroupLayout jpCompilationLayout = new javax.swing.GroupLayout(jpCompilation);
        jpCompilation.setLayout(jpCompilationLayout);
        jpCompilationLayout.setHorizontalGroup(
            jpCompilationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        jpCompilationLayout.setVerticalGroup(
            jpCompilationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jpMain.add(jpCompilation, "cardCompilation");

        javax.swing.GroupLayout jpLegaisLayout = new javax.swing.GroupLayout(jpLegais);
        jpLegais.setLayout(jpLegaisLayout);
        jpLegaisLayout.setHorizontalGroup(
            jpLegaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        jpLegaisLayout.setVerticalGroup(
            jpLegaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jpMain.add(jpLegais, "cardLegais");

        getContentPane().add(jpMain);
        jpMain.setBounds(16, 120, 368, 211);

        jLabelRoundedBorder1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRoundedBorder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoundedBorder1.setText("Fechar");
        jLabelRoundedBorder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRoundedBorder1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelRoundedBorder1);
        jLabelRoundedBorder1.setBounds(165, 350, 70, 30);

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(400, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEcoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEcoletaMouseClicked
        
        lblEcoleta.setBackground(Color.WHITE);
        lblCompilation.setBackground(new Color(242, 242, 242));
        lblLegais.setBackground(new Color(242, 242, 242));
        
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardEcoleta");
    }//GEN-LAST:event_lblEcoletaMouseClicked

    private void lblCompilationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompilationMouseClicked
        
        lblCompilation.setBackground(Color.WHITE);
        lblEcoleta.setBackground(new Color(242, 242, 242));
        lblLegais.setBackground(new Color(242, 242, 242));
        
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardCompilation");
    }//GEN-LAST:event_lblCompilationMouseClicked

    private void lblLegaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLegaisMouseClicked
        
        lblLegais.setBackground(Color.WHITE);
        lblEcoleta.setBackground(new Color(242, 242, 242));
        lblCompilation.setBackground(new Color(242, 242, 242));
        
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardLegais");
    }//GEN-LAST:event_lblLegaisMouseClicked

    private void jLabelRoundedBorder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRoundedBorder1MouseClicked
//        dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabelRoundedBorder1MouseClicked
    
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                test dialog = new test(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private br.com.loginform.components.JLabelRoundedBorder jLabelRoundedBorder1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jTextPane1;
    private br.com.loginform.components.JPanelRoundedBorder jpCompilation;
    private br.com.loginform.components.JPanelRoundedBorder jpEcoleta;
    private br.com.loginform.components.JPanelRoundedBorder jpLegais;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JLabelRoundedBorder lblCompilation;
    private br.com.loginform.components.JLabelRoundedBorder lblEcoleta;
    private br.com.loginform.components.JLabelRoundedBorder lblLegais;
    // End of variables declaration//GEN-END:variables
}
