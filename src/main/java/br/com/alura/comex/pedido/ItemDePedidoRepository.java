package br.com.alura.comex.pedido;

import br.com.alura.comex.pedido.model.ItemDePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDePedidoRepository extends JpaRepository<ItemDePedido, Long> {
}
