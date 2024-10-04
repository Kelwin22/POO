public class CadastroPessoas {
    private PessoaService pessoaService;

    public CadastroPessoas() {
        this.pessoaService = new PessoaService();
    }

    public void cadastraPessoa(Pessoa pessoa) {
        try {
            pessoaService.cadastraPessoa(pessoa);
        } catch (QuantidadeExcedidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimeCadastro() {
        for (PessoaInfo info : pessoaService.getCadastroInfo()) {
            System.out.println(info);
        }
    }
}

