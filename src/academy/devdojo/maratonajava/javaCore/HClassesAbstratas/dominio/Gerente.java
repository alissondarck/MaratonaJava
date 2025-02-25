package academy.devdojo.maratonajava.javaCore.HClassesAbstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return  salario += salario * 0.10;
    }
}
