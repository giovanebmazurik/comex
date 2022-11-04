package br.com.alura.comex.categoria.projection;

import java.math.BigDecimal;

public interface CategoriaProjection {
    Long getId();
    String getNome();
    Integer getQuantidade();
    BigDecimal getPreco();
}
