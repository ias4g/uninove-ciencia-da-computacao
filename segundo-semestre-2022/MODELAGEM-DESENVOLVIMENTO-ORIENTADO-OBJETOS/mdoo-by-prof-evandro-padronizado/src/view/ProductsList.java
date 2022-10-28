package view;

import dados.SystemDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductsList extends javax.swing.JFrame {

    int quant = 0;
    private ResultSet rs = null;
    private DefaultTableModel tableModel;

    public ProductsList() {
        initComponents();
        tableFill();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        lblJob = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setTitle("Relatórios de usuários");
        setMinimumSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(null);

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "Nome", "Marca", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 620, 290);

        lblJob.setText("Filtro");
        getContentPane().add(lblJob);
        lblJob.setBounds(10, 10, 50, 40);

        lblQtd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblQtd.setText("jLabel1");
        getContentPane().add(lblQtd);
        lblQtd.setBounds(427, 20, 200, 16);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtSearch);
        txtSearch.setBounds(50, 10, 280, 40);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        search();
    }//GEN-LAST:event_txtSearchKeyPressed

    private void search() {

        String search = txtSearch.getText();
        quant = 0;

        try {

            if (search.isEmpty()) {
                tableFill();
                return;
            }

            rs = new SystemDao().listProductsForName(search);

            tableModel = (DefaultTableModel) tblProducts.getModel();

            tableModel.setRowCount(0);

            while (rs.next()) {
                Object datas[] = {
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("brand"),
                    rs.getString("price")
                };

                tableModel.addRow(datas);
                quant++;
            }

            lblQtd.setText("Resultados encontrados: " + quant);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, "Algo de errado não está certo -> " + ex.getMessage()
            );
        }
    }

    private void tableFill() {

        try {

            rs = new SystemDao().listarProducts();

            tableModel = (DefaultTableModel) tblProducts.getModel();
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object datas[] = {
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("brand"),
                    rs.getString("price")
                };

                tableModel.addRow(datas);
                quant++;
            }

            lblQtd.setText("Resultados encontrados: " + quant);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, "Algo de errado não está certo -> " + ex.getMessage()
            );
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
