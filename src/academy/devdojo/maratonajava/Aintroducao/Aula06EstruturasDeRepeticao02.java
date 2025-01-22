package academy.devdojo.maratonajava.Aintroducao;

public class Aula06EstruturasDeRepeticao02 {
        public static void main(String[] args) {
            int valorDeSaida = 10000;
            for (int i = 1; i <= 1_000_000; i++) {
                if (i % 2 == 0) {
                    System.out.print("Number " + i);
                    if (valorDeSaida == i) {
                        break;
                    }
                }
            }
    }
}
