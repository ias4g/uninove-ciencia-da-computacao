package br.com.loginform.screem;

import br.com.loginform.utils.Utilities;

public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
        
        Utilities.insertIcon(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder2 = new br.com.loginform.components.PanelBorder();
        panelBorder1 = new br.com.loginform.components.PanelBorder();
        panelBorder3 = new br.com.loginform.components.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        lblGoBack = new javax.swing.JLabel();
        panelBorder5 = new br.com.loginform.components.PanelBorder();
        panelBorder6 = new br.com.loginform.components.PanelBorder();
        panelBorder7 = new br.com.loginform.components.PanelBorder();
        panelBorder8 = new br.com.loginform.components.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        panelBorder9 = new br.com.loginform.components.PanelBorder();
        panelBorder10 = new br.com.loginform.components.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        panelBorder4 = new br.com.loginform.components.PanelBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de pontos de coletas");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setName("jfRegister"); // NOI18N

        panelBorder2.setMaximumSize(new java.awt.Dimension(200, 540));
        panelBorder2.setMinimumSize(new java.awt.Dimension(200, 540));
        panelBorder2.setPreferredSize(new java.awt.Dimension(200, 540));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(panelBorder2, java.awt.BorderLayout.WEST);

        panelBorder1.setMaximumSize(new java.awt.Dimension(200, 540));
        panelBorder1.setMinimumSize(new java.awt.Dimension(200, 540));
        panelBorder1.setPreferredSize(new java.awt.Dimension(200, 540));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(panelBorder1, java.awt.BorderLayout.EAST);

        panelBorder3.setMaximumSize(new java.awt.Dimension(960, 120));
        panelBorder3.setMinimumSize(new java.awt.Dimension(960, 120));
        panelBorder3.setName(""); // NOI18N
        panelBorder3.setPreferredSize(new java.awt.Dimension(960, 120));
        panelBorder3.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo-1.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(212, 54));
        jLabel1.setMinimumSize(new java.awt.Dimension(212, 54));
        jLabel1.setPreferredSize(new java.awt.Dimension(212, 54));
        panelBorder3.add(jLabel1, java.awt.BorderLayout.WEST);

        lblGoBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-left-green.png"))); // NOI18N
        lblGoBack.setText("Voltar para home");
        lblGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoBack.setMaximumSize(new java.awt.Dimension(148, 16));
        lblGoBack.setMinimumSize(new java.awt.Dimension(148, 16));
        lblGoBack.setPreferredSize(new java.awt.Dimension(148, 16));
        lblGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoBackMouseClicked(evt);
            }
        });
        panelBorder3.add(lblGoBack, java.awt.BorderLayout.EAST);

        getContentPane().add(panelBorder3, java.awt.BorderLayout.NORTH);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder5.setLayout(new java.awt.BorderLayout());

        panelBorder6.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder6.setMaximumSize(new java.awt.Dimension(50, 32767));
        panelBorder6.setMinimumSize(new java.awt.Dimension(50, 100));
        panelBorder6.setPreferredSize(new java.awt.Dimension(50, 170));

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        panelBorder5.add(panelBorder6, java.awt.BorderLayout.LINE_START);

        panelBorder7.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder7.setMaximumSize(new java.awt.Dimension(50, 32767));
        panelBorder7.setMinimumSize(new java.awt.Dimension(50, 100));
        panelBorder7.setPreferredSize(new java.awt.Dimension(50, 170));

        javax.swing.GroupLayout panelBorder7Layout = new javax.swing.GroupLayout(panelBorder7);
        panelBorder7.setLayout(panelBorder7Layout);
        panelBorder7Layout.setHorizontalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelBorder7Layout.setVerticalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        panelBorder5.add(panelBorder7, java.awt.BorderLayout.LINE_END);

        panelBorder8.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder8.setMaximumSize(new java.awt.Dimension(32767, 50));
        panelBorder8.setMinimumSize(new java.awt.Dimension(100, 50));
        panelBorder8.setPreferredSize(new java.awt.Dimension(560, 100));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Cadastro do ponto de coleta");

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        panelBorder5.add(panelBorder8, java.awt.BorderLayout.PAGE_START);

        panelBorder9.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder9.setMaximumSize(new java.awt.Dimension(32767, 50));
        panelBorder9.setMinimumSize(new java.awt.Dimension(100, 50));
        panelBorder9.setPreferredSize(new java.awt.Dimension(560, 50));

        javax.swing.GroupLayout panelBorder9Layout = new javax.swing.GroupLayout(panelBorder9);
        panelBorder9.setLayout(panelBorder9Layout);
        panelBorder9Layout.setHorizontalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelBorder9Layout.setVerticalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelBorder5.add(panelBorder9, java.awt.BorderLayout.PAGE_END);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Arraste e solte ou selecione os arquivos clicando aqui");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelBorder10Layout = new javax.swing.GroupLayout(panelBorder10);
        panelBorder10.setLayout(panelBorder10Layout);
        panelBorder10Layout.setHorizontalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBorder10Layout.setVerticalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelBorder5.add(panelBorder10, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBorder5, java.awt.BorderLayout.CENTER);

        panelBorder4.setMaximumSize(new java.awt.Dimension(960, 50));
        panelBorder4.setMinimumSize(new java.awt.Dimension(960, 50));
        panelBorder4.setPreferredSize(new java.awt.Dimension(960, 50));

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panelBorder4, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(976, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoBackMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGoBackMouseClicked

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblGoBack;
    private br.com.loginform.components.PanelBorder panelBorder1;
    private br.com.loginform.components.PanelBorder panelBorder10;
    private br.com.loginform.components.PanelBorder panelBorder2;
    private br.com.loginform.components.PanelBorder panelBorder3;
    private br.com.loginform.components.PanelBorder panelBorder4;
    private br.com.loginform.components.PanelBorder panelBorder5;
    private br.com.loginform.components.PanelBorder panelBorder6;
    private br.com.loginform.components.PanelBorder panelBorder7;
    private br.com.loginform.components.PanelBorder panelBorder8;
    private br.com.loginform.components.PanelBorder panelBorder9;
    // End of variables declaration//GEN-END:variables
}
