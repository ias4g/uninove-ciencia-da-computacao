import javax.swing.JOptionPane;

/**
 * @file Apoio.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 25 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Apoio {
    public static void exibirdados(String name, String job, double salary) {
        JOptionPane.showMessageDialog(
                null,
                "Seu nome é " + name
                        + "\nVocê é " + job +
                        "\nGanha " + salary + " reais.");
    }

    static double reajustarSalary(double salary, double tx) {
        salary = salary * tx;
        return salary;
        // JOptionPane.showMessageDialog(null, "O salario reajustado é: " + salary);
    }
}