package Almoxarifado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Almoxarifado {
    private Estoque estoque;
    private List<PedidosCompra> pedidosCompraList;

    public Almoxarifado() {
        this.estoque = new Estoque();
        this.pedidosCompraList = new ArrayList<>();
    }

    // Adicionar um item ao estoque.
    public void adicionarItemAoEstoque(String nomeItem, int quantidade) {
        estoque.adicionarItem(nomeItem, quantidade);
    }

    // Remover um item do estoque.
    public void removerItemDoEstoque(String nomeItem, int quantidade) {
        estoque.removerItem(nomeItem, quantidade);
    }
    
    // Registrar um pedido de compra.
    public void registrarPedidoCompra(int numeroPedido, String fornecedor, Date dataPedido) {
        PedidosCompra pedido = new PedidosCompra(numeroPedido, fornecedor, dataPedido);
        pedidosCompraList.add(pedido);
    }

    // Obter informações sobre os pedidos de compra.
    public String obterPedidosCompra() {
        StringBuilder builder = new StringBuilder("Pedidos de compra:\n");
        for (PedidosCompra pedido : pedidosCompraList) {
            builder.append(pedido.toString()).append("\n");
        }
        return builder.toString();
    }

    public String obterEstoque() {
        return null;
    }
}
