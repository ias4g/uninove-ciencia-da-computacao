package br.com.loginform.screem;

import Atxy2k.CustomTextField.RestrictedTextField;
import br.com.loginform.components.JLabelRoundedBorder;
import br.com.loginform.controllers.ItemsController;
import br.com.loginform.controllers.RegisterController;
import br.com.loginform.model.AddressModel;
import br.com.loginform.model.ItemsModel;
import br.com.loginform.model.PointModel;
import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import br.com.loginform.utils.Utils;
import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Register extends javax.swing.JDialog {

    private File imageFile;

    ItemsController ic = new ItemsController();
    List<ItemsModel> ics = ic.ReadItems();

    private final ArrayList<String> data = new ArrayList();
    private final List<ItemsModel> itensSelected = new ArrayList();

    public Register(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();

        setFonts();
        setItems();
        fieldRestricted();
        Utils.deserializeUf(cmbUf);
        Utilities.insertIconDialog(this);

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
        lblZipcode = new javax.swing.JLabel();
        txtZipcode = new br.com.loginform.components.JTextFieldCustom();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new br.com.loginform.components.JTextFieldCustom();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new br.com.loginform.components.JTextFieldCustom();
        lblUf = new javax.swing.JLabel();
        cmbUf = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblPointAddressNext = new br.com.loginform.components.JLabelRoundedBorder();
        jpPointItens = new br.com.loginform.components.JPanelRoundedBorder();
        lblPointItensTitle = new javax.swing.JLabel();
        lblPointItensSubTitle = new javax.swing.JLabel();
        jpItens = new javax.swing.JPanel();
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
        lblClose.setBounds(988, 0, 36, 28);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(60, 60, 112, 32);

        jpMain.setLayout(new java.awt.CardLayout());

        jpPointImage.setLayout(null);

        lblPointImageTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPointImageTitle.setText("Imagem do ponto");
        lblPointImageTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpPointImage.add(lblPointImageTitle);
        lblPointImageTitle.setBounds(50, 20, 270, 28);

        lblPointImageSubTitle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPointImageSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointImageSubTitle.setText("Insira a imagem do ponto de coleta");
        jpPointImage.add(lblPointImageSubTitle);
        lblPointImageSubTitle.setBounds(320, 26, 300, 19);

        jpPointImageDropzone.setBackground(new java.awt.Color(214, 245, 228));
        jpPointImageDropzone.setLayout(null);

        lblPointImageDropzone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPointImageDropzone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointImageDropzone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/upload-icon.png"))); // NOI18N
        lblPointImageDropzone.setText("Imagem do estabelecimento");
        lblPointImageDropzone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 203, 121)));
        lblPointImageDropzone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPointImageDropzone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPointImageDropzone.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblPointImageDropzone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPointImageDropzoneMouseClicked(evt);
            }
        });
        jpPointImageDropzone.add(lblPointImageDropzone);
        lblPointImageDropzone.setBounds(22, 22, 256, 256);

        jpPointImage.add(jpPointImageDropzone);
        jpPointImageDropzone.setBounds(175, 90, 300, 300);

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
        lblPointImageNext.setBounds(584, 404, 36, 36);

        jpMain.add(jpPointImage, "cardImage");

        jpPointDesc.setLayout(null);

        lblPointDescTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPointDescTitle.setText("Descrição do ponto");
        lblPointDescTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpPointDesc.add(lblPointDescTitle);
        lblPointDescTitle.setBounds(50, 20, 270, 30);

        lblPointDescSubTitle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPointDescSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointDescSubTitle.setText("Insira a descrição do ponto de coleta");
        jpPointDesc.add(lblPointDescSubTitle);
        lblPointDescSubTitle.setBounds(320, 26, 300, 19);

        lblName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblName.setText("Nome do ponto");
        jpPointDesc.add(lblName);
        lblName.setBounds(50, 90, 210, 19);

        txtName.setForeground(new java.awt.Color(120, 120, 120));
        txtName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jpPointDesc.add(txtName);
        txtName.setBounds(50, 112, 570, 56);

        lblEmail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblEmail.setText("E-mail");
        jpPointDesc.add(lblEmail);
        lblEmail.setBounds(50, 199, 120, 19);

        txtEmail.setForeground(new java.awt.Color(120, 120, 120));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jpPointDesc.add(txtEmail);
        txtEmail.setBounds(50, 221, 570, 56);

        lblWhatsApp.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblWhatsApp.setText("WhatsApp");
        jpPointDesc.add(lblWhatsApp);
        lblWhatsApp.setBounds(50, 308, 110, 19);

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
        lblPointDescNext.setBounds(584, 404, 36, 36);

        txtWhatsApp.setForeground(new java.awt.Color(120, 120, 120));
        txtWhatsApp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        try {
            txtWhatsApp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpPointDesc.add(txtWhatsApp);
        txtWhatsApp.setBounds(50, 330, 570, 56);

        jpMain.add(jpPointDesc, "cardDescription");

        jpPointAddress.setLayout(null);

        lblPointAddressTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPointAddressTitle.setText("Endereço do ponto");
        lblPointAddressTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpPointAddress.add(lblPointAddressTitle);
        lblPointAddressTitle.setBounds(50, 20, 290, 30);

        lblPointAddressSubTitle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPointAddressSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointAddressSubTitle.setText("Insira o cep para preencher alguns campos");
        jpPointAddress.add(lblPointAddressSubTitle);
        lblPointAddressSubTitle.setBounds(320, 26, 300, 19);

        lblZipcode.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblZipcode.setText("Cep");
        jpPointAddress.add(lblZipcode);
        lblZipcode.setBounds(50, 90, 60, 19);

        txtZipcode.setForeground(new java.awt.Color(120, 120, 120));
        txtZipcode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });
        jpPointAddress.add(txtZipcode);
        txtZipcode.setBounds(50, 112, 144, 56);

        lblAddress.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblAddress.setText("Endereço");
        jpPointAddress.add(lblAddress);
        lblAddress.setBounds(202, 90, 120, 19);

        txtAddress.setForeground(new java.awt.Color(120, 120, 120));
        txtAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jpPointAddress.add(txtAddress);
        txtAddress.setBounds(202, 112, 418, 56);

        lblNumber.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblNumber.setText("Número");
        jpPointAddress.add(lblNumber);
        lblNumber.setBounds(50, 191, 110, 19);

        txtNumber.setForeground(new java.awt.Color(120, 120, 120));
        txtNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jpPointAddress.add(txtNumber);
        txtNumber.setBounds(50, 213, 117, 56);

        lblUf.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf.setText("Estado(UF)");
        jpPointAddress.add(lblUf);
        lblUf.setBounds(175, 191, 110, 19);

        cmbUf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbUf.setForeground(new java.awt.Color(120, 120, 120));
        cmbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUfActionPerformed(evt);
            }
        });
        jpPointAddress.add(cmbUf);
        cmbUf.setBounds(175, 213, 146, 56);

        lblCity.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCity.setText("Cidade");
        jpPointAddress.add(lblCity);
        lblCity.setBounds(329, 191, 110, 19);

        cmbCity.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbCity.setForeground(new java.awt.Color(120, 120, 120));
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jpPointAddress.add(cmbCity);
        cmbCity.setBounds(329, 213, 291, 56);

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
        lblPointAddressNext.setBounds(584, 404, 36, 36);

        jpMain.add(jpPointAddress, "cardAddress");

        jpPointItens.setLayout(null);

        lblPointItensTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPointItensTitle.setText("Itens de coleta");
        lblPointItensTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpPointItens.add(lblPointItensTitle);
        lblPointItensTitle.setBounds(50, 20, 270, 30);

        lblPointItensSubTitle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPointItensSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPointItensSubTitle.setText("Selecione os itens que o ponto coleta");
        jpPointItens.add(lblPointItensSubTitle);
        lblPointItensSubTitle.setBounds(320, 26, 300, 19);

        jpItens.setBackground(new java.awt.Color(255, 255, 255));
        jpItens.setLayout(new java.awt.GridLayout(2, 3, 10, 10));
        jpPointItens.add(jpItens);
        jpItens.setBounds(50, 90, 570, 264);

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
        lblPointItensSave.setBounds(584, 404, 36, 36);

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
        jpMain.setBounds(177, 120, 670, 480);

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
//        if (imageFile == null) {
//            new Message(new javax.swing.JFrame(), true, "warning", "Para prosseguir selecione um arquivo!").setVisible(true);
//        } else {
//            CardLayout cl = (CardLayout) jpMain.getLayout();
//            cl.show(jpMain, "cardDescription");
//
//            txtName.requestFocus();
//        }

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardDescription");

    }//GEN-LAST:event_lblPointImageNextMouseClicked

    private void lblPointDescNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointDescNextMouseClicked
