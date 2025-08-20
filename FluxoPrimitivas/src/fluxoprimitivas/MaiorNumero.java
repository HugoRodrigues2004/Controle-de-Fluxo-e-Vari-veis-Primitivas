
package fluxoprimitivas;

import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args){
        try{
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
            
            int maior = n1;
            if(n2 > maior) maior = n2;
            if(n3 > maior) maior = n3;
            
            JOptionPane.showMessageDialog(null, "O maior número é:\n" + maior);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro: entrada inválida!");
        }
    }
}
