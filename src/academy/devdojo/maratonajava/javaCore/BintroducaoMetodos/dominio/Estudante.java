package academy.devdojo.maratonajava.javaCore.BintroducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public int matricula;

    public Estudante(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }



    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}
