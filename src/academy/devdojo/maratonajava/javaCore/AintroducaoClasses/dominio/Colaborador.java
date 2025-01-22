package academy.devdojo.maratonajava.javaCore.AintroducaoClasses.dominio;

public class Colaborador {
    String nome;
    int idade;
    char sexo;

    public Colaborador(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
