package br.com.loginform.screem;

import br.com.loginform.utils.FontsLoad;
import br.com.loginform.utils.Utilities;
import java.awt.Font;

public class Register extends javax.swing.JFrame {

    public Register() {

        initComponents();

        Utilities.insertIcon(this);

        final Font PT_SANS_REGULAR_12 = new FontsLoad().loadFonts("/br/com/loginform/fonts/ptsansregular.ttf", Font.PLAIN, 12);
        final Font UBUNTU_BOLD_12 = new FontsLoad().loadFonts("/br/com/loginform/fonts/ubuntubold.ttf", Font.BOLD, 12);

        lblGoBack.setFont(UBUNTU_BOLD_12);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblGoBack = new javax.swing.JLabel();

        setTitle("Cadastro de pontos de coletas");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setName("jfRegister"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/main/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(80, 80, 236, 64);

        lblGoBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblGoBack.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/register/icon-go-back.png"))); // NOI18N
        lblGoBack.setText("Voltar para home");
        lblGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblGoBack);
        lblGoBack.setBounds(810, 100, 170, 24);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoBackMouseClicked
        dispose();
    }//GEN-LAST:event_lblGoBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGoBack;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
