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

        lblButtonEnter.setFont(PTSans_Bold_16);
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
        lblButtonEnterIcon = new javax.swing.JLabel();
        lblButtonEnter = new javax.swing.JLabel();
        jpButtonChange = new br.com.loginform.components.JPanelButton();
        lblButtonEnterIcon1 = new javax.swing.JLabel();
        lblButtonEnter1 = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblSubTitle1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jpButtonRegister.add(lblButtonEnterIcon);
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
        jpButtonRegister.add(lblButtonEnter);
        lblButtonEnter.setBounds(56, 0, 236, 56);

        getContentPane().add(jpButtonRegister);
        jpButtonRegister.setBounds(60, 420, 292, 56);

        jpButtonChange.setBackground(new java.awt.Color(204, 204, 204));
        jpButtonChange.setLayout(null);

        lblButtonEnterIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/icon-button-enter.png"))); // NOI18N
        lblButtonEnterIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonEnterIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonEnterIcon1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonEnterIcon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonEnterIcon1MouseExited(evt);
            }
        });
        jpButtonChange.add(lblButtonEnterIcon1);
        lblButtonEnterIcon1.setBounds(0, 0, 56, 56);

        lblButtonEnter1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonEnter1.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonEnter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonEnter1.setText("Cadastre um ponto de coleta");
        lblButtonEnter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonEnter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonEnter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonEnter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonEnter1MouseExited(evt);
            }
        });
        jpButtonChange.add(lblButtonEnter1);
        lblButtonEnter1.setBounds(56, 0, 236, 56);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/question.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(916, 0, 36, 28);

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
        jpButtonRegister.setBackground(new Color(36, 143, 85));
    }//GEN-LAST:event_lblButtonEnterIconMouseEntered

    private void lblButtonEnterIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIconMouseExited
        jpButtonRegister.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonEnterIconMouseExited

    private void lblButtonEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseEntered
        jpButtonRegister.setBackground(new Color(36, 143, 85));
    }//GEN-LAST:event_lblButtonEnterMouseEntered

    private void lblButtonEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseExited
        jpButtonRegister.setBackground(new Color(52, 203, 121));
    }//GEN-LAST:event_lblButtonEnterMouseExited

    private void lblButtonEnterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIconMouseClicked
        lblButtonEnterIcon.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        new Register(this, true).setVisible(true);

        lblButtonEnterIcon.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    }//GEN-LAST:event_lblButtonEnterIconMouseClicked

    private void lblButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterMouseClicked
        lblButtonEnter.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        new Register(this, true).setVisible(true);

        lblButtonEnter.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblButtonEnterMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new About(this, true).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblButtonEnterIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIcon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnterIcon1MouseClicked

    private void lblButtonEnterIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIcon1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnterIcon1MouseEntered

    private void lblButtonEnterIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnterIcon1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnterIcon1MouseExited

    private void lblButtonEnter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnter1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnter1MouseClicked

    private void lblButtonEnter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnter1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnter1MouseEntered

    private void lblButtonEnter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonEnter1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonEnter1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private br.com.loginform.components.JPanelButton jpButtonChange;
    private br.com.loginform.components.JPanelButton jpButtonRegister;
    private javax.swing.JLabel lblButtonEnter;
    private javax.swing.JLabel lblButtonEnter1;
    private javax.swing.JLabel lblButtonEnterIcon;
    private javax.swing.JLabel lblButtonEnterIcon1;
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
