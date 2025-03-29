package academy.devdojo.maratonajava.BjavaCore.HClassesAbstratas.dominio;

public class Dev extends Funcionario{

    public Dev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return  salario += salario * 0.15;
    }
}
