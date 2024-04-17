package Almoxarifado;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> itensEmEstoque;

    public Estoque() {
        this.itensEmEstoque = new HashMap<>();
    }

    // Adicionar um item ao estoque com uma quantidade inicial.
    public void adicionarItem(String nomeItem, int quantidade) {
        if (quantidade > 0) {
            int quantidadeAtual = itensEmEstoque.getOrDefault(nomeItem, 0);
            quantidadeAtual += quantidade;
            itensEmEstoque.put(nomeItem, quantidadeAtual);
        }
    }

    // Remover uma quantidade específica de um item do estoque.
    public void removerItem(String nomeItem, int quantidade) {
        if (quantidade > 0) {
            int quantidadeAtual = itensEmEstoque.getOrDefault(nomeItem, 0);
            quantidadeAtual -= quantidade;

            if (quantidadeAtual <= 0) {
                itensEmEstoque.remove(nomeItem);
            } else {
                itensEmEstoque.put(nomeItem, quantidadeAtual);
            }
        }
    }

    // Verificar a quantidade de um item específico no estoque.
    public int verificarQuantidade(String nomeItem) {
        return itensEmEstoque.getOrDefault(nomeItem, 0);
    }

    // Imprimir o estoque completo.
    public void imprimirEstoque() {
        System.out.println("Itens em Estoque:");
        for (Map.Entry<String, Integer> entry : itensEmEstoque.entrySet()) {
            String nomeItem = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println(nomeItem + ": " + quantidade);
        }
    }
}
