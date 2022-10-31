package br.com.alura.comex.pedido.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class PedidoInputDto {

    @NotNull
    private Long idCliente;
    @NotNull
    @NotEmpty
    @Valid
    private List<ProdutoPedidoDto> produtos;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<ProdutoPedidoDto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoPedidoDto> produtos) {
        this.produtos = produtos;
    }
}
