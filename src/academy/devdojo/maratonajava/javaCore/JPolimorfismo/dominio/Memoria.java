package academy.devdojo.maratonajava.javaCore.JPolimorfismo.dominio;

public class Memoria implements Repositoio{
    @Override
    public void salvar() {
        System.out.println("Salvando memoria");
    }
}

