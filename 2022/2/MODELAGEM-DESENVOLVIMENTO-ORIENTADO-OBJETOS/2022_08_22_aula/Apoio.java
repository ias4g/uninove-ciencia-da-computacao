import javax.swing.JOptionPane;

public class Apoio {
    public static void exibirdados(String name, String job, double salary) {
        JOptionPane.showMessageDialog(
                null,
                "Seu nome é " + name
                        + "\nVocê é " + job +
                        "\nGanha " + salary + " reais.");
    }

    static void reajustarSalary(double salary, double tx) {
        salary = salary * tx;
        JOptionPane.showMessageDialog(null, "O salario reajustado é: " + salary);
    }
}