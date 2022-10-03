package br.com.loginform.utils;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Utilities {

    public static void insertIconFrame(JFrame frm) {
        try {
            frm.getContentPane().setBackground(new Color(255, 255, 255));
//            frm.getContentPane().setBackground(new Color(248, 248, 228));
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void insertIconDialog(JDialog dialog) {
        try {
            dialog.getContentPane().setBackground(new Color(255, 255, 255));
//            dialog.getContentPane().setBackground(new Color(248, 248, 228));
            dialog.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
