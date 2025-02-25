package academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio.servico;

import academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio.domain.Produto;

public class CalculaImposto {
    public static void calculaImposto(Produto produto) {
        System.out.printf("Relatorio do imposto do %s \n",produto.getNome());
        System.out.printf("Valor Total do Produto : %.2f",produto.getPreco());
        System.out.printf("Imposto imbutido no produto : %.2f",produto.calcularTaxa());
    }
}
