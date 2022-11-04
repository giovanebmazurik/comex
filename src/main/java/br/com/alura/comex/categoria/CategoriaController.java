package br.com.alura.comex.categoria;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.dto.CategoriaRelatorioOutputDto;
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

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<CategoriaInputDto> create(@RequestBody @Valid CategoriaInputDto categoriaInputDto, UriComponentsBuilder uriBuilder){
        return categoriaService.create(categoriaInputDto, uriBuilder);
    }

    @GetMapping("/pedidos")
    public List<CategoriaRelatorioOutputDto> lista(){
        return categoriaService.getPedidos();
    }



}
