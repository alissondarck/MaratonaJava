package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do participante :");
        int idade = sc.nextInt();
        if(idade < 15){
            System.out.println("Categoria Infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else if(idade >= 18 && idade < 24){
            System.out.println("Categoria Adulta");
        }
    }
}
