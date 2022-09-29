package br.com.loginform.utils;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Utilities {

    public static void insertIconFrm(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void insertIconDialog(JFrame dialog) {
        try {
            dialog.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
