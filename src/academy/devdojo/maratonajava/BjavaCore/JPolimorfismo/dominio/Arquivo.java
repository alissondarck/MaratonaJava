package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio;

public class Arquivo implements Repositoio{
    @Override
    public void salvar() {
        System.out.println("Arquivo salvo com sucesso");
    }
}
