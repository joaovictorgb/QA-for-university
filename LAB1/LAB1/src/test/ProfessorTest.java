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
	
	@BeforeEach
	void setup() {
		professor = new Professor("João Silva");
        disciplina1 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
        disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
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
    void professor() {
    	assertEquals("João Silva", professor.getNome());
    	assertEquals(professor.getDisciplinasMinistradas(), professor.obterDisciplinasMinistradas() );
    	
    }

}

