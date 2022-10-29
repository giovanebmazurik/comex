package br.com.alura.comex.produto.mapper;

import br.com.alura.comex.produto.dto.ProdutoInputDto;
import br.com.alura.comex.produto.model.Produto;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoInputDto produtoInputDto){
        Produto produto = new Produto();
        produto.setNome(produtoInputDto.getNome());
        produto.setDescricao(produtoInputDto.getDescricao());
        produto.setPrecoUnitario(produtoInputDto.getPreco());
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque());

        return produto;
    }
}
