
package controlevariaveis;

import javax.swing.JOptionPane;

public class CalculadoraLetra {
    public static void main(String[] args){
        try{
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            String letra = JOptionPane.showInputDialog("Digite a letra da operação (A=Soma, B=Subtração, C=Multiplicação, D=Divisão):").toUpperCase();
            
            double resultado;
            
            switch (letra) {
                case "A":
                    resultado = num1 + num2;
                    break;
                case "B":
                    resultado = num1 - num2;
                    break;
                case "C":
                    resultado = num1 * num2;
                    break;
                case "D":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida!");
                    return;
            }
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entradda inválida!");
        }
    }
}
