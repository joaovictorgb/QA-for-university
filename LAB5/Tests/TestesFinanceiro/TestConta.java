package Tests.TestesFinanceiro;



import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Financeiro.Conta;

public class TestConta {

    private Conta conta;

    @Before
    public void setUp() {
        conta = new Conta();
    }

    @Test
    public void testGetSaldo() {
        double saldo = conta.getSaldo();
        assertTrue(saldo >= 5000.0 && saldo <= 20000.0);
    }
}
