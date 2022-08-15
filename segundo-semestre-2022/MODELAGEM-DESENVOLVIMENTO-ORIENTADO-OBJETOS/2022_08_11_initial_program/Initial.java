import javax.swing.JOptionPane;

public class Initial {

    public static void main(String[] args) {
        // Declaração de variáveis
        String nome, endereco;
        int idade;
        double salario;

        // Colocação de valores nas variáveis na memória
        nome = JOptionPane.showInputDialog("Qual seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário"));
        ;
        endereco = JOptionPane.showInputDialog("Qual seu Endereço");
        ;

        // Buscam na memória e exibe na tela
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");
        JOptionPane.showMessageDialog(null, salario);
        JOptionPane.showMessageDialog(null, endereco);

    }
}
