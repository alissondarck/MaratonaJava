package academy.devdojo.maratonajava.javaCore.AintroducaoClasses.dominio;

public class Carro {
    String nome;
    String modelo;
    int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
