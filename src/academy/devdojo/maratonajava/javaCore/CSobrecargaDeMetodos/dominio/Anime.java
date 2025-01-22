package academy.devdojo.maratonajava.javaCore.CSobrecargaDeMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

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
                "tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
