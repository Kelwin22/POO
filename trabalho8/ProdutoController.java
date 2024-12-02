import java.util.*;

public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = new ProdutoService();
    }

    public void exibirProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void cadastrarProdutos() {
        Produto p1 = new Produto(0, "Informática", "Notebook Dell", 2.5, 10, "kg");
        Produto p2 = new Produto(0, "Limpeza", "Sabão em pó", 1.0, 50, "kg");
        Produto p3 = new Produto(0, "Casa & Decoração", "Cama de casal", 25.0, 5, "kg");
        Produto p4 = new Produto(0, "Informática", "Monitor 24\"", 3.0, 15, "kg");
        Produto p5 = new Produto(0, "Limpeza", "Detergente", 0.5, 100, "kg");

        produtoService.cadastrarProduto(p1);
        produtoService.cadastrarProduto(p2);
        produtoService.cadastrarProduto(p3);
        produtoService.cadastrarProduto(p4);
        produtoService.cadastrarProduto(p5);
    }

    public void alterarProduto() {
        Produto p = produtoService.obterDetalhes(1); // Exemplo: ID do produto a ser alterado
        if (p != null) {
            p.setDescricao("Novo Notebook Dell");
            produtoService.atualizarProduto(p);
        }
    }

    public void excluirProduto() {
        produtoService.excluirProduto(1); // Exemplo: ID do produto a ser excluído
    }
}
