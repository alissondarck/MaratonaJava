package academy.devdojo.maratonajava.Aintroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numerto2 = 5;
        int soma = numero1 + numerto2;
        System.out.printf("A soma de %d + %d = %d \n" , numero1, numerto2, soma);
        String ISPAR = soma % 2 == 0 ? "É par" : "É impar";
        System.out.println(ISPAR);
        boolean isVerdade = numero1 > 100 && numerto2 < 20;
        System.out.println(isVerdade);
        double bonus = 1000;
        bonus += 1000;
        System.out.println(bonus);
    }
}
