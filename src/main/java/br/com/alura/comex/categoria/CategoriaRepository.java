package br.com.alura.comex.categoria;

import br.com.alura.comex.categoria.model.Categoria;
import br.com.alura.comex.categoria.projection.CategoriaProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query(value = "SELECT c.nome, SUM(p.quantidade_estoque) AS quantidade, SUM(ip.preco_unitario) AS preco " +
            "FROM categorias c JOIN produtos p JOIN itens_pedido ip " +
            "WHERE p.categoria_id = c.id AND ip.produto_id = p.id  GROUP by c.id ;", nativeQuery = true)
    List<CategoriaProjection> findRelatorioCategoriasVendidas();
}
