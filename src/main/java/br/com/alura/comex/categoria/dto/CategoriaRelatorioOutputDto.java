package br.com.alura.comex.categoria.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class CategoriaRelatorioOutputDto {

    @Schema(description = "${categoria.output.dto.name}")
    private String nomeCategoria;
    @Schema(description = "${categoria.output.dto.qtd}")
    private Integer quantidadeVendas;
    @Schema(description = "${categoria.output.dto.value}")
    private BigDecimal valorTotal;

    public CategoriaRelatorioOutputDto() {
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(Integer quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
