package academy.devdojo.maratonajava.BjavaCore.GEnum.dominio;

public class Cliente {
    private String nome;
    private TipoDeCliente TIPO_DE_CLIENTE;
    private double valorCompra;

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Cliente(String nome, TipoDeCliente TIPO_DE_CLIENTE) {
        this.nome = nome;
        this.TIPO_DE_CLIENTE = TIPO_DE_CLIENTE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeCliente getTIPO_DE_CLIENTE() {
        return TIPO_DE_CLIENTE;
    }

    public void setTIPO_DE_CLIENTE(TipoDeCliente TIPO_DE_CLIENTE) {
        this.TIPO_DE_CLIENTE = TIPO_DE_CLIENTE;
    }

    public double desconto(){
        if (getTIPO_DE_CLIENTE() == TipoDeCliente.PESSOA_FISICA){
            return valorCompra - (valorCompra * TipoDeCliente.PESSOA_FISICA.calculaDesconto());
        }
        return valorCompra;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TIPO_DE_CLIENTE=" + TIPO_DE_CLIENTE.getDescricao() +
                '}';
    }
}
