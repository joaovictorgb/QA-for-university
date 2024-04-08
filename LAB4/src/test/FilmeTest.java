package test;

import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;

import entities.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class FilmeTest {

    private Filme filme;
    private Funcionario diretor;
    private Funcionario roteirista;
    private Funcionario ator1;

    @Before
    public void setUp() throws ExcecaoFilme, ExcecaoPessoa {
        diretor = new Funcionario("Diretor1");
        diretor.adicionarFuncao(new Diretor());
        roteirista = new Funcionario("Roteirista1");
        roteirista.adicionarFuncao(new Roteirista());

        filme = new Filme("Filme1", diretor, roteirista);

        ator1 = new Funcionario("Ator1");
        ator1.adicionarFuncao(new Ator());
    }

    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(ExcecaoFilme.class, () -> new Filme(null, diretor, roteirista));
    }

    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(ExcecaoFilme.class, () -> new Filme("", diretor, roteirista));
    }

    @Test
    public void testGetDiretor() {
        assertEquals(diretor, filme.getDiretor());
    }

    @Test
    public void testGetRoteirista() {
        assertEquals(roteirista, filme.getRoteirista());
    }

    @Test
    public void testAdicionarFuncionario() throws ExcecaoFilme {
        filme.adicionarFuncionario(ator1);
        List<Funcionario> elenco = filme.getElenco();
        assertTrue(elenco.contains(ator1));
    }

    @Test
    public void testGetElenco() throws ExcecaoFilme {
        filme.adicionarFuncionario(ator1);
        List<Funcionario> elenco = filme.getElenco();
        assertNotNull(elenco);
        assertEquals(1, elenco.size());
        assertTrue(elenco.contains(ator1));
    }

}
