package app;

import entities.*;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;
import interfaces.Funcao;


public class Main {
    public static void main(String[] args) {
        try {
            Funcao ator = Controle.ator();
            Funcao diretor = Controle.diretor();
            Funcao cameraman = Controle.cameraman();
            Funcao roteirista = Controle.roteirista();
            Funcionario pessoa1 = Controle.criarFuncionario("Maria");
            Funcionario pessoa2 = Controle.criarFuncionario("Pedro");
            Funcionario pessoa3 = Controle.criarFuncionario("Ana");

            Filme filme1 = Controle.criarFilme("Star Wars", "1977", "Ficção Cientifica");
            filme1.adicionarFuncionario(pessoa1, ator);
            filme1.adicionarFuncionario(pessoa2, roteirista);
            filme1.adicionarFuncionario(pessoa2, ator);
            filme1.adicionarFuncionario(pessoa3, ator);
            Filme filme2 = Controle.criarFilme("Senhor dos Aneis", "2001", "Aventura");
            filme2.adicionarFuncionario(pessoa3, diretor);
            filme2.adicionarFuncionario(pessoa1, cameraman);
           

            Controle.informacoes(filme1);
            Controle.informacoes(filme2);
            
            Controle.filmografia(pessoa1);
            Controle.filmografia(pessoa2);
            Controle.filmografia(pessoa3);

        } catch (ExcecaoPessoa | ExcecaoFilme e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
