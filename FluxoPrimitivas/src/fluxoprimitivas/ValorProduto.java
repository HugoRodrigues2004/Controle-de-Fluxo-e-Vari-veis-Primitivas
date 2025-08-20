
package fluxoprimitivas;

import javax.swing.JOptionPane;

public class ValorProduto {

    public static void main(String[] args) {
        try{
            String valorStr = JOptionPane.showInputDialog("Digite o valor do produto:");
            double valor = Double.parseDouble(valorStr);
            
            String codigoStr = JOptionPane.showInputDialog("Digite o código de aumento (1, 3, 4, 8):");
            int codigo = Integer.parseInt(codigoStr);
            
            double novoValor = 0;
            
            switch(codigo){
                case 1:
                    novoValor = valor * 1.15;
                    break;
                case 3:
                    novoValor = valor * 1.20;
                    break;
                case 4:
                    novoValor = valor * 1.35;
                    break;
                case 8:
                    novoValor = valor * 1.40;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido!");
                    System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Novo valor do produto: R$ " + novoValor);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro: entrada inválida!");
        }
    }
    
}
