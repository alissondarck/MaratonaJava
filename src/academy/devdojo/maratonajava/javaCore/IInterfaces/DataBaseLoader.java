package academy.devdojo.maratonajava.javaCore.IInterfaces;

public class DataBaseLoader implements DataLoader, Remover{
    @Override
    public void load(Arquivo arquivo) {
        System.out.println("Loading arquivo " + arquivo);
    }

    @Override
    public void remover() {

    }
}
