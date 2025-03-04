package academy.devdojo.maratonajava.javaCore.LExecoes.RumtimeExeptions;


import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class RumtimeExeptionsTeste02 {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Dentro do Array Index");
        }catch (Exception e) {
            e.printStackTrace();
        }catch (Throwable e) {
            e.printStackTrace();
        }

        talvezLance();
    }



    private static void talvezLance() throws SQLClientInfoException, SQLException {

    }

}
