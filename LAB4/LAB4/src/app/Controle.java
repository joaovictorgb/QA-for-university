package app;

import entities.Filme;
import entities.Funcionario;
import entities.Participacao;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;

public class Controle {

    public static Funcionario criarFuncionario(String nome) throws ExcecaoPessoa{
        return new Funcionario(nome);
    }

    public static Filme criarFilme(String nome, String ano, String genero) throws ExcecaoFilme{
        return new Filme(nome, ano, genero);
    }

    public static void filmografia(Funcionario funcionario) {
    	System.out.println("Filmografia do Funcionário: " + funcionario.getNome());
        for (Participacao participacao : funcionario.getParticipacoes()) {
        	System.out.println(participacao.getFilme().getNome() + " - " + participacao.getFuncao().getFuncao());
        }
        System.out.println();
    }

    public static void informacoes(Filme filme) {
        System.out.println("Nome do filme: " + filme.getNome());
        System.out.println("Ano: " + filme.getAno());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Elenco:");

        for (Funcionario funcionario : filme.getElenco()) {
            System.out.print( funcionario.getNome() + " - ");
            for (Participacao participacao : funcionario.getParticipacoes()) {
                if (participacao.getFilme().equals(filme)) {
                    System.out.print(participacao.getFuncao().getFuncao() + " ");
                }
            }
            System.out.println();
    
        }
        System.out.println();
    }
}
