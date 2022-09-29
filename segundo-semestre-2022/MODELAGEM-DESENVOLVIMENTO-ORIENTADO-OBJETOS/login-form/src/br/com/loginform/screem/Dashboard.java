package br.com.loginform.screem;

import br.com.loginform.utils.Fonts;
import br.com.loginform.utils.Utilities;
import java.awt.Color;
import static java.lang.Thread.sleep;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        customComponents();
        setFonts();
    }

    private void customComponents() {
        Utilities.insertIconFrm(this);
        setBackground(new Color(0, 0, 0));
    }

    private void setFonts() {

        new Thread() {
            @Override
            public void run() {
                lblFaviconDescription.setFont(new Fonts().getPT_SANS_BOLD_12());
                lblTitle.setFont(new Fonts().getUBUNTU_BOLD_32());
            }
        }.start();

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

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblTitle.setText("<html>Seu marketplace<br>de coleta de<br>resíduos</html>");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(80, 164, 310, 160);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
