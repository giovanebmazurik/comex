package br.com.alura.comex.cliente;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.dto.CategoriaRelatorioOutputDto;
import br.com.alura.comex.cliente.dto.ClienteInputDto;
import br.com.alura.comex.cliente.dto.ClienteOutputDto;
import br.com.alura.comex.produto.dto.ProdutoOutputDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@Tag(name = "Customer")
@RestController
@RequestMapping("clientes")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "${cliente.post}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ClienteInputDto.class)) }),
            @ApiResponse(responseCode = "500", description = "Error",
                    content = @Content)
    })
    @PostMapping
    @Transactional
    public ResponseEntity<Long> create(@RequestBody @Valid ClienteInputDto clienteInputDto, UriComponentsBuilder uriBuilder){
        return clienteService.create(clienteInputDto, uriBuilder);
    }

    @Operation(summary = "${cliente.list}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the list",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ClienteOutputDto.class)) }),
            @ApiResponse(responseCode = "500", description = "Error",
                    content = @Content)
    })
    @GetMapping
    public List<ClienteOutputDto> lista(Integer page){
        return clienteService.getAll(page);
    }

}
