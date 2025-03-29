package academy.devdojo.maratonajava.BjavaCore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.BjavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
       Calculadora calculadora = new Calculadora();
       calculadora.somaArray(1,1,2,3);
       calculadora.somaArray(numbers);

    }
}
