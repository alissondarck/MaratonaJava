package academy.devdojo.maratonajava.Aintroducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao03 {

    public static void main(String[] args) {
        //Dado um valor de um item, descubra em quantas vezes ele pode ser parcelado,
        // valor da parcela minima é 1000


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do bem");
        double valor = sc.nextInt();
        for (int i = 0; i <= valor; i++) {
            if( valor >= 1000) {
                System.out.printf("%d parcela de %.2f \n",(i+1),valor);
                valor = valor - 1000;
            }

        }
    }
}
