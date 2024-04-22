package testesAlunos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Alunos.Alunos;

public class TestAluno {

   private Alunos aluno;

   @Before
   public void setUp() {
      aluno = new Alunos("João", 12345);
   }

   @Test
   public void testAluno(){
      assertEquals(12345, aluno.getMatricula());
   }

   @Test
   public void testImprimirHistorico() {
      aluno.adicionarDisciplinaConcluida("Matemática");
      aluno.adicionarDisciplinaConcluida("História");
      aluno.obterHistorico();
      assertTrue(aluno.obterHistorico().contains("Matemática"));
      assertTrue(aluno.obterHistorico().contains("História"));
   }

}
