package academy.devdojo.maratonajava.javaCore.EAssociacao.teste;

import academy.devdojo.maratonajava.javaCore.EAssociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javaCore.EAssociacao.dominio.Time;

import java.util.Arrays;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Time time = new Time("Barcelona");
        Jogador j = new Jogador("CR7");
        Jogador j2 = new Jogador("Messi");
        Jogador j3 = new Jogador("Ronaldo");

        j.setTime(time);
        j2.setTime(time);
        j3.setTime(time);
        time.setJogador(new Jogador[]{j, j2, j3});
        time.imprimir();


    }
}
