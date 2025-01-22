package academy.devdojo.maratonajava.Aintroducao;

import java.util.Arrays;

public class Aula07ArraysPt02 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "Joao";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";
        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.asList(nomes));
        for (int i = 0; i < nomes.length; i++) {
            System.out.print (nomes[i] + ", ");
        }
        System.out.println();
        for(String nome : nomes) {
            System.out.print(nome + ", ");
        }
    }
}
