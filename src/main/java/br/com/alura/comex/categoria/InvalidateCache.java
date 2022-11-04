package br.com.alura.comex.categoria;

import br.com.alura.comex.cliente.dto.ClienteOutputDto;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aW52YWxpZGEgcmVsYXTDs3JpbyBkZSB2ZW5kYXM")
@CacheEvict(value = "relatorioPedidos", allEntries = true)
public class InvalidateCache {

    @GetMapping
    public ResponseEntity<?> invalidate(){
        return null;
    }
}
