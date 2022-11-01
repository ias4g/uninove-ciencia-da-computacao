package view;

import dados.SystemDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Checkbox extends javax.swing.JDialog {

    private ResultSet resultado;
    private final String OPERATION;

    public Checkbox(java.awt.Frame parent, boolean modal, String op) {

        super(parent, modal);
        initComponents();

        fillComboBox();
        OPERATION = op;

        System.out.println(op);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cmbId = new javax.swing.JComboBox<>();

        setTitle("Identificação de produtos");
        setMaximumSize(new java.awt.Dimension(300, 100));
        setMinimumSize(new java.awt.Dimension(300, 100));
        setPreferredSize(new java.awt.Dimension(300, 100));

        jPanel1.setPreferredSize(new java.awt.Dimension(502, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel3.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.WEST);

        cmbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção" }));
        cmbId.setBorder(null);
        cmbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdActionPerformed(evt);
            }
        });
        getContentPane().add(cmbId, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(316, 108));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdActionPerformed
        openProductScreem(OPERATION);
        this.dispose();
    }//GEN-LAST:event_cmbIdActionPerformed

    private void fillComboBox() {

//        cmbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione"}));
        try {
            resultado = new SystemDao().listarProductsId();

            while (resultado.next()) {
                cmbId.addItem(resultado.getString("id"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    private void openProductScreem(String op) {

        if (cmbId.getSelectedItem().equals("Selecione uma opção")) {
            JOptionPane.showMessageDialog(null, "Selecione um ID");
            return;
        }

        try {

            resultado = new SystemDao().listarProduct(String.valueOf(cmbId.getSelectedItem()));

            if (resultado.next()) {
                String id = resultado.getString("id");
                String name = resultado.getString("name");
                String brand = resultado.getString("brand");
                float price = Float.valueOf(resultado.getString("price"));

                new ProductScreem(
                        id, name, brand, price, op
                ).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
