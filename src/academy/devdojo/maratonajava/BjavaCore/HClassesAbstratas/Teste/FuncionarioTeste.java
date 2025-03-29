package academy.devdojo.maratonajava.BjavaCore.HClassesAbstratas.Teste;

import academy.devdojo.maratonajava.BjavaCore.HClassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.BjavaCore.HClassesAbstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Alisson",5000);
        System.out.println(funcionario);
        System.out.println(funcionario.calculaBonus());
    }
}
