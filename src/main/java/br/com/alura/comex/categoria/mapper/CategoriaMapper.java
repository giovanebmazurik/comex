package br.com.alura.comex.categoria.mapper;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.model.Categoria;

public class CategoriaMapper {

    public static Categoria toEntity(CategoriaInputDto categoriaInputDto){
        return new Categoria(categoriaInputDto.nome());
    }
}
