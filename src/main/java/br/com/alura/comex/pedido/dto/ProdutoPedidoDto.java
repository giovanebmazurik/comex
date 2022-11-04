package br.com.alura.comex.pedido.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProdutoPedidoDto {

    @Schema(description = "${order.input.dto.produto.id}")
    @NotNull
    private Long idProduto;
    @Schema(description = "${order.input.dto.produto.qtd}")
    @NotNull
    private Integer quantidade;

    @Schema(description = "${order.input.dto.produto.value}")
    @NotNull
    @Min(0)
    private BigDecimal valorUnitario;

    public ProdutoPedidoDto() {
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
