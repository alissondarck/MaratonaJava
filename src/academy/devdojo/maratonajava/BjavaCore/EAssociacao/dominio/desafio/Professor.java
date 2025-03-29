package academy.devdojo.maratonajava.BjavaCore.EAssociacao.dominio.desafio;

public class Professor {
    private String nome;
    private String escpecialidade;
    private Seminario [] seminario;

    public Professor(String nome, String escpecialidade) {
        this.nome = nome;
        this.escpecialidade = escpecialidade;
    }

    public Professor(String nome, Seminario[] seminario, String escpecialidade) {
        this.nome = nome;
        this.seminario = seminario;
        this.escpecialidade = escpecialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscpecialidade() {
        return escpecialidade;
    }

    public void setEscpecialidade(String escpecialidade) {
        this.escpecialidade = escpecialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }


    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Escpecialidade: " + escpecialidade);
        System.out.println(" Seminarios: ");
        if (seminario != null) {
            for (Seminario s : seminario) {
                System.out.println(s.getTitulo());
                System.out.println(s.getLocal().getEndereco());
            }
        }
    }
}
