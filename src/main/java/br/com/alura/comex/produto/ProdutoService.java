package br.com.alura.comex.produto;

import br.com.alura.comex.categoria.CategoriaRepository;
import br.com.alura.comex.categoria.model.Categoria;
import br.com.alura.comex.produto.dto.ProdutoInputDto;
import br.com.alura.comex.produto.dto.ProdutoOutputDto;
import br.com.alura.comex.produto.mapper.ProdutoMapper;
import br.com.alura.comex.produto.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
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

    public List<ProdutoOutputDto> getAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 5, Sort.by(Sort.Direction.ASC, "nome"));
        return produtoRepository.findAll(pageable).stream().map(ProdutoMapper::toOutputDto).toList();
    }
}
