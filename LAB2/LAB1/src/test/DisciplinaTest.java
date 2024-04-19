package test;

import org.junit.jupiter.api.Test;
import main.Aluno;
import main.Disciplina;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class DisciplinaTest {

	Disciplina disciplina;
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	/* 
	@BeforeEach
	public void setup() {
		disciplina = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
        aluno1 = new Aluno("Pedro Henrique", "20210001");
        aluno2 = new Aluno("Ana Carolina", "20210002");
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        aluno3 = new Aluno("Felipe Carvalho", "20220002");
	}
	
    @Test
    void adicionarAluno() {
        assertEquals(2, disciplina.obterAlunosMatriculados().size());
        assertTrue(disciplina.obterAlunosMatriculados().contains(aluno1));
        assertTrue(disciplina.obterAlunosMatriculados().contains(aluno2));
    }

    @Test
    void numeroDeAlunos() {
        assertEquals(2, disciplina.numeroDeAlunos());
        disciplina.adicionarAluno(aluno3);
        assertEquals(3, disciplina.numeroDeAlunos());
    }
    
    @Test 
    void disciplina() {
    	assertEquals("Algoritmos e Estruturas de Dados", disciplina.getNome());
    	assertEquals("ALG456", disciplina.getCodigo());
    	assertEquals(90, disciplina.getCargaHoraria());
    	assertEquals("Terça 07h-09h | Quarta 07-09h", disciplina.getHorário());
    }
    */
}