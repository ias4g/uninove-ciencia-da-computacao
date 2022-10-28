package view;

import dados.SystemDao;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JOptionPane;

public class ProductScreem extends javax.swing.JFrame {

    UUID uuid;

    public ProductScreem() {
        initComponents();

        uuid = UUID.randomUUID();
        activeFields();

        txtId.setText(String.valueOf(uuid));

        btnSaveProduct.setVisible(true);
        btnSaveProduct.setEnabled(true);
        this.setTitle("Cadastrando novo produto");
    }

    public ProductScreem(String id, String name, String brand, float price, String op) {

        initComponents();

        switch (op) {

            case "alterar" -> {

                activeFields();

                btnSaveChangeProduct.setVisible(true);
                btnSaveChangeProduct.setEnabled(true);

                btnDeleteProduct.setVisible(false);
                btnSaveProduct.setVisible(false);

                this.setTitle("Alterando os dados do produto " + name);
            }

            case "delete" -> {

                btnDeleteProduct.setVisible(true);
                btnDeleteProduct.setEnabled(true);

                btnSaveProduct.setVisible(false);
                btnSaveChangeProduct.setVisible(false);

                this.setTitle("Exclusão do produto " + name);

            }

        }

        fillFields(id, name, brand, price);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSaveChangeProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnSaveProduct = new javax.swing.JButton();

        setTitle("User Control");
        setMinimumSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(null);

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setText("Id");
        getContentPane().add(lblId);
        lblId.setBounds(20, 30, 70, 40);

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtId.setEnabled(false);
        getContentPane().add(txtId);
        txtId.setBounds(90, 30, 530, 40);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Nome");
        getContentPane().add(lblName);
        lblName.setBounds(20, 80, 60, 40);

        txtName.setEnabled(false);
        getContentPane().add(txtName);
        txtName.setBounds(90, 80, 530, 40);

        lblBrand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBrand.setText("Marca");
        getContentPane().add(lblBrand);
        lblBrand.setBounds(20, 150, 70, 40);

        txtBrand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBrand.setEnabled(false);
        getContentPane().add(txtBrand);
        txtBrand.setBounds(90, 150, 290, 40);

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrice.setText("Preço");
        getContentPane().add(lblPrice);
        lblPrice.setBounds(410, 150, 70, 40);

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrice.setEnabled(false);
        getContentPane().add(txtPrice);
        txtPrice.setBounds(460, 150, 160, 40);

        jPanel1.setLayout(new java.awt.CardLayout());

        btnSaveChangeProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveChangeProduct.setText("Salvar Alteração");
        btnSaveChangeProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveChangeProduct.setEnabled(false);
        btnSaveChangeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChangeProduct, "card2");

        btnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDeleteProduct.setText("Excluir");
        btnDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteProduct.setEnabled(false);
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteProduct, "card3");

        btnSaveProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveProduct.setText("Salvar");
        btnSaveProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveProduct.setEnabled(false);
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveProduct, "card4");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 220, 230, 50);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed

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
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir este produto?", "Confirmação", 0);

        if (resp == 0) {

            try {

                new SystemDao().deletarProduct(txtId.getText());

                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");

                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else {

            dispose();

        }


    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnSaveChangeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeProductActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        String brand = txtBrand.getText();
        float price = Float.valueOf(txtPrice.getText());

        try {

            new SystemDao().alterarProduct(id, name, brand, price);

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

            dispose();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveChangeProductActionPerformed

    private void activeFields() {
//        txtId.setEnabled(true);
        txtBrand.setEnabled(true);
        txtPrice.setEnabled(true);
        txtName.setEnabled(true);

        btnDeleteProduct.setVisible(false);
        btnSaveProduct.setVisible(false);
        btnSaveChangeProduct.setVisible(false);
    }

    private void fillFields(String id, String name, String brand, float price) {
        txtId.setText(id);
        txtName.setText(name);
        txtBrand.setText(brand);
        txtPrice.setText(String.valueOf(price));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnSaveChangeProduct;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
