package br.com.alura.comex.produto.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class ProdutoInputDto {

    @Schema(description = "${product.input.dto.name}")
    @NotNull
    @NotEmpty
    @Size(min = 2)
    private String nome;

    @Schema(description = "${product.input.dto.desc}")
    private String descricao;

    @Schema(description = "${product.input.dto.value}")
    @NotNull
    @Min(0)
    private BigDecimal preco;
    @Schema(description = "${product.input.dto.qtd}")
    @NotNull
    private Integer quantidade;

    @Schema(description = "${product.input.dto.id.categoria}")
    @NotNull
    private Long idCategoria;

    public ProdutoInputDto() {
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
}
