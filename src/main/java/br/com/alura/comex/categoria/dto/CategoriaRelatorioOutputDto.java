package br.com.alura.comex.categoria.dto;

import java.math.BigDecimal;

public class CategoriaRelatorioOutputDto {

    private String nomeCategoria;
    private Integer quantidadeVendas;
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
