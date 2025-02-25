package academy.devdojo.maratonajava.javaCore.LExecoes.erroTest;

public class StackOverFlowTeste {

    public static void main(String[] args) {
        stackOverFlow();

    }

    public static void stackOverFlow() {
        stackOverFlow();
    }
}
