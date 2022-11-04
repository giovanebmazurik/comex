package br.com.alura.comex.pedido.mapper;

import br.com.alura.comex.cliente.model.Cliente;
import br.com.alura.comex.pedido.dto.PedidoInputDto;
import br.com.alura.comex.pedido.dto.ProdutoPedidoDto;
import br.com.alura.comex.pedido.model.ItemDePedido;
import br.com.alura.comex.pedido.model.Pedido;
import br.com.alura.comex.produto.model.Produto;

import java.math.BigDecimal;

public class PedidoMapper {

    public static Pedido toEntity(Cliente cliente){
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        return pedido;
    }

    public static ItemDePedido toItemPedidoEntity(Pedido pedido, Produto produto, ProdutoPedidoDto produtoPedidoDto){
        ItemDePedido itemDePedido = new ItemDePedido();
        itemDePedido.setPrecoUnitario(produtoPedidoDto.getValorUnitario());
        itemDePedido.setQuantidade(produtoPedidoDto.getQuantidade());
        itemDePedido.setPedido(pedido);
        itemDePedido.setProduto(produto);
        itemDePedido.setDesconto(BigDecimal.valueOf(0L));
        return itemDePedido;
    }
}
