package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        customComponents();
    }

    private void customComponents() {
        Utilities.insertIconFrame(this);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
        Font Ubuntu_Bold_32 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 32f);
        Font PTSans_Bold_16 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 16f);
        Font PTSans_Regular_24 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 24f);

        lblFaviconDescription.setFont(PTSans_Bold_12);

        lblTitle1.setFont(Ubuntu_Bold_32);
        lblTitle2.setFont(Ubuntu_Bold_32);
        lblTitle3.setFont(Ubuntu_Bold_32);

        lblSubTitle1.setFont(PTSans_Regular_24);
        lblSubTitle2.setFont(PTSans_Regular_24);

        lblButtonRegister.setFont(PTSans_Bold_16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFavicon = new javax.swing.JLabel();
        lblFaviconDescription = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblSubTitle2 = new javax.swing.JLabel();
        jpButtonRegister = new br.com.loginform.components.JPanelButton();
        lblButtonRegisterIcon = new javax.swing.JLabel();
        lblButtonRegister = new javax.swing.JLabel();
        jpButtonChange = new br.com.loginform.components.JPanelButton();
        lblButtonChangeIcon = new javax.swing.JLabel();
        lblButtonChange = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblSubTitle1 = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();

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
        lblClose.setBounds(988, 0, 36, 28);

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
        lblMinimize.setBounds(952, 0, 36, 28);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(60, 60, 112, 32);

        lblTitle2.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblTitle2.setText("de coleta de");
        lblTitle2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle2);
        lblTitle2.setBounds(60, 211, 310, 40);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-image.png"))); // NOI18N
        getContentPane().add(lblImage);
        lblImage.setBounds(608, 137, 356, 393);

        lblSubTitle2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSubTitle2.setText("de coleta de forma eficiente");
        lblSubTitle2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblSubTitle2);
        lblSubTitle2.setBounds(60, 366, 460, 30);

        jpButtonRegister.setLayout(null);

        lblButtonRegisterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/icon-button-enter.png"))); // NOI18N
        lblButtonRegisterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonRegisterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonRegisterIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonRegisterIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonRegisterIconMouseExited(evt);
            }
        });
        jpButtonRegister.add(lblButtonRegisterIcon);
        lblButtonRegisterIcon.setBounds(0, 0, 56, 56);

        lblButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonRegister.setText("Cadastre um ponto de coleta");
        lblButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonRegisterMouseExited(evt);
            }
        });
        jpButtonRegister.add(lblButtonRegister);
        lblButtonRegister.setBounds(56, 0, 236, 56);

        getContentPane().add(jpButtonRegister);
        jpButtonRegister.setBounds(60, 420, 292, 56);

        jpButtonChange.setBackground(new java.awt.Color(102, 51, 204));
        jpButtonChange.setLayout(null);

        lblButtonChangeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/icon-button-enter.png"))); // NOI18N
        lblButtonChangeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonChangeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonChangeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonChangeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonChangeIconMouseExited(evt);
            }
        });
        jpButtonChange.add(lblButtonChangeIcon);
        lblButtonChangeIcon.setBounds(0, 0, 56, 56);

        lblButtonChange.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonChange.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonChange.setText("Cadastre um ponto de coleta");
        lblButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonChangeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonChangeMouseExited(evt);
            }
        });
        jpButtonChange.add(lblButtonChange);
        lblButtonChange.setBounds(56, 0, 236, 56);

        getContentPane().add(jpButtonChange);
        jpButtonChange.setBounds(60, 484, 292, 56);

        lblTitle1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblTitle1.setText("Seu marketplace");
        lblTitle1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle1);
        lblTitle1.setBounds(60, 164, 370, 40);

        lblTitle3.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblTitle3.setText("resíduos");
        lblTitle3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblTitle3);
        lblTitle3.setBounds(60, 258, 310, 40);

        lblSubTitle1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSubTitle1.setText("Ajudamos pessoas a encontrarem pontos");
        lblSubTitle1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblSubTitle1);
        lblSubTitle1.setBounds(60, 325, 500, 30);

        lblAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/question.png"))); // NOI18N
        lblAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });
        getContentPane().add(lblAbout);
        lblAbout.setBounds(916, 0, 36, 28);

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

    private void lblButtonRegisterIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterIconMouseEntered
        jpButtonRegister.setBackground(new Color(55, 178, 111));
    }//GEN-LAST:event_lblButtonRegisterIconMouseEntered

    private void lblButtonRegisterIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterIconMouseExited
        jpButtonRegister.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonRegisterIconMouseExited

    private void lblButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterMouseEntered
        jpButtonRegister.setBackground(new Color(55, 178, 111));
    }//GEN-LAST:event_lblButtonRegisterMouseEntered

    private void lblButtonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterMouseExited
        jpButtonRegister.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonRegisterMouseExited

    private void lblButtonRegisterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterIconMouseClicked
        lblButtonRegisterIcon.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        new Register(this, true).setVisible(true);

        lblButtonRegisterIcon.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    }//GEN-LAST:event_lblButtonRegisterIconMouseClicked

    private void lblButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonRegisterMouseClicked
        lblButtonRegister.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        new Register(this, true).setVisible(true);

        lblButtonRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblButtonRegisterMouseClicked

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        new About(this, true).setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked

    private void lblButtonChangeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonChangeIconMouseClicked

    private void lblButtonChangeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeIconMouseEntered
        jpButtonChange.setBackground(new Color(85, 42, 172));
    }//GEN-LAST:event_lblButtonChangeIconMouseEntered

    private void lblButtonChangeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeIconMouseExited
        jpButtonChange.setBackground(new Color(102, 51, 204));
    }//GEN-LAST:event_lblButtonChangeIconMouseExited

    private void lblButtonChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonChangeMouseClicked

    private void lblButtonChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeMouseEntered
        jpButtonChange.setBackground(new Color(85, 42, 172));
    }//GEN-LAST:event_lblButtonChangeMouseEntered

    private void lblButtonChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonChangeMouseExited
        jpButtonChange.setBackground(new Color(102, 51, 204));
    }//GEN-LAST:event_lblButtonChangeMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.loginform.components.JPanelButton jpButtonChange;
    private br.com.loginform.components.JPanelButton jpButtonRegister;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblButtonChange;
    private javax.swing.JLabel lblButtonChangeIcon;
    private javax.swing.JLabel lblButtonRegister;
    private javax.swing.JLabel lblButtonRegisterIcon;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblSubTitle1;
    private javax.swing.JLabel lblSubTitle2;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    // End of variables declaration//GEN-END:variables
}
