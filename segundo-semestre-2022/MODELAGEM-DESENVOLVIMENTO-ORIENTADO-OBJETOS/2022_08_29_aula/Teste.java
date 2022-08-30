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
        double resultSum, resultDivision, resultMultiplication, resultSubtraction;

        numberOne = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

        numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        numberThree = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        resultMultiplication = MathOperations.multiplication(numberOne, numberTwo, numberThree);

        resultDivision = MathOperations.division(numberOne, numberTwo, numberThree);

        resultSum = MathOperations.sum(numberOne, numberTwo, numberThree);

        resultSubtraction = MathOperations.subtraction(numberOne, numberTwo, numberThree);

        // ###################################################
        JOptionPane.showMessageDialog(null, "Resultado\nDivisão: " + resultDivision + "\nMultiplição: "
                + resultMultiplication + "\nSoma: " + resultSum + "\nSubtração: " + resultSubtraction);
    }
}