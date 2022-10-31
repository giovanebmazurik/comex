package br.com.alura.comex.cliente;

import br.com.alura.comex.cliente.dto.ClienteInputDto;
import br.com.alura.comex.cliente.mapper.ClienteMapper;
import br.com.alura.comex.cliente.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ResponseEntity<Long> create(ClienteInputDto clienteInputDto, UriComponentsBuilder uriBuilder){
        Cliente cliente = clienteRepository.save(ClienteMapper.toEntity(clienteInputDto));

        URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
        return  ResponseEntity.created(uri).body(cliente.getId());
    }

}
