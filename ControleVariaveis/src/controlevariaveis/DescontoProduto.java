
package controlevariaveis;

import javax.swing.JOptionPane;

public class DescontoProduto {
    public static void main(String[] args) {
        try{
            String valorStr = JOptionPane.showInputDialog("Digite o valor do produto:");
            double valor = Double.parseDouble(valorStr);
            
            String codigoStr = JOptionPane.showInputDialog("Digite o código de desconto (1,2,3,4):");
            int codigo = Integer.parseInt(codigoStr);
            
            double novoValor;
            
            switch(codigo){
                case 1:
                    novoValor = valor * 0.95;
                    break;
                case 2:
                    novoValor = valor * 0.90;
                    break;
                case 3:
                    novoValor = valor * 0.80;
                    break;
                case 4:
                    novoValor = valor * 0.50;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido!");
                    return;
            }
            JOptionPane.showMessageDialog(null, "Novo valor do produto: R$ " + novoValor);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    }    
}
