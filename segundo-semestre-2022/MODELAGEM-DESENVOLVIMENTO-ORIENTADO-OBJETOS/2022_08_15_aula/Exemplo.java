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
        codigoFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Qual éo seu código?"));

        rg = JOptionPane.showInputDialog("Qual é o seu RG?");

        endereco = JOptionPane.showInputDialog("Qual é o seu endereço?");

        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario?"));

        // imprimindo os valores lidos
        JOptionPane.showMessageDialog(null, "Seu códiigo é: " + codigoFuncionario);
    }
}