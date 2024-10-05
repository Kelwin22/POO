public class ClienteVip extends Cliente {
    private float percentualDesconto;

    public ClienteVip(String nome, Data nascimento, int codigo, float percentualDesconto) {
        super(nome, nascimento, codigo);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public PessoaInfo getInfo() {
        return new PessoaInfo(nome, "Cliente VIP", "Código: " + codigo + ", Desconto: " + percentualDesconto + "%, Nascimento: " + nascimento);
    }
}

