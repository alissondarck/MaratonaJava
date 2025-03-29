package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.domain;

public class Computador extends Produto{


    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa");
        return super.getPreco() * 0.15;
    }
}
