package academy.devdojo.maratonajava.javaCore.FHeranca.dominio;

public class Funcionario extends Pessoa{

    String cpf;
    public Funcionario(String nome, Endereco endereco, int idade, String cpf) {
        super(nome, endereco, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + cpf);
    }
}
