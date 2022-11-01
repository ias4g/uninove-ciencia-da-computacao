package view;

import dados.SystemDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private ResultSet resultado;

    public Menu(int id, String user, String name, String lastname, String email, String job) {
        initComponents();

        mnuAdministrative.setVisible(false);

        lblResId.setText(String.valueOf(id));
        lblResUser.setText(user);
        lblResName.setText(name);
        lblResLastname.setText(lastname);
        lblResEmail.setText(email);
        lblResJob.setText(job);

        lblUserLogged.setText("Logado como: " + user);

        if (job.equalsIgnoreCase("Administrador")) {
            mnuAdministrative.setVisible(true);
        } else if (job.equalsIgnoreCase("Estagiário")) {
            itmDeleteProduct.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblJob = new javax.swing.JLabel();
        lblResId = new javax.swing.JLabel();
        lblResUser = new javax.swing.JLabel();
        lblResName = new javax.swing.JLabel();
        lblResLastname = new javax.swing.JLabel();
        lblResEmail = new javax.swing.JLabel();
        lblResJob = new javax.swing.JLabel();
        lblUserLogged = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        jmbMain = new javax.swing.JMenuBar();
        mnuProducts = new javax.swing.JMenu();
        itmRegisterProduct = new javax.swing.JMenuItem();
        itmChangeProduct = new javax.swing.JMenuItem();
        itmDeleteProduct = new javax.swing.JMenuItem();
        itmReportsProducts = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmExit = new javax.swing.JMenuItem();
        mnuCustomers = new javax.swing.JMenu();
        mnuEmployee = new javax.swing.JMenu();
        mnuAdministrative = new javax.swing.JMenu();
        itmChangeUserDatas = new javax.swing.JMenuItem();
        itmDeleteUser = new javax.swing.JMenuItem();
        itmDeleteAllUser = new javax.swing.JMenuItem();
        itmAddNewUser = new javax.swing.JMenuItem();
        itmUsersList = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sistema");
        setMinimumSize(new java.awt.Dimension(640, 426));
        setName("jfDashboard"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Identificação");
        getContentPane().add(lblId);
        lblId.setBounds(20, 20, 230, 25);

        lblUser.setBackground(new java.awt.Color(255, 255, 255));
        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário");
        getContentPane().add(lblUser);
        lblUser.setBounds(20, 50, 230, 25);

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nome");
        getContentPane().add(lblName);
        lblName.setBounds(20, 80, 230, 25);

        lblLastname.setBackground(new java.awt.Color(255, 255, 255));
        lblLastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLastname.setForeground(new java.awt.Color(255, 255, 255));
        lblLastname.setText("Sobre nome");
        getContentPane().add(lblLastname);
        lblLastname.setBounds(20, 270, 230, 25);

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(20, 300, 230, 25);

        lblJob.setBackground(new java.awt.Color(255, 255, 255));
        lblJob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJob.setForeground(new java.awt.Color(255, 255, 255));
        lblJob.setText("Cargo");
        getContentPane().add(lblJob);
        lblJob.setBounds(20, 330, 230, 25);

        lblResId.setBackground(new java.awt.Color(255, 255, 255));
        lblResId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResId.setForeground(new java.awt.Color(255, 255, 255));
        lblResId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResId.setText("Id");
        getContentPane().add(lblResId);
        lblResId.setBounds(310, 20, 310, 25);

        lblResUser.setBackground(new java.awt.Color(255, 255, 255));
        lblResUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResUser.setForeground(new java.awt.Color(255, 255, 255));
        lblResUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResUser.setText("User");
        getContentPane().add(lblResUser);
        lblResUser.setBounds(310, 50, 310, 25);

        lblResName.setBackground(new java.awt.Color(255, 255, 255));
        lblResName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResName.setForeground(new java.awt.Color(255, 255, 255));
        lblResName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResName.setText("Name");
        getContentPane().add(lblResName);
        lblResName.setBounds(310, 80, 310, 25);

        lblResLastname.setBackground(new java.awt.Color(255, 255, 255));
        lblResLastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResLastname.setForeground(new java.awt.Color(255, 255, 255));
        lblResLastname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResLastname.setText("Lastname");
        getContentPane().add(lblResLastname);
        lblResLastname.setBounds(310, 270, 310, 25);

        lblResEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblResEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblResEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResEmail.setText("Email");
        getContentPane().add(lblResEmail);
        lblResEmail.setBounds(310, 300, 310, 25);

        lblResJob.setBackground(new java.awt.Color(255, 255, 255));
        lblResJob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResJob.setForeground(new java.awt.Color(255, 255, 255));
        lblResJob.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblResJob.setText("Job");
        getContentPane().add(lblResJob);
        lblResJob.setBounds(310, 330, 310, 25);

        lblUserLogged.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblUserLogged.setForeground(new java.awt.Color(255, 255, 255));
        lblUserLogged.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserLogged.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblUserLogged);
        lblUserLogged.setBounds(10, 140, 620, 100);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fundo.jpg"))); // NOI18N
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 640, 403);

        mnuProducts.setText("Produtos");

        itmRegisterProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRegisterProduct.setText("Cadastrar");
        itmRegisterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegisterProductActionPerformed(evt);
            }
        });
        mnuProducts.add(itmRegisterProduct);

        itmChangeProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmChangeProduct.setText("Alterar");
        itmChangeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChangeProductActionPerformed(evt);
            }
        });
        mnuProducts.add(itmChangeProduct);

        itmDeleteProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmDeleteProduct.setText("Excluir");
        itmDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteProductActionPerformed(evt);
            }
        });
        mnuProducts.add(itmDeleteProduct);

        itmReportsProducts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmReportsProducts.setText("Relatórios");
        itmReportsProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReportsProductsActionPerformed(evt);
            }
        });
        mnuProducts.add(itmReportsProducts);
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

        itmChangeUserDatas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmChangeUserDatas.setText("Alterar Dados do Usuário");
        itmChangeUserDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChangeUserDatasActionPerformed(evt);
            }
        });
        mnuAdministrative.add(itmChangeUserDatas);

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
        openUserScreem("delete");
    }//GEN-LAST:event_itmDeleteUserActionPerformed

    private void itmUsersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsersListActionPerformed
        new UsersList().setVisible(true);
    }//GEN-LAST:event_itmUsersListActionPerformed

    private void itmChangeUserDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChangeUserDatasActionPerformed
        openUserScreem("alterar");
    }//GEN-LAST:event_itmChangeUserDatasActionPerformed

    private void itmRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegisterProductActionPerformed
        new ProductScreem().setVisible(true);
    }//GEN-LAST:event_itmRegisterProductActionPerformed

    private void itmChangeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChangeProductActionPerformed
        new Checkbox(this, true, "update").setVisible(true);
    }//GEN-LAST:event_itmChangeProductActionPerformed

    private void itmDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteProductActionPerformed
        new Checkbox(this, true, "delete").setVisible(true);
    }//GEN-LAST:event_itmDeleteProductActionPerformed

    private void itmReportsProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReportsProductsActionPerformed
        new ProductsList().setVisible(true);
    }//GEN-LAST:event_itmReportsProductsActionPerformed

    private void openUserScreem(String op) {

        String u = JOptionPane.showInputDialog(
                null, "Digite o nome do usuário a !" + op, "Usuário", 1
        );

        if (u == null) {
            JOptionPane.showMessageDialog(this, "Preencha o nome do usuário!");
            return;
        }

        try {

            resultado = new SystemDao().listarUsuario(u);

            if (resultado.next()) {
                int id = Integer.parseInt(resultado.getString("id"));
                String user = resultado.getString("user");
                String password = resultado.getString("password");
                String name = resultado.getString("name");
                String lastname = resultado.getString("lastname");
                String email = resultado.getString("email");
                String job = resultado.getString("job");

                //Abrir o formulário Menu.java
                new CreateNewUser(
                        id, user, password, name, lastname, email, job, op
                ).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAddNewUser;
    private javax.swing.JMenuItem itmChangeProduct;
    private javax.swing.JMenuItem itmChangeUserDatas;
    private javax.swing.JMenuItem itmDeleteAllUser;
    private javax.swing.JMenuItem itmDeleteProduct;
    private javax.swing.JMenuItem itmDeleteUser;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmRegisterProduct;
    private javax.swing.JMenuItem itmReportsProducts;
    private javax.swing.JMenuItem itmUsersList;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResEmail;
    private javax.swing.JLabel lblResId;
    private javax.swing.JLabel lblResJob;
    private javax.swing.JLabel lblResLastname;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResUser;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserLogged;
    private javax.swing.JMenu mnuAdministrative;
    private javax.swing.JMenu mnuCustomers;
    private javax.swing.JMenu mnuEmployee;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuProducts;
    // End of variables declaration//GEN-END:variables
}
