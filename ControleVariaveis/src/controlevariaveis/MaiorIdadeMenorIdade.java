package controlevariaveis;

import javax.swing.JOptionPane;

public class MaiorIdadeMenorIdade {
    public static void main(String[] args){
        try{
            int idade1= Integer.parseInt(JOptionPane.showInputDialog("Digite a 1ª idade:"));
            int idade2= Integer.parseInt(JOptionPane.showInputDialog("Digite a 2ª idade:"));
            int idade3= Integer.parseInt(JOptionPane.showInputDialog("Digite a 3ª idade:"));
            int idade4= Integer.parseInt(JOptionPane.showInputDialog("Digite a 4ª idade:"));
            
            int maior = idade1;
            if(idade2 > maior) maior = idade2;
            if(idade3 > maior) maior = idade3;
            if(idade4 > maior) maior = idade4;
            
            int menor = idade1;
            if(idade2 < menor) menor = idade2;
            if(idade3 < menor) menor = idade3;
            if(idade4 < menor) menor = idade4;
            
            JOptionPane.showMessageDialog(null, "A maior idade é: " + maior + "\nA menor idade é: " + menor);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    }
}
