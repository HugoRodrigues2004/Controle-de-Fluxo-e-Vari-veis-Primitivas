
package questõesfixação;

import javax.swing.JOptionPane;

public class VolumePiscina {
    public static void main(String[] args){
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento da piscina (m):");
        String larguraStr = JOptionPane.showInputDialog("Digite a largura da piscina (m):");
        String profundidadeStr = JOptionPane.showInputDialog("Digite a profundidade da piscina (m):");
       
        double comprimento = Double.parseDouble(comprimentoStr);
        double largura = Double.parseDouble(larguraStr);
        double profundidade = Double.parseDouble(profundidadeStr);
        
        double volume = comprimento * largura * profundidade;
        double preco = volume * 45.0;
        
        JOptionPane.showMessageDialog(null, "O valor da construção da piscina é: R$ " + preco);
    }
}
