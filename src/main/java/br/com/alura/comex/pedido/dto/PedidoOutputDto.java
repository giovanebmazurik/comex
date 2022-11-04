package br.com.alura.comex.pedido.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class PedidoOutputDto {

    @Schema(description = "${order.output.dto.name.categoria}")
    private String nomeCategoria;

    @Schema(description = "${order.output.dto.qtd}")
    private String quantidadeVenda;

    @Schema(description = "${order.output.dto.value}")
    private BigDecimal valorTotal;

    public PedidoOutputDto() {
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(String quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
