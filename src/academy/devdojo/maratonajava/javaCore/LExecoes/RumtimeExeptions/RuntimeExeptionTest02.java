package academy.devdojo.maratonajava.javaCore.LExecoes.RumtimeExeptions;

import java.sql.PseudoColumnUsage;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        divisao(2,0);
    }

    private static int divisao( int a, int b ) {

        if ( b == 0 || a == 0 ) {
            throw new RuntimeException("Tu lançou um zero pra fazer uma divisão ? Animal");
        }
        return a / b;
    }
}
