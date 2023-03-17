package br.com.loginform.screem;

import br.com.loginform.utils.FontManager;
import java.awt.Color;
import java.awt.Font;

public class Message extends javax.swing.JDialog {

    public Message(java.awt.Frame parent, boolean modal, String status, String Message) {
        super(parent, modal);
        initComponents();

        setFont();

        jtaMessage.setText(Message);

        switch (status) {
            case "success" -> {
                setSuccess();
            }

            case "error" -> {
                setError();
            }

            case "warning" -> {
                setWarning();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jtaMessage = new javax.swing.JTextArea();
        lblButtonOk = new br.com.loginform.components.JLabelRoundedBorder();

        setMaximumSize(new java.awt.Dimension(300, 260));
        setMinimumSize(new java.awt.Dimension(300, 260));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 174, 104), 4));
        jpMain.setLayout(null);

        lblIcon.setBackground(new java.awt.Color(45, 174, 104));
        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/img-success.png"))); // NOI18N
        lblIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIcon.setOpaque(true);
        jpMain.add(lblIcon);
        lblIcon.setBounds(0, 0, 300, 96);

        lblStatus.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Sucesso");
        lblStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpMain.add(lblStatus);
        lblStatus.setBounds(0, 110, 300, 20);

        jtaMessage.setEditable(false);
        jtaMessage.setBackground(new java.awt.Color(255, 255, 255));
        jtaMessage.setLineWrap(true);
        jtaMessage.setWrapStyleWord(true);
        jtaMessage.setBorder(null);
        jtaMessage.setFocusable(false);
        jtaMessage.setVerifyInputWhenFocusTarget(false);
        jpMain.add(jtaMessage);
        jtaMessage.setBounds(16, 136, 268, 62);

        lblButtonOk.setBackground(new java.awt.Color(45, 174, 104));
        lblButtonOk.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonOk.setText("OK");
        lblButtonOk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblButtonOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblButtonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonOkMouseClicked(evt);
            }
        });
        jpMain.add(lblButtonOk);
        lblButtonOk.setBounds(112, 216, 76, 22);

        getContentPane().add(jpMain, "card2");

        setSize(new java.awt.Dimension(300, 260));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonOkMouseClicked
        dispose();
    }//GEN-LAST:event_lblButtonOkMouseClicked

    private void setFont() {

        Font Ubuntu_Bold_24 = FontManager.Loading("Ubuntu-Bold.ttf", Font.BOLD, 24f);
        Font PTSans_Regular_12 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 12f);
        Font PTSans_Regular_16 = FontManager.Loading("PTSans-Regular.ttf", Font.PLAIN, 16f);

        lblStatus.setFont(Ubuntu_Bold_24);
        jtaMessage.setFont(PTSans_Regular_12);
        lblButtonOk.setFont(PTSans_Regular_16);

    }

    private void setSuccess() {
        lblStatus.setText("Sucesso");
        lblButtonOk.setBackground(new Color(45, 174, 104));
        lblIcon.setBackground(new java.awt.Color(45, 174, 104));
        jpMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 174, 104), 4));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/img-success.png")));
    }

    private void setError() {
        lblStatus.setText("Erro");
        lblButtonOk.setBackground(new Color(246, 86, 86));
        lblIcon.setBackground(new java.awt.Color(246, 86, 86));
        jpMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 86, 86), 4));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/img-error.png")));
    }

    private void setWarning() {
        lblStatus.setText("Aviso");
        lblButtonOk.setBackground(new Color(248, 177, 35));
        lblIcon.setBackground(new java.awt.Color(248, 177, 35));
        jpMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 177, 35), 4));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/img-warning.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpMain;
    private javax.swing.JTextArea jtaMessage;
    private br.com.loginform.components.JLabelRoundedBorder lblButtonOk;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
