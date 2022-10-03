package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

public class Register extends javax.swing.JDialog {

    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Utilities.insertIconDialog(this);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);

        lblFaviconDescription.setFont(PTSans_Bold_12);
        lblGoBack.setFont(PTSans_Regular_16);

        lblTitleImagePoint.setFont(Ubuntu_Bold_16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblFaviconDescription = new javax.swing.JLabel();
        lblFavicon = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblGoBack = new javax.swing.JLabel();
        jpMain = new br.com.loginform.components.JPanelRoundedBorder();
        jpImagePoint = new br.com.loginform.components.JPanelRoundedBorder();
        lblTitleImagePoint = new javax.swing.JLabel();
        jpBgGreenImagePoint = new br.com.loginform.components.JPanelRoundedBorder();
        lblImageDescriptionImagePoint = new javax.swing.JLabel();
        jpButtonNextImagePoint = new br.com.loginform.components.JPanelRoundedBorder();
        lblButtonNextImagePoint = new javax.swing.JLabel();
        jpPointDescription = new br.com.loginform.components.JPanelRoundedBorder();
        lblTitlePointDescription = new javax.swing.JLabel();
        jpButtonBackPointDescription = new br.com.loginform.components.JPanelRoundedBorder();
        lblButtonBackPointDescription = new javax.swing.JLabel();
        jpButtonNextPointDescription = new br.com.loginform.components.JPanelRoundedBorder();
        lblButtonNextPointDescription = new javax.swing.JLabel();
        jpPointAddress = new br.com.loginform.components.JPanelRoundedBorder();
        lblTitleAddress = new javax.swing.JLabel();
        lblTitleInfoAddress = new javax.swing.JLabel();
        jpButtonNextAddressPoint = new br.com.loginform.components.JPanelRoundedBorder();
        lblButtonNextAddressPoint = new javax.swing.JLabel();
        jpButtonBackAddressPoint = new br.com.loginform.components.JPanelRoundedBorder();
        lblButtonBackAddressPoint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pontos de coletas");
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

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

        lblFaviconDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFaviconDescription.setText("Ecoleta | Cadastro de ponto");
        getContentPane().add(lblFaviconDescription);
        lblFaviconDescription.setBounds(30, 10, 250, 14);

        lblFavicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/favicon.png"))); // NOI18N
        getContentPane().add(lblFavicon);
        lblFavicon.setBounds(10, 10, 13, 16);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(60, 60, 112, 32);

        lblGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-left.png"))); // NOI18N
        lblGoBack.setText("Voltar");
        lblGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblGoBack);
        lblGoBack.setBounds(899, 71, 90, 18);

        jpMain.setLayout(new java.awt.CardLayout());

        jpImagePoint.setOpaque(true);
        jpImagePoint.setLayout(null);

        lblTitleImagePoint.setText("Imagem do ponto");
        jpImagePoint.add(lblTitleImagePoint);
        lblTitleImagePoint.setBounds(20, 20, 200, 16);

        jpBgGreenImagePoint.setBackground(new java.awt.Color(214, 245, 228));
        jpBgGreenImagePoint.setLayout(null);

        lblImageDescriptionImagePoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageDescriptionImagePoint.setText("Clique aqui para selecionar uma imagem.");
        lblImageDescriptionImagePoint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 203, 121)));
        lblImageDescriptionImagePoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpBgGreenImagePoint.add(lblImageDescriptionImagePoint);
        lblImageDescriptionImagePoint.setBounds(35, 24, 500, 252);

        jpImagePoint.add(jpBgGreenImagePoint);
        jpBgGreenImagePoint.setBounds(50, 70, 570, 300);

        jpButtonNextImagePoint.setLayout(null);

        lblButtonNextImagePoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonNextImagePoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblButtonNextImagePoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonNextImagePoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblButtonNextImagePoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonNextImagePointMouseClicked(evt);
            }
        });
        jpButtonNextImagePoint.add(lblButtonNextImagePoint);
        lblButtonNextImagePoint.setBounds(0, 0, 36, 36);

        jpImagePoint.add(jpButtonNextImagePoint);
        jpButtonNextImagePoint.setBounds(626, 376, 36, 36);

        jpMain.add(jpImagePoint, "cardImage");

        jpPointDescription.setOpaque(true);
        jpPointDescription.setLayout(null);

        lblTitlePointDescription.setText("Descrição do ponto");
        jpPointDescription.add(lblTitlePointDescription);
        lblTitlePointDescription.setBounds(20, 20, 200, 16);

        jpButtonBackPointDescription.setLayout(null);

        lblButtonBackPointDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonBackPointDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-left-10x.png"))); // NOI18N
        lblButtonBackPointDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblButtonBackPointDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonBackPointDescriptionMouseClicked(evt);
            }
        });
        jpButtonBackPointDescription.add(lblButtonBackPointDescription);
        lblButtonBackPointDescription.setBounds(0, 0, 36, 36);

        jpPointDescription.add(jpButtonBackPointDescription);
        jpButtonBackPointDescription.setBounds(8, 376, 36, 36);

        jpButtonNextPointDescription.setLayout(null);

        lblButtonNextPointDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonNextPointDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblButtonNextPointDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonNextPointDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblButtonNextPointDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonNextPointDescriptionMouseClicked(evt);
            }
        });
        jpButtonNextPointDescription.add(lblButtonNextPointDescription);
        lblButtonNextPointDescription.setBounds(0, 0, 36, 36);

        jpPointDescription.add(jpButtonNextPointDescription);
        jpButtonNextPointDescription.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointDescription, "cardDescription");

        jpPointAddress.setOpaque(true);
        jpPointAddress.setLayout(null);

        lblTitleAddress.setText("Endereço do ponto");
        jpPointAddress.add(lblTitleAddress);
        lblTitleAddress.setBounds(20, 20, 200, 16);

        lblTitleInfoAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTitleInfoAddress.setText("Insira o cep para preencher alguns campos");
        lblTitleInfoAddress.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jpPointAddress.add(lblTitleInfoAddress);
        lblTitleInfoAddress.setBounds(358, 24, 292, 16);

        jpButtonNextAddressPoint.setLayout(null);

        lblButtonNextAddressPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonNextAddressPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblButtonNextAddressPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonNextAddressPoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblButtonNextAddressPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonNextAddressPointMouseClicked(evt);
            }
        });
        jpButtonNextAddressPoint.add(lblButtonNextAddressPoint);
        lblButtonNextAddressPoint.setBounds(0, 0, 36, 36);

        jpPointAddress.add(jpButtonNextAddressPoint);
        jpButtonNextAddressPoint.setBounds(626, 376, 36, 36);

        jpButtonBackAddressPoint.setLayout(null);

        lblButtonBackAddressPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonBackAddressPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-left-10x.png"))); // NOI18N
        lblButtonBackAddressPoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpButtonBackAddressPoint.add(lblButtonBackAddressPoint);
        lblButtonBackAddressPoint.setBounds(0, 0, 36, 36);

        jpPointAddress.add(jpButtonBackAddressPoint);
        jpButtonBackAddressPoint.setBounds(8, 376, 36, 36);

        jpMain.add(jpPointAddress, "cardAddress");

        getContentPane().add(jpMain);
        jpMain.setBounds(177, 120, 670, 420);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        dispose();
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

    private void lblButtonNextImagePointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonNextImagePointMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardDescription");
    }//GEN-LAST:event_lblButtonNextImagePointMouseClicked

    private void lblButtonNextPointDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonNextPointDescriptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonNextPointDescriptionMouseClicked

    private void lblButtonNextAddressPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonNextAddressPointMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblButtonNextAddressPointMouseClicked

    private void lblButtonBackPointDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonBackPointDescriptionMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardImage");
    }//GEN-LAST:event_lblButtonBackPointDescriptionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.loginform.components.JPanelRoundedBorder jpBgGreenImagePoint;
    private br.com.loginform.components.JPanelRoundedBorder jpButtonBackAddressPoint;
    private br.com.loginform.components.JPanelRoundedBorder jpButtonBackPointDescription;
    private br.com.loginform.components.JPanelRoundedBorder jpButtonNextAddressPoint;
    private br.com.loginform.components.JPanelRoundedBorder jpButtonNextImagePoint;
    private br.com.loginform.components.JPanelRoundedBorder jpButtonNextPointDescription;
    private br.com.loginform.components.JPanelRoundedBorder jpImagePoint;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JPanelRoundedBorder jpPointAddress;
    private br.com.loginform.components.JPanelRoundedBorder jpPointDescription;
    private javax.swing.JLabel lblButtonBackAddressPoint;
    private javax.swing.JLabel lblButtonBackPointDescription;
    private javax.swing.JLabel lblButtonNextAddressPoint;
    private javax.swing.JLabel lblButtonNextImagePoint;
    private javax.swing.JLabel lblButtonNextPointDescription;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblGoBack;
    private javax.swing.JLabel lblImageDescriptionImagePoint;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTitleAddress;
    private javax.swing.JLabel lblTitleImagePoint;
    private javax.swing.JLabel lblTitleInfoAddress;
    private javax.swing.JLabel lblTitlePointDescription;
    // End of variables declaration//GEN-END:variables
}
