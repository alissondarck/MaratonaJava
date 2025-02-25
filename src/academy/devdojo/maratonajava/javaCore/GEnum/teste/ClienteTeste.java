package academy.devdojo.maratonajava.javaCore.GEnum.teste;

import academy.devdojo.maratonajava.javaCore.GEnum.dominio.Cliente;
import academy.devdojo.maratonajava.javaCore.GEnum.dominio.TipoDeCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alisson", TipoDeCliente.PESSOA_FISICA);
        cliente.setValorCompra(3000.00);
        System.out.println(cliente.desconto());
    }
}
