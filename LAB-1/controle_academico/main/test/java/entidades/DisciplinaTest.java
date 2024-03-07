package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void adicionarAluno() {
        Disciplina disciplina = new Disciplina("Matemática Discreta", "MAT123", 60);
        Aluno aluno1 = new Aluno("Pedro Henrique", "20210001");
        Aluno aluno2 = new Aluno("Ana Carolina", "20210002");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        assertEquals(2, disciplina.obterAlunosMatriculados().size());
        assertTrue(disciplina.obterAlunosMatriculados().contains(aluno1));
        assertTrue(disciplina.obterAlunosMatriculados().contains(aluno2));
    }

    @Test
    void numeroDeAlunos() {
        Disciplina disciplina = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90);
        Aluno aluno1 = new Aluno("Pedro Henrique", "20210001");
        Aluno aluno2 = new Aluno("Ana Carolina", "20210002");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        assertEquals(2, disciplina.numeroDeAlunos());
    }
}