//        String name = txtName.getText();
//        String email = txtEmail.getText();
//        String whatsapp = txtWhatsApp.getText();
//
//        if (name.isEmpty() || email.isEmpty() || whatsapp.isEmpty()) {
//            new Message(new javax.swing.JFrame(), true, "warning", "Preencha todos os campos!").setVisible(true);
//        } else {
//            data.add(name);
//            data.add(email);
//            data.add(whatsapp);
//
//            CardLayout cl = (CardLayout) jpMain.getLayout();
//            cl.show(jpMain, "cardAddress");
//
//            txtZipcode.requestFocus();
//        }

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardAddress");

    }//GEN-LAST:event_lblPointDescNextMouseClicked

    private void lblPointAddressNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointAddressNextMouseClicked
//        String zipcode = txtZipcode.getText();
//        String address = txtAddress.getText();
//        String number = txtNumber.getText();
//        String uf = String.valueOf(cmbUf.getSelectedItem());
//        String city = String.valueOf(cmbCity.getSelectedItem());
//
//        if (zipcode.isEmpty() || address.isEmpty() || address.isBlank() || number.isEmpty() || uf.equalsIgnoreCase("Selecione") || city.equalsIgnoreCase("Selecione")) {
//            new Message(new javax.swing.JFrame(), true, "warning", "Preencha todos os campos!").setVisible(true);
//        } else {
//
//            data.add(zipcode);
//            data.add(address);
//            data.add(number);
//            data.add(uf);
//            data.add(city);
//
//            CardLayout cl = (CardLayout) jpMain.getLayout();
//            cl.show(jpMain, "cardItens");
//        }

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardItens");

    }//GEN-LAST:event_lblPointAddressNextMouseClicked

    private void lblPointItensSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointItensSaveMouseClicked
        lblPointItensSave.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        String res;
        PointModel pm = new PointModel();
        AddressModel am = new AddressModel();

        pm.setName(data.get(0));
        pm.setEmail(data.get(1));
        pm.setImage(getImageFile());
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

        lblPointItensSave.setCursor(new Cursor(Cursor.HAND_CURSOR));

        new Details(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_lblPointItensSaveMouseClicked

    private void lblCloseSuccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseSuccessMouseClicked
        dispose();
    }//GEN-LAST:event_lblCloseSuccessMouseClicked

    private void lblPointImageDropzoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPointImageDropzoneMouseClicked
        lblPointImageDropzone.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        imageFile = selectImage();
        openImage(imageFile);

        lblPointImageDropzone.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_lblPointImageDropzoneMouseClicked

    private void txtZipcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cepSearch();
        }
    }//GEN-LAST:event_txtZipcodeKeyPressed

    private void cmbUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUfActionPerformed
        addMunicipos();
    }//GEN-LAST:event_cmbUfActionPerformed

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

    private byte[] getImageFile() {
        boolean isPng = false;

        if (imageFile != null) {

            isPng = imageFile.getName().endsWith("png");

            try {

                BufferedImage image = ImageIO.read(imageFile);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int type = BufferedImage.TYPE_INT_RGB;

                if (isPng) {
                    type = BufferedImage.BITMASK;
                }

                BufferedImage newImage = new BufferedImage(400, 400, type);
                Graphics2D g = newImage.createGraphics();
                g.setComposite(AlphaComposite.Src);
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

    private void openImage(Object src) {
        if (src instanceof File) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(400, 400, 100));
            lblPointImageDropzone.setText(null);
            lblPointImageDropzone.setIcon(icon);
        } else if (src instanceof byte[]) {
            ImageIcon icon = new ImageIcon();
        }
    }

    private void fieldRestricted() {
        RestrictedTextField validZipcode = new RestrictedTextField(txtZipcode);
        RestrictedTextField validNumber = new RestrictedTextField(txtNumber);

        validZipcode.setOnlyNums(true);
        validZipcode.setLimit(8);

        validNumber.setOnlyNums(true);
    }

    private void cepSearch() {
        String result;
        String bairro = null;
        String logradouro = null;
        String tipologradouro = null;
        String zipcode = txtZipcode.getText();

        try {

            URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + zipcode + "&formato=xml");
            SAXReader xml = new SAXReader();
            Document doc = xml.read(url);
            Element root = doc.getRootElement();

            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element el = it.next();
                if (el.getQualifiedName().equals("uf")) {
                    cmbUf.setSelectedItem(el.getText());
                }

                if (el.getQualifiedName().equals("cidade")) {
                    cmbCity.setSelectedItem(el.getText());
                }

                if (el.getQualifiedName().equals("bairro")) {
                    bairro = el.getText();
                }

                if (el.getQualifiedName().equals("tipo_logradouro")) {
                    tipologradouro = el.getText();
                }

                if (el.getQualifiedName().equals("logradouro")) {
                    logradouro = el.getText();
                }
            }

            txtAddress.setText(tipologradouro + " " + logradouro + " " + bairro);
        } catch (MalformedURLException | DocumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void addMunicipos() {
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione"}));
        Utils.deserializeMunicipios(cmbCity, cmbUf.getSelectedItem().toString());
    }

    private void setFonts() {
        Font Ubuntu_Bold_24 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 24f);

        Font PTSans_Bold_12 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 12f);
        Font PTSans_Bold_16 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 16f);
        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

        lblFaviconDescription.setFont(PTSans_Bold_12);

        //panel point image
        lblPointImageTitle.setFont(Ubuntu_Bold_24);
        lblPointImageSubTitle.setFont(PTSans_Regular_16);
        lblPointImageDropzone.setFont(PTSans_Regular_16);

        //panel point description
        lblPointDescTitle.setFont(Ubuntu_Bold_24);
        lblPointDescSubTitle.setFont(PTSans_Regular_16);
        lblName.setFont(PTSans_Bold_16);
        txtName.setFont(PTSans_Regular_16);
        lblEmail.setFont(PTSans_Bold_16);
        txtEmail.setFont(PTSans_Regular_16);
        lblWhatsApp.setFont(PTSans_Bold_16);
        txtWhatsApp.setFont(PTSans_Regular_16);

        //panel point address
        lblPointAddressTitle.setFont(Ubuntu_Bold_24);
        lblPointAddressSubTitle.setFont(PTSans_Regular_16);
        lblZipcode.setFont(PTSans_Bold_16);
        txtZipcode.setFont(PTSans_Regular_16);
        lblAddress.setFont(PTSans_Bold_16);
        txtAddress.setFont(PTSans_Regular_16);
        lblNumber.setFont(PTSans_Bold_16);
        txtNumber.setFont(PTSans_Regular_16);
        lblUf.setFont(PTSans_Bold_16);
        cmbUf.setFont(PTSans_Regular_16);
        lblCity.setFont(PTSans_Bold_16);
        cmbCity.setFont(PTSans_Regular_16);

        //panel point items
        lblPointItensTitle.setFont(Ubuntu_Bold_24);
        lblPointItensSubTitle.setFont(PTSans_Regular_16);
