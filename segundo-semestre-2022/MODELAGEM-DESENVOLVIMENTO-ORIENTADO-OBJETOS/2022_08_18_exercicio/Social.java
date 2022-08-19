import javax.swing.JOptionPane;

public class Social {
    public static void main(String[] args) {
        // declarando variavéis
        double salario;

        // armazenando os valores nas variavéis
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario?"));

        // imprimindo os valores lidos
        if (salario <= 2424) {
            JOptionPane.showMessageDialog(null, "Classe E");
        } else if (salario > 2424 && salario <= 4848) {
            JOptionPane.showMessageDialog(null, "Classe D");
        } else if (salario > 4848 && salario <= 12120) {
            JOptionPane.showMessageDialog(null, "Classe C");
        } else if (salario > 12120 && salario <= 24240) {
            JOptionPane.showMessageDialog(null, "Classe B");
        } else if (salario > 24240) {
            JOptionPane.showMessageDialog(null, "Classe A");
        }
    }
}