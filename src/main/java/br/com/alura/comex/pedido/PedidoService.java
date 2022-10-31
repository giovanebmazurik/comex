package br.com.alura.comex.pedido;

import br.com.alura.comex.cliente.ClienteRepository;
import br.com.alura.comex.cliente.model.Cliente;
import br.com.alura.comex.pedido.dto.PedidoInputDto;
import br.com.alura.comex.pedido.dto.ProdutoPedidoDto;
import br.com.alura.comex.pedido.mapper.PedidoMapper;
import br.com.alura.comex.pedido.model.Pedido;
import br.com.alura.comex.produto.ProdutoRepository;
import br.com.alura.comex.produto.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private  ItemDePedidoRepository itemDePedidoRepository;

    public ResponseEntity<Long> create(PedidoInputDto pedidoInputDto, UriComponentsBuilder uriBuilder){

        Cliente cliente = validateAndReturnCliente(pedidoInputDto);
        if (cliente == null){
            return ResponseEntity.badRequest().build();
        }

        Pedido pedido = pedidoRepository.save(PedidoMapper.toEntity(cliente));

        for (ProdutoPedidoDto produtoPedidoDto: pedidoInputDto.getProdutos()) {
            Optional<Produto> produto = produtoRepository.findById(produtoPedidoDto.getIdProduto());
            if (produto.isEmpty()){
                return ResponseEntity.badRequest().build();
            }else{
                itemDePedidoRepository.save(PedidoMapper.toItemPedidoEntity(pedido, produto.get(), produtoPedidoDto));
            }
        }

        URI uri = uriBuilder.path("/pedidos/{id}").buildAndExpand(pedido.getId()).toUri();
        return  ResponseEntity.created(uri).body(pedido.getId());
    }

    private Cliente validateAndReturnCliente(PedidoInputDto pedidoInputDto) {
        Optional<Cliente> cliente = clienteRepository.findById(pedidoInputDto.getIdCliente());
        if (cliente.isEmpty()) {
            return null;
        }else{
            return cliente.get();
        }
    }
}
