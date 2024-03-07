package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void matricularDisciplina() {
        Aluno aluno = new Aluno("Pedro Henrique", "20210001");
        Disciplina disciplina1 = new Disciplina("Matemática Discreta", "MAT123", 60);
        Disciplina disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90);

        aluno.matricularDisciplina(disciplina1);
        aluno.matricularDisciplina(disciplina2);

        assertEquals(2, aluno.obterDisciplinasMatriculadas().size());
        assertTrue(aluno.obterDisciplinasMatriculadas().contains(disciplina1));
        assertTrue(aluno.obterDisciplinasMatriculadas().contains(disciplina2));
    }

    @Test
    void obterHorario() {
        Aluno aluno = new Aluno("Ana Carolina", "20210002");
        assertEquals("Horário não definido", aluno.obterHorario());
    }
}
