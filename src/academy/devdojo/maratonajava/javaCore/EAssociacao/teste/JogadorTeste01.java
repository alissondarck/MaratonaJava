package academy.devdojo.maratonajava.javaCore.EAssociacao.teste;

import academy.devdojo.maratonajava.javaCore.EAssociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador j = new Jogador("CR7");
        Jogador j2 = new Jogador("Messi");
        Jogador j3 = new Jogador("Ronaldo");

        Jogador [] time = {j, j2, j3};

        System.out.println(time[0].getNome());
        for (Jogador jogador : time) {
            System.out.println(jogador.getNome());
        }

    }
}
