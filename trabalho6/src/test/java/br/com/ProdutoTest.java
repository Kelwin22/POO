package br.com.minhaempresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    
    @Test
    public void testCriacaoProduto() {
        Produto produto = new Produto("Produto C", 15.0);
        assertEquals("Produto C", produto.getNome());
        assertEquals(15.0, produto.getPreco());
    }

    @Test
    public void testEqualsAndHashCode() {
        Produto produto1 = new Produto("Produto D", 10.0);
        Produto produto2 = new Produto("Produto D", 12.0);
        assertEquals(produto1, produto2);
        assertEquals(produto1.hashCode(), produto2.hashCode());
    }

    @Test
    public void testCompareTo() {
        Produto produto1 = new Produto("Produto E", 8.0);
        Produto produto2 = new Produto("Produto F", 15.0);
        Produto produto3 = new Produto("Produto G", 8.0);

        assertTrue(produto1.compareTo(produto2) < 0); // produto1 é mais barato que produto2
        assertTrue(produto2.compareTo(produto1) > 0); // produto2 é mais caro que produto1
        assertEquals(0, produto1.compareTo(produto3)); // produto1 e produto3 têm o mesmo preço
    }
}
