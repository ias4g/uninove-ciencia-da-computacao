package br.com.loginform.screem;

import br.com.loginform.utils.Utilities;
import java.awt.Color;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        customComponents();
    }

    private void customComponents() {
        Utilities.insertIconFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFavicon = new javax.swing.JLabel();
        lblFaviconDescription = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jpButtonEnter = new br.com.loginform.components.JPanelButton();
        lblButtonEnterIcon = new javax.swing.JLabel();
        lblButtonEnter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

        lblFavicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/favicon.png"))); // NOI18N
        getContentPane().add(lblFavicon);
        lblFavicon.setBounds(10, 10, 13, 16);

        lblFaviconDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFaviconDescription.setText("Ecoleta | Dashboard");
        getContentPane().add(lblFaviconDescription);
        lblFaviconDescription.setBounds(30, 10, 250, 14);

        lblClose.setBackground(new java.awt.Color(248, 248, 228));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/close.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.setOpaque(true);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(974, 0, 50, 25);

        lblMinimize.setBackground(new java.awt.Color(248, 248, 228));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/minimize.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.setOpaque(true);
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        getContentPane().add(lblMinimize);
        lblMinimize.setBounds(924, 0, 50, 25);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(80, 80, 112, 32);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblTitle.setText("<html>Seu marketplace<br>de coleta de<br>resíduos</html>");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(80, 164, 310, 120);

        lblSubTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSubTitle.setText("<html>Ajudamos pessoas a encontrarem pontos<br>de coleta de forma eficiente</html>");
        lblSubTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblSubTitle);
        lblSubTitle.setBounds(80, 323, 500, 80);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-image.png"))); // NOI18N
        getContentPane().add(lblImage);
        lblImage.setBounds(588, 117, 356, 393);

        jpButtonEnter.setLayout(null);

        lblButtonEnterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/icon-button-enter.png"))); // NOI18N
        lblButtonEnterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonEnterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonEnterIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonEnterIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonEnterIconMouseExited(evt);
            }
        });
        jpButtonEnter.add(lblButtonEnterIcon);
        lblButtonEnterIcon.setBounds(0, 0, 56, 56);

        lblButtonEnter.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonEnter.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonEnter.setText("Cadastre um ponto de coleta");
        lblButtonEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonEnterMouseExited(evt);
            }
        });
        jpButtonEnter.add(lblButtonEnter);
        lblButtonEnter.setBounds(56, 0, 236, 56);

        getContentPane().add(jpButtonEnter);
        jpButtonEnter.setBounds(80, 425, 292, 56);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setBackground(Color.red);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBackground(null);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        lblMinimize.setBackground(new Color(192, 213, 255));
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        lblMinimize.setBackground(null);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblButtonEnterIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIconMouseEntered
        jpButtonEnter.setBackground(new Color(36, 143, 85));
    }//GEN-LAST:event_lblButtonEnterIconMouseEntered

    private void lblButtonEnterIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIconMouseExited
        jpButtonEnter.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonEnterIconMouseExited

    private void lblButtonEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseEntered
        jpButtonEnter.setBackground(new Color(36, 143, 85));
    }//GEN-LAST:event_lblButtonEnterMouseEntered

    private void lblButtonEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseExited
        jpButtonEnter.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonEnterMouseExited

    private void lblButtonEnterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIconMouseClicked
        new Register(this, true).setVisible(true);
    }//GEN-LAST:event_lblButtonEnterIconMouseClicked

    private void lblButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseClicked
        new Register(this, true).setVisible(true);
    }//GEN-LAST:event_lblButtonEnterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.loginform.components.JPanelButton jpButtonEnter;
    private javax.swing.JLabel lblButtonEnter;
    private javax.swing.JLabel lblButtonEnterIcon;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
