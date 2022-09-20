
public class Menu extends javax.swing.JFrame {
    
    public Menu(String name, String lastname, String job) {
        initComponents();
        lblSaudacao.setText("Bem vindo " + name + " " + lastname + " - Perfil: " + job);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        jmbMain = new javax.swing.JMenuBar();
        mnuProducts = new javax.swing.JMenu();
        itmChange = new javax.swing.JMenuItem();
        itmRegister = new javax.swing.JMenuItem();
        itmDelete = new javax.swing.JMenuItem();
        itmReports = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmExit = new javax.swing.JMenuItem();
        mnuCustomers = new javax.swing.JMenu();
        mnuEmployee = new javax.swing.JMenu();
        mnuAdministrative = new javax.swing.JMenu();
        itmChangeUserPass = new javax.swing.JMenuItem();
        itmDeleteUser = new javax.swing.JMenuItem();
        itmDeleteAllUser = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sistema");
        setMaximumSize(new java.awt.Dimension(640, 426));
        setMinimumSize(new java.awt.Dimension(640, 426));
        setName("jfDashboard"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 426));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaudacao.setBackground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSaudacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 250, 50));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fundo.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 403));

        mnuProducts.setText("Produtos");

        itmChange.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmChange.setText("Alterar");
        mnuProducts.add(itmChange);

        itmRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRegister.setText("Cadastrar");
        mnuProducts.add(itmRegister);

        itmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmDelete.setText("Excluir");
        mnuProducts.add(itmDelete);

        itmReports.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmReports.setText("Relatórios");
        mnuProducts.add(itmReports);
        mnuProducts.add(jSeparator1);

        itmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExit.setText("Sair");
        mnuProducts.add(itmExit);

        jmbMain.add(mnuProducts);

        mnuCustomers.setText("Clientes");
        jmbMain.add(mnuCustomers);

        mnuEmployee.setText("Funcionários");
        jmbMain.add(mnuEmployee);

        mnuAdministrative.setText("Admin");

        itmChangeUserPass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmChangeUserPass.setText("Alterar Senha de Usuário");
        mnuAdministrative.add(itmChangeUserPass);

        itmDeleteUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmDeleteUser.setText("Excluir Usuário");
        mnuAdministrative.add(itmDeleteUser);

        itmDeleteAllUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmDeleteAllUser.setText("Excluir Todos os Usuários");
        mnuAdministrative.add(itmDeleteAllUser);

        jmbMain.add(mnuAdministrative);

        mnuHelp.setText("Ajuda");
        jmbMain.add(mnuHelp);

        setJMenuBar(jmbMain);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmChange;
    private javax.swing.JMenuItem itmChangeUserPass;
    private javax.swing.JMenuItem itmDelete;
    private javax.swing.JMenuItem itmDeleteAllUser;
    private javax.swing.JMenuItem itmDeleteUser;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmRegister;
    private javax.swing.JMenuItem itmReports;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAdministrative;
    private javax.swing.JMenu mnuCustomers;
    private javax.swing.JMenu mnuEmployee;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuProducts;
    // End of variables declaration//GEN-END:variables
}
