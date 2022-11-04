package br.com.alura.comex.categoria.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Size;

public class CategoriaInputDto {

    @Schema(description = "${categoria.input.dto.name}", example = "T-Shirt")
    @Size(min = 2)
    private String nome;

    public CategoriaInputDto() {
    }

    public CategoriaInputDto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
