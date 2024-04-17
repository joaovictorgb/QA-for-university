package Tests.TestesAlunos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Alunos.Alunos;

public class TestAluno {w

   private Alunos aluno;

   @Before
   public void setUp() {
      aluno = new Alunos("João", 12345);
   }

   @Test
   public void testAdicionarDisciplinaConcluida() {
      aluno.adicionarDisciplinaConcluida("Matemática");
      aluno.adicionarDisciplinaConcluida("História");
   }

   @Test
   public void testImprimirHistorico() {
      aluno.adicionarDisciplinaConcluida("Matemática");
      aluno.adicionarDisciplinaConcluida("História");
      aluno.obterHistorico();
      // Você pode adicionar mais verificações aqui com base na saída impressa
   }

   @Test
   public void testImprimirRDM() {
      aluno.adicionarNota("Matemática", 8.5);
      aluno.adicionarNota("História", 7.0);
      aluno.obterRDM();
      // Você pode adicionar mais verificações aqui com base na saída impressa
   }
}
