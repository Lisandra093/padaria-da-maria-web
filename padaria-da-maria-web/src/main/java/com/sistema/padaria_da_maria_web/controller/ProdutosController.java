package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Produtos;
import com.sistema.padaria_da_maria_web.service.ProdutosService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*")
public class ProdutosController {
    private final ProdutosService service;

    public ProdutosController(ProdutosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produtos> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtos> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Produtos> cadastrar(
            @RequestBody Produtos produto) {

        return ResponseEntity.ok(service.salvar(produto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produtos> atualizar(
            @PathVariable Integer id,
            @RequestBody Produtos produto) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        produto.setId(id);

        return ResponseEntity.ok(service.salvar(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        service.excluir(id);

        return ResponseEntity.noContent().build();
    }
    
}
