package academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio;

public class Banco implements Repositoio{
    @Override
    public void salvar() {
        System.out.println("Salvando banco");
    }
}
