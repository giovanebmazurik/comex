package br.com.alura.comex.produto;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.produto.dto.ProdutoInputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Long> create(@RequestBody @Valid ProdutoInputDto produtoInputDto, UriComponentsBuilder uriBuilder){
        return produtoService.create(produtoInputDto, uriBuilder);
    }
}
