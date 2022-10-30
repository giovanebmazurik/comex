package br.com.alura.comex.categoria;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.dto.CategoriaRelatorioOutputDto;
import br.com.alura.comex.categoria.mapper.CategoriaMapper;
import br.com.alura.comex.categoria.model.Categoria;
import br.com.alura.comex.categoria.projection.CategoriaProjection;
import br.com.alura.comex.pedido.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<CategoriaRelatorioOutputDto> getPedidos() {
        return CategoriaMapper.toCategoriaRelatorioOutputDto(categoriaRepository.findRelatorioCategoriasVendidas());
    }
}
