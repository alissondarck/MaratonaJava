package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salario ?");
        double salario = sc.nextDouble();
        String mensagemDoar = salario > 5000 ? "Vou doar  500" : "Não tenho condicoes ainda, mas breve terei";
        System.out.println(mensagemDoar);



    }
}
