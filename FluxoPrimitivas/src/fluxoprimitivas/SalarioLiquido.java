
package fluxoprimitivas;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Salário por hora: ");
        double salarioHora = sc.nextDouble();
        System.out.print("Número de dependentes: ");
        int dependentes = sc.nextInt();
        
        double salarioBruto = (horas * salarioHora) + (50 * dependentes);
        
        double inss;
        if(salarioBruto <= 1000)
            inss = salarioBruto * 8.5 / 100;
        else
            inss = salarioBruto * 9 / 100;
        
        double ir;
        if(salarioBruto <= 500)
            ir = 0;
        else if(salarioBruto <= 1000)
            ir = salarioBruto * 5 / 100;
        else
            ir = salarioBruto * 7 / 100;
        
        double salarioLiquido = salarioBruto - inss - ir;
        
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Desconto IR: " + ir);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
