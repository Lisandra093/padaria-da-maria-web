package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Estoque;
import com.sistema.padaria_da_maria_web.service.EstoqueService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estoque")
@CrossOrigin(origins = "*")
public class EstoqueController {
    private final EstoqueService service;

    public EstoqueController(EstoqueService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estoque> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estoque> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Estoque> cadastrar(
            @RequestBody Estoque estoque) {

        return ResponseEntity.ok(service.salvar(estoque));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estoque> atualizar(
            @PathVariable Integer id,
            @RequestBody Estoque estoque) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        estoque.setId(id);

        return ResponseEntity.ok(service.salvar(estoque));
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
