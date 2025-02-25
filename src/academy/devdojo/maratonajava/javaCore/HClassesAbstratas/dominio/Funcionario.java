package academy.devdojo.maratonajava.javaCore.HClassesAbstratas.dominio;

public abstract class Funcionario {
   String nome;
   double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
