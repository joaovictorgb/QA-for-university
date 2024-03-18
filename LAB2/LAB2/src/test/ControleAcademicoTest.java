package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import main.ControleAcademico;
import main.Disciplina;
import main.Turma;

public class ControleAcademicoTest {

    private Disciplina disciplina;
    private ControleAcademico cA;
    private Turma turma;

    @BeforeEach
    void setup(){
        cA = new ControleAcademico();
    }
   

    @Test
    public void testAdicionarDisciplina() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);


        disciplina = cA.buscaDisciplina("ALG123");
        assertTrue(cA.getDisciplinas().contains(disciplina));
    }
    

    @Test
    public void testRemoverDisciplina() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);


        disciplina = cA.buscaDisciplina("ALG123");
        cA.removerDisciplina(disciplina);
        assertFalse(cA.getDisciplinas().contains(disciplina));
 
    }
    

    @Test
    public void testBuscaDisciplina() throws Exception {
        cA = new ControleAcademico();
        assertNull(cA.buscaDisciplina("ALG123"));
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);


        disciplina = cA.buscaDisciplina("ALG123");
        assertNotNull(disciplina);
        assertEquals(disciplina.getNome(), "Algoritmo");
    }
    
    
    @Test
    public void testAdicionarTurma() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");

        turma = cA.buscaTurma(1);
        disciplina = cA.buscaDisciplina("ALG123");
        assertEquals(turma.getDisciplina(), disciplina);
    }
    
    @Test
    public void testRemoverTurma() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");

        turma = cA.buscaTurma(1);
        cA.removerTurma(turma);
        assertFalse(cA.getTurmas().contains(turma));
    }
    
    @Test
    public void testBuscaTurma() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");

        turma = cA.buscaTurma(1);
        assertNotNull(turma);
        assertEquals(turma.getId(), 1);
        
    }
    
    @Test
    public void testAdicionarAlunos() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");
        turma = cA.buscaTurma(1);

        cA.adicionarAlunos(1,"Maria Eduarda", "22101231");
        assertEquals(turma.getAlunos().size(), 1);
        assertEquals(turma.getAlunos().get(0).getNome(), "Maria Eduarda");
    }
    
    @Test
    public void testRemoverAlunos() throws Exception {
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");
        turma = cA.buscaTurma(1);
        cA.adicionarAlunos(1,"Maria Eduarda", "22101231");

        cA.removerAlunos(1, "22101231");
        assertEquals(turma.getAlunos().size(), 0 );
        
    }
    
    @Test
    public void testAdicionarProfessor() throws Exception {
        cA = new ControleAcademico();
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");
        turma = cA.buscaTurma(1);

        cA.adicionarProfessor(1, "Anderson", "12345");
        assertNotNull(turma.getProfessor());
        assertEquals(turma.getProfessor().getNome(), "Anderson");
    }
    
    @Test
    public void testRemoverProfessor() throws Exception {
        cA = new ControleAcademico();
        cA = new ControleAcademico();
        cA = new ControleAcademico();
        cA.adicionarDisciplina("Algoritmo", "ALG123", 60);
        cA.adicionarTurma("ALG123", "B103", "Segunda 14h-16h");
        turma = cA.buscaTurma(1);
        cA.adicionarProfessor(1, "Anderson", "12345");

        cA.removerProfessor(1, "12345");
        assertNull(turma.getProfessor());
       
    }
    
}

