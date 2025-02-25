package academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio.Teste;

import academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio.Banco;
import academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio.Repositoio;

public class RepoTeste {
    public static void main(String[] args) {
        Repositoio teste = new Banco();
        teste.salvar();
    }
}
