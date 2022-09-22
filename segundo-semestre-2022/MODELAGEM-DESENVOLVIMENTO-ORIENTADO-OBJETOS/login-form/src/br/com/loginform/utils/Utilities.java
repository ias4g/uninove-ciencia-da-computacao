package br.com.loginform.utils;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Utilities {

    public static void insertIcon(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/loginform/assets/logo-2.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
