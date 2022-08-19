
/**
 * @file Social.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 18 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

import javax.swing.JOptionPane;

public class Social {
    public static void main(String[] args) {
        // declarando variavéis
        double salario;

        // armazenando os valores nas variavéis
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario?"));

        salario *= 1.30;

        // imprimindo os valores lidos
        if (salario <= 2424) {
            JOptionPane.showMessageDialog(null, "Classe E" + salario);
        } else if (salario > 2424 && salario <= 4848) {
            JOptionPane.showMessageDialog(null, "Classe D" + salario);
        } else if (salario > 4848 && salario <= 12120) {
            JOptionPane.showMessageDialog(null, "Classe C" + salario);
        } else if (salario > 12120 && salario <= 24240) {
            JOptionPane.showMessageDialog(null, "Classe B" + salario);
        } else {
            JOptionPane.showMessageDialog(null, "Classe A" + salario);
        }
    }
}