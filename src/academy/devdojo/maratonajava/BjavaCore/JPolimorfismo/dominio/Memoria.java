package academy.devdojo.maratonajava.BjavaCore.JPolimorfismo.dominio;

public class Memoria implements Repositoio{
    @Override
    public void salvar() {
        System.out.println("Salvando memoria");
    }
}

