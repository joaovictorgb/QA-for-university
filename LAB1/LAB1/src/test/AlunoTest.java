
package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Aluno;
import main.Disciplina;


class AlunoTest {
	
	private Aluno aluno1;
	private Disciplina disciplina1;
	private Disciplina disciplina2;
	private Disciplina disciplina3;
	
	
	@BeforeEach
    public void setup() {
    	aluno1 = new Aluno("Pedro Henrique", "20210001");
    	disciplina1 = new Disciplina("Matemática Discreta", "MAT123", 60, "Segunda 11h-13h | Quarta 9h-11h");
    	disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07h-09h");
        aluno1.matricularDisciplina(disciplina1);
        aluno1.matricularDisciplina(disciplina2);
        disciplina3 = new Disciplina("Métodos Avançados de Programação", "MAP523", 90, "Segunda 07h-09h | Sexta 07-09h");
    }	
	
    
	@Test
    void obterDisciplinasMatriculadas() {
        assertEquals(2, aluno1.obterDisciplinasMatriculadas().size());
        assertEquals(true, aluno1.obterDisciplinasMatriculadas().contains(disciplina1));
        assertEquals(true, aluno1.obterDisciplinasMatriculadas().contains(disciplina2));    
    }
	
	@Test
    void adicionarDisciplinas() {
    	assertEquals(2,aluno1.obterDisciplinasMatriculadas().size());
        aluno1.matricularDisciplina(disciplina3);
        assertEquals(3,aluno1.obterDisciplinasMatriculadas().size());
        assertEquals(true, aluno1.obterDisciplinasMatriculadas().contains(disciplina3));
    }
    
    @Test
    public void aluno() {
    	assertEquals("Pedro Henrique", aluno1.getNome());
    	assertEquals("20210001", aluno1.getMatricula());
    }
    
    @Test 
    void removerDisciplinas() {
    	aluno1.removerDisciplina(disciplina1);
    	aluno1.removerDisciplina(disciplina2);
    	assertEquals(0 , aluno1.obterDisciplinasMatriculadas().size());
    	assertFalse(aluno1.obterDisciplinasMatriculadas().contains(disciplina1));
    	assertFalse(aluno1.obterDisciplinasMatriculadas().contains(disciplina2));
    }
    
}
