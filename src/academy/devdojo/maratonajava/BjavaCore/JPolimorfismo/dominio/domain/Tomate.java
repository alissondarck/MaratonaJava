package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.domain;

public class Tomate extends Produto{

    String dataDeValidade;
    public Tomate(String nome, double preco, String dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa");
        return super.getPreco() * 0.10;
    }
}
