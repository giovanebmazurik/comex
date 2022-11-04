package br.com.alura.comex.categoria;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.dto.CategoriaRelatorioOutputDto;
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

@Tag(name = "Category")
@RestController
@RequestMapping("categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @Operation(summary = "${categoria.post}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaInputDto.class)) }),
            @ApiResponse(responseCode = "500", description = "Error",
                    content = @Content)
    })
    @PostMapping
    @Transactional
    public ResponseEntity<CategoriaInputDto> create(@RequestBody @Valid CategoriaInputDto categoriaInputDto, UriComponentsBuilder uriBuilder){
        return categoriaService.create(categoriaInputDto, uriBuilder);
    }

    @Operation(summary = "${categoria.list}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the list",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CategoriaRelatorioOutputDto.class)) }),
            @ApiResponse(responseCode = "500", description = "Error",
                    content = @Content)
    })
    @GetMapping("/pedidos")
    public List<CategoriaRelatorioOutputDto> lista(){
        return categoriaService.getPedidos();
    }



}
