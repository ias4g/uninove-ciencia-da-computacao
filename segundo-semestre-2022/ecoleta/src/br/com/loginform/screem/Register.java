package br.com.loginform.screem;

import br.com.loginform.controllers.ItemsController;
import br.com.loginform.controllers.RegisterController;
import br.com.loginform.model.AddressModel;
import br.com.loginform.model.PointModel;
import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JDialog {

    private File imageFile;

    private final ArrayList<String> data = new ArrayList();
    private final ArrayList<String> itensSelected = new ArrayList();

    private boolean isSelectedlamps = false;
    private boolean isSelectedBatteries = false;
    private boolean isSelectedKitchenOil = false;
    private boolean isSelectedOrganicWaste = false;
    private boolean isSelectedElectronicWaste = false;
    private boolean isSelectedPapersCardboard = false;

    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Utilities.insertIconDialog(this);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
//        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

//        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);
        lblFaviconDescription.setFont(PTSans_Bold_12);

//        lblTitleImagePoint.setFont(Ubuntu_Bold_16);
        ItemsController ic = new ItemsController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFavicon = new javax.swing.JLabel();
        lblFaviconDescription = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
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
        lblName = new javax.swing.JLabel();
        txtName = new br.com.loginform.components.JTextFieldCustom();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new br.com.loginform.components.JTextFieldCustom();
        lblWhatsApp = new javax.swing.JLabel();
        lblPointDescNext = new br.com.loginform.components.JLabelRoundedBorder();
        txtWhatsApp = new br.com.loginform.components.JFormattedFieldCustom();
        jpPointAddress = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointAddressTitle = new javax.swing.JLabel();
        lblPointAddressSubTitle = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new br.com.loginform.components.JTextFieldCustom();
        lblNumber = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        cmbUf = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblPointAddressNext = new br.com.loginform.components.JLabelRoundedBorder();
        txtZipcode = new br.com.loginform.components.JTextFieldCustom();
        txtNumber = new br.com.loginform.components.JTextFieldCustom();
        jpPointItens = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointItensTitle = new javax.swing.JLabel();
        lblPointItensSubTitle = new javax.swing.JLabel();
        jpItens = new javax.swing.JPanel();
        lblBatteries = new br.com.loginform.components.JLabelRoundedBorder();
        lblElectronicWaste = new br.com.loginform.components.JLabelRoundedBorder();
        lblLamps = new br.com.loginform.components.JLabelRoundedBorder();
        lblOrganicWaste = new br.com.loginform.components.JLabelRoundedBorder();
        lblKitchenOil = new br.com.loginform.components.JLabelRoundedBorder();
        lblPapersCardboard = new br.com.loginform.components.JLabelRoundedBorder();
        lblPointItensSave = new br.com.loginform.components.JLabelRoundedBorder();
        jpSucess = new br.com.loginform.components.JPanelRoundedBorder();
        lblIconSuccess = new javax.swing.JLabel();
        lblSuccess = new javax.swing.JLabel();
        lblCloseSuccess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pontos de coletas");
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

        lblFavicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/favicon.png"))); // NOI18N
        getContentPane().add(lblFavicon);
        lblFavicon.setBounds(10, 10, 13, 16);

        lblFaviconDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFaviconDescription.setText("Ecoleta | Cadastro de ponto");
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
        lblClose.setBounds(974, 0, 50, 25);

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

        lblName.setText("Nome do ponto");
        jpPointDesc.add(lblName);
        lblName.setBounds(50, 75, 210, 16);
        jpPointDesc.add(txtName);
        txtName.setBounds(50, 96, 570, 56);

        lblEmail.setText("E-mail");
        jpPointDesc.add(lblEmail);
        lblEmail.setBounds(50, 184, 120, 16);
        jpPointDesc.add(txtEmail);
        txtEmail.setBounds(50, 205, 570, 56);

        lblWhatsApp.setText("WhatsApp");
        jpPointDesc.add(lblWhatsApp);
        lblWhatsApp.setBounds(50, 293, 110, 16);

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

        try {
            txtWhatsApp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpPointDesc.add(txtWhatsApp);
        txtWhatsApp.setBounds(50, 314, 570, 56);

        jpMain.add(jpPointDesc, "cardDescription");

        jpPointAddress.setLayout(null);

        lblPointAddressTitle.setText("Endereço do ponto");
        jpPointAddress.add(lblPointAddressTitle);
        lblPointAddressTitle.setBounds(20, 20, 170, 16);

        lblPointAddressSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointAddressSubTitle.setText("Insira o cep para preencher alguns campos");
        jpPointAddress.add(lblPointAddressSubTitle);
        lblPointAddressSubTitle.setBounds(350, 24, 300, 16);

        lblCep.setText("Cep");
        jpPointAddress.add(lblCep);
        lblCep.setBounds(50, 75, 60, 16);

        lblAddress.setText("Endereço");
        jpPointAddress.add(lblAddress);
        lblAddress.setBounds(202, 75, 120, 16);
        jpPointAddress.add(txtAddress);
        txtAddress.setBounds(202, 96, 418, 56);

        lblNumber.setText("Número");
        jpPointAddress.add(lblNumber);
        lblNumber.setBounds(50, 176, 110, 16);

        lblUf.setText("Estado(UF)");
        jpPointAddress.add(lblUf);
        lblUf.setBounds(175, 176, 110, 16);

        cmbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "SP", "BA" }));
        jpPointAddress.add(cmbUf);
        cmbUf.setBounds(175, 197, 146, 56);

        lblCity.setText("Cidade");
        jpPointAddress.add(lblCity);
        lblCity.setBounds(329, 176, 110, 16);

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "São Paulo", "Engenheiro Coelho" }));
        jpPointAddress.add(cmbCity);
        cmbCity.setBounds(329, 197, 291, 56);

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

        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyTyped(evt);
            }
        });
        jpPointAddress.add(txtZipcode);
        txtZipcode.setBounds(50, 96, 144, 56);

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });
        jpPointAddress.add(txtNumber);
        txtNumber.setBounds(50, 197, 117, 56);

        jpMain.add(jpPointAddress, "cardAddress");

        jpPointItens.setLayout(null);

        lblPointItensTitle.setText("Itens de coleta");
        jpPointItens.add(lblPointItensTitle);
        lblPointItensTitle.setBounds(20, 20, 170, 16);

        lblPointItensSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointItensSubTitle.setText("Selecione os itens que o ponto coleta");
        jpPointItens.add(lblPointItensSubTitle);
        lblPointItensSubTitle.setBounds(350, 24, 300, 16);

        jpItens.setBackground(new java.awt.Color(255, 255, 255));
        jpItens.setLayout(new java.awt.GridLayout(2, 3, 10, 10));

        lblBatteries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatteries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/pilhas-baterias.png"))); // NOI18N
        lblBatteries.setText("Pilhas e Baterias");
        lblBatteries.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBatteries.setIconTextGap(12);
        lblBatteries.setName("pilhas-baterias"); // NOI18N
        lblBatteries.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBatteries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBatteriesMouseClicked(evt);
            }
        });
        jpItens.add(lblBatteries);
        lblBatteries.getAccessibleContext().setAccessibleDescription("pilhas");

        lblElectronicWaste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElectronicWaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/eletronicos.png"))); // NOI18N
        lblElectronicWaste.setText("Resíduos Eletrônicos");
        lblElectronicWaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblElectronicWaste.setIconTextGap(12);
        lblElectronicWaste.setName("eletronicos"); // NOI18N
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
        lblLamps.setName("lampadas"); // NOI18N
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
        lblOrganicWaste.setName("organicos"); // NOI18N
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
        lblKitchenOil.setName("oleo"); // NOI18N
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
        lblPapersCardboard.setName("papeis-papelao"); // NOI18N
        lblPapersCardboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblPapersCardboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPapersCardboardMouseClicked(evt);
            }
        });
        jpItens.add(lblPapersCardboard);

        jpPointItens.add(jpItens);
        jpItens.setBounds(50, 75, 570, 264);

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

        lblIconSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconSuccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/successful.png"))); // NOI18N
        jpSucess.add(lblIconSuccess);
        lblIconSuccess.setBounds(303, 152, 64, 64);

        lblSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuccess.setText("Cadastro concluído");
        jpSucess.add(lblSuccess);
        lblSuccess.setBounds(185, 232, 300, 30);

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

        txtName.requestFocus();
    }//GEN-LAST:event_lblPointImageNextMouseClicked

    private void lblPointDescNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseClicked

        String name = txtName.getText();
        String email = txtEmail.getText();
        String whatsapp = txtWhatsApp.getText();

        if (name.isEmpty() || email.isEmpty() || whatsapp.isEmpty()) {
            new Message(new javax.swing.JFrame(), true, "warning", "Preencha todos os campos!").setVisible(true);
        } else {
            data.add(name);
            data.add(email);
            data.add(whatsapp);

            CardLayout cl = (CardLayout) jpMain.getLayout();
            cl.show(jpMain, "cardAddress");

            txtZipcode.requestFocus();
        }
    }//GEN-LAST:event_lblPointDescNextMouseClicked

    private void lblPointAddressNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointAddressNextMouseClicked

        String zipcode = txtZipcode.getText();
        String address = txtAddress.getText();
        String number = txtNumber.getText();
        String uf = String.valueOf(cmbUf.getSelectedItem());
        String city = String.valueOf(cmbCity.getSelectedItem());

        if (zipcode.isEmpty() || address.isEmpty() || number.isEmpty() || uf.equalsIgnoreCase("Selecione") || city.equalsIgnoreCase("Selecione")) {
            new Message(new javax.swing.JFrame(), true, "warning", "Preencha todos os campos!").setVisible(true);
        } else {

            data.add(zipcode);
            data.add(address);
            data.add(number);
            data.add(uf);
            data.add(city);

            CardLayout cl = (CardLayout) jpMain.getLayout();
            cl.show(jpMain, "cardItens");
        }
    }//GEN-LAST:event_lblPointAddressNextMouseClicked

    private void lblPointItensSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointItensSaveMouseClicked

        String res;
        PointModel pm = new PointModel();
        AddressModel am = new AddressModel();

        pm.setName(data.get(0));
        pm.setEmail(data.get(1));
