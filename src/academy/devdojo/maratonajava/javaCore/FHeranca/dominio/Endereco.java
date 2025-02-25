package academy.devdojo.maratonajava.javaCore.FHeranca.dominio;

public class Endereco {
    private String logradouro;
    private String numero;


    public Endereco(String logradouro, String numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void imprimir() {
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Numero: " + numero);
    }
}
