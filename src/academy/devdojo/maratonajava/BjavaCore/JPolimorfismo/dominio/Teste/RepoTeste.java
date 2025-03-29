package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.Teste;

import academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.Banco;
import academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio.Repositoio;

public class RepoTeste {
    public static void main(String[] args) {
        Repositoio teste = new Banco();
        teste.salvar();
    }
}
