package br.com.alura.comex.categoria.dto;

import javax.validation.constraints.Size;

public record CategoriaInputDto(String nome) {

    public CategoriaInputDto(@Size(min = 2) String nome) {
        this.nome = nome;
    }
}
