package app;

import entities.Ator;
import entities.Diretor;
import entities.Filme;
import entities.Funcionario;
import entities.Roteirista;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;


public class ControleAcesso {
    public static void main(String[] args) {
        try {
            Funcionario ator1 = new Funcionario("Ator 1");
            ator1.adicionarFuncao(new Ator());
            Funcionario ator2 = new Funcionario("Ator 2");
            ator2.adicionarFuncao(new Ator());
            Funcionario diretor1 = new Funcionario("Diretor 1");
            diretor1.adicionarFuncao(new Diretor());
            Funcionario roteirista1 = new Funcionario("Roteirista 1");
            roteirista1.adicionarFuncao(new Roteirista());

            Filme filme1 = new Filme("Filme 1", diretor1, roteirista1);
            filme1.adicionarFuncionario(ator1);
            filme1.adicionarFuncionario(ator2);

            System.out.println("Informações do Filme:");
            System.out.println("Nome: " + filme1.getNome());
            System.out.println("Diretor: " + filme1.getDiretor().getNome());
            System.out.println("Roteirista: " + filme1.getRoteirista().getNome());
            System.out.println("Elenco:");
            for (Funcionario funcionario : filme1.getElenco()) {
                System.out.println("- " + funcionario.getNome() + " (" + funcionario.getFuncoesAsString() + ")");
            }

        } catch (ExcecaoPessoa | ExcecaoFilme e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
