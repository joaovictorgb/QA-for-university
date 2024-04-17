
package Tests.TestesFinanceiro;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Financeiro.Financeiro;

public class TestFinanceiro {

    private Financeiro financeiro;

    @Before
    public void setUp() {
        financeiro = new Financeiro();
    }

    @Test
    public void testObterBalancoContas() {
        String balanco = financeiro.obterBalancoContas();
        assertNotNull(balanco);
        assertTrue(balanco.contains("Balanço de contas em 30/09/2023"));
    }

    @Test
    public void testObterFolhaPagamento() {
        String folhaPagamento = financeiro.obterFolhaPagamento();
        assertNotNull(folhaPagamento);
        assertTrue(folhaPagamento.contains("Folha de pagamento de outubro de 2023"));
    }
}
