package test;

import main.Aluno;
import main.Disciplina;
import main.Professor;
import main.Turma;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurmaTest {

    private Aluno aluno1, aluno2;
    private Professor professor,professor2;
    private Disciplina disciplina;
    private Turma turma;


    @BeforeEach
    void setup(){
        disciplina = new Disciplina("Algoritmo", "ALG123", 60);
        aluno1=new Aluno("Paulo Silva","221012312");
        aluno2=new Aluno("Maria Eduarda", "221012313");
        professor = new Professor("Rafael Costa", "123123");
        professor2=new Professor("Ana Luiza", "123124");
        turma = new Turma(1, disciplina, "B104", "Segunda 14h-16h");
    }


    @Test 
    public void testAddAluno() throws Exception{
        turma.addNovoAluno(aluno1);
        assertTrue(turma.getAlunos().contains(aluno1));
        try {
            turma.addNovoAluno(aluno1);
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Aluno já está na turma.", e.getMessage());
        }
    }

    @Test
    public void testRemoverAluno() throws Exception{
        turma.addNovoAluno(aluno1);
        turma.addNovoAluno(aluno2);
        turma.removerAluno(aluno1.getMatricula());
        assertFalse(turma.getAlunos().contains(aluno1));
        assertTrue(turma.getAlunos().contains(aluno2));
        try {
            turma.removerAluno(aluno1.getMatricula());
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Aluno não está na turma.", e.getMessage());
        }
    }

    @Test 
    public void testAddProfessor() throws Exception{
        turma.addNovoProfessor(professor);
        assertNotNull(turma.getProfessor());
        try {
            turma.addNovoProfessor(professor2);
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Já existe um professor nessa turma.", e.getMessage());
        }
    }

    @Test
    public void testRemoverProfessor() throws Exception{
        turma.addNovoProfessor(professor);
        turma.removerProfessor();
        assertNull(turma.getProfessor());
        try {
            turma.removerProfessor();
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Não há professor nesta turma para ser removido.", e.getMessage());
        }
    }


    @Test
    public void testGetterSetter(){
        assertEquals(1,turma.getId());
        turma.setId(2);
        assertEquals(turma.getId(),2 );
    }

    @Test
    public void testConstrutor(){
        assertEquals(turma.getDisciplina(), disciplina);
        assertEquals(turma.getId(), 1);
        assertEquals(turma.getSala(), "B104");
    }
}
