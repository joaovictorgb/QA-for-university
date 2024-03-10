
package test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Aluno;
import main.Disciplina;


class AlunoTest {
	
	private Aluno aluno1;
	private Disciplina disciplina1;
	private Disciplina disciplina2;
	
	@BeforeEach
    public void setup() {
    	aluno1 = new Aluno("Pedro Henrique", "20210001");
    	disciplina1 = new Disciplina("Matemática Discreta", "MAT123", 60, "Segunda 11h-13h | Quarta 9h-11h");
    	disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07h-09h");
        aluno1.matricularDisciplina(disciplina1);
        aluno1.matricularDisciplina(disciplina2);
    }	
	
    
    @Test
    public void matricularDisciplina() {
        assertEquals(2, aluno1.obterDisciplinasMatriculadas().size());
        assertTrue(aluno1.obterDisciplinasMatriculadas().contains(disciplina1));
        assertTrue(aluno1.obterDisciplinasMatriculadas().contains(disciplina2));
    }
    
    @Test
    public void aluno() {
    	assertEquals("Pedro Henrique", aluno1.getNome());
    	assertEquals("20210001", aluno1.getMatricula());
    }
    
}
