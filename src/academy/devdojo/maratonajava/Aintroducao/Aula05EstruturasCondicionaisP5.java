package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana que você deseja");
        int dia = sc.nextInt();
        switch (dia) {
            default -> System.out.printf("O valor %d não é um valor válido", dia);
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Terça");
            case 5 -> System.out.println("Terça");
            case 6 -> System.out.println("Terça");
            case 7 -> System.out.println("Terça");
        }
    }
}
