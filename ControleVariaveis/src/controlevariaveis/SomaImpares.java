
package controlevariaveis;

public class SomaImpares {
    public static void main(String[] args){
        int soma = 0;
        for(int i = 1; i < 500; i += 2){
            soma += i;
        }
        System.out.println("Soma de todos os números ímpares entre 1 e 499: " + soma);
    }
}
