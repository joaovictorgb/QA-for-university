package main;

import static org.junit.Assert.*;
import org.junit.Test;


public class ControleAcademicoTest {

    @Test
    public void testAdicionarDisciplina() throws Exception {
        ControleAcademico ca = new ControleAcademico();
        ca.adicionarDisciplina("Algoritmos", "ALG123", 60);
        assertNotNull(ca.buscaDisciplina("ALG123"));
    }

    @Test
    public void testAdicionarTurma() throws Exception {
        ControleAcademico ca = new ControleAcademico();
        ca.adicionarDisciplina("Algoritmos", "ALG123", 60);
        ca.adicionarTurma("ALG123", "B104", "Segunda 14h-16h");
        assertNotNull(ca.buscaTurma(1));
    }

    
}

