package br.com.alura.comex.pedido;

import br.com.alura.comex.categoria.projection.CategoriaProjection;
import br.com.alura.comex.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
