public class PessoaService {
    private ArrayList<Pessoa> pessoas;

    public PessoaService() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pessoa) throws QuantidadeExcedidaException {
      
    }

    public ArrayList<PessoaInfo> getCadastroInfo() {
        ArrayList<PessoaInfo> cadastroInfo = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            cadastroInfo.add(pessoa.getInfo());
        }
        return cadastroInfo;
    }
}

