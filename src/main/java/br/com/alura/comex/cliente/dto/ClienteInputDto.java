package br.com.alura.comex.cliente.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Schema
public class ClienteInputDto {

    @Schema(description = "${cliente.input.dto.name}")
    @Size(min = 2)
    @NotNull
    @NotBlank
    private String nome;

    @Schema(description = "${cliente.input.dto.cpf}")
    @NotNull
    @NotBlank
    private String cpf;

    @Schema(description = "${cliente.input.dto.telefone}")
    @NotNull
    @NotBlank
    private String telefone;

    @Schema(description = "${cliente.input.dto.rua}")
    @NotNull
    @NotBlank
    private String rua;

    @Schema(description = "${cliente.input.dto.numero}")
    @NotNull
    @NotBlank
    private String numero;

    @Schema(description = "${cliente.input.dto.complemento}")
    private String complemento;

    @Schema(description = "${cliente.input.dto.bairro}")
    @NotNull
    @NotBlank
    private String bairro;

    @Schema(description = "${cliente.input.dto.cidade}")
    @NotNull
    @NotBlank
    private String cidade;

    @Schema(description = "${cliente.input.dto.estado}")
    @NotNull
    @NotBlank
    private String estado;

    public ClienteInputDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
