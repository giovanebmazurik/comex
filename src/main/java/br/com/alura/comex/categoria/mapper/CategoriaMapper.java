package br.com.alura.comex.categoria.mapper;

import br.com.alura.comex.categoria.dto.CategoriaInputDto;
import br.com.alura.comex.categoria.dto.CategoriaRelatorioOutputDto;
import br.com.alura.comex.categoria.model.Categoria;
import br.com.alura.comex.categoria.projection.CategoriaProjection;

import java.util.ArrayList;
import java.util.List;

public class CategoriaMapper {

    public static Categoria toEntity(CategoriaInputDto categoriaInputDto){
        return new Categoria(categoriaInputDto.getNome());
    }

    public static List<CategoriaRelatorioOutputDto> toCategoriaRelatorioOutputDto(List<CategoriaProjection> categoriaProjectionList){
        List<CategoriaRelatorioOutputDto> categoriaRelatorioOutputDtoList = new ArrayList<>();

        categoriaProjectionList.stream().forEach(categoriaProjection -> {
            CategoriaRelatorioOutputDto categoriaRelatorioOutputDto = new CategoriaRelatorioOutputDto();
            categoriaRelatorioOutputDto.setNomeCategoria(categoriaProjection.getNome());
            categoriaRelatorioOutputDto.setQuantidadeVendas(categoriaProjection.getQuantidade());
            categoriaRelatorioOutputDto.setValorTotal(categoriaProjection.getPreco());

            categoriaRelatorioOutputDtoList.add(categoriaRelatorioOutputDto);
        });
        return categoriaRelatorioOutputDtoList;
    }
}
