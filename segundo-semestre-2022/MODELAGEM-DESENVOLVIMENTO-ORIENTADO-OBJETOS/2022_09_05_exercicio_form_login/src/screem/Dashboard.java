package screem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        System.out.println(this.getWidth());

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        lblTitle.setBounds((tela.width - lblTitle.getWidth()) / 2, 10, 92, 25);
        lblClose.setBounds(tela.width - 34, 10, 24, 24);
        lblSeparator.setBounds(0, 43, tela.width, 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblIconLogin = new javax.swing.JLabel();
        lblSeparator = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setTitle("Tela de cadastro");
        setIconImage(new ImageIcon(getClass().getResource("/assets/logo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        jpPrincipal.setBackground(new java.awt.Color(52, 58, 64));
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
        lblClose.setBounds(456, 10, 24, 24);

        lblIconLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        lblIconLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblIconLogin);
        lblIconLogin.setBounds(10, 10, 24, 24);

        lblSeparator.setBackground(new java.awt.Color(102, 102, 102));
        lblSeparator.setOpaque(true);
        jpPrincipal.add(lblSeparator);
        lblSeparator.setBounds(0, 43, 500, 2);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Dashboard");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblTitle);
        lblTitle.setBounds(202, 10, 92, 25);

        getContentPane().add(jpPrincipal, "card2");

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblIconLogin;
    private javax.swing.JLabel lblSeparator;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
