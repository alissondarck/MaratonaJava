package academy.devdojo.maratonajava.BjavaCore.GEnum.dominio;

public enum TipoDeCliente {
    PESSOA_FISICA(1,"Pessoa Fisica") {
        @Override
        public double calculaDesconto() {
            return 0.1;
        }
    },
    PESSOA_JURIDICA(2, "Pessoa Jurica") {
        @Override
        public double calculaDesconto() {
            return 0.2;
        }
    };

    private final int id;
    private final String descricao;

    TipoDeCliente(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calculaDesconto();
    public static TipoDeCliente obterTipoDeCliente(String descricao) {
        for (TipoDeCliente tipo : TipoDeCliente.values()) {
            if (tipo.getDescricao().equals(descricao)) {
                return tipo;
            }
        }
        return null;
    }
}
