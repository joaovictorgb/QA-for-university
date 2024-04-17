package Tests.TestesAdministrativas;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Administrativa.Entrevista;

public class TestEntrevista {

   private Entrevista entrevista;

   @Before
   public void setUp() {
      entrevista = new Entrevista();
   }

   @Test
   public void testGetData() {
      assertNotNull(entrevista.getData());
   }

   @Test
   public void testGetCandidato() {
      assertNotNull(entrevista.getCandidato());
      assertTrue(entrevista.getCandidato().matches("[A-Z]{4}"));
   }
}
