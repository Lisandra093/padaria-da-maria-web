package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Fornecedores;
import com.sistema.padaria_da_maria_web.service.FornecedoresService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fornecedores")
@CrossOrigin(origins = "*")
public class FornecedoresController {
    private final FornecedoresService service;

    public FornecedoresController(FornecedoresService service) {
        this.service = service;
    }

    @GetMapping
    public List<Fornecedores> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedores> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Fornecedores> cadastrar(
            @RequestBody Fornecedores fornecedor) {

        return ResponseEntity.ok(service.salvar(fornecedor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedores> atualizar(
            @PathVariable Integer id,
            @RequestBody Fornecedores fornecedor) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        fornecedor.setId(id);

        return ResponseEntity.ok(service.salvar(fornecedor));
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
