package test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Aluno;
import main.Disciplina;


class AlunoTest {

    @Test
    void matricularDisciplina() {
        Aluno aluno = new Aluno("Pedro Henrique", "20210001");
        Disciplina disciplina1 = new Disciplina("Matemática Discreta", "MAT123", 60, "Segunda 11h-13 | Quarta 9h-11h");
        Disciplina disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");

        aluno.matricularDisciplina(disciplina1);
        aluno.matricularDisciplina(disciplina2);

        assertEquals(2, aluno.obterDisciplinasMatriculadas().size());
        assertTrue(aluno.obterDisciplinasMatriculadas().contains(disciplina1));
        assertTrue(aluno.obterDisciplinasMatriculadas().contains(disciplina2));
    }

}
