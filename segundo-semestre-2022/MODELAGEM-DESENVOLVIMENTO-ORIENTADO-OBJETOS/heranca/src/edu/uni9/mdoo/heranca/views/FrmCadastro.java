package edu.uni9.mdoo.heranca.views;

import edu.uni9.mdoo.heranca.dao.EmpresaDao;
import edu.uni9.mdoo.heranca.models.Cliente;
import edu.uni9.mdoo.heranca.models.Funcionario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrmCadastro extends javax.swing.JDialog {

    private final String tela;

    public FrmCadastro(java.awt.Frame parent, boolean modal, String tela, String op) {

        super(parent, modal);
        initComponents();
        this.tela = tela;

        if (tela.equalsIgnoreCase("cli")) {

            jpCliente.setVisible(true);
            jpFuncionario.setVisible(false);
            btnSalvar.setText("Salvar Cliente");
            setTitle("TELA PARA CADASTRO DE CLIENTES");
            lblIconTitle.setText("Cadastro de clientes");
            lblIconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/heranca/images/client.png")));

        } else {

            jpCliente.setVisible(false);
            jpFuncionario.setVisible(true);
            btnSalvar.setText("Salvar Funcionário");
            setTitle("TELA PARA CADASTRO DE FUNCIONÁRIOS");
            lblIconTitle.setText("Cadastro de funcionários");
            lblIconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/heranca/images/employee.png")));

        }

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
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        jpOpcao = new javax.swing.JPanel();
        jpCliente = new javax.swing.JPanel();
        lblDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        lblCupomDesconto = new javax.swing.JLabel();
        txtCupomDesconto = new javax.swing.JFormattedTextField();
        jpFuncionario = new javax.swing.JPanel();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela para cadastro de funcionários");
        setMinimumSize(new java.awt.Dimension(816, 652));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        lblIconTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblIconTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblIconTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/uni9/mdoo/heranca/images/employee.png"))); // NOI18N
        lblIconTitle.setText("Cadastro de funcionários");
        lblIconTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconTitle.setIconTextGap(5);
        lblIconTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblNome.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        lblNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        lblEmail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
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

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setEnabled(false);
        txtTelefone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        jpOpcao.setOpaque(false);
        jpOpcao.setPreferredSize(new java.awt.Dimension(616, 65));
        jpOpcao.setLayout(new java.awt.CardLayout());

        jpCliente.setMaximumSize(new java.awt.Dimension(0, 0));
        jpCliente.setOpaque(false);
        jpCliente.setPreferredSize(new java.awt.Dimension(616, 65));

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

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txtCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(txtCupomDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpOpcao.add(jpCliente, "card2");

        jpFuncionario.setMaximumSize(new java.awt.Dimension(0, 0));
        jpFuncionario.setMinimumSize(new java.awt.Dimension(0, 0));
        jpFuncionario.setOpaque(false);
        jpFuncionario.setPreferredSize(new java.awt.Dimension(616, 65));

        lblCargo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");
        lblCargo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtCargo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCargo.setEnabled(false);
        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCargoKeyPressed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalario.setText("Salário");
        lblSalario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        try {
            txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSalario.setEnabled(false);
        txtSalario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpFuncionarioLayout = new javax.swing.GroupLayout(jpFuncionario);
        jpFuncionario.setLayout(jpFuncionarioLayout);
        jpFuncionarioLayout.setHorizontalGroup(
            jpFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionarioLayout.createSequentialGroup()
                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFuncionarioLayout.createSequentialGroup()
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpFuncionarioLayout.setVerticalGroup(
            jpFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionarioLayout.createSequentialGroup()
                .addGroup(jpFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpOpcao.add(jpFuncionario, "card3");

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpOpcao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpBackgroundLayout.createSequentialGroup()
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpBackgroundLayout.createSequentialGroup()
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jpOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(832, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        if (tela.equalsIgnoreCase("cli")) {
            if (txtEmail.getText().length() > 0) {
                txtDataCompra.setEnabled(true);
            } else {
                txtDataCompra.setEnabled(false);
            }
        } else {
            if (txtEmail.getText().length() > 0) {
                txtCargo.setEnabled(true);
            } else {
                txtCargo.setEnabled(false);
            }
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

    private void txtCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyPressed
        if (txtCargo.getText().length() > 0) {
            txtSalario.setEnabled(true);
        } else {
            txtSalario.setEnabled(false);
        }
    }//GEN-LAST:event_txtCargoKeyPressed

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        if (txtSalario.getText().length() > 0) {
            btnSalvar.setEnabled(true);
        } else {
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (tela.equalsIgnoreCase("cli")) {

            Cliente cl = new Cliente();

            cl.setNome(txtNome.getText());
            cl.setEndereco(txtEndereco.getText());
            cl.setTelefone(txtTelefone.getText());
            cl.setEmail(txtEmail.getText());
            cl.setDataCompra(txtDataCompra.getText());
            cl.setCupomDesconto(txtCupomDesconto.getText());

            try {
                new EmpresaDao().salvarCliente(cl);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else {

            Funcionario func = new Funcionario();

            func.setNome(txtNome.getText());
            func.setEndereco(txtEndereco.getText());
            func.setTelefone(txtTelefone.getText());
            func.setEmail(txtEmail.getText());
            func.setCargo(txtCargo.getText());
            func.setSalario(Double.valueOf(txtSalario.getText()));

            try {
                new EmpresaDao().salvarFuncionario(func);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }

        cleanFields();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cleanFields() {

        txtNome.setText(null);

        txtEndereco.setText(null);
        txtEndereco.setEnabled(false);

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
    private edu.uni9.mdoo.heranca.swing.Background jpBackground;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpFuncionario;
    private javax.swing.JPanel jpOpcao;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCupomDesconto;
    private javax.swing.JLabel lblDataCompra;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIconTitle;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCupomDesconto;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
