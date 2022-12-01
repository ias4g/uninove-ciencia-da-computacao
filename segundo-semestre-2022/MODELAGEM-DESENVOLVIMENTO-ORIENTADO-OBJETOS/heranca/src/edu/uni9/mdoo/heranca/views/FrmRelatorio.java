package edu.uni9.mdoo.heranca.views;

public class FrmRelatorio extends javax.swing.JDialog {

    public FrmRelatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new edu.uni9.mdoo.heranca.swing.Background();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela para cadastro de funcionários");
        setMaximumSize(new java.awt.Dimension(816, 652));
        setMinimumSize(new java.awt.Dimension(816, 652));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        getContentPane().add(jpBackground, "card2");

        setSize(new java.awt.Dimension(832, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.uni9.mdoo.heranca.swing.Background jpBackground;
    // End of variables declaration//GEN-END:variables
}
