package testesFinanceiro;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Financeiro.Pagamento;

public class TestPagamento {

   private Pagamento pagamento;

   @Before
   public void setUp() {
      pagamento = new Pagamento();
   }

   @Test
   public void testGetSalario() {
      double salario = pagamento.getSalario();
      assertTrue(salario >= 1000.0 && salario <= 2500.0);
   }

   @Test
   public void testGetFuncionarioNome() {
      String nome = pagamento.getFuncionarioNome();
      assertNotNull(nome);
      assertTrue(nome.startsWith("Funcionario "));
   }
}
