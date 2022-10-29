package br.com.alura.comex.categoria.dto;

import javax.validation.constraints.Size;

public class CategoriaInputDto {

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
