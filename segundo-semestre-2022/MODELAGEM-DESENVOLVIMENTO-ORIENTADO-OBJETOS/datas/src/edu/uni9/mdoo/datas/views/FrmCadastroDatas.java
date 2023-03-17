package edu.uni9.mdoo.datas.views;

import edu.uni9.mdoo.datas.dao.dataDao;
import edu.uni9.mdoo.datas.models.Data;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrmCadastroDatas extends javax.swing.JDialog {

    private final String tela;

    public FrmCadastroDatas(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new edu.uni9.mdoo.datas.swing.Background();
        lblIconTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela para cadastro de funcionários");
        setMinimumSize(new java.awt.Dimension(816, 652));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        lblIconTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblIconTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblIconTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/datas/images/employee.png"))); // NOI18N
        lblIconTitle.setText("Cadastro de funcionários");
        lblIconTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIconTextGap(5);
        lblIconTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblId.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Id");
        lblId.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        lblNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtNome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNome.setEnabled(false);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblDataCompra.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDataCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCompra.setText("Data de nascimento");
        lblDataCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDataCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDataCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        try {
            txtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCompra.setEnabled(false);
        txtDataCompra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDataCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataCompraKeyPressed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/datas/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDataCompra, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpBackgroundLayout.createSequentialGroup()
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(832, 644));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if (txtId.getText().length() > 0) {
            txtNome.setEnabled(true);
        } else {
            txtNome.setEnabled(false);
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (txtNome.getText().length() > 0) {
            txtDataCompra.setEnabled(true);
        } else {
            txtDataCompra.setEnabled(false);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtDataCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataCompraKeyPressed
        if (txtDataCompra.getText().length() > 0) {
            btnSalvar.setEnabled(true);
        } else {
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_txtDataCompraKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {

            Data dt = new Data();

            dt.setId(WIDTH);
            dt.setNome(txtId.getText());
            dt.setData(txtDataCompra.getText());

            new dataDao().salvarCliente(dt);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            cleanFields();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cleanFields() {

        txtId.setText(null);

        txtNome.setText(null);
        txtNome.setEnabled(false);

        txtTelefone.setText(null);
        txtTelefone.setEnabled(false);

        txtEmail.setText(null);
        txtEmail.setEnabled(false);

        txtCargo.setText(null);
        txtCargo.setEnabled(false);

        txtSalario.setText(null);
        txtSalario.setEnabled(false);

        txtDataCompra.setText(null);
        txtDataCompra.setEnabled(false);

        txtCupomDesconto.setText(null);
        txtCupomDesconto.setEnabled(false);

        btnSalvar.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private edu.uni9.mdoo.datas.swing.Background jpBackground;
    private javax.swing.JLabel lblDataCompra;
    private javax.swing.JLabel lblIconTitle;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
