package test;

import org.junit.jupiter.api.Test;

import main.Disciplina;
import main.Professor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class ProfessorTest {
	
	Professor professor;
	Disciplina disciplina1;
	Disciplina disciplina2;
	Disciplina disciplina3;
	
	@BeforeEach
	void setup() {
		professor = new Professor("João Silva");
        disciplina1 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
        disciplina2 = new Disciplina("Banco de Dados", "BDA123", 90, "Terça 09h-11h | Quarta 09-11h");
        disciplina2 = new Disciplina("Métodos Avançados de Programação", "MAP523", 90, "Segunda 07h-09h | Sexta 07-09h");
        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);
	}
	
    @Test
    void obterDisciplinasMinistradas() {
        assertEquals(2, professor.obterDisciplinasMinistradas().size());
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina1));
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina2));    
    }
    
    @Test
    void adicionarDisciplinas() {
    	assertEquals(2,professor.obterDisciplinasMinistradas().size());
        professor.adicionarDisciplina(disciplina3);
        assertEquals(3,professor.obterDisciplinasMinistradas().size());
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina3));
    }
    
    @Test 
    void professor() {
    	assertEquals("João Silva", professor.getNome());
    	assertEquals(professor.getDisciplinasMinistradas(), professor.obterDisciplinasMinistradas() );
    }
    
    @Test 
    void removerDisciplinas() {
    	professor.removerDisciplina(disciplina1);
    	professor.removerDisciplina(disciplina2);
    	assertEquals(0 ,professor.obterDisciplinasMinistradas().size());
    	assertFalse(professor.obterDisciplinasMinistradas().contains(disciplina1));
    	assertFalse(professor.obterDisciplinasMinistradas().contains(disciplina2));
    }

}

