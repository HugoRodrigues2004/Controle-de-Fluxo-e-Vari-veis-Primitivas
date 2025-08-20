
package questõesfixação;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite Quantidade1 Valor1 Quantidade2 Valor2 Quantidade3 Valor3: ");
        int q1 = sc.nextInt();
        double v1 = sc.nextDouble(); 
        int q2 = sc.nextInt();
        double v2 = sc.nextDouble();
        int q3 = sc.nextInt();
        double v3 = sc.nextDouble();
        
        double total = q1*v1 + q2*v2 + q3*v3;
        
        System.out.println("Valor total dos produtos: " + total);
    }
}
