package br.com.alura.comex.pedido;

import br.com.alura.comex.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
