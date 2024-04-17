package Infraestrutura;

import java.util.HashMap;
import java.util.Map;

public class AlocacaoSalas {
    private Map<String, String> alocacoes; // Mapeia salas para as pessoas ou atividades alocadas.

    public AlocacaoSalas() {
        this.alocacoes = new HashMap<>();
    }

    // Alocar uma sala para uma pessoa ou atividade.
    public void alocarSala(String sala, String ocupante) {
        alocacoes.put(sala, ocupante);
    }

    // Desalocar uma sala.
    public void desalocarSala(String sala) {
        alocacoes.remove(sala);
    }

    // Verificar quem está alocado em uma sala específica.
    public String verificarAlocacaoSala(String sala) {
        return alocacoes.get(sala);
    }

    // Listar todas as alocações de salas.
    public String listarAlocacoesSalas() {
        StringBuilder builder = new StringBuilder("Alocações de Salas:\n");
        for (Map.Entry<String, String> entry : alocacoes.entrySet()) {
            String sala = entry.getKey();
            String ocupante = entry.getValue();
            builder.append("Sala: ").append(sala).append(", Ocupante: ").append(ocupante).append("\n");
        }
        return builder.toString();
    }
}
