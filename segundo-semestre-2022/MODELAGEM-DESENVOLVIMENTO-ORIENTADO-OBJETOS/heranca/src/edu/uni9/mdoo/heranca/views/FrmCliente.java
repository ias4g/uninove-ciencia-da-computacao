package edu.uni9.mdoo.heranca.views;

import edu.uni9.mdoo.heranca.dao.EmpresaDao;
import edu.uni9.mdoo.heranca.models.Cliente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrmCliente extends javax.swing.JDialog {

    public FrmCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new edu.uni9.mdoo.heranca.swing.Background();
        lblIconTitle = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        lblCupomDesconto = new javax.swing.JLabel();
        txtCupomDesconto = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela para cadastro de clientes");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(816, 652));
        setMinimumSize(new java.awt.Dimension(816, 652));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpBackground.setForeground(new java.awt.Color(255, 255, 255));

        lblIconTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblIconTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblIconTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/heranca/images/client.png"))); // NOI18N
        lblIconTitle.setText("Cadastro de clientes");
        lblIconTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIconTextGap(5);
        lblIconTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblNome.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        lblNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtNome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");
        lblEndereco.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEndereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEndereco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtEndereco.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEndereco.setEnabled(false);
        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone");
        lblTelefone.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTelefone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTelefone.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtTelefone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTelefone.setEnabled(false);
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lblDataCompra.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDataCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCompra.setText("Data da compra");
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

        lblCupomDesconto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCupomDesconto.setForeground(new java.awt.Color(255, 255, 255));
        lblCupomDesconto.setText("Cupom de desconto");
        lblCupomDesconto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblCupomDesconto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCupomDesconto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        try {
            txtCupomDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCupomDesconto.setEnabled(false);
        txtCupomDesconto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCupomDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCupomDescontoKeyPressed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/heranca/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(110, 110, 110))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(832, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Cliente cl = new Cliente();
        cl.setNome(txtEndereco.getText());
        cl.setEndereco(txtNome.getText());
        cl.setTelefone(txtTelefone.getText());
        cl.setEmail(txtCupomDesconto.getText());
        cl.setDataPrimeiroCompra(txtEmail.getText());
        cl.setCupomDesconto(txtCupomDesconto.getText());

        try {
            new EmpresaDao().salvarCliente(cl);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        cleanFields();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (txtNome.getText().length() > 0) {
            txtEndereco.setEnabled(true);
        } else {
            txtEndereco.setEnabled(false);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        if (txtEndereco.getText().length() > 0) {
            txtTelefone.setEnabled(true);
        } else {
            txtTelefone.setEnabled(false);
        }
    }//GEN-LAST:event_txtEnderecoKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if (txtTelefone.getText().length() > 0) {
            txtEmail.setEnabled(true);
        } else {
            txtEmail.setEnabled(false);
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (txtEmail.getText().length() > 0) {
            txtDataCompra.setEnabled(true);
        } else {
            txtDataCompra.setEnabled(false);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtDataCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataCompraKeyPressed
        if (txtDataCompra.getText().length() > 0) {
            txtCupomDesconto.setEnabled(true);
        } else {
            txtCupomDesconto.setEnabled(false);
        }
    }//GEN-LAST:event_txtDataCompraKeyPressed

    private void txtCupomDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCupomDescontoKeyPressed
        if (txtCupomDesconto.getText().length() > 0) {
            btnSalvar.setEnabled(true);
        } else {
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_txtCupomDescontoKeyPressed

    private void cleanFields() {

        txtNome.setText(null);

        txtEndereco.setText(null);
        txtEndereco.setEnabled(false);

        txtTelefone.setText(null);
        txtTelefone.setEnabled(false);

        txtEmail.setText(null);
        txtEmail.setEnabled(false);

        txtDataCompra.setText(null);
        txtDataCompra.setEnabled(false);

        txtCupomDesconto.setText(null);
        txtCupomDesconto.setEnabled(false);

        btnSalvar.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private edu.uni9.mdoo.heranca.swing.Background jpBackground;
    private javax.swing.JLabel lblCupomDesconto;
    private javax.swing.JLabel lblDataCompra;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIconTitle;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JFormattedTextField txtCupomDesconto;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
