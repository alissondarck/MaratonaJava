package academy.devdojo.maratonajava.javaCore.DModificadorEstatico.teste;

import academy.devdojo.maratonajava.javaCore.DModificadorEstatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Carro 1");
        carro.setVelocidadeMaxima(350);
        carro.painel();

    }
}
