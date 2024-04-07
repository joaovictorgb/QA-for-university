package entities;

import funcoes.Funcao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Funcao> funcoes;

    public Funcionario(String nome) throws ExcecaoPessoa {
        super(nome);
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) {
        if (funcao != null) {
            funcoes.add(funcao);
        }
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }
}
