package br.com.alura.comex.repositories;

import br.com.alura.comex.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
