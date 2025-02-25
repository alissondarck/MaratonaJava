package academy.devdojo.maratonajava.javaCore.FHeranca.teste;

import academy.devdojo.maratonajava.javaCore.FHeranca.dominio.Endereco;
import academy.devdojo.maratonajava.javaCore.FHeranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javaCore.FHeranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Jovino Valverde","100");
        Pessoa pessoa = new Pessoa("Alisson",endereco,32);
        Funcionario zelador = new Funcionario("Cato",endereco,32,"2047");
        zelador.imprimir();




    }
}
