package academy.devdojo.maratonajava.BjavaCore.DModificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private final static int VELOCIDADE_LIMITE = 300;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static int getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }



    public void painel(){
        System.out.println("Nome :" + nome);
        System.out.println("Velocidade Limite" + VELOCIDADE_LIMITE);
        System.out.println("Velocidade Máxima " + velocidadeMaxima);
    }
}