//        lblBatteries.setFont(PTSans_Regular_16);
//        lblElectronicWaste.setFont(PTSans_Regular_16);
//        lblLamps.setFont(PTSans_Regular_16);
//        lblOrganicWaste.setFont(PTSans_Regular_16);
//        lblKitchenOil.setFont(PTSans_Regular_16);
//        lblPapersCardboard.setFont(PTSans_Regular_16);
    }

    private void setItems() {

        List<Boolean> isSelectedItem = new ArrayList<>();

        for (ItemsModel item : ics) {

            JLabel label = new JLabelRoundedBorder();
            isSelectedItem.add(false);

            label.setIconTextGap(10);
            label.setName(item.getId());
            label.setText(item.getTitle());
            label.setToolTipText(item.getSlug());
            label.setBackground(new Color(244, 244, 244));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/" + item.getSlug() + ".png")));

            label.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    int i = Integer.parseInt(label.getName()) - 1;
                    boolean j = !isSelectedItem.get(i);
                    isSelectedItem.set(i, j);

                    System.out.println(isSelectedItem.toString());

                    System.out.println(isSelectedItem.get(i));

//                    System.out.println(isSelectedItem.get(i));
//                    if (isSelectedItem.get(i)) {
//
//                        ItemsModel im = new ItemsModel();
//                        im.setId(label.getName());
//                        im.setTitle(label.getText());
//                        im.setSlug(label.getToolTipText());
//
//                        itensSelected.add(im);
//
//                        label.setBackground(new Color(214, 245, 228));
//
//                        System.out.println(itensSelected);
//
//                    }
                }
            });

            jpItens.add(label);
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
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCloseSuccess;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFavicon;
    private javax.swing.JLabel lblFaviconDescription;
    private javax.swing.JLabel lblIconSuccess;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
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
    private javax.swing.JLabel lblZipcode;
    private br.com.loginform.components.JTextFieldCustom txtAddress;
    private br.com.loginform.components.JTextFieldCustom txtEmail;
    private br.com.loginform.components.JTextFieldCustom txtName;
    private br.com.loginform.components.JTextFieldCustom txtNumber;
    private br.com.loginform.components.JFormattedFieldCustom txtWhatsApp;
    private br.com.loginform.components.JTextFieldCustom txtZipcode;
    // End of variables declaration//GEN-END:variables
}
