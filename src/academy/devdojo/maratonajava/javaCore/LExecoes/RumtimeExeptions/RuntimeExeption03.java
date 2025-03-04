package academy.devdojo.maratonajava.javaCore.LExecoes.RumtimeExeptions;

public class RuntimeExeption03 {
    public static void main(String[] args) {
        Extrair();


    }

    private static void Extrair() {
        try{
            System.out.println("Abrinco do arquivo");
            System.out.println("Escrevendo o arquivo");
            System.out.println("Fechando recurso liberado pelo SO");
        } catch (Exception e) {
            System.out.println("Fechando recurso libeado pelo SO");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
