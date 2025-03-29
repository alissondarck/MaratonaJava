package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.Teste;

import academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.domain.Computador;
import academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.domain.Produto;
import academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.servico.CalculaImposto;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 10_000);
        CalculaImposto.calculaImposto(produto);

    }
}

