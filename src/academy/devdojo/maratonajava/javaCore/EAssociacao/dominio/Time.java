package academy.devdojo.maratonajava.javaCore.EAssociacao.dominio;

public class Time {
    private String nome;
    private Jogador [] jogador;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }

    public void imprimir() {
        for (int i = 0; i < jogador.length; i++) {
            System.out.println(jogador[i].getNome());
        }
    }
}
