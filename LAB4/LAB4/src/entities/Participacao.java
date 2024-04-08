package entities;

import interfaces.Funcao;

public class Participacao {
	private Filme filme;
	private Funcao funcao;
	
	public Participacao(Filme filme, Funcao funcao){
		this.filme=filme;
		this.funcao=funcao;
	}
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

}
