import javax.swing.JOptionPane;

/**
 * @file Exercicio.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 25 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 * 
 *            Declarar uma variável chamada percentual
 *            Perguntar o percentual de aumento que se
 *            deseja aplicar no salário
 *            Passar para o método reajustarSalario o
 *            salario e o percentual
 *            Aplicar o aumento de acordo com o
 *            percentual fornecido
 *            Retornar o salário reajustado
 *            Exibir o salário reajustado
 */

public class Exercicio {
    public static void main(String[] args) {
        double salary;
        double percent;
        double salaryReaj;
        String classe;

        salary = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario:"));

        percent = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem:"));

        salaryReaj = Percent.reajustarsalary(salary, percent);

        JOptionPane.showMessageDialog(null, "Salario reajustado é " + salaryReaj);

        classe = Percent.verifyClass(salary);
        JOptionPane.showMessageDialog(null, "Sua classe social é " + classe);
    }
}
