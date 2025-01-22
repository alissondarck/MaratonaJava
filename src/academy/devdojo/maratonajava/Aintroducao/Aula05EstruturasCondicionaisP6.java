package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana que você deseja para saber se é um dia útil ou FDS");
        int dia = sc.nextInt();
        switch (dia) {
            default -> System.out.printf("O valor %d não é um valor válido", dia);
            case 1,7 -> System.out.println("Final de semana");
            case 2,3,4,5,6 -> System.out.println("Dia útil");

        }
    }
}
