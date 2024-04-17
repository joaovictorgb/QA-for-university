package Almoxarifado;

import java.util.Date;

public class PedidosCompra {
    private int numeroPedido;
    private String fornecedor;
    private Date dataPedido;

    public PedidosCompra(int numeroPedido, String fornecedor, Date dataPedido) {
        this.numeroPedido = numeroPedido;
        this.fornecedor = fornecedor;
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        return "Número do Pedido: " + numeroPedido +
               ", Fornecedor: " + fornecedor +
               ", Data do Pedido: " + dataPedido;
    }
}
