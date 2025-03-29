package academy.devdojo.maratonajava.BjavaCore.LExecoes.RumtimeExeptions;

import java.io.File;
import java.io.IOException;

public class RumtimeExeptionsTeste {
    public static void main(String[] args) throws IOException, InterruptedException {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() throws IOException, InterruptedException {
        File file = new File("arquivo\\teste1.txt");
        try {
           boolean isCriado = file.createNewFile();
            if (isCriado) {
                System.out.println("Arquivo criado com sucesso!");
            }
        }catch (IOException e){
            System.out.println("Erro ao criar arquivo!");
            e.wait(100);
            throw e;
        } finally {
            System.out.println("Vamos tentar de novo");
            file.createNewFile();
        }

    }
}
