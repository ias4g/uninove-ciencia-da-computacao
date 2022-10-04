package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JDialog {

    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Utilities.insertIconDialog(this);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);

        lblFaviconDescription.setFont(PTSans_Bold_12);

//        lblTitleImagePoint.setFont(Ubuntu_Bold_16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblFaviconDescription = new javax.swing.JLabel();
        lblFavicon = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
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
        jpPointAddress = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointAddressTitle = new javax.swing.JLabel();
        lblPointAddressSubTitle = new javax.swing.JLabel();
        lblPointAddressNext = new br.com.loginform.components.JLabelRoundedBorder();
        jpPointItens = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointItensTitle = new javax.swing.JLabel();
        lblPointItensSubTitle = new javax.swing.JLabel();
        lblPointItensSave = new br.com.loginform.components.JLabelRoundedBorder();
        jpSucess = new br.com.loginform.components.JPanelRoundedBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCloseSuccess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pontos de coletas");
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

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
        lblPointImageDropzone.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lblPointImageDropzone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointImageDropzoneMouseClicked(evt);
            }
        });
        jpPointImageDropzone.add(lblPointImageDropzone);
        lblPointImageDropzone.setBounds(35, 24, 500, 252);

        jpPointImage.add(jpPointImageDropzone);
        jpPointImageDropzone.setBounds(50, 68, 570, 300);

        lblPointImageNext.setBackground(new java.awt.Color(255, 255, 255));
        lblPointImageNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointImageNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblPointImageNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointImageNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointImageNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointImageNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointImageNextMouseExited(evt);
            }
        });
        jpPointImage.add(lblPointImageNext);
        lblPointImageNext.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointImage, "cardImage");

        jpPointDesc.setLayout(null);

        lblPointDescTitle.setText("Descrição do ponto");
        jpPointDesc.add(lblPointDescTitle);
        lblPointDescTitle.setBounds(20, 20, 170, 16);

        lblPointDescSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointDescSubTitle.setText("Insira a descrição do ponto de coleta");
        jpPointDesc.add(lblPointDescSubTitle);
        lblPointDescSubTitle.setBounds(350, 24, 300, 16);

        lblPointDescNext.setBackground(new java.awt.Color(255, 255, 255));
        lblPointDescNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointDescNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblPointDescNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointDescNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointDescNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointDescNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointDescNextMouseExited(evt);
            }
        });
        jpPointDesc.add(lblPointDescNext);
        lblPointDescNext.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointDesc, "cardDescription");

        jpPointAddress.setLayout(null);

        lblPointAddressTitle.setText("Endereço do ponto");
        jpPointAddress.add(lblPointAddressTitle);
        lblPointAddressTitle.setBounds(20, 20, 170, 16);

        lblPointAddressSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointAddressSubTitle.setText("Insira o cep para preencher alguns campos");
        jpPointAddress.add(lblPointAddressSubTitle);
        lblPointAddressSubTitle.setBounds(350, 24, 300, 16);

        lblPointAddressNext.setBackground(new java.awt.Color(255, 255, 255));
        lblPointAddressNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointAddressNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/arrow-right-10x.png"))); // NOI18N
        lblPointAddressNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointAddressNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointAddressNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointAddressNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointAddressNextMouseExited(evt);
            }
        });
        jpPointAddress.add(lblPointAddressNext);
        lblPointAddressNext.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointAddress, "cardAddress");

        jpPointItens.setLayout(null);

        lblPointItensTitle.setText("Itens de coleta");
        jpPointItens.add(lblPointItensTitle);
        lblPointItensTitle.setBounds(20, 20, 170, 16);

        lblPointItensSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointItensSubTitle.setText("Selecione os itens que o ponto coleta");
        jpPointItens.add(lblPointItensSubTitle);
        lblPointItensSubTitle.setBounds(350, 24, 300, 16);

        lblPointItensSave.setBackground(new java.awt.Color(255, 255, 255));
        lblPointItensSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointItensSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/save.png"))); // NOI18N
        lblPointItensSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointItensSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointItensSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPointItensSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPointItensSaveMouseExited(evt);
            }
        });
        jpPointItens.add(lblPointItensSave);
        lblPointItensSave.setBounds(626, 376, 36, 36);

        jpMain.add(jpPointItens, "cardItens");

        jpSucess.setBackground(new java.awt.Color(214, 245, 228));
        jpSucess.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/successful.png"))); // NOI18N
        jpSucess.add(jLabel2);
        jLabel2.setBounds(303, 152, 64, 64);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro concluído");
        jpSucess.add(jLabel1);
        jLabel1.setBounds(185, 232, 300, 30);

        lblCloseSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseSuccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/close-modal.png"))); // NOI18N
        lblCloseSuccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCloseSuccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseSuccessMouseClicked(evt);
            }
        });
        jpSucess.add(lblCloseSuccess);
        lblCloseSuccess.setBounds(618, 20, 32, 32);

        jpMain.add(jpSucess, "cardSuccess");

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

    private void lblPointImageNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageNextMouseEntered
        lblPointImageNext.setBackground(new Color(214, 245, 228));
    }//GEN-LAST:event_lblPointImageNextMouseEntered

    private void lblPointImageNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageNextMouseExited
        lblPointImageNext.setBackground(null);
    }//GEN-LAST:event_lblPointImageNextMouseExited

    private void lblPointDescNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseEntered
        lblPointDescNext.setBackground(new Color(214, 245, 228));
    }//GEN-LAST:event_lblPointDescNextMouseEntered

    private void lblPointDescNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseExited
        lblPointDescNext.setBackground(null);
    }//GEN-LAST:event_lblPointDescNextMouseExited

    private void lblPointAddressNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointAddressNextMouseEntered
        lblPointAddressNext.setBackground(new Color(214, 245, 228));
    }//GEN-LAST:event_lblPointAddressNextMouseEntered

    private void lblPointAddressNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointAddressNextMouseExited
        lblPointAddressNext.setBackground(null);
    }//GEN-LAST:event_lblPointAddressNextMouseExited

    private void lblPointItensSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointItensSaveMouseEntered
        lblPointItensSave.setBackground(new Color(214, 245, 228));
    }//GEN-LAST:event_lblPointItensSaveMouseEntered

    private void lblPointItensSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointItensSaveMouseExited
        lblPointItensSave.setBackground(null);
    }//GEN-LAST:event_lblPointItensSaveMouseExited

    private void lblPointImageNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageNextMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardDescription");
    }//GEN-LAST:event_lblPointImageNextMouseClicked

    private void lblPointDescNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardAddress");
    }//GEN-LAST:event_lblPointDescNextMouseClicked

    private void lblPointAddressNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointAddressNextMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardItens");
    }//GEN-LAST:event_lblPointAddressNextMouseClicked

    private void lblPointItensSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointItensSaveMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardSuccess");
    }//GEN-LAST:event_lblPointItensSaveMouseClicked

    private void lblCloseSuccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseSuccessMouseClicked
        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardImage");
    }//GEN-LAST:event_lblCloseSuccessMouseClicked

    private void lblPointImageDropzoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageDropzoneMouseClicked
        selectImage();
    }//GEN-LAST:event_lblPointImageDropzoneMouseClicked

    public File selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens em JPEG  e PNG", "jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.showOpenDialog(this);

        return fileChooser.getSelectedFile();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JPanelRoundedBorder jpPointAddress;
    private br.com.loginform.components.JPanelRoundedBorder jpPointDesc;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImage;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImageDropzone;
    private br.com.loginform.components.JPanelRoundedBorder jpPointItens;
    private br.com.loginform.components.JPanelRoundedBorder jpSucess;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCloseSuccess;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblLogo;
    private br.com.loginform.components.JLabelRoundedBorder lblPointAddressNext;
    private javax.swing.JLabel lblPointAddressSubTitle;
    private javax.swing.JLabel lblPointAddressTitle;
    private br.com.loginform.components.JLabelRoundedBorder lblPointDescNext;
    private javax.swing.JLabel lblPointDescSubTitle;
    private javax.swing.JLabel lblPointDescTitle;
    private javax.swing.JLabel lblPointImageDropzone;
    private br.com.loginform.components.JLabelRoundedBorder lblPointImageNext;
    private javax.swing.JLabel lblPointImageSubTitle;
    private javax.swing.JLabel lblPointImageTitle;
    private br.com.loginform.components.JLabelRoundedBorder lblPointItensSave;
    private javax.swing.JLabel lblPointItensSubTitle;
    private javax.swing.JLabel lblPointItensTitle;
    // End of variables declaration//GEN-END:variables
}
