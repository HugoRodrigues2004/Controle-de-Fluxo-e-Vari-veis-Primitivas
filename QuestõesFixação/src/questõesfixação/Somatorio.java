
package questõesfixação;

import javax.swing.JOptionPane;

public class Somatorio {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Digite quatro valores separados por espaço: ");
        String[] valores = input.split(" ");
        
        double v1 = Double.parseDouble(valores[0]);
        double v2 = Double.parseDouble(valores[1]);
        double v3 = Double.parseDouble(valores[2]);
        double v4 = Double.parseDouble(valores[3]);
        
        double soma = v1 + v2 + v3 + v4;
        double media = soma / 4;
        
        String mensagem = "Somatório: " + soma + "\n" +
                          "Média: " + media + "\n" +
                          "Resto da divisão do somatório por cada valor:\n" +
                          "Soma % " + v1 + " = " + (soma % v1) + "\n" +
                          "Soma % " + v2 + " = " + (soma % v2) + "\n" +
                          "Soma % " + v3 + " = " + (soma % v3) + "\n" +
                          "Soma % " + v4 + " = " + (soma % v4);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
