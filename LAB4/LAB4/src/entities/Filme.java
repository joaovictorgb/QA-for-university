package entities;

import exceptions.ExcecaoFilme;
import interfaces.Funcao;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String ano;
    private String genero;

    private List<Funcionario> elenco;

    public Filme(String nome, String ano, String genero) throws ExcecaoFilme {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoFilme("Nome inválido para o filme.");
        }
        this.nome = nome;
        this.ano=ano;
        this.genero=genero;
        this.elenco = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario, Funcao funcao) throws ExcecaoFilme {
        if (funcionario == null) {
            throw new ExcecaoFilme("Funcionário não pode ser nulo.");
        }
        funcionario.adicionarParticipacao(funcao, this);
        if (!elenco.contains(funcionario)){
            elenco.add(funcionario);
        }

    }

    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    
    public List<Funcionario> getElenco() {
        return elenco;
    }

}
