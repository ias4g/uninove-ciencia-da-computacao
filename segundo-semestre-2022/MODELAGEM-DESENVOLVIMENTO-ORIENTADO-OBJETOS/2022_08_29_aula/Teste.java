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
        int numberThree;
        double numberOne, numberTwo;

        numberOne = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

        numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        numberThree = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        // ###################################################
        JOptionPane.showMessageDialog(null,
                "Resultado\nDivisão: " + MathOperations.division(numberOne, numberTwo, numberThree) + "\nMultiplição: "
                        + MathOperations.multiplication(numberOne, numberTwo, numberThree) + "\nSoma: "
                        + MathOperations.sum(numberOne, numberTwo, numberThree) + "\nSubtração: "
                        + MathOperations.subtraction(numberOne, numberTwo, numberThree));
    }
}