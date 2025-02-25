package academy.devdojo.maratonajava.javaCore.EAssociacao.teste;

import academy.devdojo.maratonajava.javaCore.EAssociacao.dominio.Escola;

public class EscolaTeste {
    public static void main(String[] args) {
        Escola escola = new Escola("Maratona");
        Escola.Professor professor1 = new Escola.Professor(" Wiliian" , escola);
        Escola.Professor professor2 = new Escola.Professor(" Alissom" , escola);
        escola.setProfessor(new Escola.Professor[]{professor1, professor2});
        escola.imprimirProfessor();
    }
}
