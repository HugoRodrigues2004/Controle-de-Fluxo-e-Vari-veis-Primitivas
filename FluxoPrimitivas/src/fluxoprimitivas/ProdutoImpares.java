
package fluxoprimitivas;

public class ProdutoImpares {
    public static void main(String[] args){
        long produto = 1;
        for(int i = 1; i <= 15; i += 2){
            produto *= i;
        }
        System.out.println("Produto dos inteiros ímpares de 1 a 15: " + produto);
    }
}
