
package fluxoprimitivas;

public class Soma100Numeros {
    public static void main(String[] args){
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += 1;
        }
        System.out.println("Soma dos 100 primeiros números inteiros: " + soma);
    }
}
