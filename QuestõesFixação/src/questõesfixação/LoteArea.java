
package questõesfixação;

import javax.swing.JOptionPane;

public class LoteArea {
    public static void main(String[] args){
        String larguraStr = JOptionPane.showInputDialog("Digite a largura do lote (m):");
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento do lote (m):");
        
        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);
        
        double area = largura * comprimento;
        
        JOptionPane.showMessageDialog(null, "A área total do lote é: " + area + " m²");
        
    }
}
