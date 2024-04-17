package Tests.TestesAlmoxarifado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import Almoxarifado.Estoque;

public class TestEstoque {
     private Estoque estoque;

    @Before
    public void setUp() {
        estoque = new Estoque();
    }

    @Test
    public void testAdicionarItem() {
        estoque.adicionarItem("Item A", 10);
        estoque.adicionarItem("Item B", 5);

        int quantidadeItemA = estoque.verificarQuantidade("Item A");
        int quantidadeItemB = estoque.verificarQuantidade("Item B");

        assertEquals(10, quantidadeItemA);
        assertEquals(5, quantidadeItemB);
    }

    @Test
    public void testRemoverItem() {
        estoque.adicionarItem("Item C", 15);
        estoque.removerItem("Item C", 7);

        int quantidadeItemC = estoque.verificarQuantidade("Item C");

        assertEquals(8, quantidadeItemC);
    }

    @Test
    public void testRemoverItemComQuantidadeMaiorQueEstoque() {
        estoque.adicionarItem("Item D", 5);
        estoque.removerItem("Item D", 7);

        int quantidadeItemD = estoque.verificarQuantidade("Item D");

        assertEquals(0, quantidadeItemD);
        assertFalse(estoque.verificarQuantidade("Item D") > 0);
    }
}