//        pm.setImage(getImageFile());
        pm.setWhatsapp(data.get(2));

        am.setZipcode(data.get(3));
        am.setAddress(data.get(4));
        am.setNumber(Integer.parseInt(data.get(5)));
        am.setUf(data.get(6));
        am.setCity(data.get(7));

        RegisterController rc = new RegisterController();
        res = rc.createRegister(pm, am);

        if (res.equalsIgnoreCase("ok")) {
            CardLayout cl = (CardLayout) jpMain.getLayout();
            cl.show(jpMain, "cardSuccess");
        } else {
            new Message(new javax.swing.JFrame(), true, "error", res).setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_lblPointItensSaveMouseClicked

    private void lblCloseSuccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseSuccessMouseClicked
        dispose();
    }//GEN-LAST:event_lblCloseSuccessMouseClicked

    private void lblPointImageDropzoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageDropzoneMouseClicked
        imageFile = selectImage();

        opemImage(imageFile);
    }//GEN-LAST:event_lblPointImageDropzoneMouseClicked

    private void lblLampsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLampsMouseClicked
        isSelectedlamps = !isSelectedlamps;

        if (isSelectedlamps) {
            itensSelected.add(lblLamps.getName());
            lblLamps.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblLamps.getName());
            lblLamps.setBackground(new Color(244, 244, 244));

        }
    }//GEN-LAST:event_lblLampsMouseClicked

    private void lblOrganicWasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrganicWasteMouseClicked
        isSelectedOrganicWaste = !isSelectedOrganicWaste;

        if (isSelectedOrganicWaste) {
            itensSelected.add(lblOrganicWaste.getName());
            lblOrganicWaste.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblOrganicWaste.getName());
            lblOrganicWaste.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblOrganicWasteMouseClicked

    private void lblKitchenOilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKitchenOilMouseClicked
        isSelectedKitchenOil = !isSelectedKitchenOil;

        if (isSelectedKitchenOil) {
            itensSelected.add(lblKitchenOil.getName());
            lblKitchenOil.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblKitchenOil.getName());
            lblKitchenOil.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblKitchenOilMouseClicked

    private void lblPapersCardboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapersCardboardMouseClicked
        isSelectedPapersCardboard = !isSelectedPapersCardboard;

        if (isSelectedPapersCardboard) {
            itensSelected.add(lblPapersCardboard.getName());
            lblPapersCardboard.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblPapersCardboard.getName());
            lblPapersCardboard.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblPapersCardboardMouseClicked

    private void lblBatteriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatteriesMouseClicked
        isSelectedBatteries = !isSelectedBatteries;

        if (isSelectedBatteries) {
            itensSelected.add(lblBatteries.getName());
            lblBatteries.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblBatteries.getName());
            lblBatteries.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblBatteriesMouseClicked

    private void lblElectronicWasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElectronicWasteMouseClicked
        isSelectedElectronicWaste = !isSelectedElectronicWaste;

        if (isSelectedElectronicWaste) {
            itensSelected.add(lblElectronicWaste.getName());
            lblElectronicWaste.setBackground(new Color(214, 245, 228));
        } else {
            itensSelected.remove(lblElectronicWaste.getName());
            lblElectronicWaste.setBackground(new Color(244, 244, 244));
        }
    }//GEN-LAST:event_lblElectronicWasteMouseClicked

    private void txtZipcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtZipcodeKeyTyped

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumberKeyTyped

    public File selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens em JPEG  e PNG", "jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setCurrentDirectory(new File("/Images"));
        fileChooser.showOpenDialog(this);

        return fileChooser.getSelectedFile();
    }

    private byte[] getImageFile() {
        boolean isPng = false;

        if (imageFile != null) {
            try {
                isPng = imageFile.getName().endsWith("png");

                BufferedImage image = ImageIO.read(imageFile);

                ByteArrayOutputStream out = new ByteArrayOutputStream();

                int type = BufferedImage.TYPE_INT_RGB;

                if (isPng) {
                    type = BufferedImage.BITMASK;
                }

                BufferedImage newImage = new BufferedImage(400, 400, type);
                Graphics2D g = newImage.createGraphics();
                g.drawImage(image, 0, 0, 400, 400, null);

                if (isPng) {
                    ImageIO.write(newImage, "png", out);
                } else {
                    ImageIO.write(newImage, "jpg", out);
                }

                out.flush();
                byte[] arraybyte = out.toByteArray();
                out.close();

                return arraybyte;

            } catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    private void opemImage(Object src) {
        if (src instanceof File) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(400, 400, 100));
            lblPointImageDropzone.setText(null);
            lblPointImageDropzone.setIcon(icon);
        } else if (src instanceof byte[]) {
            ImageIcon icon = new ImageIcon();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbUf;
    private javax.swing.JPanel jpItens;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JPanelRoundedBorder jpPointAddress;
    private br.com.loginform.components.JPanelRoundedBorder jpPointDesc;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImage;
    private br.com.loginform.components.JPanelRoundedBorder jpPointImageDropzone;
    private br.com.loginform.components.JPanelRoundedBorder jpPointItens;
    private br.com.loginform.components.JPanelRoundedBorder jpSucess;
    private javax.swing.JLabel lblAddress;
    private br.com.loginform.components.JLabelRoundedBorder lblBatteries;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCloseSuccess;
    private br.com.loginform.components.JLabelRoundedBorder lblElectronicWaste;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblIconSuccess;
    private br.com.loginform.components.JLabelRoundedBorder lblKitchenOil;
    private br.com.loginform.components.JLabelRoundedBorder lblLamps;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
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
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblUf;
    private javax.swing.JLabel lblWhatsApp;
    private br.com.loginform.components.JTextFieldCustom txtAddress;
    private br.com.loginform.components.JTextFieldCustom txtEmail;
    private br.com.loginform.components.JTextFieldCustom txtName;
    private br.com.loginform.components.JTextFieldCustom txtNumber;
    private br.com.loginform.components.JFormattedFieldCustom txtWhatsApp;
    private br.com.loginform.components.JTextFieldCustom txtZipcode;
    // End of variables declaration//GEN-END:variables
}
