package academy.devdojo.maratonajava.BjavaCore.EAssociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public void imprimirProfessor() {
        for (int i = 0; i < professor.length; i++) {
            System.out.println(professor[i].getNome());
        }
    }

    public static class Professor {
        private String nome;
        private Escola escola;


        public Professor(String nome, Escola escola) {
            this.nome = nome;
            this.escola = escola;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Escola getEscola() {
            return escola;
        }

        public void setEscola(Escola escola) {
            this.escola = escola;
        }

        public void imprimir() {
            System.out.println("Nome: " + nome);
            System.out.println("Escola: " + escola);
        }
    }
}
