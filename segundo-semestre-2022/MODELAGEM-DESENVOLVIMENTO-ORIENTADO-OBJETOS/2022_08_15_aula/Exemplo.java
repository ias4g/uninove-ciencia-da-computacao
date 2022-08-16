import javax.swing.JOptionPane;

/**
 * @file Exemplo.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 15 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Exemplo {
    public static void main(String[] args) {
        // declarando variavéis
        int codigoFuncionario;
        String rg, endereco;
        double salario;

        // armazenando os valores nas variavéis
        codigoFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Qual é o seu código?"));

        rg = JOptionPane.showInputDialog("Qual é o seu RG?");

        endereco = JOptionPane.showInputDialog("Qual é o seu endereço?");

        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario?"));

        salario *= 1.30;

        // imprimindo os valores lidos
        JOptionPane.showMessageDialog(null,
                "Seu códiigo é: " + codigoFuncionario + "\nRG: " + rg + "\nEndereço: " + endereco + "\nNovo salario: "
                        + salario);

        if (salario <= 1212) {
            JOptionPane.showMessageDialog(null, "Vc ganha um salario minimo");
        } else {
            JOptionPane.showMessageDialog(null, "Vc ganha muito bem");
        }
    }
}