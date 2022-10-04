package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JDialog {

    private boolean isSelectedBatteries = false;
    private boolean isSelectedElectronicWaste = false;
    private boolean isSelectedlamps = false;
    private boolean isSelectedOrganicWaste = false;
    private boolean isSelectedKitchenOil = false;
    private boolean isSelectedPapersCardboard = false;

    ArrayList<String> itensSelected;

    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.itensSelected = new ArrayList();
        initComponents();

        Utilities.insertIconDialog(this);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
//        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

//        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);
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
        jTextFieldCustom1 = new br.com.loginform.components.JTextFieldCustom();
        jTextFieldCustom2 = new br.com.loginform.components.JTextFieldCustom();
        jTextFieldCustom3 = new br.com.loginform.components.JTextFieldCustom();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpPointAddress = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointAddressTitle = new javax.swing.JLabel();
        lblPointAddressSubTitle = new javax.swing.JLabel();
        lblPointAddressNext = new br.com.loginform.components.JLabelRoundedBorder();
        jTextFieldCustom5 = new br.com.loginform.components.JTextFieldCustom();
        jTextFieldCustom6 = new br.com.loginform.components.JTextFieldCustom();
        jTextFieldCustom7 = new br.com.loginform.components.JTextFieldCustom();
        jTextFieldCustom8 = new br.com.loginform.components.JTextFieldCustom();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpPointItens = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointItensTitle = new javax.swing.JLabel();
        lblPointItensSubTitle = new javax.swing.JLabel();
        lblPointItensSave = new br.com.loginform.components.JLabelRoundedBorder();
        jpItens = new javax.swing.JPanel();
        lblBatteries = new br.com.loginform.components.JLabelRoundedBorder();
        lblElectronicWaste = new br.com.loginform.components.JLabelRoundedBorder();
        lblLamps = new br.com.loginform.components.JLabelRoundedBorder();
        lblOrganicWaste = new br.com.loginform.components.JLabelRoundedBorder();
        lblKitchenOil = new br.com.loginform.components.JLabelRoundedBorder();
        lblPapersCardboard = new br.com.loginform.components.JLabelRoundedBorder();
        jButton1 = new javax.swing.JButton();
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
        jpPointDesc.add(jTextFieldCustom1);
        jTextFieldCustom1.setBounds(50, 314, 570, 56);
        jpPointDesc.add(jTextFieldCustom2);
        jTextFieldCustom2.setBounds(50, 96, 570, 56);
        jpPointDesc.add(jTextFieldCustom3);
        jTextFieldCustom3.setBounds(50, 205, 570, 56);

        jLabel3.setText("WhatsApp");
        jpPointDesc.add(jLabel3);
        jLabel3.setBounds(50, 293, 110, 16);

        jLabel4.setText("Nome do ponto");
        jpPointDesc.add(jLabel4);
        jLabel4.setBounds(50, 75, 210, 16);

        jLabel5.setText("E-mail");
        jpPointDesc.add(jLabel5);
        jLabel5.setBounds(50, 184, 120, 16);

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
        jpPointAddress.add(jTextFieldCustom5);
        jTextFieldCustom5.setBounds(50, 298, 570, 56);
        jpPointAddress.add(jTextFieldCustom6);
        jTextFieldCustom6.setBounds(50, 96, 144, 56);
        jpPointAddress.add(jTextFieldCustom7);
        jTextFieldCustom7.setBounds(202, 96, 418, 56);
        jpPointAddress.add(jTextFieldCustom8);
        jTextFieldCustom8.setBounds(50, 197, 117, 56);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPointAddress.add(jComboBox3);
        jComboBox3.setBounds(329, 197, 291, 56);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPointAddress.add(jComboBox4);
        jComboBox4.setBounds(175, 197, 146, 56);

        jLabel9.setText("Cidade");
        jpPointAddress.add(jLabel9);
        jLabel9.setBounds(50, 277, 110, 16);

        jLabel10.setText("Cep");
        jpPointAddress.add(jLabel10);
        jLabel10.setBounds(50, 75, 60, 16);

        jLabel11.setText("Endereço");
        jpPointAddress.add(jLabel11);
        jLabel11.setBounds(202, 75, 120, 16);

        jLabel12.setText("Número");
        jpPointAddress.add(jLabel12);
        jLabel12.setBounds(50, 176, 110, 16);

        jLabel13.setText("Estado(UF)");
        jpPointAddress.add(jLabel13);
        jLabel13.setBounds(175, 176, 110, 16);

        jLabel14.setText("Cidade");
        jpPointAddress.add(jLabel14);
        jLabel14.setBounds(329, 176, 110, 16);

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

        jpItens.setBackground(new java.awt.Color(255, 255, 255));
        jpItens.setLayout(new java.awt.GridLayout(2, 3, 10, 10));

        lblBatteries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatteries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/baterias.png"))); // NOI18N
        lblBatteries.setText("Pilhas e Baterias");
        lblBatteries.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBatteries.setIconTextGap(12);
        lblBatteries.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBatteries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBatteriesMouseClicked(evt);
            }
        });
        jpItens.add(lblBatteries);

        lblElectronicWaste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElectronicWaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/eletronicos.png"))); // NOI18N
        lblElectronicWaste.setText("Resíduos Eletrônicos");
        lblElectronicWaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblElectronicWaste.setIconTextGap(12);
        lblElectronicWaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblElectronicWaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElectronicWasteMouseClicked(evt);
            }
        });
        jpItens.add(lblElectronicWaste);

        lblLamps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLamps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/lampadas.png"))); // NOI18N
        lblLamps.setText("Lâmpadas");
        lblLamps.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLamps.setIconTextGap(12);
        lblLamps.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblLamps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLampsMouseClicked(evt);
            }
        });
        jpItens.add(lblLamps);

        lblOrganicWaste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrganicWaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/organicos.png"))); // NOI18N
        lblOrganicWaste.setText("Resíduos Orgânicos");
        lblOrganicWaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOrganicWaste.setIconTextGap(12);
        lblOrganicWaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOrganicWaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrganicWasteMouseClicked(evt);
            }
        });
        jpItens.add(lblOrganicWaste);

        lblKitchenOil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKitchenOil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/oleo.png"))); // NOI18N
        lblKitchenOil.setText("Óleo de cozinha");
        lblKitchenOil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblKitchenOil.setIconTextGap(12);
        lblKitchenOil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblKitchenOil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKitchenOilMouseClicked(evt);
            }
        });
        jpItens.add(lblKitchenOil);

        lblPapersCardboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPapersCardboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/papeis-papelao.png"))); // NOI18N
        lblPapersCardboard.setText("Papéis e Papelão");
        lblPapersCardboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPapersCardboard.setIconTextGap(12);
        lblPapersCardboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblPapersCardboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPapersCardboardMouseClicked(evt);
            }
        });
        jpItens.add(lblPapersCardboard);

        jpPointItens.add(jpItens);
        jpItens.setBounds(50, 75, 570, 264);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpPointItens.add(jButton1);
        jButton1.setBounds(290, 370, 130, 30);

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


    private void lblLampsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLampsMouseClicked
        isSelectedlamps = !isSelectedlamps;

        if (isSelectedlamps) {
            itensSelected.add(lblLamps.getText());
            lblLamps.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblLamps.getText());
            lblLamps.setBackground(new Color(244, 244, 244));

        }
    }//GEN-LAST:event_lblLampsMouseClicked

    private void lblOrganicWasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrganicWasteMouseClicked
        isSelectedOrganicWaste = !isSelectedOrganicWaste;

        if (isSelectedOrganicWaste) {
            itensSelected.add(lblOrganicWaste.getText());
            lblOrganicWaste.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblOrganicWaste.getText());
            lblOrganicWaste.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblOrganicWasteMouseClicked

    private void lblKitchenOilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKitchenOilMouseClicked
        isSelectedKitchenOil = !isSelectedKitchenOil;

        if (isSelectedKitchenOil) {
            itensSelected.add(lblKitchenOil.getText());
            lblKitchenOil.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblKitchenOil.getText());
            lblKitchenOil.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblKitchenOilMouseClicked

    private void lblPapersCardboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapersCardboardMouseClicked
        isSelectedPapersCardboard = !isSelectedPapersCardboard;

        if (isSelectedPapersCardboard) {
            itensSelected.add(lblPapersCardboard.getText());
            lblPapersCardboard.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblPapersCardboard.getText());
            lblPapersCardboard.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblPapersCardboardMouseClicked
    private void lblBatteriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatteriesMouseClicked
        isSelectedBatteries = !isSelectedBatteries;

        if (isSelectedBatteries) {
            itensSelected.add(lblBatteries.getText());
            lblBatteries.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblBatteries.getText());
            lblBatteries.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblBatteriesMouseClicked

    private void lblElectronicWasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElectronicWasteMouseClicked
        isSelectedElectronicWaste = !isSelectedElectronicWaste;

        if (isSelectedElectronicWaste) {
            itensSelected.add(lblElectronicWaste.getText());
            lblElectronicWaste.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblElectronicWaste.getText());
            lblElectronicWaste.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblElectronicWasteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(itensSelected);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom1;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom2;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom3;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom5;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom6;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom7;
    private br.com.loginform.components.JTextFieldCustom jTextFieldCustom8;
    private javax.swing.JPanel jpItens;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JPanelRoundedBorder jpPointAddress;
    private br.com.loginform.components.JPanelRoundedBorder jpPointDesc;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImage;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImageDropzone;
    private br.com.loginform.components.JPanelRoundedBorder jpPointItens;
    private br.com.loginform.components.JPanelRoundedBorder jpSucess;
    private br.com.loginform.components.JLabelRoundedBorder lblBatteries;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCloseSuccess;
    private br.com.loginform.components.JLabelRoundedBorder lblElectronicWaste;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private br.com.loginform.components.JLabelRoundedBorder lblKitchenOil;
    private br.com.loginform.components.JLabelRoundedBorder lblLamps;
    private javax.swing.JLabel lblLogo;
    private br.com.loginform.components.JLabelRoundedBorder lblOrganicWaste;
    private br.com.loginform.components.JLabelRoundedBorder lblPapersCardboard;
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
