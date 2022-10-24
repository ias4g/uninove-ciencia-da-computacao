package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import br.com.loginform.utils.Utilities;
import br.com.loginform.utils.Utils;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class About extends javax.swing.JDialog {

    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        Utilities.insertIconDialog(this);

        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);
        Font PTSans_Regular_14 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 14f);
        Font PTSans_Bold_14 = FontManager.Loading("PTSans-Bold.ttf", Font.BOLD, 14f);
        Font PTSans_Regular_12 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 12f);

        lblEcoleta.setFont(Ubuntu_Bold_16);
        lblCompilation.setFont(Ubuntu_Bold_16);
        lblLegais.setFont(Ubuntu_Bold_16);

        lblVersion.setFont(Ubuntu_Bold_16);
        lblDevs.setFont(Ubuntu_Bold_16);
        lblLibrary.setFont(Ubuntu_Bold_16);

        lblMysql.setFont(PTSans_Bold_14);
        lblAtxy2k.setFont(PTSans_Bold_14);
        lblDom4j.setFont(PTSans_Bold_14);
        lblGson.setFont(PTSans_Bold_14);
        lblHttpClient.setFont(PTSans_Bold_14);

        lbl1.setFont(PTSans_Regular_14);
        lbl2.setFont(PTSans_Regular_14);
        lbl3.setFont(PTSans_Regular_14);
        lbl4.setFont(PTSans_Regular_14);
        lbl5.setFont(PTSans_Regular_14);
        lbl6.setFont(PTSans_Regular_14);

        lbl7.setFont(PTSans_Regular_12);
        lbl8.setFont(PTSans_Regular_12);
        lbl9.setFont(PTSans_Regular_12);
        lbl10.setFont(PTSans_Regular_12);
        lbl11.setFont(PTSans_Regular_12);

        lbl12.setFont(PTSans_Regular_14);
        lbl13.setFont(PTSans_Regular_14);
        lbl14.setFont(PTSans_Regular_14);
        lbl15.setFont(PTSans_Regular_14);
        lbl16.setFont(PTSans_Regular_14);

        jtxt01.setFont(PTSans_Regular_14);
        jtxt02.setFont(PTSans_Regular_14);
        jtxt03.setFont(PTSans_Regular_14);
        jtxt04.setFont(PTSans_Regular_14);
        jtxt05.setFont(PTSans_Regular_14);
        jtxt06.setFont(PTSans_Regular_14);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        lblLicense = new javax.swing.JLabel();
        jpMain = new br.com.loginform.components.JPanelRoundedBorder();
        jpMenu = new javax.swing.JPanel();
        lblEcoleta = new br.com.loginform.components.JLabelRoundedBorder();
        lblCompilation = new br.com.loginform.components.JLabelRoundedBorder();
        lblLegais = new br.com.loginform.components.JLabelRoundedBorder();
        jpCards = new javax.swing.JPanel();
        jpEcoleta = new br.com.loginform.components.JPanelRoundedBorder();
        lblVersion = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jpCompilation = new br.com.loginform.components.JPanelRoundedBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblDevs = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        jtxt01 = new javax.swing.JTextArea();
        lblMysql = new javax.swing.JLabel();
        lblAtxy2k = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        jtxt02 = new javax.swing.JTextArea();
        lblDom4j = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        jtxt03 = new javax.swing.JTextArea();
        lblGson = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        jtxt04 = new javax.swing.JTextArea();
        lblHttpClient = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        jtxt05 = new javax.swing.JTextArea();
        jpLegais = new br.com.loginform.components.JPanelRoundedBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt06 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ecoleta - sobre");
        setBackground(new java.awt.Color(102, 102, 102));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setLayout(new java.awt.BorderLayout(0, 10));

        lblLicense.setBackground(new java.awt.Color(255, 255, 255));
        lblLicense.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLicense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/GNU.png"))); // NOI18N
        lblLicense.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblLicense.setOpaque(true);
        jpPrincipal.add(lblLicense, java.awt.BorderLayout.NORTH);

        jpMain.setLayout(new java.awt.BorderLayout());

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setLayout(new java.awt.BorderLayout());

        lblEcoleta.setBackground(new java.awt.Color(255, 255, 255));
        lblEcoleta.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEcoleta.setText("Ecoleta");
        lblEcoleta.setMaximumSize(new java.awt.Dimension(100, 30));
        lblEcoleta.setMinimumSize(new java.awt.Dimension(100, 30));
        lblEcoleta.setOpaque(true);
        lblEcoleta.setPreferredSize(new java.awt.Dimension(100, 30));
        lblEcoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEcoletaMouseClicked(evt);
            }
        });
        jpMenu.add(lblEcoleta, java.awt.BorderLayout.LINE_START);

        lblCompilation.setBackground(new java.awt.Color(255, 255, 255));
        lblCompilation.setForeground(new java.awt.Color(153, 153, 153));
        lblCompilation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompilation.setText("Informações de Compilação");
        lblCompilation.setMaximumSize(new java.awt.Dimension(180, 30));
        lblCompilation.setMinimumSize(new java.awt.Dimension(180, 30));
        lblCompilation.setOpaque(true);
        lblCompilation.setPreferredSize(new java.awt.Dimension(180, 30));
        lblCompilation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompilationMouseClicked(evt);
            }
        });
        jpMenu.add(lblCompilation, java.awt.BorderLayout.CENTER);

        lblLegais.setBackground(new java.awt.Color(255, 255, 255));
        lblLegais.setForeground(new java.awt.Color(153, 153, 153));
        lblLegais.setText("Inf. Legais");
        lblLegais.setMaximumSize(new java.awt.Dimension(130, 30));
        lblLegais.setMinimumSize(new java.awt.Dimension(130, 30));
        lblLegais.setOpaque(true);
        lblLegais.setPreferredSize(new java.awt.Dimension(130, 30));
        lblLegais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLegaisMouseClicked(evt);
            }
        });
        jpMenu.add(lblLegais, java.awt.BorderLayout.LINE_END);

        jpMain.add(jpMenu, java.awt.BorderLayout.NORTH);

        jpCards.setBackground(new java.awt.Color(255, 255, 255));
        jpCards.setLayout(new java.awt.CardLayout());

        jpEcoleta.setLayout(null);

        lblVersion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("Ecoleta v1.0");
        jpEcoleta.add(lblVersion);
        lblVersion.setBounds(0, 30, 468, 20);

        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Você está com a ultima versão deste software.");
        jpEcoleta.add(lbl1);
        lbl1.setBounds(0, 60, 468, 20);

        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Sistema para cadastro de ponto de coleta de resíduos");
        jpEcoleta.add(lbl2);
        lbl2.setBounds(0, 80, 468, 20);

        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("orgânicos e não orgânicos.");
        jpEcoleta.add(lbl3);
        lbl3.setBounds(0, 100, 468, 20);

        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Desenvolvido durante o 2º semestre do curso de ciência da computação.");
        jpEcoleta.add(lbl4);
        lbl4.setBounds(0, 120, 468, 20);

        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Trabalho de conclusão de semestre.");
        jpEcoleta.add(lbl5);
        lbl5.setBounds(0, 140, 468, 20);

        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Pela Universidade Nove de Julho.");
        jpEcoleta.add(lbl6);
        lbl6.setBounds(0, 160, 468, 20);

        jpCards.add(jpEcoleta, "cardEcoleta");

        jpCompilation.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setRowHeaderView(null);
        jScrollPane2.setViewportView(null);
        jScrollPane2.setWheelScrollingEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(436, 640));
        jPanel2.setMinimumSize(new java.awt.Dimension(436, 640));
        jPanel2.setPreferredSize(new java.awt.Dimension(436, 640));
        jPanel2.setLayout(null);

        lblDevs.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblDevs.setText("Desenvolvedores:");
        jPanel2.add(lblDevs);
        lblDevs.setBounds(0, 0, 330, 19);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 5, 4, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/deyzy.png"))); // NOI18N

        lbl7.setForeground(new java.awt.Color(51, 102, 255));
        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        lbl7.setText("/deyzy");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.setIconTextGap(0);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/ratasba.png"))); // NOI18N

        lbl8.setForeground(new java.awt.Color(51, 102, 255));
        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        lbl8.setText("/ratasba");
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.setIconTextGap(0);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(68, 71));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bielhgsr.png"))); // NOI18N

        lbl9.setForeground(new java.awt.Color(51, 102, 255));
        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        lbl9.setText("/bielhgsr");
        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.setIconTextGap(0);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/ias4g.png"))); // NOI18N

        lbl10.setForeground(new java.awt.Color(51, 102, 255));
        lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        lbl10.setText("/ias4g");
        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10.setIconTextGap(0);
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/vitorguim2.png"))); // NOI18N

        lbl11.setForeground(new java.awt.Color(51, 102, 255));
        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        lbl11.setText("/vitorguim2");
        lbl11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl11.setIconTextGap(0);
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel12);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 20, 450, 71);

        lblLibrary.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblLibrary.setText("Bibliotecas usadas:");
        jPanel2.add(lblLibrary);
        lblLibrary.setBounds(0, 110, 430, 19);

        lbl12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl12.setForeground(new java.awt.Color(51, 51, 255));
        lbl12.setText("https://www.mysql.com/products/connector/");
        lbl12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        jPanel2.add(lbl12);
        lbl12.setBounds(80, 140, 290, 14);

        jtxt01.setEditable(false);
        jtxt01.setColumns(20);
        jtxt01.setLineWrap(true);
        jtxt01.setRows(5);
        jtxt01.setText("MySQL provides connectivity for client applications developed in the Java programming language with MySQL Connector/J, a driver that implements the Java Database Connectivity (JDBC) API and also MySQL X DevAPI.");
        jtxt01.setWrapStyleWord(true);
        jtxt01.setBorder(null);
        jPanel2.add(jtxt01);
        jtxt01.setBounds(16, 160, 400, 80);

        lblMysql.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMysql.setText("MySQL:");
        jPanel2.add(lblMysql);
        lblMysql.setBounds(16, 140, 60, 14);

        lblAtxy2k.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAtxy2k.setText("Atxy2k:");
        jPanel2.add(lblAtxy2k);
        lblAtxy2k.setBounds(16, 246, 60, 14);

        lbl13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl13.setForeground(new java.awt.Color(51, 51, 255));
        lbl13.setText("http://atxy2k.github.io/RestrictedTextField/");
        lbl13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl13MouseClicked(evt);
            }
        });
        jPanel2.add(lbl13);
        lbl13.setBounds(80, 246, 290, 14);

        jtxt02.setEditable(false);
        jtxt02.setColumns(20);
        jtxt02.setLineWrap(true);
        jtxt02.setRows(5);
        jtxt02.setText("Biblioteca inspirada no comportamento limitado que o componente Swing fornece, um dos problemas comuns na utilização do componente, é muito complexo gerenciar o conteúdo que está sendo escrito, ou seja, não há como validar automaticamente o usuário para digitar certos caracteres que queremos, a menos que seja por código manual.");
        jtxt02.setWrapStyleWord(true);
        jtxt02.setBorder(null);
        jtxt02.setCaretPosition(0);
        jPanel2.add(jtxt02);
        jtxt02.setBounds(16, 265, 400, 100);

        lblDom4j.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDom4j.setText("Dom4j:");
        jPanel2.add(lblDom4j);
        lblDom4j.setBounds(16, 381, 60, 14);

        lbl14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl14.setForeground(new java.awt.Color(51, 51, 255));
        lbl14.setText("https://dom4j.github.io/");
        lbl14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl14MouseClicked(evt);
            }
        });
        jPanel2.add(lbl14);
        lbl14.setBounds(80, 381, 290, 14);

        jtxt03.setEditable(false);
        jtxt03.setColumns(20);
        jtxt03.setLineWrap(true);
        jtxt03.setRows(5);
        jtxt03.setText("dom4j é uma biblioteca Java de código aberto para trabalhar com XML, XPath e XSLT. É compatível com os padrões DOM, SAX e JAXP.");
        jtxt03.setWrapStyleWord(true);
        jtxt03.setBorder(null);
        jtxt03.setCaretPosition(0);
        jPanel2.add(jtxt03);
        jtxt03.setBounds(16, 400, 400, 40);

        lblGson.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGson.setText("Gson:");
        jPanel2.add(lblGson);
        lblGson.setBounds(16, 456, 60, 14);

        lbl15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl15.setForeground(new java.awt.Color(51, 51, 255));
        lbl15.setText("https://github.com/google/gson");
        lbl15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl15MouseClicked(evt);
            }
        });
        jPanel2.add(lbl15);
        lbl15.setBounds(80, 456, 290, 14);

        jtxt04.setEditable(false);
        jtxt04.setColumns(20);
        jtxt04.setLineWrap(true);
        jtxt04.setRows(5);
        jtxt04.setText("Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON.");
        jtxt04.setWrapStyleWord(true);
        jtxt04.setBorder(null);
        jtxt04.setCaretPosition(0);
        jPanel2.add(jtxt04);
        jtxt04.setBounds(16, 475, 400, 40);

        lblHttpClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHttpClient.setText("HttpClient:");
        jPanel2.add(lblHttpClient);
        lblHttpClient.setBounds(16, 531, 70, 14);

        lbl16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl16.setForeground(new java.awt.Color(51, 51, 255));
        lbl16.setText("https://hc.apache.org/httpcomponents-client-4.5.x/");
        lbl16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl16MouseClicked(evt);
            }
        });
        jPanel2.add(lbl16);
        lbl16.setBounds(90, 531, 330, 14);

        jtxt05.setEditable(false);
        jtxt05.setColumns(20);
        jtxt05.setLineWrap(true);
        jtxt05.setRows(5);
        jtxt05.setText("HTTPClient fornece um pacote eficiente, atualizado e rico em recursos que implementa o lado do cliente dos padrões e recomendações HTTP mais recentes.");
        jtxt05.setWrapStyleWord(true);
        jtxt05.setBorder(null);
        jtxt05.setCaretPosition(0);
        jPanel2.add(jtxt05);
        jtxt05.setBounds(16, 550, 400, 70);

        jScrollPane2.setViewportView(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleParent(jScrollPane2);

        jpCompilation.add(jScrollPane2);
        jScrollPane2.setBounds(0, 16, 468, 250);

        jpCards.add(jpCompilation, "cardCompilation");

        jpLegais.setLayout(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtxt06.setEditable(false);
        jtxt06.setColumns(20);
        jtxt06.setLineWrap(true);
        jtxt06.setRows(5);
        jtxt06.setText("ECOLETA DESKTOP is an open source project published under the GNU License.\nYou can view the source code and contribute to this project on GitHUb.\n\nGNU GENERAL PUBLIC LICENSE\nVersion 3, 29 June 2007\n\nCopyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>\nEveryone is permitted to copy and distribute verbatim copies\nof this license document, but changing it is not allowed.\n\nPreamble\n\nThe GNU General Public License is a free, copyleft license for\nsoftware and other kinds of works.\n\nThe licenses for most software and other practical works are designed\nto take away your freedom to share and change the works.  By contrast,\nthe GNU General Public License is intended to guarantee your freedom to\nshare and change all versions of a program--to make sure it remains free\nsoftware for all its users.  We, the Free Software Foundation, use the\nGNU General Public License for most of our software; it applies also to\nany other work released this way by its authors.  You can apply it to\nyour programs, too.\n\nWhen we speak of free software, we are referring to freedom, not\nprice.  Our General Public Licenses are designed to make sure that you\nhave the freedom to distribute copies of free software (and charge for\nthem if you wish), that you receive source code or can get it if you\nwant it, that you can change the software or use pieces of it in new\nfree programs, and that you know you can do these things.\n\nTo protect your rights, we need to prevent others from denying you\nthese rights or asking you to surrender the rights.  Therefore, you have\ncertain responsibilities if you distribute copies of the software, or if\nyou modify it: responsibilities to respect the freedom of others.\n\nFor example, if you distribute copies of such a program, whether\ngratis or for a fee, you must pass on to the recipients the same\nfreedoms that you received.  You must make sure that they, too, receive\nor can get the source code.  And you must show them these terms so they\nknow their rights.\n\nDevelopers that use the GNU GPL protect your rights with two steps:\n(1) assert copyright on the software, and (2) offer you this License\ngiving you legal permission to copy, distribute and/or modify it.\n\nFor the developers' and authors' protection, the GPL clearly explains\nthat there is no warranty for this free software.  For both users' and\nauthors' sake, the GPL requires that modified versions be marked as\nchanged, so that their problems will not be attributed erroneously to\nauthors of previous versions.\n\nSome devices are designed to deny users access to install or run\nmodified versions of the software inside them, although the manufacturer\ncan do so.  This is fundamentally incompatible with the aim of\nprotecting users' freedom to change the software.  The systematic\npattern of such abuse occurs in the area of products for individuals to\nuse, which is precisely where it is most unacceptable.  Therefore, we\nhave designed this version of the GPL to prohibit the practice for those\nproducts.  If such problems arise substantially in other domains, we\nstand ready to extend this provision to those domains in future versions\nof the GPL, as needed to protect the freedom of users.\n\nFinally, every program is threatened constantly by software patents.\nStates should not allow patents to restrict development and use of\nsoftware on general-purpose computers, but in those that do, we wish to\navoid the special danger that patents applied to a free program could\nmake it effectively proprietary.  To prevent this, the GPL assures that\npatents cannot be used to render the program non-free.\n\nThe precise terms and conditions for copying, distribution and\nmodification follow.\n\nTERMS AND CONDITIONS\n\n0. Definitions.\n\n\"This License\" refers to version 3 of the GNU General Public License.\n\n\"Copyright\" also means copyright-like laws that apply to other kinds of\nworks, such as semiconductor masks.\n\n\"The Program\" refers to any copyrightable work licensed under this\nLicense.  Each licensee is addressed as \"you\".  \"Licensees\" and\n\"recipients\" may be individuals or organizations.\n\nTo \"modify\" a work means to copy from or adapt all or part of the work\nin a fashion requiring copyright permission, other than the making of an\nexact copy.  The resulting work is called a \"modified version\" of the\nearlier work or a work \"based on\" the earlier work.\n\nA \"covered work\" means either the unmodified Program or a work based\non the Program.\n\nTo \"propagate\" a work means to do anything with it that, without\npermission, would make you directly or secondarily liable for\ninfringement under applicable copyright law, except executing it on a\ncomputer or modifying a private copy.  Propagation includes copying,\ndistribution (with or without modification), making available to the\npublic, and in some countries other activities as well.\n\nTo \"convey\" a work means any kind of propagation that enables other\nparties to make or receive copies.  Mere interaction with a user through\na computer network, with no transfer of a copy, is not conveying.\n\nAn interactive user interface displays \"Appropriate Legal Notices\"\nto the extent that it includes a convenient and prominently visible\nfeature that (1) displays an appropriate copyright notice, and (2)\ntells the user that there is no warranty for the work (except to the\nextent that warranties are provided), that licensees may convey the\nwork under this License, and how to view a copy of this License.  If\nthe interface presents a list of user commands or options, such as a\nmenu, a prominent item in the list meets this criterion.\n\n1. Source Code.\n\nThe \"source code\" for a work means the preferred form of the work\nfor making modifications to it.  \"Object code\" means any non-source\nform of a work.\n\nA \"Standard Interface\" means an interface that either is an official\nstandard defined by a recognized standards body, or, in the case of\ninterfaces specified for a particular programming language, one that\nis widely used among developers working in that language.\n\nThe \"System Libraries\" of an executable work include anything, other\nthan the work as a whole, that (a) is included in the normal form of\npackaging a Major Component, but which is not part of that Major\nComponent, and (b) serves only to enable use of the work with that\nMajor Component, or to implement a Standard Interface for which an\nimplementation is available to the public in source code form.  A\n\"Major Component\", in this context, means a major essential component\n(kernel, window system, and so on) of the specific operating system\n(if any) on which the executable work runs, or a compiler used to\nproduce the work, or an object code interpreter used to run it.\n\nThe \"Corresponding Source\" for a work in object code form means all\nthe source code needed to generate, install, and (for an executable\nwork) run the object code and to modify the work, including scripts to\ncontrol those activities.  However, it does not include the work's\nSystem Libraries, or general-purpose tools or generally available free\nprograms which are used unmodified in performing those activities but\nwhich are not part of the work.  For example, Corresponding Source\nincludes interface definition files associated with source files for\nthe work, and the source code for shared libraries and dynamically\nlinked subprograms that the work is specifically designed to require,\nsuch as by intimate data communication or control flow between those\nsubprograms and other parts of the work.\n\nThe Corresponding Source need not include anything that users\ncan regenerate automatically from other parts of the Corresponding\nSource.\n\nThe Corresponding Source for a work in source code form is that\nsame work.\n\n2. Basic Permissions.\n\nAll rights granted under this License are granted for the term of\ncopyright on the Program, and are irrevocable provided the stated\nconditions are met.  This License explicitly affirms your unlimited\npermission to run the unmodified Program.  The output from running a\ncovered work is covered by this License only if the output, given its\ncontent, constitutes a covered work.  This License acknowledges your\nrights of fair use or other equivalent, as provided by copyright law.\n\nYou may make, run and propagate covered works that you do not\nconvey, without conditions so long as your license otherwise remains\nin force.  You may convey covered works to others for the sole purpose\nof having them make modifications exclusively for you, or provide you\nwith facilities for running those works, provided that you comply with\nthe terms of this License in conveying all material for which you do\nnot control copyright.  Those thus making or running the covered works\nfor you must do so exclusively on your behalf, under your direction\nand control, on terms that prohibit them from making any copies of\nyour copyrighted material outside their relationship with you.\n\nConveying under any other circumstances is permitted solely under\nthe conditions stated below.  Sublicensing is not allowed; section 10\nmakes it unnecessary.\n\n3. Protecting Users' Legal Rights From Anti-Circumvention Law.\n\nNo covered work shall be deemed part of an effective technological\nmeasure under any applicable law fulfilling obligations under article\n11 of the WIPO copyright treaty adopted on 20 December 1996, or\nsimilar laws prohibiting or restricting circumvention of such\nmeasures.\n\nWhen you convey a covered work, you waive any legal power to forbid\ncircumvention of technological measures to the extent such circumvention\nis effected by exercising rights under this License with respect to\nthe covered work, and you disclaim any intention to limit operation or\nmodification of the work as a means of enforcing, against the work's\nusers, your or third parties' legal rights to forbid circumvention of\ntechnological measures.\n\n4. Conveying Verbatim Copies.\n\nYou may convey verbatim copies of the Program's source code as you\nreceive it, in any medium, provided that you conspicuously and\nappropriately publish on each copy an appropriate copyright notice;\nkeep intact all notices stating that this License and any\nnon-permissive terms added in accord with section 7 apply to the code;\nkeep intact all notices of the absence of any warranty; and give all\nrecipients a copy of this License along with the Program.\n\nYou may charge any price or no price for each copy that you convey,\nand you may offer support or warranty protection for a fee.\n\n5. Conveying Modified Source Versions.\n\nYou may convey a work based on the Program, or the modifications to\nproduce it from the Program, in the form of source code under the\nterms of section 4, provided that you also meet all of these conditions:\n\na) The work must carry prominent notices stating that you modified\nit, and giving a relevant date.\n\nb) The work must carry prominent notices stating that it is\nreleased under this License and any conditions added under section\n7.  This requirement modifies the requirement in section 4 to\n\"keep intact all notices\".\n\nc) You must license the entire work, as a whole, under this\nLicense to anyone who comes into possession of a copy.  This\nLicense will therefore apply, along with any applicable section 7\nadditional terms, to the whole of the work, and all its parts,\nregardless of how they are packaged.  This License gives no\npermission to license the work in any other way, but it does not\ninvalidate such permission if you have separately received it.\n\nd) If the work has interactive user interfaces, each must display\nAppropriate Legal Notices; however, if the Program has interactive\ninterfaces that do not display Appropriate Legal Notices, your\nwork need not make them do so.\n\nA compilation of a covered work with other separate and independent\nworks, which are not by their nature extensions of the covered work,\nand which are not combined with it such as to form a larger program,\nin or on a volume of a storage or distribution medium, is called an\n\"aggregate\" if the compilation and its resulting copyright are not\nused to limit the access or legal rights of the compilation's users\nbeyond what the individual works permit.  Inclusion of a covered work\nin an aggregate does not cause this License to apply to the other\nparts of the aggregate.\n\n6. Conveying Non-Source Forms.\n\nYou may convey a covered work in object code form under the terms\nof sections 4 and 5, provided that you also convey the\nmachine-readable Corresponding Source under the terms of this License,\nin one of these ways:\n\na) Convey the object code in, or embodied in, a physical product\n(including a physical distribution medium), accompanied by the\nCorresponding Source fixed on a durable physical medium\ncustomarily used for software interchange.\n\nb) Convey the object code in, or embodied in, a physical product\n(including a physical distribution medium), accompanied by a\nwritten offer, valid for at least three years and valid for as\nlong as you offer spare parts or customer support for that product\nmodel, to give anyone who possesses the object code either (1) a\ncopy of the Corresponding Source for all the software in the\nproduct that is covered by this License, on a durable physical\nmedium customarily used for software interchange, for a price no\nmore than your reasonable cost of physically performing this\nconveying of source, or (2) access to copy the\nCorresponding Source from a network server at no charge.\n\nc) Convey individual copies of the object code with a copy of the\nwritten offer to provide the Corresponding Source.  This\nalternative is allowed only occasionally and noncommercially, and\nonly if you received the object code with such an offer, in accord\nwith subsection 6b.\n\nd) Convey the object code by offering access from a designated\nplace (gratis or for a charge), and offer equivalent access to the\nCorresponding Source in the same way through the same place at no\nfurther charge.  You need not require recipients to copy the\nCorresponding Source along with the object code.  If the place to\ncopy the object code is a network server, the Corresponding Source\nmay be on a different server (operated by you or a third party)\nthat supports equivalent copying facilities, provided you maintain\nclear directions next to the object code saying where to find the\nCorresponding Source.  Regardless of what server hosts the\nCorresponding Source, you remain obligated to ensure that it is\navailable for as long as needed to satisfy these requirements.\n\ne) Convey the object code using peer-to-peer transmission, provided\nyou inform other peers where the object code and Corresponding\nSource of the work are being offered to the general public at no\ncharge under subsection 6d.\n\nA separable portion of the object code, whose source code is excluded\nfrom the Corresponding Source as a System Library, need not be\nincluded in conveying the object code work.\n\nA \"User Product\" is either (1) a \"consumer product\", which means any\ntangible personal property which is normally used for personal, family,\nor household purposes, or (2) anything designed or sold for incorporation\ninto a dwelling.  In determining whether a product is a consumer product,\ndoubtful cases shall be resolved in favor of coverage.  For a particular\nproduct received by a particular user, \"normally used\" refers to a\ntypical or common use of that class of product, regardless of the status\nof the particular user or of the way in which the particular user\nactually uses, or expects or is expected to use, the product.  A product\nis a consumer product regardless of whether the product has substantial\ncommercial, industrial or non-consumer uses, unless such uses represent\nthe only significant mode of use of the product.\n\n\"Installation Information\" for a User Product means any methods,\nprocedures, authorization keys, or other information required to install\nand execute modified versions of a covered work in that User Product from\na modified version of its Corresponding Source.  The information must\nsuffice to ensure that the continued functioning of the modified object\ncode is in no case prevented or interfered with solely because\nmodification has been made.\n\nIf you convey an object code work under this section in, or with, or\nspecifically for use in, a User Product, and the conveying occurs as\npart of a transaction in which the right of possession and use of the\nUser Product is transferred to the recipient in perpetuity or for a\nfixed term (regardless of how the transaction is characterized), the\nCorresponding Source conveyed under this section must be accompanied\nby the Installation Information.  But this requirement does not apply\nif neither you nor any third party retains the ability to install\nmodified object code on the User Product (for example, the work has\nbeen installed in ROM).\n\nThe requirement to provide Installation Information does not include a\nrequirement to continue to provide support service, warranty, or updates\nfor a work that has been modified or installed by the recipient, or for\nthe User Product in which it has been modified or installed.  Access to a\nnetwork may be denied when the modification itself materially and\nadversely affects the operation of the network or violates the rules and\nprotocols for communication across the network.\n\nCorresponding Source conveyed, and Installation Information provided,\nin accord with this section must be in a format that is publicly\ndocumented (and with an implementation available to the public in\nsource code form), and must require no special password or key for\nunpacking, reading or copying.\n\n7. Additional Terms.\n\n\"Additional permissions\" are terms that supplement the terms of this\nLicense by making exceptions from one or more of its conditions.\nAdditional permissions that are applicable to the entire Program shall\nbe treated as though they were included in this License, to the extent\nthat they are valid under applicable law.  If additional permissions\napply only to part of the Program, that part may be used separately\nunder those permissions, but the entire Program remains governed by\nthis License without regard to the additional permissions.\n\nWhen you convey a copy of a covered work, you may at your option\nremove any additional permissions from that copy, or from any part of\nit.  (Additional permissions may be written to require their own\nremoval in certain cases when you modify the work.)  You may place\nadditional permissions on material, added by you to a covered work,\nfor which you have or can give appropriate copyright permission.\n\nNotwithstanding any other provision of this License, for material you\nadd to a covered work, you may (if authorized by the copyright holders of\nthat material) supplement the terms of this License with terms:\n\na) Disclaiming warranty or limiting liability differently from the\nterms of sections 15 and 16 of this License; or\n\nb) Requiring preservation of specified reasonable legal notices or\nauthor attributions in that material or in the Appropriate Legal\nNotices displayed by works containing it; or\n\nc) Prohibiting misrepresentation of the origin of that material, or\nrequiring that modified versions of such material be marked in\nreasonable ways as different from the original version; or\n\nd) Limiting the use for publicity purposes of names of licensors or\nauthors of the material; or\n\ne) Declining to grant rights under trademark law for use of some\ntrade names, trademarks, or service marks; or\n\nf) Requiring indemnification of licensors and authors of that\nmaterial by anyone who conveys the material (or modified versions of\nit) with contractual assumptions of liability to the recipient, for\nany liability that these contractual assumptions directly impose on\nthose licensors and authors.\n\nAll other non-permissive additional terms are considered \"further\nrestrictions\" within the meaning of section 10.  If the Program as you\nreceived it, or any part of it, contains a notice stating that it is\ngoverned by this License along with a term that is a further\nrestriction, you may remove that term.  If a license document contains\na further restriction but permits relicensing or conveying under this\nLicense, you may add to a covered work material governed by the terms\nof that license document, provided that the further restriction does\nnot survive such relicensing or conveying.\n\nIf you add terms to a covered work in accord with this section, you\nmust place, in the relevant source files, a statement of the\nadditional terms that apply to those files, or a notice indicating\nwhere to find the applicable terms.\n\nAdditional terms, permissive or non-permissive, may be stated in the\nform of a separately written license, or stated as exceptions;\nthe above requirements apply either way.\n\n8. Termination.\n\nYou may not propagate or modify a covered work except as expressly\nprovided under this License.  Any attempt otherwise to propagate or\nmodify it is void, and will automatically terminate your rights under\nthis License (including any patent licenses granted under the third\nparagraph of section 11).\n\nHowever, if you cease all violation of this License, then your\nlicense from a particular copyright holder is reinstated (a)\nprovisionally, unless and until the copyright holder explicitly and\nfinally terminates your license, and (b) permanently, if the copyright\nholder fails to notify you of the violation by some reasonable means\nprior to 60 days after the cessation.\n\nMoreover, your license from a particular copyright holder is\nreinstated permanently if the copyright holder notifies you of the\nviolation by some reasonable means, this is the first time you have\nreceived notice of violation of this License (for any work) from that\ncopyright holder, and you cure the violation prior to 30 days after\nyour receipt of the notice.\n\nTermination of your rights under this section does not terminate the\nlicenses of parties who have received copies or rights from you under\nthis License.  If your rights have been terminated and not permanently\nreinstated, you do not qualify to receive new licenses for the same\nmaterial under section 10.\n\n9. Acceptance Not Required for Having Copies.\n\nYou are not required to accept this License in order to receive or\nrun a copy of the Program.  Ancillary propagation of a covered work\noccurring solely as a consequence of using peer-to-peer transmission\nto receive a copy likewise does not require acceptance.  However,\nnothing other than this License grants you permission to propagate or\nmodify any covered work.  These actions infringe copyright if you do\nnot accept this License.  Therefore, by modifying or propagating a\ncovered work, you indicate your acceptance of this License to do so.\n\n10. Automatic Licensing of Downstream Recipients.\n\nEach time you convey a covered work, the recipient automatically\nreceives a license from the original licensors, to run, modify and\npropagate that work, subject to this License.  You are not responsible\nfor enforcing compliance by third parties with this License.\n\nAn \"entity transaction\" is a transaction transferring control of an\norganization, or substantially all assets of one, or subdividing an\norganization, or merging organizations.  If propagation of a covered\nwork results from an entity transaction, each party to that\ntransaction who receives a copy of the work also receives whatever\nlicenses to the work the party's predecessor in interest had or could\ngive under the previous paragraph, plus a right to possession of the\nCorresponding Source of the work from the predecessor in interest, if\nthe predecessor has it or can get it with reasonable efforts.\n\nYou may not impose any further restrictions on the exercise of the\nrights granted or affirmed under this License.  For example, you may\nnot impose a license fee, royalty, or other charge for exercise of\nrights granted under this License, and you may not initiate litigation\n(including a cross-claim or counterclaim in a lawsuit) alleging that\nany patent claim is infringed by making, using, selling, offering for\nsale, or importing the Program or any portion of it.\n\n11. Patents.\n\nA \"contributor\" is a copyright holder who authorizes use under this\nLicense of the Program or a work on which the Program is based.  The\nwork thus licensed is called the contributor's \"contributor version\".\n\nA contributor's \"essential patent claims\" are all patent claims\nowned or controlled by the contributor, whether already acquired or\nhereafter acquired, that would be infringed by some manner, permitted\nby this License, of making, using, or selling its contributor version,\nbut do not include claims that would be infringed only as a\nconsequence of further modification of the contributor version.  For\npurposes of this definition, \"control\" includes the right to grant\npatent sublicenses in a manner consistent with the requirements of\nthis License.\n\nEach contributor grants you a non-exclusive, worldwide, royalty-free\npatent license under the contributor's essential patent claims, to\nmake, use, sell, offer for sale, import and otherwise run, modify and\npropagate the contents of its contributor version.\n\nIn the following three paragraphs, a \"patent license\" is any express\nagreement or commitment, however denominated, not to enforce a patent\n(such as an express permission to practice a patent or covenant not to\nsue for patent infringement).  To \"grant\" such a patent license to a\nparty means to make such an agreement or commitment not to enforce a\npatent against the party.\n\nIf you convey a covered work, knowingly relying on a patent license,\nand the Corresponding Source of the work is not available for anyone\nto copy, free of charge and under the terms of this License, through a\npublicly available network server or other readily accessible means,\nthen you must either (1) cause the Corresponding Source to be so\navailable, or (2) arrange to deprive yourself of the benefit of the\npatent license for this particular work, or (3) arrange, in a manner\nconsistent with the requirements of this License, to extend the patent\nlicense to downstream recipients.  \"Knowingly relying\" means you have\nactual knowledge that, but for the patent license, your conveying the\ncovered work in a country, or your recipient's use of the covered work\nin a country, would infringe one or more identifiable patents in that\ncountry that you have reason to believe are valid.\n\nIf, pursuant to or in connection with a single transaction or\narrangement, you convey, or propagate by procuring conveyance of, a\ncovered work, and grant a patent license to some of the parties\nreceiving the covered work authorizing them to use, propagate, modify\nor convey a specific copy of the covered work, then the patent license\nyou grant is automatically extended to all recipients of the covered\nwork and works based on it.\n\nA patent license is \"discriminatory\" if it does not include within\nthe scope of its coverage, prohibits the exercise of, or is\nconditioned on the non-exercise of one or more of the rights that are\nspecifically granted under this License.  You may not convey a covered\nwork if you are a party to an arrangement with a third party that is\nin the business of distributing software, under which you make payment\nto the third party based on the extent of your activity of conveying\nthe work, and under which the third party grants, to any of the\nparties who would receive the covered work from you, a discriminatory\npatent license (a) in connection with copies of the covered work\nconveyed by you (or copies made from those copies), or (b) primarily\nfor and in connection with specific products or compilations that\ncontain the covered work, unless you entered into that arrangement,\nor that patent license was granted, prior to 28 March 2007.\n\nNothing in this License shall be construed as excluding or limiting\nany implied license or other defenses to infringement that may\notherwise be available to you under applicable patent law.\n\n12. No Surrender of Others' Freedom.\n\nIf conditions are imposed on you (whether by court order, agreement or\notherwise) that contradict the conditions of this License, they do not\nexcuse you from the conditions of this License.  If you cannot convey a\ncovered work so as to satisfy simultaneously your obligations under this\nLicense and any other pertinent obligations, then as a consequence you may\nnot convey it at all.  For example, if you agree to terms that obligate you\nto collect a royalty for further conveying from those to whom you convey\nthe Program, the only way you could satisfy both those terms and this\nLicense would be to refrain entirely from conveying the Program.\n\n13. Use with the GNU Affero General Public License.\n\nNotwithstanding any other provision of this License, you have\npermission to link or combine any covered work with a work licensed\nunder version 3 of the GNU Affero General Public License into a single\ncombined work, and to convey the resulting work.  The terms of this\nLicense will continue to apply to the part which is the covered work,\nbut the special requirements of the GNU Affero General Public License,\nsection 13, concerning interaction through a network will apply to the\ncombination as such.\n\n14. Revised Versions of this License.\n\nThe Free Software Foundation may publish revised and/or new versions of\nthe GNU General Public License from time to time.  Such new versions will\nbe similar in spirit to the present version, but may differ in detail to\naddress new problems or concerns.\n\nEach version is given a distinguishing version number.  If the\nProgram specifies that a certain numbered version of the GNU General\nPublic License \"or any later version\" applies to it, you have the\noption of following the terms and conditions either of that numbered\nversion or of any later version published by the Free Software\nFoundation.  If the Program does not specify a version number of the\nGNU General Public License, you may choose any version ever published\nby the Free Software Foundation.\n\nIf the Program specifies that a proxy can decide which future\nversions of the GNU General Public License can be used, that proxy's\npublic statement of acceptance of a version permanently authorizes you\nto choose that version for the Program.\n\nLater license versions may give you additional or different\npermissions.  However, no additional obligations are imposed on any\nauthor or copyright holder as a result of your choosing to follow a\nlater version.\n\n15. Disclaimer of Warranty.\n\nTHERE IS NO WARRANTY FOR THE PROGRAM, TO THE EXTENT PERMITTED BY\nAPPLICABLE LAW.  EXCEPT WHEN OTHERWISE STATED IN WRITING THE COPYRIGHT\nHOLDERS AND/OR OTHER PARTIES PROVIDE THE PROGRAM \"AS IS\" WITHOUT WARRANTY\nOF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,\nTHE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR\nPURPOSE.  THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE PROGRAM\nIS WITH YOU.  SHOULD THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF\nALL NECESSARY SERVICING, REPAIR OR CORRECTION.\n\n16. Limitation of Liability.\n\nIN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING\nWILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MODIFIES AND/OR CONVEYS\nTHE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES, INCLUDING ANY\nGENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE\nUSE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF\nDATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD\nPARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER PROGRAMS),\nEVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF\nSUCH DAMAGES.\n\n17. Interpretation of Sections 15 and 16.\n\nIf the disclaimer of warranty and limitation of liability provided\nabove cannot be given local legal effect according to their terms,\nreviewing courts shall apply local law that most closely approximates\nan absolute waiver of all civil liability in connection with the\nProgram, unless a warranty or assumption of liability accompanies a\ncopy of the Program in return for a fee.\n\nEND OF TERMS AND CONDITIONS\n\nHow to Apply These Terms to Your New Programs\n\nIf you develop a new program, and you want it to be of the greatest\npossible use to the public, the best way to achieve this is to make it\nfree software which everyone can redistribute and change under these terms.\n\nTo do so, attach the following notices to the program.  It is safest\nto attach them to the start of each source file to most effectively\nstate the exclusion of warranty; and each file should have at least\nthe \"copyright\" line and a pointer to where the full notice is found.\n\n<one line to give the program's name and a brief idea of what it does.>\nCopyright (C) <year>  <name of author>\n\nThis program is free software: you can redistribute it and/or modify\nit under the terms of the GNU General Public License as published by\nthe Free Software Foundation, either version 3 of the License, or\n(at your option) any later version.\n\nThis program is distributed in the hope that it will be useful,\nbut WITHOUT ANY WARRANTY; without even the implied warranty of\nMERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\nGNU General Public License for more details.\n\nYou should have received a copy of the GNU General Public License\nalong with this program.  If not, see <https://www.gnu.org/licenses/>.\n\nAlso add information on how to contact you by electronic and paper mail.\n\nIf the program does terminal interaction, make it output a short\nnotice like this when it starts in an interactive mode:\n\n<program>  Copyright (C) <year>  <name of author>\nThis program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.\nThis is free software, and you are welcome to redistribute it\nunder certain conditions; type `show c' for details.\n\nThe hypothetical commands `show w' and `show c' should show the appropriate\nparts of the General Public License.  Of course, your program's commands\nmight be different; for a GUI interface, you would use an \"about box\".\n\nYou should also get your employer (if you work as a programmer) or school,\nif any, to sign a \"copyright disclaimer\" for the program, if necessary.\nFor more information on this, and how to apply and follow the GNU GPL, see\n<https://www.gnu.org/licenses/>.\n\nThe GNU General Public License does not permit incorporating your program\ninto proprietary programs.  If your program is a subroutine library, you\nmay consider it more useful to permit linking proprietary applications with\nthe library.  If this is what you want to do, use the GNU Lesser General\nPublic License instead of this License.  But first, please read\n<https://www.gnu.org/licenses/why-not-lgpl.html>.\n\n\n");
        jtxt06.setWrapStyleWord(true);
        jtxt06.setBorder(null);
        jtxt06.setCaretPosition(0);
        jScrollPane1.setViewportView(jtxt06);

        jpLegais.add(jScrollPane1);
        jScrollPane1.setBounds(0, 16, 468, 250);

        jpCards.add(jpLegais, "cardLegais");

        jpMain.add(jpCards, java.awt.BorderLayout.CENTER);

        jpPrincipal.add(jpMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpPrincipal);
        jpPrincipal.setBounds(16, 16, 468, 368);

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(516, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEcoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEcoletaMouseClicked

        lblEcoleta.setForeground(new Color(0, 0, 0));
        lblCompilation.setForeground(new Color(153, 153, 153));
        lblLegais.setForeground(new Color(153, 153, 153));

        CardLayout cl = (CardLayout) jpCards.getLayout();
        cl.show(jpCards, "cardEcoleta");
    }//GEN-LAST:event_lblEcoletaMouseClicked

    private void lblCompilationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompilationMouseClicked

        lblCompilation.setForeground(new Color(0, 0, 0));
        lblEcoleta.setForeground(new Color(153, 153, 153));
        lblLegais.setForeground(new Color(153, 153, 153));

        CardLayout cl = (CardLayout) jpCards.getLayout();
        cl.show(jpCards, "cardCompilation");
    }//GEN-LAST:event_lblCompilationMouseClicked

    private void lblLegaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLegaisMouseClicked

        lblLegais.setForeground(new Color(0, 0, 0));
        lblEcoleta.setForeground(new Color(153, 153, 153));
        lblCompilation.setForeground(new Color(153, 153, 153));

        CardLayout cl = (CardLayout) jpCards.getLayout();
        cl.show(jpCards, "cardLegais");
    }//GEN-LAST:event_lblLegaisMouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        lbl7.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl("https://github.com" + lbl7.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        lbl8.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl("https://github.com" + lbl8.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        lbl9.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl("https://github.com" + lbl9.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl9.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        lbl10.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl("https://github.com" + lbl10.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        lbl11.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl("https://github.com" + lbl11.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl11.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        lbl12.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl(lbl12.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl12.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl13MouseClicked
        lbl13.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl(lbl13.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl13.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl13MouseClicked

    private void lbl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl14MouseClicked
        lbl14.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl(lbl14.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl14.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl14MouseClicked

    private void lbl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl15MouseClicked
        lbl15.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl(lbl15.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl15.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl15MouseClicked

    private void lbl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl16MouseClicked
        lbl16.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        try {
            Utils.openUrl(lbl16.getText());
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        lbl16.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl16MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpCards;
    private br.com.loginform.components.JPanelRoundedBorder jpCompilation;
    private br.com.loginform.components.JPanelRoundedBorder jpEcoleta;
    private br.com.loginform.components.JPanelRoundedBorder jpLegais;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextArea jtxt01;
    private javax.swing.JTextArea jtxt02;
    private javax.swing.JTextArea jtxt03;
    private javax.swing.JTextArea jtxt04;
    private javax.swing.JTextArea jtxt05;
    private javax.swing.JTextArea jtxt06;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAtxy2k;
    private br.com.loginform.components.JLabelRoundedBorder lblCompilation;
    private javax.swing.JLabel lblDevs;
    private javax.swing.JLabel lblDom4j;
    private br.com.loginform.components.JLabelRoundedBorder lblEcoleta;
    private javax.swing.JLabel lblGson;
    private javax.swing.JLabel lblHttpClient;
    private br.com.loginform.components.JLabelRoundedBorder lblLegais;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblMysql;
    private javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
}
