package br.com.alura.comex.produto.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class ProdutoOutputDto {

    @Schema(description = "${product.output.dto.name}")
    private String nome;

    @Schema(description = "${product.output.dto.desc}")
    private String descricao;

    @Schema(description = "${product.output.dto.value}")
    private BigDecimal preco;

    @Schema(description = "${product.output.dto.qtd}")
    private Integer quantidade;

    @Schema(description = "${product.output.dto.id.cateogria}")
    private Long idCategoria;

    @Schema(description = "${product.output.name.categoria}")
    private String nomeCategoria;

    public ProdutoOutputDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
