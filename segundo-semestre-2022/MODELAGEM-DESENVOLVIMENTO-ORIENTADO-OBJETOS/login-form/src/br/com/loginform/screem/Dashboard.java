package br.com.loginform.screem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
//        this.setExtendedState(MAXIMIZED_BOTH);
//        System.out.println(this.getWidth());
//
//        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
//
//        lblTitle.setBounds((tela.width - lblTitle.getWidth()) / 2, 10, 92, 25);
//        lblClose.setBounds(tela.width - 34, 10, 24, 24);
//        lblSeparator.setBounds(0, 43, tela.width, 2);

        getContentPane().setBackground(new java.awt.Color(52, 58, 64));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de cadastro");
        setBackground(new java.awt.Color(255, 255, 102));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(683, 384));
        setUndecorated(true);
        setSize(new java.awt.Dimension(683, 384));
        getContentPane().setLayout(new java.awt.CardLayout());

        setSize(new java.awt.Dimension(683, 384));
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
