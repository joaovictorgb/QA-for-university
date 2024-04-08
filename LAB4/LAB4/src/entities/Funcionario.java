package entities;

import exceptions.ExcecaoPessoa;
import interfaces.Funcao;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Participacao> participacoes;

	public Funcionario(String nome) throws ExcecaoPessoa {
        super(nome);
        this.participacoes = new ArrayList<>();
    }
    
    public void adicionarParticipacao(Funcao funcao, Filme filme) {
        if (filme == null) return;
        
        for (Participacao participacao : participacoes) {
            if (participacao.getFilme().equals(filme)) {
                if (participacao.getFuncao().getClass().equals(funcao.getClass())) {
                    System.out.println("O funcionário já possui esta função neste filme.");
                    return;
                }
            }
        }

        Participacao novaParticipacao = new Participacao(filme, funcao);
        participacoes.add(novaParticipacao);
    }
    
    public List<Participacao> getParticipacoes() {
 		return participacoes;
    }

}
