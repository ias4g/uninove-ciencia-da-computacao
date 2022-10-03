package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
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

//        lblTitleImagePoint.setFont(Ubuntu_Bold_16);
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
        jpPointImage = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointImageTitle = new javax.swing.JLabel();
        lblPointImageSubTitle = new javax.swing.JLabel();
        jpPointImageDropzone = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointImageDropzone = new javax.swing.JLabel();
        lblPointImageNext = new br.com.loginform.components.JLabelRoundedBorder();
        jpPointDesc = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointDescTitle = new javax.swing.JLabel();
        lblPointDescSubTitle = new javax.swing.JLabel();
        lblPointDescNext = new br.com.loginform.components.JLabelRoundedBorder();

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

        jpPointImage.setLayout(null);

        lblPointImageTitle.setText("Imagem do ponto");
        jpPointImage.add(lblPointImageTitle);
        lblPointImageTitle.setBounds(20, 20, 170, 16);

        lblPointImageSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointImageSubTitle.setText("Insira a imagem do ponto de coleta");
        jpPointImage.add(lblPointImageSubTitle);
        lblPointImageSubTitle.setBounds(350, 24, 300, 16);

        jpPointImageDropzone.setBackground(new java.awt.Color(214, 245, 228));
        jpPointImageDropzone.setLayout(null);

        lblPointImageDropzone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointImageDropzone.setText("Clique aqui para selecionar uma imagem.");
        lblPointImageDropzone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 203, 121)));
        jpPointImageDropzone.add(lblPointImageDropzone);
        lblPointImageDropzone.setBounds(35, 24, 500, 252);

        jpPointImage.add(jpPointImageDropzone);
        jpPointImageDropzone.setBounds(50, 68, 570, 300);

        lblPointImageNext.setBackground(new java.awt.Color(255, 255, 255));
        lblPointImageNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointImageNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblPointImageNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointImageNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointImageNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointImageNextMouseExited(evt);
            }
        });
        jpPointImage.add(lblPointImageNext);
        lblPointImageNext.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointImage, "card2");

        lblPointDescTitle.setText("Descrição do ponto");

        lblPointDescSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointDescSubTitle.setText("Insira a descrição do ponto de coleta");

        lblPointDescNext.setBackground(new java.awt.Color(255, 255, 255));
        lblPointDescNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointDescNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblPointDescNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointDescNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointDescNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointDescNextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpPointDescLayout = new javax.swing.GroupLayout(jpPointDesc);
        jpPointDesc.setLayout(jpPointDescLayout);
        jpPointDescLayout.setHorizontalGroup(
            jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPointDescLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpPointDescLayout.createSequentialGroup()
                            .addComponent(lblPointDescTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(lblPointDescSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPointDescLayout.createSequentialGroup()
                            .addGap(606, 606, 606)
                            .addComponent(lblPointDescNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpPointDescLayout.setVerticalGroup(
            jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPointDescLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpPointDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPointDescTitle)
                        .addGroup(jpPointDescLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblPointDescSubTitle)))
                    .addGap(336, 336, 336)
                    .addComponent(lblPointDescNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpMain.add(jpPointDesc, "card3");

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

    private void lblPointImageNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageNextMouseEntered
        lblPointImageNext.setBackground(new Color(214, 245, 228));
    }//GEN-LAST:event_lblPointImageNextMouseEntered

    private void lblPointImageNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageNextMouseExited
        lblPointImageNext.setBackground(null);
    }//GEN-LAST:event_lblPointImageNextMouseExited

    private void lblPointDescNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPointDescNextMouseEntered

    private void lblPointDescNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPointDescNextMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JPanelRoundedBorder jpPointDesc;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImage;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImageDropzone;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblGoBack;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimize;
    private br.com.loginform.components.JLabelRoundedBorder lblPointDescNext;
    private javax.swing.JLabel lblPointDescSubTitle;
    private javax.swing.JLabel lblPointDescTitle;
    private javax.swing.JLabel lblPointImageDropzone;
    private br.com.loginform.components.JLabelRoundedBorder lblPointImageNext;
    private javax.swing.JLabel lblPointImageSubTitle;
    private javax.swing.JLabel lblPointImageTitle;
    // End of variables declaration//GEN-END:variables
}
