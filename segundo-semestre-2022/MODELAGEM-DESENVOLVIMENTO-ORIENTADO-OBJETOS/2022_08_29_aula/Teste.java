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
        double numberOne;
        double numberTwo;
        double result;
        int numberThree;
        int numberFour;
        int numberFive;

        numberOne = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

        numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        JOptionPane.showMessageDialog(null, "Numero digitados foram " + numberOne + " " + numberTwo);
    }
}