
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu(String name, String job) {
        initComponents();

        mnuAdministrative.setVisible(false);

        lblSaudacao.setText("Bem vindo: " + name);
        lblUserLogged.setText("Usuário logado: " + job);

        if (job.equalsIgnoreCase("Administrador")) {
            mnuAdministrative.setVisible(true);
        } else if (job.equalsIgnoreCase("Estagiário")) {
            itmDelete.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        lblUserLogged = new javax.swing.JLabel();
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
        itmAddNewUser = new javax.swing.JMenuItem();
        itmUsersList = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sistema");
        setMaximumSize(new java.awt.Dimension(640, 426));
        setMinimumSize(new java.awt.Dimension(640, 426));
        setName("jfDashboard"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 426));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaudacao.setBackground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setText("Saudação");
        getContentPane().add(lblSaudacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, -1));

        lblUserLogged.setBackground(new java.awt.Color(255, 255, 255));
        lblUserLogged.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserLogged.setForeground(new java.awt.Color(255, 255, 255));
        lblUserLogged.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUserLogged.setText("Logado");
        getContentPane().add(lblUserLogged, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 400, -1));

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
        itmDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteUserActionPerformed(evt);
            }
        });
        mnuAdministrative.add(itmDeleteUser);

        itmDeleteAllUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmDeleteAllUser.setText("Excluir Todos os Usuários");
        mnuAdministrative.add(itmDeleteAllUser);

        itmAddNewUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmAddNewUser.setText("Adicionar Usuário");
        itmAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddNewUserActionPerformed(evt);
            }
        });
        mnuAdministrative.add(itmAddNewUser);

        itmUsersList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmUsersList.setText("Listar Usuários");
        itmUsersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsersListActionPerformed(evt);
            }
        });
        mnuAdministrative.add(itmUsersList);

        jmbMain.add(mnuAdministrative);

        mnuHelp.setText("Ajuda");
        jmbMain.add(mnuHelp);

        setJMenuBar(jmbMain);

        setSize(new java.awt.Dimension(656, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddNewUserActionPerformed
        new CreateNewUser().setVisible(true);

    }//GEN-LAST:event_itmAddNewUserActionPerformed

    private void itmDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteUserActionPerformed

        Connection conn;
        String u = JOptionPane.showInputDialog("Digite o nome do usuário a ser excluido!");

        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student");

            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conn.prepareStatement("SELECT * FROM tbusers WHERE user = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                int id = Integer.parseInt(resultado.getString("id"));
                String user = resultado.getString("user");
                String password = resultado.getString("password");
                String name = resultado.getString("name");
                String lastname = resultado.getString("lastname");
                String email = resultado.getString("email");
                String job = resultado.getString("job");

                //Abrir o formulário Menu.java
                new CreateNewUser(id, user, password, name, lastname, email, job).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }

            //5 - Desconectar.
            conn.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }//GEN-LAST:event_itmDeleteUserActionPerformed

    private void itmUsersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsersListActionPerformed
        new UsersList().setVisible(true);
    }//GEN-LAST:event_itmUsersListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAddNewUser;
    private javax.swing.JMenuItem itmChange;
    private javax.swing.JMenuItem itmChangeUserPass;
    private javax.swing.JMenuItem itmDelete;
    private javax.swing.JMenuItem itmDeleteAllUser;
    private javax.swing.JMenuItem itmDeleteUser;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmRegister;
    private javax.swing.JMenuItem itmReports;
    private javax.swing.JMenuItem itmUsersList;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblUserLogged;
    private javax.swing.JMenu mnuAdministrative;
    private javax.swing.JMenu mnuCustomers;
    private javax.swing.JMenu mnuEmployee;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuProducts;
    // End of variables declaration//GEN-END:variables
}
