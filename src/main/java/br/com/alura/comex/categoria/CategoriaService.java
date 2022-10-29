package br.com.alura.comex.categoria;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.mapper.CategoriaMapper;
import br.com.alura.comex.categoria.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService() {
    }

    public ResponseEntity<CategoriaInputDto> create(CategoriaInputDto categoriaInputDto, UriComponentsBuilder uriBuilder){
        Categoria categoria = categoriaRepository.save(CategoriaMapper.toEntity(categoriaInputDto));

        URI uri = uriBuilder.path("/categorias/{id}").buildAndExpand(categoria.getId()).toUri();
        return  ResponseEntity.created(uri).body(new CategoriaInputDto(categoria.getNome()));
    }
}
