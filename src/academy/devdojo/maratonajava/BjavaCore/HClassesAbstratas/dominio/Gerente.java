package academy.devdojo.maratonajava.BjavaCore.HClassesAbstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return  salario += salario * 0.10;
    }
}
