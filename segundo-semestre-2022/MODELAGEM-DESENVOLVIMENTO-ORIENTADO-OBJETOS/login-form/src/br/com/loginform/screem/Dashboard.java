package br.com.loginform.screem;

import br.com.loginform.utils.Utilities;
import java.awt.Color;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        customComponents();
    }

    private void customComponents() {
        Utilities.insertIconFrm(this);
        setBackground(new Color(0, 0, 0));
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

        lblFavicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/favicon.png"))); // NOI18N
        getContentPane().add(lblFavicon);
        lblFavicon.setBounds(10, 10, 13, 16);

        lblFaviconDescription.setText("Ecoleta | Dashboard");
        getContentPane().add(lblFaviconDescription);
        lblFaviconDescription.setBounds(30, 10, 110, 16);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/close.png"))); // NOI18N
        getContentPane().add(lblClose);
        lblClose.setBounds(984, 0, 40, 20);

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/minimize.png"))); // NOI18N
        getContentPane().add(lblMinimize);
        lblMinimize.setBounds(944, 0, 40, 20);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(80, 80, 112, 32);

        lblTitle.setText("<html>Seu marketplace<br>de coleta de<br>resíduos</html>");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(80, 164, 310, 160);

        lblSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSubTitle.setText("<html>Ajudamos pessoas a encontrarem pontos<br>de coleta de forma eficiente</html>");
        lblSubTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblSubTitle);
        lblSubTitle.setBounds(80, 323, 500, 80);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
