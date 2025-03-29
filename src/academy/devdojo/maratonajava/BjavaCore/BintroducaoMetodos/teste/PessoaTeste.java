package academy.devdojo.maratonajava.BjavaCore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.BjavaCore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao");
        p1.setIdade(-10);
        p1.setSexo("M");



        System.out.println(p1);
    }
}
