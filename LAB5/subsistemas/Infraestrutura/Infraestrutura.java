package Infraestrutura;

public class Infraestrutura {
    private AlocacaoSalas alocacaoSalas;

    public Infraestrutura() {
        this.alocacaoSalas = new AlocacaoSalas();
    }

    // Método para alocar uma sala para uma pessoa ou atividade.
    public void alocarSala(String sala, String ocupante) {
        alocacaoSalas.alocarSala(sala, ocupante);
    }

    // Método para desalocar uma sala.
    public void desalocarSala(String sala) {
        alocacaoSalas.desalocarSala(sala);
    }

    // Método para obter informações sobre a alocação de salas.
    public String obterAlocacaoSalas() {
        return alocacaoSalas.listarAlocacoesSalas();
    }
}
