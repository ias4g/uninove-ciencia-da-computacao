package br.com.loginform.screem;

import br.com.loginform.utils.FontsLoad;
import br.com.loginform.utils.Utilities;
import java.awt.Color;
import java.awt.Font;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        setBackground(new Color(0, 0, 0));
        initComponents();

        Utilities.insertIcon(this);

        final Font UBUNTU_BOLD_32 = new FontsLoad().loadFonts("/br/com/loginform/fonts/ubuntubold.ttf", Font.BOLD, 32);
        final Font PT_SANS_REGULAR_16 = new FontsLoad().loadFonts("/br/com/loginform/fonts/ptsansregular.ttf", Font.PLAIN, 16);
        final Font PT_SANS_REGULAR_12 = new FontsLoad().loadFonts("/br/com/loginform/fonts/ptsansregular.ttf", Font.PLAIN, 12);

        lblDescriptionHeader.setFont(PT_SANS_REGULAR_12);
        lblSeu.setFont(UBUNTU_BOLD_32);
        lblDe.setFont(UBUNTU_BOLD_32);
        lblResiduo.setFont(UBUNTU_BOLD_32);

        lblAjudamos.setFont(PT_SANS_REGULAR_16);
        lblColeta.setFont(PT_SANS_REGULAR_16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblResiduo = new javax.swing.JLabel();
        lblSeu = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        lblColeta = new javax.swing.JLabel();
        lblAjudamos = new javax.swing.JLabel();
        jpButton = new br.com.loginform.components.JPanelButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblDescriptionHeader = new javax.swing.JLabel();
        lblLogoHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setBackground(new java.awt.Color(244, 244, 244));
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(80, 80, 236, 64);

        lblResiduo.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblResiduo.setText("resíduos");
        getContentPane().add(lblResiduo);
        lblResiduo.setBounds(80, 280, 320, 43);

        lblSeu.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblSeu.setText("Seu marketplace");
        getContentPane().add(lblSeu);
        lblSeu.setBounds(80, 200, 320, 43);

        lblDe.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblDe.setText("de coleta de");
        getContentPane().add(lblDe);
        lblDe.setBounds(80, 240, 320, 43);

        lblColeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblColeta.setText("coleta de forma eficiente");
        getContentPane().add(lblColeta);
        lblColeta.setBounds(80, 380, 320, 16);

        lblAjudamos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAjudamos.setText("Ajudamos pessoas a encontrarem pontos de");
        getContentPane().add(lblAjudamos);
        lblAjudamos.setBounds(80, 350, 320, 22);

        jpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpButtonMouseExited(evt);
            }
        });
        jpButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/button-icon.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastre um ponto de coleta");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpButton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 290, 70));

        getContentPane().add(jpButton);
        jpButton.setBounds(80, 430, 360, 72);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/image-header.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(543, 108, 392, 434);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/close-header.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        lblClose.setBounds(980, 0, 40, 20);

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/minimize-header.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblMinimize);
        lblMinimize.setBounds(900, 40, 40, 20);

        lblDescriptionHeader.setText("Ecoleta | Tela Inicial");
        getContentPane().add(lblDescriptionHeader);
        lblDescriptionHeader.setBounds(30, 5, 140, 16);

        lblLogoHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/logo-header.png"))); // NOI18N
        getContentPane().add(lblLogoHeader);
        lblLogoHeader.setBounds(5, 5, 13, 16);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setBackground(Color.red);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBackground(null);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void jpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpButtonMouseEntered
        jpButton.setBackground(new Color(52, 180, 121));
    }//GEN-LAST:event_jpButtonMouseEntered

    private void jpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpButtonMouseExited
        jpButton.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_jpButtonMouseExited

    private void jpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpButtonMouseClicked
        Register dialog = new Register(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jpButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private br.com.loginform.components.JPanelButton jpButton;
    private javax.swing.JLabel lblAjudamos;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblColeta;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDescriptionHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoHeader;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblResiduo;
    private javax.swing.JLabel lblSeu;
    // End of variables declaration//GEN-END:variables
}
