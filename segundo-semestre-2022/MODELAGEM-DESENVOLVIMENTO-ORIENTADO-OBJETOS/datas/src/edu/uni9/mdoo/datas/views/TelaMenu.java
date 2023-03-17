package edu.uni9.mdoo.datas.views;

import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new edu.uni9.mdoo.datas.swing.Background();
        jpControleFuncionario = new javax.swing.JPanel();
        btnDatas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de menu");
        setMaximumSize(new java.awt.Dimension(574, 389));
        setMinimumSize(new java.awt.Dimension(574, 389));
        getContentPane().setLayout(new java.awt.CardLayout());

        jpControleFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Controles de Pessoas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpControleFuncionario.setMaximumSize(new java.awt.Dimension(0, 0));
        jpControleFuncionario.setOpaque(false);

        btnDatas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnDatas.setText("Datas");
        btnDatas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControleFuncionarioLayout = new javax.swing.GroupLayout(jpControleFuncionario);
        jpControleFuncionario.setLayout(jpControleFuncionarioLayout);
        jpControleFuncionarioLayout.setHorizontalGroup(
            jpControleFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleFuncionarioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jpControleFuncionarioLayout.setVerticalGroup(
            jpControleFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControleFuncionarioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jpControleFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jpControleFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(590, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatasActionPerformed

        String op = pergunta("O que você quer fazer?", "Escolha uma opção abaixo!");

        if (op != null) {

            switch (op) {
                case "Cadastrar" -> {
//                    new FrmFuncionario(this, true).setVisible(true);
                    new FrmCadastroDatas(this, true, "cli", op).setVisible(true);
                }

                case "Relatório" -> {
                    new FrmCadastroDatas(this, true, "cli", op).setVisible(true);
                }

                default -> {
                    break;
                }
            }

        }

    }//GEN-LAST:event_btnDatasActionPerformed

    public String pergunta(String pergunta, String titulo) {

        Object opcoes[] = {"Cadastrar", "Relatório", "Cancelar"};
        int op = JOptionPane.showOptionDialog(null, pergunta, titulo, 1, 3, null, opcoes, null);

        if (op != -1) {
            return opcoes[op].toString();
        }

        return null;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatas;
    private edu.uni9.mdoo.datas.swing.Background jpBackground;
    private javax.swing.JPanel jpControleFuncionario;
    // End of variables declaration//GEN-END:variables
}
