package br.com.minhaempresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    public void setUp() {
        estoque = new Estoque();
        produto1 = new Produto("Produto A", 10.0);
        produto2 = new Produto("Produto B", 20.0);
    }

    @Test
    public void testAdicionarProduto() {
        assertTrue(estoque.adicionarProduto(produto1));
        assertTrue(estoque.adicionarProduto(produto2));
    }

    @Test
    public void testAdicionarProdutoDuplicado() {
        estoque.adicionarProduto(produto1);
        assertFalse(estoque.adicionarProduto(produto1));
    }

    @Test
    public void testRemoverProduto() {
        estoque.adicionarProduto(produto1);
        assertTrue(estoque.removerProduto("Produto A"));
        assertFalse(estoque.removerProduto("Produto A"));
    }

    @Test
    public void testBuscarProdutoExistente() {
        estoque.adicionarProduto(produto1);
        Produto encontrado = estoque.buscarProduto("Produto A");
        assertNotNull(encontrado);
        assertEquals("Produto A", encontrado.getNome());
    }

    @Test
    public void testBuscarProdutoNaoExistente() {
        Produto encontrado = estoque.buscarProduto("Produto Inexistente");
        assertNull(encontrado);
    }

    @Test
    public void testListarProdutos() {
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        Set<Produto> produtos = estoque.listarProdutos();
        assertEquals(2, produtos.size());
        assertTrue(produtos.contains(produto1));
        assertTrue(produtos.contains(produto2));
    }
}
