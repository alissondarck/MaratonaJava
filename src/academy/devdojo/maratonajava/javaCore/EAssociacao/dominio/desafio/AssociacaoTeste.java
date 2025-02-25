package academy.devdojo.maratonajava.javaCore.EAssociacao.dominio.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("RUa das Laranjeiras");
        Aluno aluno = new Aluno("Alisson",32);
        Professor professor = new Professor("Stark","Linguistica Aplicada");
        Aluno[] alunos = {aluno};
        Seminario [] seminarios = {new Seminario("TEste",local)};

        Seminario seminario = new Seminario("O cu",local);
        seminario.setAlunos(alunos);
        professor.setSeminario(seminarios);
        professor.imprimir();
    }
}
