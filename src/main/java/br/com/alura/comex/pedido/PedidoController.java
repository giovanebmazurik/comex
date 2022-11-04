package br.com.alura.comex.pedido;

import br.com.alura.comex.cliente.dto.ClienteInputDto;
import br.com.alura.comex.pedido.dto.PedidoInputDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@Tag(name = "Order")
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @Operation(summary = "${order.post}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Long.class)) }),
            @ApiResponse(responseCode = "500", description = "Error",
                    content = @Content)
    })
    @PostMapping
    @Transactional
    public ResponseEntity<Long> create(@RequestBody @Valid PedidoInputDto pedidoInputDto, UriComponentsBuilder uriBuilder){
        return pedidoService.create(pedidoInputDto, uriBuilder);
    }
}
