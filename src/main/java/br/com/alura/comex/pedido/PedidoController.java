package br.com.alura.comex.pedido;

import br.com.alura.comex.pedido.dto.PedidoInputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Long> create(@RequestBody @Valid PedidoInputDto pedidoInputDto, UriComponentsBuilder uriBuilder){
        return pedidoService.create(pedidoInputDto, uriBuilder);
    }
}
