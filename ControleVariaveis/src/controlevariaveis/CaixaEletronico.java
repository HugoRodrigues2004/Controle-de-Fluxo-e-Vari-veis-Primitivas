package controlevariaveis;

import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args){
        String senhaCorreta = "admin";
        int tentativas = 0;
        boolean acesso = false;
        
        while(tentativas < 3){
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if(senha.equals(senhaCorreta)){
                JOptionPane.showMessageDialog(null, "Senha válida!");
                acesso = true;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Senha inválida!");
                tentativas++;
                
            }
        }
        if(!acesso){
            JOptionPane.showMessageDialog(null, "Senha bloqueada!");
        }
    }
}
