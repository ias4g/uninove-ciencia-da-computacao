import javax.swing.JOptionPane;

/**
 * @file Social.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 18 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Social {
    public static void main(String[] args) {
        // declarando variavéis
        String name;
        double salario;

        // armazenando os valores nas variavéis
        name = JOptionPane.showInputDialog("Qual é o seu nome?");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario?"));

        salario *= 1.30;

        // imprimindo os valores lidos
        if (salario <= 2424) {
            JOptionPane.showMessageDialog(null, "Nome: " + name + "Classe E - Salario: " + salario);
        } else if (salario <= 4848) {
            JOptionPane.showMessageDialog(null, "Nome: " + name + "Classe D - Salario: " + salario);
        } else if (salario <= 12120) {
            JOptionPane.showMessageDialog(null, "Nome: " + name + "Classe C - Salario: " + salario);
        } else if (salario <= 24240) {
            JOptionPane.showMessageDialog(null, "Nome: " + name + "Classe B - Salario: " + salario);
        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + name + "Classe A - Salario: " + salario);
        }
    }
}