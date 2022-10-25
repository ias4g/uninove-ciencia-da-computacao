package view;

import dados.SystemDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductScreem extends javax.swing.JFrame {

    public ProductScreem() {
        initComponents();
        activeFields();

        btnSave.setVisible(true);
        btnSave.setEnabled(true);
        this.setTitle("Cadastrando novo produto");
    }

    public ProductScreem(int id, String user, String password, String name, String lastname, String email, String job, String op) {
        initComponents();

        switch (op) {

            case "delete" -> {

                btnDelete.setVisible(true);
                btnDelete.setEnabled(true);

                btnSave.setVisible(false);
                btnSaveChange.setVisible(false);

                this.setTitle("Excluindo um usuário");

            }
            case "alterar" -> {

                activeFields();

                btnSaveChange.setVisible(true);
                btnSaveChange.setEnabled(true);

                btnDelete.setVisible(false);
                btnSave.setVisible(false);

                this.setTitle("Alterando um usuário");
            }

        }

        fillFields(id, user, password, name, lastname, email, job);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSaveChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setTitle("User Control");
        setMinimumSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(null);

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setText("Id");
        getContentPane().add(lblUser);
        lblUser.setBounds(20, 80, 70, 40);

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtId.setEnabled(false);
        getContentPane().add(txtId);
        txtId.setBounds(90, 80, 180, 40);

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setText("Nome");
        getContentPane().add(lblId);
        lblId.setBounds(300, 80, 80, 25);

        txtName.setEditable(false);
        txtName.setEnabled(false);
        getContentPane().add(txtName);
        txtName.setBounds(360, 80, 260, 40);

        lblPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPass.setText("Marca");
        getContentPane().add(lblPass);
        lblPass.setBounds(20, 150, 70, 40);

        txtBrand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBrand.setEnabled(false);
        getContentPane().add(txtBrand);
        txtBrand.setBounds(90, 150, 290, 40);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Preço");
        getContentPane().add(lblName);
        lblName.setBounds(410, 150, 70, 40);

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrice.setEnabled(false);
        getContentPane().add(txtPrice);
        txtPrice.setBounds(460, 150, 160, 40);

        jPanel1.setLayout(new java.awt.CardLayout());

        btnSaveChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveChange.setText("Salvar Alteração");
        btnSaveChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveChange.setEnabled(false);
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChange, "card2");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, "card3");

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, "card4");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 250, 230, 50);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        String brand = txtBrand.getText();
        float price = Float.parseFloat(txtPrice.getText());

        try {

            new SystemDao().salvarProduct(id, name, brand, price);

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

            txtId.setText(null);
            txtBrand.setText(null);
            txtPrice.setText(null);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir este usuário?", "Confirmação", 0);
//
//        if (resp == 0) {
//
//            try {
//
//                new SystemDao().deletarUsuario(txtName.getText());
//
//                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
//
//                dispose();
//
//            } catch (ClassNotFoundException | SQLException ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//
//        } else {
//
//            dispose();
//
//        }


    }//GEN-LAST:event_btnDeleteActionPerformed
    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
//        int id = Integer.parseInt(txtName.getText());
//        String user = txtId.getText();
//        String pass = txtBrand.getText();
//        String name = txtPrice.getText();
//
//        try {
//
//            new SystemDao().alterarUsuario(user, pass, name);
//
//            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
//
//            dispose();
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
    }//GEN-LAST:event_btnSaveChangeActionPerformed
    private void activeFields() {
        txtId.setEnabled(true);
        txtBrand.setEnabled(true);
        txtPrice.setEnabled(true);

        lblId.setVisible(false);
        txtName.setVisible(false);

        btnDelete.setVisible(false);
        btnSave.setVisible(false);
        btnSaveChange.setVisible(false);
    }

    private void fillFields(int id, String user, String password, String name, String lastname, String email, String job) {
        txtName.setText(String.valueOf(id));
        txtId.setText(user);
        txtBrand.setText(password);
        txtPrice.setText(name);

        lblId.setVisible(true);
        txtName.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
