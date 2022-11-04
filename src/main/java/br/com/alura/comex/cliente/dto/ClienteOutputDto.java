package br.com.alura.comex.cliente.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class ClienteOutputDto {

    @Schema(description = "${cliente.output.dto.name}")
    private String nome;
    @Schema(description = "${cliente.output.dto.cpf}")
    private String cpf;
    @Schema(description = "${cliente.output.dto.telefone}")
    private String telefone;
    @Schema(description = "${cliente.output.dto.local}")
    private String local;

    public ClienteOutputDto() {
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
