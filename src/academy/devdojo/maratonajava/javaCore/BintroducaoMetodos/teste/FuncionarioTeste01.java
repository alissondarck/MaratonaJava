package academy.devdojo.maratonajava.javaCore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javaCore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Maratona";
        funcionario.idade = 20;
        funcionario.salario[0] = 1520.00;
        funcionario.salario[1] = 3000.00;
        funcionario.salario[2] = 5000.00;

        System.out.println(funcionario.calcularSalario(funcionario.salario));
        funcionario.imprimirSalario();
    }
}
