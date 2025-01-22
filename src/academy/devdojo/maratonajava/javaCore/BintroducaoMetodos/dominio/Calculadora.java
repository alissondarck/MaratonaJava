package academy.devdojo.maratonajava.javaCore.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(double num1, double num2) {
        System.out.printf("A soma de %.2f e %.2f é %.2f", num1, num2, (num1 + num2));
    }

    public void subtraiDoisNumeros(double num1, double num2) {
        System.out.printf("%.2f - %.2f é %.2f", num1, num2, (num1 - num2));
    }

    public void multiplicaDoisNumeros(double num1, double num2) {
        System.out.printf("%.2f * %.2f é igual a %.2f", num1, num2, (num1 * num2));
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }else {
            return num1 / num2;
        }


    }

    public void somaArray(int ... numeros){
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println(soma);
    }

}
