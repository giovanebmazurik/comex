package br.com.alura.comex.produto;

import br.com.alura.comex.categoria.CategoriaRepository;
import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.mapper.CategoriaMapper;
import br.com.alura.comex.categoria.model.Categoria;
import br.com.alura.comex.produto.dto.ProdutoInputDto;
import br.com.alura.comex.produto.mapper.ProdutoMapper;
import br.com.alura.comex.produto.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public ProdutoService() {
    }

    public ResponseEntity<Long> create(ProdutoInputDto produtoInputDto, UriComponentsBuilder uriBuilder){

        Optional<Categoria> categoria = validateAndReturnCategoria(produtoInputDto.getIdCategoria());
        if (categoria.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        Produto produto = ProdutoMapper.toEntity(produtoInputDto);
        produto.setCategoria(categoria.get());
        produto = produtoRepository.save(produto);

        URI uri = uriBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();
        return  ResponseEntity.created(uri).body(produto.getId());
    }

    private Optional<Categoria> validateAndReturnCategoria(Long idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }
}
