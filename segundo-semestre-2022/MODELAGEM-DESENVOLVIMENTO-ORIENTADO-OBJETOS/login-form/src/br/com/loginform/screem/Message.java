package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Message extends javax.swing.JDialog {

    public Message(java.awt.Frame parent, boolean modal, String status, String Message) {
        super(parent, modal);
        initComponents();
        setFont();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/icon-system.png"));
        this.getContentPane().setBackground(new Color(255, 255, 255));

        jtaMessage.setText(Message);

        switch (status) {
            case "success" -> {
                lblStatus.setText("Sucesso");
                lblOk.setBackground(new Color(45, 174, 104));
                jpMain.setBackground(new Color(255, 255, 255));
                jpHeader.setBackground(new Color(45, 174, 104));
                jpSeparator.setBackground(new Color(56, 161, 104));
                lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-icon-success.png")));
            }

            case "error" -> {
                lblStatus.setText("Erro");
                lblOk.setBackground(new Color(212, 86, 89));
                jpMain.setBackground(new Color(255, 255, 255));
                jpHeader.setBackground(new Color(212, 86, 89));
                jpSeparator.setBackground(new Color(234, 135, 138));
                lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-icon-error.png")));
            }

//            case "info" -> {
//                lblStatus.setText("Erro");
//                lblOk.setBackground(new Color(212, 86, 89));
//                jpMain.setBackground(new Color(255, 255, 255));
//                jpHeader.setBackground(new Color(212, 86, 89));
//                jpSeparator.setBackground(new Color(234, 135, 138));
//                lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-icon-error.png")));
//            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jpSeparator = new javax.swing.JPanel();
        jtaMessage = new javax.swing.JTextArea();
        lblIcon = new javax.swing.JLabel();
        lblOk = new br.com.loginform.components.JLabelRoundedBorder();

        setMaximumSize(new java.awt.Dimension(360, 250));
        setMinimumSize(new java.awt.Dimension(360, 250));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jpMain.setBackground(new java.awt.Color(52, 203, 121));
        jpMain.setLayout(null);

        jpHeader.setBackground(new java.awt.Color(45, 174, 104));
        jpHeader.setLayout(null);

        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Sucesso");
        lblStatus.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpHeader.add(lblStatus);
        lblStatus.setBounds(20, 16, 190, 30);

        jpSeparator.setBackground(new java.awt.Color(56, 161, 104));

        javax.swing.GroupLayout jpSeparatorLayout = new javax.swing.GroupLayout(jpSeparator);
        jpSeparator.setLayout(jpSeparatorLayout);
        jpSeparatorLayout.setHorizontalGroup(
            jpSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jpSeparatorLayout.setVerticalGroup(
            jpSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jpHeader.add(jpSeparator);
        jpSeparator.setBounds(0, 50, 360, 1);

        jtaMessage.setEditable(false);
        jtaMessage.setColumns(20);
        jtaMessage.setForeground(new java.awt.Color(255, 255, 255));
        jtaMessage.setLineWrap(true);
        jtaMessage.setRows(5);
        jtaMessage.setText("\n");
        jtaMessage.setWrapStyleWord(true);
        jtaMessage.setBorder(null);
        jtaMessage.setMaximumSize(new java.awt.Dimension(317, 105));
        jtaMessage.setMinimumSize(new java.awt.Dimension(317, 105));
        jtaMessage.setOpaque(false);
        jtaMessage.setPreferredSize(new java.awt.Dimension(317, 105));
        jpHeader.add(jtaMessage);
        jtaMessage.setBounds(22, 62, 317, 105);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bg-icon-success.png"))); // NOI18N
        jpHeader.add(lblIcon);
        lblIcon.setBounds(0, 0, 360, 180);

        jpMain.add(jpHeader);
        jpHeader.setBounds(0, 0, 360, 180);

        lblOk.setBackground(new java.awt.Color(52, 203, 121));
        lblOk.setForeground(new java.awt.Color(255, 255, 255));
        lblOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOk.setText("OK");
        lblOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOkMouseClicked(evt);
            }
        });
        jpMain.add(lblOk);
        lblOk.setBounds(270, 200, 70, 30);

        getContentPane().add(jpMain);
        jpMain.setBounds(0, 0, 360, 250);

        setSize(new java.awt.Dimension(360, 250));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkMouseClicked
        dispose();
    }//GEN-LAST:event_lblOkMouseClicked

    private void setFont() {
        Font Ubuntu_Bold_24 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 24f);
        Font Ubuntu_Bold_16 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 16f);
        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

        lblStatus.setFont(Ubuntu_Bold_24);
        jtaMessage.setFont(PTSans_Regular_16);
        lblOk.setFont(Ubuntu_Bold_16);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpSeparator;
    private javax.swing.JTextArea jtaMessage;
    private javax.swing.JLabel lblIcon;
    private br.com.loginform.components.JLabelRoundedBorder lblOk;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
