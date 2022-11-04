package br.com.alura.comex.categoria;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Cache")
@RestController
@RequestMapping("aW52YWxpZGEgcmVsYXTDs3JpbyBkZSB2ZW5kYXM")
@CacheEvict(value = "relatorioPedidos", allEntries = true)
public class InvalidateCache {

    @Operation(summary = "Invalidate")
    @GetMapping
    public ResponseEntity<?> invalidate(){
        return null;
    }
}
