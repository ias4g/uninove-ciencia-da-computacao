
public class Calculator extends javax.swing.JFrame {

    double n1, n2, result;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResult = new javax.swing.JLabel();
        lblNumber1 = new javax.swing.JLabel();
        lblNumber2 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        btnExponeciacao = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        txtNumber1 = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuFiles = new javax.swing.JMenu();
        itmClean = new javax.swing.JMenuItem();
        itmLogout = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        itmCalculatorUse = new javax.swing.JMenuItem();
        itmSupport = new javax.swing.JMenuItem();
        mnuOptions = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic Calculator");
        setResizable(false);
        getContentPane().setLayout(null);

        lblResult.setText("Resultado");
        getContentPane().add(lblResult);
        lblResult.setBounds(30, 90, 60, 16);

        lblNumber1.setText("Número");
        getContentPane().add(lblNumber1);
        lblNumber1.setBounds(30, 20, 50, 16);

        lblNumber2.setText("Número");
        getContentPane().add(lblNumber2);
        lblNumber2.setBounds(200, 20, 50, 16);
        getContentPane().add(txtResult);
        txtResult.setBounds(30, 110, 250, 30);
        getContentPane().add(txtNumber2);
        txtNumber2.setBounds(200, 40, 80, 30);

        btnExponeciacao.setText("Exp");
        btnExponeciacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExponeciacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponeciacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExponeciacao);
        btnExponeciacao.setBounds(230, 160, 50, 30);

        btnSomar.setText("+");
        btnSomar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSomar);
        btnSomar.setBounds(30, 160, 40, 30);

        btnSubtrair.setText("-");
        btnSubtrair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtrair);
        btnSubtrair.setBounds(80, 160, 40, 30);

        btnMultiplicar.setText("*");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicar);
        btnMultiplicar.setBounds(130, 160, 40, 30);

        btnDividir.setText("/");
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDividir);
        btnDividir.setBounds(180, 160, 40, 30);
        getContentPane().add(txtNumber1);
        txtNumber1.setBounds(30, 40, 80, 30);

        btnLimpar.setText("Limpar campos");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(30, 200, 250, 40);

        mnuFiles.setText("Arquivos");

        itmClean.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmClean.setText("Limpar");
        itmClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCleanActionPerformed(evt);
            }
        });
        mnuFiles.add(itmClean);

        itmLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmLogout.setText("Sair");
        itmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogoutActionPerformed(evt);
            }
        });
        mnuFiles.add(itmLogout);

        barMenu.add(mnuFiles);

        mnuHelp.setText("Ajuda");

        itmCalculatorUse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCalculatorUse.setText("Uso da calculadora");
        mnuHelp.add(itmCalculatorUse);

        itmSupport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSupport.setText("Suporte");
        mnuHelp.add(itmSupport);

        barMenu.add(mnuHelp);

        mnuOptions.setText("Opções");
        barMenu.add(mnuOptions);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(331, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        n1 = Double.parseDouble(txtNumber1.getText());
        n2 = Double.parseDouble(txtNumber2.getText());

        result = n1 + n2;

        txtResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        n1 = Double.parseDouble(txtNumber1.getText());
        n2 = Double.parseDouble(txtNumber2.getText());

        result = n1 - n2;

        txtResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        n1 = Double.parseDouble(txtNumber1.getText());
        n2 = Double.parseDouble(txtNumber2.getText());

        result = n1 * n2;

        txtResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        n1 = Double.parseDouble(txtNumber1.getText());
        n2 = Double.parseDouble(txtNumber2.getText());

        result = n1 / n2;

        txtResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnExponeciacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponeciacaoActionPerformed
        n1 = Double.parseDouble(txtNumber1.getText());
        n2 = Double.parseDouble(txtNumber2.getText());

        result = Math.pow(n1, n2);

        txtResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnExponeciacaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanTextField();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void itmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogoutActionPerformed
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_itmLogoutActionPerformed

    private void itmCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCleanActionPerformed
        cleanTextField();
    }//GEN-LAST:event_itmCleanActionPerformed

    private void cleanTextField() {
        txtNumber1.setText("");
        txtNumber2.setText("");
        txtResult.setText("");

        txtNumber1.requestFocus();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExponeciacao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JMenuItem itmCalculatorUse;
    private javax.swing.JMenuItem itmClean;
    private javax.swing.JMenuItem itmLogout;
    private javax.swing.JMenuItem itmSupport;
    private javax.swing.JLabel lblNumber1;
    private javax.swing.JLabel lblNumber2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JMenu mnuFiles;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuOptions;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
