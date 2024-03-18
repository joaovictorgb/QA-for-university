package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void testConstrutor() {
        Aluno aluno = new Aluno("João", "2024124");
        assertEquals("João", aluno.getNome());
        assertEquals("2024124", aluno.getMatricula());
    }

    
}
