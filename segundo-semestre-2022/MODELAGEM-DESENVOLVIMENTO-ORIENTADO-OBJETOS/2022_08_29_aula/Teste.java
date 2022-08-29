import javax.swing.JOptionPane;

/**
 * @file Teste.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 29 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Teste {
    public static void main(String[] args) {
        double a, b, c;
        int d, e, f;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
    }
}