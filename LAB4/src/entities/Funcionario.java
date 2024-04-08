package entities;

import exceptions.ExcecaoPessoa;
import interfaces.Funcao;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Funcao> funcoes;

    public Funcionario(String nome) throws ExcecaoPessoa {
        super(nome);
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) {
        if (funcao != null && !funcoes.contains(funcao)) {
            funcoes.add(funcao);
        }
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }

    public String getFuncoesAsString() {
        StringBuilder sb = new StringBuilder();
        for (Funcao funcao : funcoes) {
            sb.append(funcao.getFuncao()).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2); // Remover a última vírgula e espaço
        }
        return sb.toString();
    }
}
