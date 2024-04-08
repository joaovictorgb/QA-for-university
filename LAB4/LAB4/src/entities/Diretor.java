package entities;

import interfaces.Funcao;

public class Diretor implements Funcao {
    @Override
    public String getFuncao() {
        return "Diretor";
    }
}