public class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService() {
        this.produtoDAO = new ProdutoDAO();
    }

    public void cadastrarProduto(Produto produto) {
    
        produtoDAO.inserir(produto);
    }

    public void atualizarProduto(Produto produto) {
  
        produtoDAO.atualizar(produto);
    }

    public void excluirProduto(int id) {
     
        produtoDAO.excluir(id);
    }

    public List<Produto> listarProdutos() {
        return produtoDAO.listar();
    }

    public Produto obterDetalhes(int id) {
        return produtoDAO.obterDetalhes(id);
    }
}
