package br.com.loginform.screem;

import java.awt.Font;
import javax.swing.UIManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.loginform.utils.Utilities;
import br.com.loginform.utils.FontManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SplashScreem extends javax.swing.JFrame {

    public SplashScreem() {
        initComponents();
        customizingComponents();
    }

    private void customizingComponents() {

        Utilities.insertIconFrame(this);

        Font Ubuntu_Regular_12 = FontManager.Loading("Ubuntu-Regular.ttf", Font.PLAIN, 12f);

        lblLoading.setFont(Ubuntu_Regular_12);
        lblPercent.setFont(Ubuntu_Regular_12);

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    try {
                        sleep(100);

                        lblPercent.setText(i + "%");

                        switch (i) {
                            case 10 ->
                                lblLoading.setText("Ativando os módulos...");
                            case 20 ->
                                lblLoading.setText("Carregando módulos...");
                            case 50 ->
                                lblLoading.setText("Conectando ao banco de dados...");
                            case 70 ->
                                lblLoading.setText("Conexão bem sucedida...");
                            case 80 ->
                                lblLoading.setText("Iniciando o programa...");
                        }

                        jpProgress.setValue(i);

                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                new Dashboard().setVisible(true);
                dispose();
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpProgress = new javax.swing.JProgressBar();
        lblPercent = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(525, 370));
        setMinimumSize(new java.awt.Dimension(525, 370));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/splash-screem-image.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(163, 30, 200, 219);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/splash-screem-line.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(163, 248, 200, 1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/splash-screem-logo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(225, 278, 75, 18);

        jpProgress.setBackground(new java.awt.Color(255, 255, 255));
        jpProgress.setForeground(new java.awt.Color(0, 153, 102));
        jpProgress.setBorder(null);
        jpProgress.setBorderPainted(false);
        getContentPane().add(jpProgress);
        jpProgress.setBounds(10, 350, 505, 10);

        lblPercent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPercent.setForeground(new java.awt.Color(50, 33, 83));
        lblPercent.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPercent.setText("0%");
        getContentPane().add(lblPercent);
        lblPercent.setBounds(415, 330, 100, 14);

        lblLoading.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(50, 33, 83));
        lblLoading.setText("Carregando...");
        getContentPane().add(lblLoading);
        lblLoading.setBounds(10, 330, 290, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/splash-screem-bg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 370);

        setSize(new java.awt.Dimension(525, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SplashScreem.class.getName()).log(Level.SEVERE, null, ex);
        }

        new SplashScreem().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jpProgress;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblPercent;
    // End of variables declaration//GEN-END:variables
}
