
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {
    
    public FormLogin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(295, 162));
        setMinimumSize(new java.awt.Dimension(295, 162));
        setResizable(false);

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setText("Usuário");

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(200, 38));

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPass.setText("Senha");

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPass.setPreferredSize(new java.awt.Dimension(200, 38));

        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnter.setText("Entrar");
        btnEnter.setBorder(null);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setPreferredSize(new java.awt.Dimension(100, 38));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(lblPass))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(311, 203));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String usuario, senha;
        usuario = txtUser.getText();
        senha = txtPass.getText();
        Connection conn;
        
        if (txtUser.getText().isEmpty() || txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
            txtUser.setText(null);
            txtPass.setText(null);
            
            txtUser.requestFocus();
        } else {
            try {
                //2 - Conectar no banco de dados sistemabd;
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student");

                //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
                PreparedStatement st = conn.prepareStatement("SELECT * FROM tbusers WHERE user = ? AND password = ?");
                st.setString(1, usuario);
                st.setString(2, senha);
                ResultSet resultado = st.executeQuery();

                //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
                if (resultado.next()) {
                    //Abrir o formulário Menu.java
                    new Menu().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
                    
                    txtUser.setText("");
                    txtPass.setText("");
                    
                    txtUser.requestFocus();
                }

                //5 - Desconectar.
                conn.close();
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não está na library");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
            }
        }

    }//GEN-LAST:event_btnEnterActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
