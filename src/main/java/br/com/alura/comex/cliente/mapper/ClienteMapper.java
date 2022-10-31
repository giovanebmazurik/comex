package br.com.alura.comex.cliente.mapper;

import br.com.alura.comex.cliente.dto.ClienteInputDto;
import br.com.alura.comex.cliente.model.Cliente;

public class ClienteMapper {

    public static Cliente toEntity(ClienteInputDto clienteInputDto){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteInputDto.getNome());
        cliente.setCpf(clienteInputDto.getCpf());
        cliente.setTelefone(clienteInputDto.getTelefone());
        cliente.setRua(clienteInputDto.getRua());
        cliente.setNumero(clienteInputDto.getNumero());
        cliente.setComplemento(clienteInputDto.getComplemento());
        cliente.setBairro(clienteInputDto.getBairro());
        cliente.setCidade(clienteInputDto.getCidade());
        cliente.setEstado(clienteInputDto.getEstado());
        return cliente;
    }
}
