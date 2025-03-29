package academy.devdojo.maratonajava.BjavaCore.EAssociacao.dominio.desafio;

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
