package academy.devdojo.maratonajava.javaCore.CSobrecargaDeMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String data;

    {
        System.out.println(" Bloco de inicialização");
    }

    public Anime(String nome, int episodios, String tipo) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public Anime(String data) {
        this();
        this.data = data;


    }

    public Anime() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
