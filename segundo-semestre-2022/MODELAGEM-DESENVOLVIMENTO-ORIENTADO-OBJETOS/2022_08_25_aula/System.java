import javax.swing.JOptionPane;

/**
 * @file System.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 22 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class System {
    public static void main(String[] args) {
        String name;
        String job;
        double salary;

        // Cadastrar as informações nas variáveis
        name = JOptionPane.showInputDialog("Digite seu nome");

        job = JOptionPane.showInputDialog("Digite seu cargo");

        salary = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));

        // Chama o metodo exibirdados() da class Apoio
        Apoio.exibirdados(name, job, salary);

        // Chama o metodo reajustarSalary() da class Apoio
        salary = Apoio.reajustarSalary(salary, 1.30);

        JOptionPane.showMessageDialog(null, "Salario reajustado em 30% " + salary);
    }
}