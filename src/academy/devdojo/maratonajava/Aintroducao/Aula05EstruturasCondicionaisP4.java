package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double faixa1 = 9.70;
        double faixa2 = 37.35;
        double faixa3 = 49.50;
        System.out.println("Qual o seu salario ?");
        double salario = sc.nextDouble();
        if (salario <= 34_712.00) {
            salario =  salario - ((salario /100 ) * faixa1);
        } else if (salario >= 34_000.00 && salario <= 68_507.00) {
            salario =  salario - ((salario /100 ) * faixa2);
        } else {
            salario =  salario - ((salario /100 ) * faixa3);
        }

        System.out.println(salario);
    }
}
